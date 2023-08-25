package com.constructorinjection;

public class Adittion {
    private int a;
    private int b;

    // if String constrcutor not present, then first written constructr will be
    // chosen.
    public Adittion(double a, double b) {
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("Constructor(double,double)");
    }

    public Adittion(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Constructor(int,int)");
    }

    // be default, values provided will be String so if String constructor present
    // then it would be chosen.
    public Adittion(String a, String b) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("Constructor(String,String)");
    }

    public void sum() {
        System.out.println("Sum= " + (this.a + this.b));
    }
}
