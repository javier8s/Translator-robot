package com.meta4.translationsrobot.ddbb.functional.services;

import com.meta4.translationsrobot.ddbb.functional.entities.item.M4RchItemsOwr;
import com.meta4.translationsrobot.ddbb.functional.entities.webLiteral.M4RwsLiterals;
import com.meta4.translationsrobot.ddbb.functional.repositories.FunItemRepository;
import com.meta4.translationsrobot.ddbb.functional.repositories.FunWebLiteralsRepository;
import com.meta4.translationsrobot.dto.LinkedListObject;
import com.meta4.translationsrobot.dto.NumericalResults;
import com.meta4.translationsrobot.dto.ObjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class FunWebLiteralsService {
    @Autowired
    private FunWebLiteralsRepository repository;
    private List<M4RwsLiterals> findedRows;
    private ObjectDTO aux=null;

    public void getRow(LinkedListObject linkedListObject){
        String[] ids =regexPoint(linkedListObject.getRoot().getIdObject());
        String[] idsDivision1  =regexComa(ids[0]);
        String[] idsDivision2  =regexComa(ids[1]);
        findedRows=findByIdTypeAndPathInfoAndBaseNameAndIdLiteralAndIdOrganization(
                BigInteger.valueOf(Integer.valueOf(idsDivision2[0])),idsDivision1[0],idsDivision1[1]
                ,idsDivision2[1],idsDivision2[2]);
        aux=linkedListObject.getRoot();
        try{
            M4RwsLiterals row=findedRows.get(0);
            if (row.getZvalueesp() == null)
                aux.setSpanishError(true);
            else if ((row.getZvalueesp()).equals(idsDivision2[1]))
                aux.setShowed(false);
            else {
                for (String language : aux.getValues().keySet())
                    try {
                        solveQuery(row, language, aux);
                    } catch (Exception e) {
                        aux.setValueByKey(language, NumericalResults.WITHOUT_EXTRACTION);
                    }
            }
        }catch (Exception e){
            aux.setSpanishError(true);
        }
    }

    public List<M4RwsLiterals> findByIdTypeAndPathInfoAndBaseNameAndIdLiteralAndIdOrganization(BigInteger idType, String pathInfo, String baseName, String idLiteral, String idOrganization
    ){
        return repository.findByIdTypeAndPathInfoAndBaseNameAndIdLiteralAndIdOrganization(idType,  pathInfo, baseName, idLiteral, idOrganization);
    }
    public void solveQuery(M4RwsLiterals row, String language, ObjectDTO aux) throws Exception{
        switch (language) {
            case "USA":
            case "ENG":
                aux.setFunctionalRowByKey(language,row.getZvalueeng());
                break;
            case "FRA":
                aux.setFunctionalRowByKey(language,row.getZvaluefra());
                break;
            case "BRA":
                aux.setFunctionalRowByKey(language,row.getZvaluebra());
                break;
            case "GER":
                aux.setFunctionalRowByKey(language,row.getZvalueger());
                break;
        }
        if(aux.getFunctionalRowByKey(language)==null)
            aux.setValueByKey(language, NumericalResults.WITHOUT_EXTRACTION);
    }
    public String[] regexPoint(String idObject) {
        return idObject.split("\\.");
    }
    public String[] regexComa(String idObject) {
        return idObject.split("\\,");
    }

}
