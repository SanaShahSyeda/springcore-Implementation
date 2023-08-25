package com.constructorinjection;

public class Certi {
    public String certiname;

    public Certi(String certiname) {
        this.certiname = certiname;
    }

    @Override
    public String toString() {
        return "{" +
                " certiname='" + this.certiname + "'" +
                "}";
    }

}
