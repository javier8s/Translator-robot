package com.meta4.translationsrobot.dto;

import java.util.ArrayList;
import java.util.HashMap;

public class ObjectDTO {
    private String tableFun;
    private String idObject;
    private ObjectDTO next =null;
    private HashMap<String,NumericalResults> values;
    private HashMap<String,String> functionalRows;
    private boolean showed =true;
    private boolean spanishError=false;
    public ObjectDTO() {
        values=new HashMap<>();
        functionalRows=new HashMap<>();
    }

    public ObjectDTO nextRow(){
        this.next =new ObjectDTO();
        this.next.setTableFun(tableFun);
        for(String language: values.keySet()){
            this.next.getValues().put(language,null);
            this.next.getFunctionalRows().put(language,null);
        }
        return this.next;
    }

    public boolean isSpanishError() {
        return spanishError;
    }

    public void setSpanishError(boolean spanishError) {
        this.showed=spanishError;
        this.spanishError = spanishError;
    }

    public void setValues(HashMap<String, NumericalResults> values) {
        this.values = values;
    }

    public void setFunctionalRows(HashMap<String, String> functionalRows) {
        this.functionalRows = functionalRows;
    }

    public String getTableFun() {
        return tableFun;
    }

    public void setTableFun(String tableFun) {
        this.tableFun = tableFun;
    }

    public HashMap<String, NumericalResults> getValues(){
        return values;
    }

    public NumericalResults getValueByKey(String language){
        return values.get(language);
    }

    public void setValueByKey(String language,NumericalResults value){
        values.put(language,value);
    }

    public ObjectDTO getNext() {
        return next;
    }

    public void setNext(ObjectDTO next) {
        this.next = next;
    }

    public String getIdObject() {
        return idObject;
    }

    public void setIdObject(String idObject) {
        this.idObject = idObject;
    }

    public void setLanguagesArray(ArrayList<String> countries) {
        for(String country:countries){
            values.put(country,null);
            functionalRows.put(country,null);
        }
    }

    public boolean isShowed() {
        return showed;
    }

    public void setShowed(boolean showed) {
        this.showed = showed;
    }

    public HashMap<String, String> getFunctionalRows() {
        return functionalRows;
    }

    public void setFunctionalRowByKey(String language,String functionalRow){
        functionalRows.replace(language,functionalRow);
    }
    public String getFunctionalRowByKey(String language){
        return functionalRows.get(language);
    }

    public void copyObject(){
        next =new ObjectDTO();
        next.setFunctionalRows(functionalRows);
        next.setValues(values);
    }

    public void setAllValues(NumericalResults result){
        for(String language:values.keySet())
            values.put(language,result);
    }

    public void setLanguagesNullToWithoutExtraction() {
        for(String languages:values.keySet())
            values.put(languages,NumericalResults.WITHOUT_EXTRACTION);
    }
}
