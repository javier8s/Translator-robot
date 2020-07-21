package com.meta4.translationsrobot.ddbb.patches.repositories;

import com.healthmarketscience.jackcess.Row;
import com.healthmarketscience.jackcess.Table;

import java.io.IOException;

public interface PatchRepository {
     Table getTable() ;
     Row nextRow() throws IOException ;
}

