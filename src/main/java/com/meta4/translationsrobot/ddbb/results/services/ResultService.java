package com.meta4.translationsrobot.ddbb.results.services;

import com.healthmarketscience.jackcess.Column;
import com.healthmarketscience.jackcess.Database;
import com.healthmarketscience.jackcess.DatabaseBuilder;
import com.meta4.translationsrobot.ddbb.results.entities.ResultEntity;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ResultService {
    private Database db;
    public ResultService() throws IOException {
        File file = new File("\\Users\\javiersg\\Desktop\\test.mdb");
        db = new DatabaseBuilder(file)
                .setFileFormat(Database.FileFormat.V2000)
                .create();
        createInsideTable();
    }

    public void createInsideTable() throws IOException {
        ResultEntity table=new ResultEntity(db);
    }

    public void addRow(String tableFun,String tableTrad,String idObject,String idClass,ArrayList<String> language) throws IOException {
        if(tableFun.equals("M4RCH_NODES"))
            db.getTable("M4RCH_NODES").addRow(Column.AUTO_NUMBER,tableFun,tableTrad,idClass,idObject, language.get(0), language.get(1), language.get(2),language.get(3),language.get(4));
        else if(tableFun.equals("M4RCH_TIS"))
            db.getTable("M4RCH_TIS").addRow(Column.AUTO_NUMBER,tableFun,tableTrad,idClass,idObject, language.get(0), language.get(1), language.get(2),language.get(3),language.get(4));
        else if(tableFun.equals("M4RCH_T3S"))
            db.getTable("M4RCH_T3S").addRow(Column.AUTO_NUMBER,tableFun,tableTrad,idClass,idObject, language.get(0), language.get(1), language.get(2),language.get(3),language.get(4));
        else if(tableFun.equals("M4RDC_FIELDS"))
            db.getTable("M4RDC_FIELDS").addRow(Column.AUTO_NUMBER,tableFun,tableTrad,idClass,idObject, language.get(0), language.get(1), language.get(2),language.get(3),language.get(4));
       else if(tableFun.equals("M4RDD_FIELDS"))
            db.getTable("M4RDD_FIELDS").addRow(Column.AUTO_NUMBER,tableFun,tableTrad,idClass,idObject, language.get(0), language.get(1), language.get(2),language.get(3),language.get(4));
        else if(tableFun.equals("M4RDC_LOGIC_OBJECT"))
            db.getTable("M4RDC_LOGIC_OBJECT").addRow(Column.AUTO_NUMBER,tableFun,tableTrad,idClass,idObject, language.get(0), language.get(1), language.get(2),language.get(3),language.get(4));
        else if(tableFun.equals("M4RDD_LOGIC_OBJECT"))
            db.getTable("M4RDD_LOGIC_OBJECT").addRow(Column.AUTO_NUMBER,tableFun,tableTrad,idClass,idObject, language.get(0), language.get(1), language.get(2),language.get(3),language.get(4));
        else if(tableFun.equals("M4RSY_ERROR_MSGSX"))
            db.getTable("M4RSY_ERROR_MSGSX").addRow(Column.AUTO_NUMBER,tableFun,tableTrad,idClass,idObject, language.get(0), language.get(1), language.get(2),language.get(3),language.get(4));
        else
            db.getTable("M4RCH_ITEMS_OWR").addRow(Column.AUTO_NUMBER,tableFun,tableTrad,idClass,idObject, language.get(0), language.get(1), language.get(2),language.get(3),language.get(4));
        }
    public void addRowInFail(String tableFun,String text) throws IOException {
            db.getTable("FAIL IN TABLE").addRow(tableFun, text);


    }


}
