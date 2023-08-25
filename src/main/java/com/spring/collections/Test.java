package com.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/spring/collections/collectionsconfig.xml");
        emp emp1 = (emp) context.getBean("emp1");
        System.out.println(emp1.getName());
        System.out.println(emp1.getProps());
    }

}
