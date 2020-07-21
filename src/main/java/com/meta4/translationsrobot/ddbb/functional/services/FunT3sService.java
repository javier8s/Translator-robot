package com.meta4.translationsrobot.ddbb.functional.services;

import com.meta4.translationsrobot.ddbb.functional.entities.t3s.M4RchT3S;
import com.meta4.translationsrobot.ddbb.functional.repositories.FunT3sRepository;
import com.meta4.translationsrobot.dto.LinkedListObject;
import com.meta4.translationsrobot.dto.NumericalResults;
import com.meta4.translationsrobot.dto.ObjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunT3sService {
    @Autowired
    private FunT3sRepository funT3sRepository;
    private List<M4RchT3S> findedRows;
    private ObjectDTO aux=null;


    public void getRow(LinkedListObject linkedListObject){
        findedRows=findByIdT3(linkedListObject.getRoot().getIdObject());
        aux=linkedListObject.getRoot();
        try{
            M4RchT3S row=findedRows.get(0);
            if((row.getnT3Esp()).equals(linkedListObject.getRoot().getIdObject()))
                aux.setShowed(false);
            else{
                for(String language : aux.getValues().keySet())
                    try {
                        solveQuery(row,language);
                    }catch (Exception e){
                        aux.setValueByKey(language,NumericalResults.WITHOUT_EXTRACTION);
                    }
            }
        }catch (Exception e){
        aux.setSpanishError(true);}
    }

    private void solveQuery(M4RchT3S row,String language){
        switch (language) {
            case "USA":
            case "ENG":
                aux.setFunctionalRowByKey(language,row.getnT3Eng());
                break;
            case "FRA":
                aux.setFunctionalRowByKey(language,row.getnT3Fra());
                break;
            case "BRA":
                aux.setFunctionalRowByKey(language,row.getnT3Bra());
                break;
            case "GER":
                aux.setFunctionalRowByKey(language,row.getnT3Ger());
                break;
        }
        if(aux.getFunctionalRowByKey(language)==null)
            aux.setValueByKey(language, NumericalResults.WITHOUT_EXTRACTION);
    }
    public List<M4RchT3S> findByIdT3(String idT3){
        return funT3sRepository.findByIdT3(idT3);
    }

}
