package com.meta4.translationsrobot.ddbb.translators.services;

import com.meta4.translationsrobot.ddbb.translators.entities.item.M4RtrMitems;
import com.meta4.translationsrobot.ddbb.translators.repositories.TraItemRepository;
import com.meta4.translationsrobot.dto.LinkedListObject;
import com.meta4.translationsrobot.dto.NumericalResults;
import com.meta4.translationsrobot.dto.ObjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraItemService {
    @Autowired
    private TraItemRepository traItemRepository;
    private List<M4RtrMitems> findedRows;
    private ObjectDTO aux;
    public void getAllRows(LinkedListObject linkedListObject){
        findedRows=findByIdTi(regex(linkedListObject.getRoot().getIdObject())[0]);
        aux=linkedListObject.getRoot();
        do {
            boolean flag=false;
            for(M4RtrMitems  row : findedRows) {
                try {
                    if (regex(aux.getIdObject())[1].equals(row.getIdItem())) {
                        flag=true;
                        for (String language : aux.getValues().keySet()) {
                            if (aux.getValueByKey(language) != NumericalResults.WITHOUT_EXTRACTION) {
                                try {
                                    solveQuery(row, language);
                                } catch (Exception e) {
                                    aux.setValueByKey(language, NumericalResults.WITHOUT_EXTRACTION);
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    continue;
                }
            }
            if(!flag) aux.setLanguagesNullToWithoutExtraction();
            aux = aux.getNext();
        }while(aux!=null);
    }
    public void getRow(LinkedListObject linkedListObject){
        String[] ids =regex(linkedListObject.getRoot().getIdObject());
        findedRows=findByIdTiAndIdItem(ids[0],ids[1]);
        aux=linkedListObject.getRoot();
        try{
            M4RtrMitems  row =findedRows.get(0);
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
    private void solveQuery(M4RtrMitems row,String language){
        switch (language) {
            case "USA":
            case "ENG":
                if (isNotValidate(row.getValidateUsa()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getItemUsa(),language);
                break;
            case "FRA":
                if (isNotValidate(row.getValidateFra()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getItemFra(),language);
                break;
            case "BRA":
                if (isNotValidate(row.getValidateBra()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getItemBra(),language);
                break;
            case "GER":
                if (isNotValidate(row.getValidateGer()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getItemGer(),language);
                break;
        }
    }
    private void solveLiterals(String translatedText,String language){
        if(translatedText.equals(aux.getFunctionalRows().get(language)))
            aux.setValueByKey(language,NumericalResults.IS_OK);
        else aux.setValueByKey(language,NumericalResults.IS_WRONG);
    }
    private List<M4RtrMitems> findByIdTiAndIdItem(String idTi, String idItem){
        return traItemRepository.findByIdTiAndIdItem(idTi,idItem);
    }
    public List<M4RtrMitems> findByIdTi(String idTi){
        return traItemRepository.findByIdTi(idTi);
    }
    public boolean isNotValidate(int n){
        return ((n!=2) && (n!=9));
    }
    public String[] regex(String idObject) {
        return idObject.split("\\.");
    }


}
