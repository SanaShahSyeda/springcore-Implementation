package com.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class springbean_2 implements InitializingBean, DisposableBean {
    private double price;

    public springbean_2() {
        super();
    }

    public springbean_2(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price before init() method");
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                " price='" + getPrice() + "'" +
                "}";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("Inside init() method using 'InitializingBean' interface");
    }

    @Override
    public void destroy() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("Inside destroy() method using 'DisposableBean' interface");
    }

}
