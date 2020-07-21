package com.meta4.translationsrobot.ddbb.functional.services;



import com.meta4.translationsrobot.ddbb.functional.entities.item.M4RchItemsOwr;
import com.meta4.translationsrobot.ddbb.functional.repositories.FunItemRepository;
import com.meta4.translationsrobot.dto.LinkedListObject;
import com.meta4.translationsrobot.dto.NumericalResults;
import com.meta4.translationsrobot.dto.ObjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FunItemService {
    @Autowired
    private FunItemRepository repository;
    private List<M4RchItemsOwr> findedRows;
    private ObjectDTO aux=null;
    public void getAllRows(LinkedListObject linkedListObject){
        findedRows=findByIdTi(linkedListObject.getRoot().getIdObject());
        aux = linkedListObject.getRoot();
        if(findedRows.size()==0) aux.setShowed(false);
        else
            for (M4RchItemsOwr row : findedRows) {
                try{
                    aux.setIdObject(row.getIdTi() + "." + row.getIdItem());
                    if ((row.getIdTransItemesp()).equals(row.getIdItem()))
                        aux.setShowed(false);
                    else {
                        for (String language : aux.getValues().keySet())
                            try {
                                solveQuery(row, language, aux);
                            } catch (Exception e) {
                                aux.setValueByKey(language, NumericalResults.WITHOUT_EXTRACTION);
                            }
                    }
               } catch (Exception e){
                    aux.setSpanishError(true);
                }
                if(findedRows.indexOf(row)!=findedRows.size()-1)aux = aux.nextRow();
            }
    }
    public void getRow(LinkedListObject linkedListObject){
        String[] ids =regex(linkedListObject.getRoot().getIdObject());
        findedRows=findByIdTiAndIdItem(ids[0],ids[1]);
        aux=linkedListObject.getRoot();
        try{
            M4RchItemsOwr row=findedRows.get(0);
                if (row.getIdTransItemesp() == null)
                    aux.setSpanishError(true);
                else if ((row.getIdTransItemesp()).equals(ids[1]))
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

    public List<M4RchItemsOwr> findByIdTiAndIdItem(String idTi, String idItem){
        return repository.findByIdTiAndIdItem(idTi,idItem );
    }
    public List<M4RchItemsOwr> findByIdTi(String idTi){
        return repository.findByIdTi(idTi);
    }
    public void solveQuery(M4RchItemsOwr row, String language, ObjectDTO aux) throws Exception{
        switch (language) {
            case "USA":
            case "ENG":
                aux.setFunctionalRowByKey(language,row.getIdTransItemeng());
                break;
            case "FRA":
                aux.setFunctionalRowByKey(language,row.getIdTransItemfra());
                break;
            case "BRA":
                aux.setFunctionalRowByKey(language,row.getIdTransItembra());
                break;
            case "GER":
                aux.setFunctionalRowByKey(language,row.getIdTransItemger());
                break;
        }
        if(aux.getFunctionalRowByKey(language)==null)
            aux.setValueByKey(language,NumericalResults.WITHOUT_EXTRACTION);
    }
    public String[] regex(String idObject) {
        return idObject.split("\\.");
    }

}
