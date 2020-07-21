package com.meta4.translationsrobot.ddbb.translators.services;

import com.meta4.translationsrobot.ddbb.translators.entities.node.M4RtrMnodos;
import com.meta4.translationsrobot.ddbb.translators.repositories.TraNodeRepository;
import com.meta4.translationsrobot.dto.LinkedListObject;
import com.meta4.translationsrobot.dto.NumericalResults;
import com.meta4.translationsrobot.dto.ObjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraNodeService {
        @Autowired
        private TraNodeRepository repository;
        private List<M4RtrMnodos> findedRows;
        private ObjectDTO aux;
     public void getAllRows(LinkedListObject linkedListObject){
         findedRows=findByIdT3(regex(linkedListObject.getRoot().getIdObject())[0]);
         aux=linkedListObject.getRoot();
         do {
             boolean flag=false;
             for(M4RtrMnodos  row : findedRows) {
                 try {
                     if (regex(aux.getIdObject())[1].equals(row.getIdNode())) {
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
        findedRows=findByIdT3AndIdNode(ids[0],ids[1]);
        aux=linkedListObject.getRoot();
        try{
            M4RtrMnodos  row =findedRows.get(0);
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
    private void solveQuery(M4RtrMnodos row,String language){
        try {
            switch (language) {
                case "USA":
                case "ENG":
                    if (isNotValidate(row.getValidateUsa()))
                        aux.setValueByKey(language,NumericalResults.NOT_VALIDATED_YET);
                    else
                        solveLiterals(row.getNodeUsa(),language);
                    break;
                case "FRA":
                    if (isNotValidate(row.getValidateFra()))
                        aux.setValueByKey(language,NumericalResults.NOT_VALIDATED_YET);
                    else
                        solveLiterals(row.getNodeFra(),language);
                    break;
                case "BRA":
                    if (isNotValidate(row.getValidateBra()))
                        aux.setValueByKey(language,NumericalResults.NOT_VALIDATED_YET);
                    else
                        solveLiterals(row.getNodeBra(),language);
                    break;

                case "GER":
                    if (isNotValidate(row.getValidateGer()))
                        aux.setValueByKey(language,NumericalResults.NOT_VALIDATED_YET);
                    else
                        solveLiterals(row.getNodeGer(),language);
                    break;
            }

        } catch(Exception e){
            aux.setValueByKey(language,NumericalResults.WITHOUT_EXTRACTION);
        }
    }

    private void solveLiterals(String translatedText,String language){
        if(translatedText.equals(aux.getFunctionalRows().get(language)))
            aux.setValueByKey(language,NumericalResults.IS_OK);
        else aux.setValueByKey(language,NumericalResults.IS_WRONG);
    }
    private List<M4RtrMnodos> findByIdT3AndIdNode(String idT3, String idNode){
        return repository.findByIdT3AndIdNode(idT3,idNode);
    }
    private List<M4RtrMnodos> findByIdT3(String idT3){
        return repository.findByIdT3(idT3);
    }
    public boolean isNotValidate(int n){
        return ((n!=2) && (n!=9));
    }
    public String[] regex(String idObject) {
        return idObject.split("\\.");
    }

}
