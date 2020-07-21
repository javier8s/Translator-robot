package com.meta4.translationsrobot.ddbb.translators.services;

import com.meta4.translationsrobot.ddbb.translators.entities.memoriaTBL.M4RtrAlstTbl;
import com.meta4.translationsrobot.ddbb.translators.repositories.TraTblRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Service
public class TraTblService {
    @Autowired
    private TraTblRepository repository;
    private  List<M4RtrAlstTbl> rowsQueryTbl;
    public HashMap<String,ArrayList<String>> getTableTra(String tableFunctional) throws Exception{
        rowsQueryTbl =findAllByNTablaReal(tableFunctional);
        HashMap<String,ArrayList<String>> hashMapToReturn=new HashMap<>();
            for (M4RtrAlstTbl row : rowsQueryTbl) {
                if (isCountry(row.getPais())) {
                    if (hashMapToReturn.get(row.getNombre()) == null)
                        hashMapToReturn.put(row.getNombre(), new ArrayList<>(Arrays.asList(row.getPais())));
                    else {
                        hashMapToReturn.get(row.getNombre()).add(row.getPais());
                    }
                }
            }
        return hashMapToReturn;
    }
    private List<M4RtrAlstTbl> findAllByNTablaReal(String tableFunctional){
        return repository.findAllByNTablaReal(tableFunctional);
    }
    private boolean isCountry(String country){
        return (country.equals("ENG") || country.equals("USA") || country.equals( "FRA") || country.equals( "GER") || country.equals( "BRA") );
    }
}
