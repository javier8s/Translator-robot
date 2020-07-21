package com.meta4.translationsrobot.ddbb.translators.services;

import com.meta4.translationsrobot.ddbb.translators.entities.webLiterals.M4RtrMliterals;
import com.meta4.translationsrobot.ddbb.translators.repositories.TraWebLiteralsRepository;
import com.meta4.translationsrobot.dto.LinkedListObject;
import com.meta4.translationsrobot.dto.NumericalResults;
import com.meta4.translationsrobot.dto.ObjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class TraWebLiteralsService {
    @Autowired
    private TraWebLiteralsRepository traWebLiteralsRepository;
    private List<M4RtrMliterals> findedRows;
    private ObjectDTO aux;
    public void getRow(LinkedListObject linkedListObject){
        String[] ids =regexPoint(linkedListObject.getRoot().getIdObject());
        String[] idsDivision1  =regexComa(ids[0]);
        String[] idsDivision2  =regexComa(ids[1]);
        findedRows=findByIdTypeAndPathInfoAndBaseNameAndIdLiteralAndIdOrganization(
                BigInteger.valueOf(Integer.valueOf(idsDivision2[0])),idsDivision1[0],idsDivision1[1]
                ,idsDivision2[1],idsDivision2[2]);
        aux=linkedListObject.getRoot();
        try{
            M4RtrMliterals  row =findedRows.get(0);
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
    private void solveQuery(M4RtrMliterals row,String language){
        switch (language) {
            case "USA":
            case "ENG":
                if (isNotValidate(row.getValidateUsa()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getZvalueusa(),language);
                break;
            case "FRA":
                if (isNotValidate(row.getValidateFra()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getZvaluefra(),language);
                break;
            case "BRA":
                if (isNotValidate(row.getValidateBra()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getZvaluebra(),language);
                break;
            case "GER":
                if (isNotValidate(row.getValidateGer()))
                    aux.setValueByKey(language, NumericalResults.NOT_VALIDATED_YET);
                else
                    solveLiterals(row.getZvalueger(),language);
                break;
        }
    }
    private void solveLiterals(String translatedText,String language){
        if(translatedText.equals(aux.getFunctionalRows().get(language)))
            aux.setValueByKey(language,NumericalResults.IS_OK);
        else aux.setValueByKey(language,NumericalResults.IS_WRONG);
    }
    private List<M4RtrMliterals> findByIdTypeAndPathInfoAndBaseNameAndIdLiteralAndIdOrganization
            (
                    BigInteger idType, String pathInfo, String baseName, String idLiteral, String idOrganization
            ){
        return traWebLiteralsRepository.findByIdTypeAndPathInfoAndBaseNameAndIdLiteralAndIdOrganization(idType,  pathInfo, baseName,  idLiteral, idOrganization);
    }
    public boolean isNotValidate(int n){
        return ((n!=2) && (n!=9));
    }
    public String[] regexPoint(String idObject) {
        return idObject.split("\\.");
    }
    public String[] regexComa(String idObject) {
        return idObject.split("\\,");
    }
}
