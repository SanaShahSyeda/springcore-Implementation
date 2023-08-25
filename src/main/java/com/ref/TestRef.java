package com.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/ref/configref.xml");
        A a = (A) context.getBean("aref");
        System.out.println("Print x value from A's object");
        System.out.println(a.getX());
        System.out.println("Print y value of  B object from A object");
        System.out.println(a.getOb().getY());
        System.out.println(a);

    }

}
