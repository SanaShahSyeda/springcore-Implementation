package com.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testTemp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/standalonecollections/configstandalone.xml");
        temp ob = context.getBean("person", temp.class);
        System.out.println(ob);
        System.out.println(ob.getFriends().getClass().getName());
        System.out.println(ob.getFeestructure().getClass().getName());
        System.out.println(ob.getProperties().getClass().getName());
    }
}
