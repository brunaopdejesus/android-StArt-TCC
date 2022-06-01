package com.example.start.model;

public class Item {

    /** Definir tipos de obras (ex.: 0-Pinturas; 1-Esculturas)**/
    private int type;

    /** Recebe objetos de obra **/
    private Object object;

    public Item() {
    }

    public Item(int type, Object object) {
        this.type = type;
        this.object = object;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

}
