package com.meta4.translationsrobot.ddbb.translators.services;

import com.meta4.translationsrobot.ddbb.translators.entities.fields.M4RtrMfieldsRdc;
import com.meta4.translationsrobot.ddbb.translators.repositories.TraFieldsRepository;
import com.meta4.translationsrobot.dto.LinkedListObject;
import com.meta4.translationsrobot.dto.NumericalResults;
import com.meta4.translationsrobot.dto.ObjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraFieldsService {
    @Autowired
    private TraFieldsRepository traFieldsRepository;
    private List<M4RtrMfieldsRdc> findedRows;
    private ObjectDTO aux;

    public void getRow(LinkedListObject linkedListObject){
        String[] ids =regex(linkedListObject.getRoot().getIdObject());
        findedRows=findByIdObjectAndIdField(ids[0],ids[1]);
        try {
            aux = linkedListObject.getRoot();
            M4RtrMfieldsRdc row = findedRows.get(0);
            for (String language : aux.getValues().keySet())
                if (aux.getValueByKey(language) != NumericalResults.WITHOUT_EXTRACTION) {
                    try {
                        solveQuery(row, language);
                    } catch (Exception e) {
                        aux.setValueByKey(language, NumericalResults.WITHOUT_EXTRACTION);
                    }
                }
        }catch(Exception e){
            linkedListObject.setAllSpanishError(true);}
    }
    private void solveQuery(M4RtrMfieldsRdc row,String language){
        switch (language) {
            case "USA":
            case "ENG":
                if (isNotValidate(row.getValidateUsa()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getnFieldsUsa(),language);
                break;
            case "FRA":
                if (isNotValidate(row.getValidateFra()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getnFieldsFra(),language);
                break;
            case "BRA":
                if (isNotValidate(row.getValidateBra()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getnFieldsBra(),language);
                break;
            case "GER":
                if (isNotValidate(row.getValidateGer()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getnFieldsGer(),language);
                break;
        }
    }
    private void solveLiterals(String translatedText,String language){
        if(translatedText.equals(aux.getFunctionalRows().get(language)))
            aux.setValueByKey(language,NumericalResults.IS_OK);
        else aux.setValueByKey(language,NumericalResults.IS_WRONG);
    }
    private List<M4RtrMfieldsRdc> findByIdObjectAndIdField(String idTi, String idItem){
        return traFieldsRepository.findByIdObjectAndIdField(idTi,idItem);
    }
    public boolean isNotValidate(int n){
        return ((n!=2) && (n!=9));
    }
    public String[] regex(String idObject) {
        return idObject.split("\\.");
    }

}
