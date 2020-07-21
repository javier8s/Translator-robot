package com.meta4.translationsrobot.dto;

public class LinkedListObject {
    ObjectDTO root;
    String idClass;

    public LinkedListObject(String idClass) {
        this.idClass = idClass;
        root=new ObjectDTO();
    }

    public ObjectDTO getRoot() {
        return root;
    }

    public void setRoot(ObjectDTO root) {
        this.root = root;
    }

    public String getIdClass() {
        return idClass;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    public void generateObjects(int size) {
        ObjectDTO aux=root;
        for(int i=0;i<size;i++){
            aux.copyObject();
            aux=aux.getNext();
        }
    }

    public ObjectDTO searchByIdObject(String id){
        ObjectDTO aux=root;
        while(aux!=null){
            if(aux.getIdObject().equals(id))return aux;
            aux=aux.getNext();
        }
        return null;
    }


    public void setAllSpanishError(boolean flag) {
        ObjectDTO aux=root;
        while(aux!=null){
            aux.setSpanishError(flag);
            aux=aux.getNext();
        }
    }


}
