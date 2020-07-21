package com.meta4.translationsrobot.ddbb.patches.entities;

import com.healthmarketscience.jackcess.DatabaseBuilder;
import com.healthmarketscience.jackcess.Table;

import java.io.File;
import java.io.IOException;

public class PatchEntity {
    private Table table;
    public PatchEntity(String path, String name, String tab) throws IOException {
        table = DatabaseBuilder.open(new File(path + name)).getTable(tab);
    }

    public Table getTable() {
        return table;
    }
}

