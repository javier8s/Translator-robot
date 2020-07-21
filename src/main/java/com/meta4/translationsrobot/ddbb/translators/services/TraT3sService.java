package com.meta4.translationsrobot.ddbb.translators.services;

import com.meta4.translationsrobot.ddbb.translators.entities.item.M4RtrMitems;
import com.meta4.translationsrobot.ddbb.translators.entities.t3s.M4RtrMm4Object;
import com.meta4.translationsrobot.ddbb.translators.repositories.TraT3sRepository;
import com.meta4.translationsrobot.dto.LinkedListObject;
import com.meta4.translationsrobot.dto.NumericalResults;
import com.meta4.translationsrobot.dto.ObjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraT3sService {

    @Autowired
    private TraT3sRepository traT3sRepository;
    private List<M4RtrMm4Object> findedRows;
    private ObjectDTO aux = null;



    public void getRow(LinkedListObject linkedListObject){
        findedRows=findByIdT3(linkedListObject.getRoot().getIdObject());
        aux=linkedListObject.getRoot();
        try{
            M4RtrMm4Object row =findedRows.get(0);
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
    public List<M4RtrMm4Object> findByIdT3(String idT3) {
        return traT3sRepository.findByIdT3(idT3);
    }

    private void solveQuery(M4RtrMm4Object row,String language){
        switch (language) {
            case "USA":
            case "ENG":
                if (isNotValidate(row.getValidateUsa()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getnM4ObjUsa(),language);
                break;
            case "FRA":
                if (isNotValidate(row.getValidateFra()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getnM4ObjFra(),language);
                break;
            case "BRA":
                if (isNotValidate(row.getValidateBra()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getnM4ObjBra(),language);
                break;
            case "GER":
                if (isNotValidate(row.getValidateGer()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getnM4ObjGer(),language);
                break;
        }
        if(aux.getValueByKey(language)==null)
            aux.setValueByKey(language,NumericalResults.WITHOUT_EXTRACTION);
    }
    private void solveLiterals(String translatedText,String language){
        if(translatedText.equals(aux.getFunctionalRows().get(language)))
            aux.setValueByKey(language,NumericalResults.IS_OK);
        else aux.setValueByKey(language,NumericalResults.IS_WRONG);
    }
    public boolean isNotValidate(int n){
        return ((n!=2) && (n!=9));
    }

}
