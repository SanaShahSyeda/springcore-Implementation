package com.ref;

public class B {
    private int y;

    public B() {
    }

    public B(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" +
                " y='" + getY() + "'" +
                "}";
    }

}
