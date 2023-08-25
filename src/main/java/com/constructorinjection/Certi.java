package com.constructorinjection;

public class Certi {
    public String name;

    public Certi(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + this.name + "'" +
                "}";
    }

}
