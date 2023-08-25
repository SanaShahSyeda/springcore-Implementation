package com.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_ci {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/constructorinjection/ciconfig.xml");
        Person person1 = (Person) context.getBean("person");
        System.out.println(person1);
        Adittion ad = (Adittion) context.getBean("Add");
        ad.sum();

    }
}
