package com.meta4.translationsrobot.ddbb.functional.services;


import com.meta4.translationsrobot.ddbb.functional.entities.fields.M4RddFields;
import com.meta4.translationsrobot.ddbb.functional.repositories.FunFieldDRepository;
import com.meta4.translationsrobot.dto.LinkedListObject;
import com.meta4.translationsrobot.dto.NumericalResults;
import com.meta4.translationsrobot.dto.ObjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunFieldDService {
    @Autowired
    private FunFieldDRepository repository;
    private List<M4RddFields> findedRows;
    private ObjectDTO aux = null;


    public void getRow(LinkedListObject linkedListObject) {
        String[] ids = regex(linkedListObject.getRoot().getIdObject());
        if(ids.length==2) {
            findedRows = findByIdObjectAndIdField(ids[0], ids[1]);
            aux = linkedListObject.getRoot();
            try {
                M4RddFields row = findedRows.get(0);
                if (row.getIdTransFldesp() == null)
                    aux.setSpanishError(true);
                else if ((row.getIdTransFldesp()).equals(ids[1]))
                    aux.setShowed(false);
                else {
                    for (String language : aux.getValues().keySet())
                        try {
                            solveQuery(row, language, aux);
                        } catch (Exception e) {
                            aux.setValueByKey(language, NumericalResults.WITHOUT_EXTRACTION);
                        }
                }
            } catch (Exception e) {
                aux.setSpanishError(true);
            }
        }else linkedListObject.getRoot().setShowed(false);
    }

    public List<M4RddFields> findByIdObjectAndIdField(String idObject, String idField) {
        return repository.findByIdObjectAndIdField(idObject, idField);
    }

    public void solveQuery(M4RddFields row, String language, ObjectDTO aux) throws Exception {
        switch (language) {
            case "USA":
            case "ENG":
                aux.setFunctionalRowByKey(language, row.getIdTransFldeng());
                break;
            case "FRA":
                aux.setFunctionalRowByKey(language, row.getIdTransFldfra());
                break;
            case "BRA":
                aux.setFunctionalRowByKey(language, row.getIdTransFldbra());
                break;
            case "GER":
                aux.setFunctionalRowByKey(language, row.getIdTransFldger());
                break;
        }
        if (aux.getFunctionalRowByKey(language) == null)
            aux.setValueByKey(language, NumericalResults.WITHOUT_EXTRACTION);
    }

    public String[] regex(String idObject) {
        return idObject.split("\\.");
    }
}