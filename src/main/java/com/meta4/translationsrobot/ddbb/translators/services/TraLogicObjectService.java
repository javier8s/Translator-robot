package com.meta4.translationsrobot.ddbb.translators.services;

import com.meta4.translationsrobot.ddbb.translators.entities.logicalObject.M4RtrMobjsRdc;
import com.meta4.translationsrobot.ddbb.translators.repositories.TraItemRepository;
import com.meta4.translationsrobot.ddbb.translators.repositories.TraLogicObjectRepository;
import com.meta4.translationsrobot.dto.LinkedListObject;
import com.meta4.translationsrobot.dto.NumericalResults;
import com.meta4.translationsrobot.dto.ObjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraLogicObjectService {

    @Autowired
    private TraLogicObjectRepository traItemRepository;
    private List<M4RtrMobjsRdc> findedRows;
    private ObjectDTO aux;
    public void getRow(LinkedListObject linkedListObject){
        findedRows=findByIdObject(linkedListObject.getRoot().getIdObject());
        aux=linkedListObject.getRoot();
        try{
            M4RtrMobjsRdc  row =findedRows.get(0);
            for (String language : aux.getValues().keySet())
                if (aux.getValueByKey(language) != NumericalResults.WITHOUT_EXTRACTION){
                    try {
                        solveQuery(row, language);
                    } catch (Exception e){
                        aux.setValueByKey(language,NumericalResults.WITHOUT_EXTRACTION);
                    }
                }

        }catch(Exception e){
            aux.setLanguagesNullToWithoutExtraction();
        }
    }
    private void solveQuery(M4RtrMobjsRdc row,String language){
        switch (language) {
            case "USA":
            case "ENG":
                if (isNotValidate(row.getValidateUsa()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getnLogicObjUsa(),language);
                break;
            case "FRA":
                if (isNotValidate(row.getValidateFra()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getnLogicObjFra(),language);
                break;
            case "BRA":
                if (isNotValidate(row.getValidateBra()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getnLogicObjBra(),language);
                break;
            case "GER":
                if (isNotValidate(row.getValidateGer()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getnLogicObjGer(),language);
                break;
        }
    }
    private void solveLiterals(String translatedText,String language){
        if(translatedText.equals(aux.getFunctionalRows().get(language)))
            aux.setValueByKey(language,NumericalResults.IS_OK);
        else aux.setValueByKey(language,NumericalResults.IS_WRONG);
    }


    public List<M4RtrMobjsRdc> findByIdObject(String idObject){
        return traItemRepository.findByIdObject(idObject);
    }

    public boolean isNotValidate(int n){
        return ((n!=2) && (n!=9));
    }
    public String[] regex(String idObject) {
        return idObject.split("\\.");
    }


}
