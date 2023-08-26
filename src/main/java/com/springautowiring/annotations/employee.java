package com.springautowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class employee {
    @Autowired
    @Qualifier("address2")
    // @Qualifier used to show which bean object to use
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
