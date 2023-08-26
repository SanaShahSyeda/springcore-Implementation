package com.springautowiring;

public class employee {
    private Address address;

    public employee() {
    }

    public employee(Address address) {
        this.address = address;
        System.out.println("Through constructor ----");
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        System.out.println("Through setter method ----");
        this.address = address;
    }

    @Override
    public String toString() {
        return "{" +
                " address='" + getAddress() + "'" +
                "}";
    }

}
