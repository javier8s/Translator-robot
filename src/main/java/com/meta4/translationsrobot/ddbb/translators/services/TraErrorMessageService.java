package com.meta4.translationsrobot.ddbb.translators.services;

import com.meta4.translationsrobot.ddbb.translators.entities.item.M4RtrMitems;
import com.meta4.translationsrobot.ddbb.translators.repositories.*;
import com.meta4.translationsrobot.dto.LinkedListObject;
import com.meta4.translationsrobot.dto.NumericalResults;
import com.meta4.translationsrobot.dto.ObjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraErrorMessageService {
    @Autowired
    private TraErrorMessageEng traErrorMessageEng;
    @Autowired
    private TraErrorMessageEsp traErrorMessageEsp;
    @Autowired
    private TraErrorMessageFra traErrorMessageFra;
    @Autowired
    private TraErrorMessageBra traErrorMessageBra;
    @Autowired
    private TraErrorMessageGer traErrorMessageGer;
    private ObjectDTO aux;
    int idFunMod,  idFunSmod,  idError;
    public void getRow(LinkedListObject linkedListObject){
        aux=linkedListObject.getRoot();
        String[] ids =regex(linkedListObject.getRoot().getIdObject());
        idFunMod=Integer.valueOf(ids[0]);idFunSmod=Integer.valueOf(ids[1]); idError=Integer.valueOf(ids[2]);
        try{
            for (String language : aux.getValues().keySet())
                if (aux.getValueByKey(language) != NumericalResults.WITHOUT_EXTRACTION){
                    try {
                        solveQuery(language);
                    } catch (Exception e){
                        aux.setValueByKey(language,NumericalResults.WITHOUT_EXTRACTION);
                    }
                }
        }catch(Exception e){
            aux.setLanguagesNullToWithoutExtraction();
        }
    }



    private void solveQuery(String language){
        switch (language) {
            case "USA":
            case "ENG":
                if (isNotValidate(Integer.valueOf(traErrorMessageEng.findByIdFunModNumAndIdFunSmodNumAndIdErrorMsg( idFunMod,  idFunSmod,  idError).get(0).getValidateEng())))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(traErrorMessageEng.findByIdFunModNumAndIdFunSmodNumAndIdErrorMsg( idFunMod,  idFunSmod,  idError).get(0).getnErrorMsgeng(),language);
                break;
            case "FRA":
                if (isNotValidate(traErrorMessageFra.findByIdFunModNumAndIdFunSmodNumAndIdErrorMsg( idFunMod,  idFunSmod,  idError).get(0).getValidateFra()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(traErrorMessageFra.findByIdFunModNumAndIdFunSmodNumAndIdErrorMsg( idFunMod,  idFunSmod,  idError).get(0).getnErrorMsgfra(),language);
                break;
            case "BRA":
                if (isNotValidate(traErrorMessageBra.findByIdFunModNumAndIdFunSmodNumAndIdErrorMsg( idFunMod,  idFunSmod,  idError).get(0).getValidateBra()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(traErrorMessageBra.findByIdFunModNumAndIdFunSmodNumAndIdErrorMsg( idFunMod,  idFunSmod,  idError).get(0).getnErrorMsgbra(),language);
                break;
            case "GER":
                if (isNotValidate(traErrorMessageGer.findByIdFunModNumAndIdFunSmodNumAndIdErrorMsg( idFunMod,  idFunSmod,  idError).get(0).getValidateGer()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(traErrorMessageGer.findByIdFunModNumAndIdFunSmodNumAndIdErrorMsg( idFunMod,  idFunSmod,  idError).get(0).getnErrorMsgger(),language);
                break;
        }
    }
    private void solveLiterals(String translatedText,String language){
        if(translatedText.equals(aux.getFunctionalRows().get(language)))
            aux.setValueByKey(language,NumericalResults.IS_OK);
        else aux.setValueByKey(language,NumericalResults.IS_WRONG);
    }
    public String[] regex(String idObject) {
        return idObject.split("\\.");
    }
    public boolean isNotValidate(int n){
        return ((n!=2) && (n!=9));
    }

}
