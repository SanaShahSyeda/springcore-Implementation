package com.springautowiring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "com/springautowiring/autowiringconfig.xml");
        // no need to typecast if .class file provided
        employee emp = context.getBean("employee", employee.class);
        System.out.println(emp);
        // Method to make destroy() method called
        context.registerShutdownHook();
    }
}
