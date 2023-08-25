package com.ref;

public class A {
    private int x;
    private B ob;

    public A() {
    }

    public A(int x, B ob) {
        this.x = x;
        this.ob = ob;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public B getOb() {
        return this.ob;
    }

    public void setOb(B ob) {
        this.ob = ob;
    }

    @Override
    public String toString() {
        return "{" +
                " x='" + getX() + "'" +
                ", ob='" + getOb() + "'" +
                "}";
    }

}
