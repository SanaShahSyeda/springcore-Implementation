package com.beanlifecycle;

class springbean {
    private double price;

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        System.out.println("Setting property !!");
        this.price = price;
    }

    public springbean(double price) {
        this.price = price;
    }

    public springbean() {
        super();
    }

    @Override
    public String toString() {
        return "{" +
                " price='" + getPrice() + "'" +
                "}";
    }

    public void init() {
        System.out.println("Inside init() method !!");
    }

    public void destroy() {
        System.out.println("Inside destroy() method !!");
    }

}