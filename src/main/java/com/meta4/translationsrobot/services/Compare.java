package com.meta4.translationsrobot.services;

import com.meta4.translationsrobot.dto.NumericalResults;
import com.meta4.translationsrobot.dto.ObjectDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Compare {
    private ArrayList<String> cache;
    private ArrayList<String> rowResult;
    public Compare(){
        cache=new ArrayList<>();
    }
    public ArrayList<String> orderArray(HashMap<String, NumericalResults> languages,boolean spanishError) {
        rowResult=new ArrayList<>(Arrays.asList("","","","",""));
        if(!spanishError) {
            for (String language : languages.keySet()) {
                switch (language) {
                    case "USA":
                    case "ENG":
                        rowResult.set(0, resultEvaluation(languages.get(language)));
                        break;
                    case "FRA":
                        rowResult.set(1, resultEvaluation(languages.get(language)));
                        break;
                    case "GER":
                        rowResult.set(2, resultEvaluation(languages.get(language)));
                        break;
                    case "BRA":
                        rowResult.set(3, resultEvaluation(languages.get(language)));
                        break;
                }
            }
        } else  rowResult.set(4, "No existe registro en la BBDD funcional.");
        return rowResult;
    }
    public String resultEvaluation(NumericalResults resultNum ){
        if(resultNum==NumericalResults.WITHOUT_EXTRACTION) return "No se ha hecho aún la extracción. (Tejado de Devops)";
        if(resultNum==NumericalResults.NOT_VALIDATED_YET) return "No está correctamente traducido aún. (Tejado de los traductores)";
        if(resultNum==NumericalResults.IS_WRONG) return "Falta un parche en el entorno de turno. (Error en la inyección y traspaso de parche de traducciones)";
        return "";
    }
    public boolean searchCache(String idObject) {
        try {
            for (String id : cache)
                if (id.equals(idObject))
                    return true;
        }catch (Exception e){;}
        return false;
    }
    public void setInCache(String idObject) {
        cache.add(idObject);
    }
}