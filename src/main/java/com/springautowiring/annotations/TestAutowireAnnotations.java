package com.springautowiring.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowireAnnotations {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "com/springautowiring/annotations/autowiringconfig.xml");
        // no need to typecast if .class file provided
        employee emp = context.getBean("employee", employee.class);
        System.out.println(emp);
        // Method to make destroy() method called
        context.registerShutdownHook();
    }
}
