package com.meta4.translationsrobot.ddbb.translators.services;

import com.meta4.translationsrobot.ddbb.translators.entities.item.M4RtrMitems;
import com.meta4.translationsrobot.ddbb.translators.entities.tis.M4RtrMtis;
import com.meta4.translationsrobot.ddbb.translators.repositories.TraTisRepository;
import com.meta4.translationsrobot.dto.LinkedListObject;
import com.meta4.translationsrobot.dto.NumericalResults;
import com.meta4.translationsrobot.dto.ObjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraTisService {
    @Autowired
    private TraTisRepository funTisRepository;
    private List<M4RtrMtis> findedRows;
    private ObjectDTO aux = null;


    public void getRow(LinkedListObject linkedListObject){
        findedRows=findByIdTi(linkedListObject.getRoot().getIdObject());
        aux=linkedListObject.getRoot();
        try{
            M4RtrMtis row =findedRows.get(0);
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

    private void solveQuery(M4RtrMtis row,String language){
        switch (language) {
            case "USA":
            case "ENG":
                if (isNotValidate(row.getValidateUsa()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getnTiUsa(),language);
                break;
            case "FRA":
                if (isNotValidate(row.getValidateFra()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getnTiFra(),language);
                break;
            case "BRA":
                if (isNotValidate(row.getValidateBra()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getnTiBra(),language);
                break;
            case "GER":
                if (isNotValidate(row.getValidateGer()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getnTiGer(),language);
                break;
        }
    }
    private void solveLiterals(String translatedText,String language){
        if(translatedText.equals(aux.getFunctionalRows().get(language)))
            aux.setValueByKey(language,NumericalResults.IS_OK);
        else aux.setValueByKey(language,NumericalResults.IS_WRONG);
    }
    public List<M4RtrMtis> findByIdTi(String idTi) {
        return funTisRepository.findByIdTi(idTi);
    }
    public boolean isNotValidate(int n){
        return ((n!=2) && (n!=9));
    }
}