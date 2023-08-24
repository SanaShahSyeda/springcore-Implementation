package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        beansDemo student1 = (beansDemo) context.getBean("Student");
        System.out.println(student1);
    }
}
