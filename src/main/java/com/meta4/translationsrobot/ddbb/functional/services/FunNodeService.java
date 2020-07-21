package com.meta4.translationsrobot.ddbb.functional.services;




import com.meta4.translationsrobot.ddbb.functional.entities.node.M4RchNodes;
import com.meta4.translationsrobot.ddbb.functional.repositories.FunNodeRepository;
import com.meta4.translationsrobot.dto.LinkedListObject;
import com.meta4.translationsrobot.dto.NumericalResults;
import com.meta4.translationsrobot.dto.ObjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunNodeService {


    @Autowired
    private FunNodeRepository funNodeRepository;
    private List<M4RchNodes> findedRows;
    private ObjectDTO aux=null;
    public void getAllRows(LinkedListObject linkedListObject){
        findedRows=findByIdT3(linkedListObject.getRoot().getIdObject());
        aux=linkedListObject.getRoot();
        if(findedRows.size()==0) aux.setShowed(false);
        else
            for(M4RchNodes row :findedRows){
                try{
                aux.setIdObject(row.getIdT3() + "." + row.getIdNode());
                if(row.getnNodeesp()==null)
                    aux.setSpanishError(true);
                else if((row.getnNodeesp()).equals(row.getIdNode()))
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
                if(findedRows.indexOf(row)!=findedRows.size()-1)aux=aux.nextRow();

            }
    }
    public void getRow(LinkedListObject linkedListObject){
        String[] ids =regex(linkedListObject.getRoot().getIdObject());
        findedRows=findByIdT3AndIdNode(ids[0],ids[1]);
        aux=linkedListObject.getRoot();
        try{
            M4RchNodes row=findedRows.get(0);
            if((row.getnNodeesp()).equals(ids[1]))
                aux.setShowed(false);
            else{
                for (String language : aux.getValues().keySet())
                    try {
                        solveQuery(row, language);
                    }catch (Exception e){
                        aux.setValueByKey(language,NumericalResults.WITHOUT_EXTRACTION);
                    }
            }
        }catch (Exception e){
            aux.setSpanishError(true);}
    }


    private void solveQuery(M4RchNodes row,String language){
        switch (language) {
            case "USA":
            case "ENG":
                aux.setFunctionalRowByKey(language,row.getnNodeeng());
                break;
            case "FRA":
                aux.setFunctionalRowByKey(language,row.getnNodefra());
                break;
            case "BRA":
                aux.setFunctionalRowByKey(language,row.getnNodebra());
                break;
            case "GER":
                aux.setFunctionalRowByKey(language,row.getnNodeger());
                break;
        }
        if(aux.getFunctionalRowByKey(language)==null)
            aux.setValueByKey(language, NumericalResults.WITHOUT_EXTRACTION);
    }
    public List<M4RchNodes> findByIdT3AndIdNode(String idT3, String idNode){
        return funNodeRepository.findByIdT3AndIdNode(idT3,idNode);
    }
    public List<M4RchNodes> findByIdT3(String idT3){
        return funNodeRepository.findByIdT3(idT3);
    }
    public String[] regex(String idObject) {
        return idObject.split("\\.");
    }

}
