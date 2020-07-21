package com.meta4.translationsrobot.ddbb.patches.services;

import com.healthmarketscience.jackcess.Row;
import com.healthmarketscience.jackcess.Table;
import com.meta4.translationsrobot.ddbb.patches.entities.PatchEntity;
import com.meta4.translationsrobot.ddbb.patches.entities.PatchRow;
import com.meta4.translationsrobot.ddbb.patches.repositories.PatchRepository;

import java.io.IOException;

public class PatchService implements PatchRepository {

    private Row row;

    private PatchEntity patchEntity;

    public PatchService(String path, String name, String tab) throws IOException {
        patchEntity=new PatchEntity(path, name,  tab);
    }
    public Table getTable() {
        return patchEntity.getTable();
    }
    public Row nextRow() throws IOException {
        row=getTable().getNextRow();
        return  row;
    }
    public PatchRow getRow() {
        return new PatchRow( row.get("ID_CLASS"),   row.get("ID_OBJECT"),    row.get("CMD_ACTIVE"), row.get("CMD_COMMENTS"));
    }
    public void showRow() throws IOException {
        for(int i=0;i<10;i++){
            System.out.println("Column 'RDL' has value: " + nextRow().get("CMD_ACTIVE"));
        }
    }
}
