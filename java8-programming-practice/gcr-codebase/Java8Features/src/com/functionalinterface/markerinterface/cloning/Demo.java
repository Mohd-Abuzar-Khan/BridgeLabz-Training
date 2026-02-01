package com.functionalinterface.markerinterface.cloning;

public class Demo implements Cloneable {

    int id;
    String name;

    public Demo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
