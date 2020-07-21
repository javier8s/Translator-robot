package com.meta4.translationsrobot.ddbb.functional.services;

import com.meta4.translationsrobot.ddbb.functional.repositories.FunTisRepository;
import com.meta4.translationsrobot.dto.LinkedListObject;
import com.meta4.translationsrobot.dto.NumericalResults;
import com.meta4.translationsrobot.dto.ObjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.meta4.translationsrobot.ddbb.functional.entities.tis.M4RchTis;

import java.util.List;

@Service
public class FunTisService {
    @Autowired
    private FunTisRepository funTisRepository;
    private List<M4RchTis> findedRows;
    private ObjectDTO aux=null;

    public void getRow(LinkedListObject linkedListObject){
        findedRows=findByIdTi(linkedListObject.getRoot().getIdObject());
        aux=linkedListObject.getRoot();
        try{
            M4RchTis row=findedRows.get(0);
                if((row.getnTiesp()).equals(linkedListObject.getRoot().getIdObject()))
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

    private void solveQuery(M4RchTis row, String language){
        switch (language) {
            case "USA":
            case "ENG":
                aux.setFunctionalRowByKey(language,row.getIdTransTieng());
                break;
            case "FRA":
                aux.setFunctionalRowByKey(language,row.getIdTransTifra());
                break;
            case "BRA":
                aux.setFunctionalRowByKey(language,row.getIdTransTibra());
                break;
            case "GER":
                aux.setFunctionalRowByKey(language,row.getIdTransTiger());
                break;
        }
        if(aux.getFunctionalRowByKey(language)==null)
            aux.setValueByKey(language, NumericalResults.WITHOUT_EXTRACTION);
    }
    public List<com.meta4.translationsrobot.ddbb.functional.entities.tis.M4RchTis> findByIdTi(String idTi){
        return funTisRepository.findByIdTi(idTi);
    }

}