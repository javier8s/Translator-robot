package com.meta4.translationsrobot.ddbb.functional.services;

import com.meta4.translationsrobot.ddbb.functional.entities.logicObject.M4RddLogicObject;
import com.meta4.translationsrobot.ddbb.functional.repositories.LogicObjectDRepository;
import com.meta4.translationsrobot.dto.LinkedListObject;
import com.meta4.translationsrobot.dto.NumericalResults;
import com.meta4.translationsrobot.dto.ObjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunLogicObjectDService {
    @Autowired
    private LogicObjectDRepository repository;
    private List<M4RddLogicObject> findedRows;
    private ObjectDTO aux = null;


    public void getRow(LinkedListObject linkedListObject) {
        findedRows = findByIdObject(linkedListObject.getRoot().getIdObject());
        aux = linkedListObject.getRoot();
        try {
            M4RddLogicObject row = findedRows.get(0);
            if (row.getIdTransObjesp() == null)
                aux.setSpanishError(true);
            else if ((row.getIdTransObjesp()).equals(linkedListObject.getRoot().getIdObject()))
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

    public List<M4RddLogicObject> findByIdObject(String idObject) {
        return repository.findByIdObject(idObject);
    }

    public void solveQuery(M4RddLogicObject row, String language, ObjectDTO aux) throws Exception {
        switch (language) {
            case "USA":
            case "ENG":
                aux.setFunctionalRowByKey(language, row.getIdTransObjeng());
                break;
            case "FRA":
                aux.setFunctionalRowByKey(language, row.getIdTransObjfra());
                break;
            case "BRA":
                aux.setFunctionalRowByKey(language, row.getIdTransObjbra());
                break;
            case "GER":
                aux.setFunctionalRowByKey(language, row.getIdTransObjger());
                break;
        }
        if (aux.getFunctionalRowByKey(language) == null)
            aux.setValueByKey(language, NumericalResults.WITHOUT_EXTRACTION);
    }

    public String[] regex(String idObject) {
        return idObject.split("\\.");
    }
}
