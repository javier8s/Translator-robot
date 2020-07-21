package com.meta4.translationsrobot.ddbb.functional.services;

import com.meta4.translationsrobot.ddbb.functional.repositories.*;
import com.meta4.translationsrobot.dto.LinkedListObject;
import com.meta4.translationsrobot.dto.NumericalResults;
import com.meta4.translationsrobot.dto.ObjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class FunErrorMessageService {
    @Autowired
    private FunErrorMessageBra funErrorMessageBra;
    @Autowired
    private FunErrorMessageGer funErrorMessageGer;
    @Autowired
    private FunErrorMessageFra funErrorMessageFra;
    @Autowired
    private FunErrorMessageEng funErrorMessageEng;
    @Autowired
    private FunErrorMessageEsp funErrorMessageEsp;
    private ObjectDTO aux;
    int idFunMod,  idFunSmod,  idError;

    public String findEsp(){
        try {
            return funErrorMessageEsp.findByIdFunModNumAndIdFunSmodNumAndIdErrorMsg(idFunMod, idFunSmod, idError).get(0).getnErrorMsgesp();
        }catch(Exception e){return null;}
    }
    public void getRow(LinkedListObject linkedListObject){
        aux=linkedListObject.getRoot();
        String[] ids=regex(aux.getIdObject());
        idFunMod=Integer.valueOf(ids[0]);idFunSmod=Integer.valueOf(ids[1]);idError=Integer.valueOf(ids[2]);
        if (findEsp() == null)
                aux.setSpanishError(true);
        else {
            for (String language : aux.getValues().keySet())
                try {
                    solveQuery(language, aux);
                } catch (Exception e) {
                    aux.setValueByKey(language, NumericalResults.WITHOUT_EXTRACTION);
                }
        }
        }
    public void solveQuery(String language, ObjectDTO aux) {
        switch (language) {
            case "USA":
            case "ENG":
                aux.setFunctionalRowByKey(language,funErrorMessageEng.findByIdFunModNumAndIdFunSmodNumAndIdErrorMsg( idFunMod,  idFunSmod,  idError).get(0).getnErrorMsgeng());
                break;
            case "FRA":
                aux.setFunctionalRowByKey(language,funErrorMessageFra.findByIdFunModNumAndIdFunSmodNumAndIdErrorMsg( idFunMod,  idFunSmod,  idError).get(0).getnErrorMsgfra());
                break;
            case "BRA":
                aux.setFunctionalRowByKey(language,funErrorMessageBra.findByIdFunModNumAndIdFunSmodNumAndIdErrorMsg( idFunMod,  idFunSmod,  idError).get(0).getnErrorMsgbra());
                break;
            case "GER":
                aux.setFunctionalRowByKey(language,funErrorMessageGer.findByIdFunModNumAndIdFunSmodNumAndIdErrorMsg( idFunMod,  idFunSmod,  idError).get(0).getnErrorMsgger());
                break;
        }
        if(aux.getFunctionalRowByKey(language)==null)
            aux.setValueByKey(language,NumericalResults.WITHOUT_EXTRACTION);
    }
    public String[] regex(String idObject) {
        return idObject.split("\\.");
    }
}
