package com.meta4.translationsrobot.ddbb.functional.services;



import com.meta4.translationsrobot.ddbb.functional.entities.fields.M4RdcFields;
import com.meta4.translationsrobot.ddbb.functional.repositories.FunFieldCRepository;
import com.meta4.translationsrobot.dto.LinkedListObject;
import com.meta4.translationsrobot.dto.NumericalResults;
import com.meta4.translationsrobot.dto.ObjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunFieldCService {
    @Autowired
    private FunFieldCRepository repository;
    private List<M4RdcFields> findedRows;
    private ObjectDTO aux = null;


    public void getRow(LinkedListObject linkedListObject) {
        String[] ids = regex(linkedListObject.getRoot().getIdObject());
        if(ids.length==2) {
            findedRows = findByIdObjectAndIdField(ids[0], ids[1]);
            aux = linkedListObject.getRoot();
            try {
                M4RdcFields row = findedRows.get(0);
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
        }
    }

    public List<M4RdcFields> findByIdObjectAndIdField(String idObject, String idField) {
        return repository.findByIdObjectAndIdField(idObject, idField);
    }

    public void solveQuery(M4RdcFields row, String language, ObjectDTO aux) throws Exception {
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
