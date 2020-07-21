package com.meta4.translationsrobot;

import com.meta4.translationsrobot.ddbb.patches.entities.PatchRow;
import com.meta4.translationsrobot.ddbb.patches.services.PatchService;
import com.meta4.translationsrobot.ddbb.results.services.ResultService;
import com.meta4.translationsrobot.dto.LinkedListObject;
import com.meta4.translationsrobot.dto.NumericalResults;
import com.meta4.translationsrobot.dto.ObjectDTO;
import com.meta4.translationsrobot.services.Compare;
import com.meta4.translationsrobot.services.ServiceTableManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

@Component
public class LauncherTranslationsRobot {
    private HashMap<String,HashMap<String,ArrayList<String>>> tables;
    private HashMap<String,HashMap<String,HashMap<String, HashMap<String,HashMap<String,NumericalResults>>>>> finalResult =null;
    @Autowired
    private ServiceTableManager serviceTableManager;
    private PatchService patchService;
    private Compare compare;
    private PatchRow patchRow;
    private LinkedListObject linkedListObject;
    private ResultService resultService;
    private String idClass,idObject;

    public void execute(String path, String name, String tab) throws IOException {
        resultService=new ResultService();
        finalResult = new HashMap<>();
        compare = new Compare();
        patchService = new PatchService(path,name,tab);
        //for(int index=0;index<patchService.getTable().getRowCount();index++) {
        for(int index=0;index<315;index++) {
            patchService.nextRow();
            patchRow = patchService.getRow();
            if(patchRow.getCMD_ACTIVE()!=null){
                if (patchRow.getCMD_ACTIVE().intValue() == -1) {
                    this.idClass = patchRow.getID_CLASS();
                    if (idClass.equals("ITEM")||idClass.equals("NODE")||
                            idClass.equals("NODE STRUCTURE")||
                            idClass.equals("META4OBJECT")
                          //  || idClass.equals("FIELD")
                            || idClass.equals("ERROR MESSAGE")
                           || idClass.equals("LOGICAL TABLE")) {
                        idObject = patchRow.getID_OBJECT();
                        setTables();
                        solve();
                    }
                }
            }
        }
    }

    public void solve() throws IOException {
        HashMap<String,NumericalResults> languagesResult;
        for(String functionalTable: tables.keySet()){
            for(String translatorTable:tables.get(functionalTable).keySet()) {
               if (!compare.searchCache(idObject)){
                searchSolution(functionalTable, tables.get(functionalTable).get(translatorTable));
                ObjectDTO aux = linkedListObject.getRoot();
                languagesResult = new HashMap<>();
                do{
                    if (aux.isShowed()) {
                        compare.setInCache(aux.getIdObject());
                        for (String language : aux.getValues().keySet())
                            languagesResult.put(language, aux.getValueByKey(language));
                        if (!languagesResult.isEmpty()) {
                            resultService.addRow(functionalTable, translatorTable,
                                    aux.getIdObject(), idClass,
                                    compare.orderArray(languagesResult,
                                            aux.isSpanishError()));
                        }
                    }
                    aux = aux.getNext();
                }while(aux!=null);
                }
            }
        }
    }
    private void searchSolution(String functionalTable, ArrayList<String> countries){
        linkedListObject =new LinkedListObject(idClass);
        linkedListObject.getRoot().setIdObject(idObject);
        linkedListObject.getRoot().setLanguagesArray(countries);
        linkedListObject.getRoot().setTableFun(functionalTable);
        serviceTableManager.createService(functionalTable, linkedListObject);
    }
    public void setTables() throws IOException {
        tables=new HashMap<>();
        for (String functionalTable : serviceTableManager.getTableFun(idClass))
            try {
                tables.put(functionalTable, serviceTableManager.getTableTra(functionalTable));
            }catch(Exception e){
                resultService.addRowInFail(functionalTable, "No se púdo encontrar.");
            }
    }
}
