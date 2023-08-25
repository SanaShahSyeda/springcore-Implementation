package com.constructorinjection;

import java.util.List;

public class Person {
    private String name;
    private int id;
    private Certi certi;
    private List<String> list;

    public Person(String name, int id, Certi certi, List<String> list) {
        this.name = name;
        this.id = id;
        this.certi = certi;
        this.list = list;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + this.name + "'" +
                ", id='" + this.id + "'" +
                ", certi='" + this.certi.certiname + "'" +
                ", list='" + this.list + "'" +
                "}";
    }

}
