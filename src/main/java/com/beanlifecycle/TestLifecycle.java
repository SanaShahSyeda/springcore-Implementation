package com.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifecycle {
    public static void main(String[] args) {
        // this time AbstractApplicationContext used to get .registerShutdownHook()
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "com/beanlifecycle/lifecycleconfig.xml");
        springbean sb = (springbean) context.getBean("lifecycle1");
        System.out.println(sb);
        // Method to make destroy() method called
        context.registerShutdownHook();
    }
}
