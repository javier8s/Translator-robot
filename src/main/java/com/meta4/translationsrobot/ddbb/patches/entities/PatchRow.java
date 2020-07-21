package com.meta4.translationsrobot.ddbb.patches.entities;

import java.math.BigInteger;

public class PatchRow {
    private Object ID_CLASS;
    private Object ID_OBJECT;
    private Object CMD_COMMENTS;
    private Object CMD_ACTIVE;

    public PatchRow(Object ID_CLASS, Object ID_OBJECT, Object CMD_ACTIVE, Object CMD_COMMENTS) {
        this.ID_CLASS = ID_CLASS;
        this.ID_OBJECT = ID_OBJECT;
        this.CMD_COMMENTS = CMD_COMMENTS;
        this.CMD_ACTIVE = CMD_ACTIVE;
    }

    public String getID_CLASS() {
        return (String) ID_CLASS;
    }

    public String getID_OBJECT() {
        return (String) ID_OBJECT;
    }

    public String getCMD_COMMENTS() {
        return (String) CMD_COMMENTS;
    }

    public Number getCMD_ACTIVE() {
        return (Number) CMD_ACTIVE;
    }
}