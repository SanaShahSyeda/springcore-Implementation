package com.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifecycle {
    public static void main(String[] args) {
        // this time AbstractApplicationContext used to get .registerShutdownHook()
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "com/beanlifecycle/lifecycleconfig.xml");

        // 1:
        // springbean sb = (springbean) context.getBean("lifecycle1");
        // System.out.println(sb);
        // // Method to make destroy() method called
        // context.registerShutdownHook();

        // 2:
        // springbean_2 sb2 = (springbean_2) context.getBean("lifecycle2");
        // System.out.println(sb2);
        // // Method to make destroy() method called
        context.registerShutdownHook();

        // 3:
        springbean_3 sb3 = (springbean_3) context.getBean("lifecycle3");
        System.out.println(sb3);
    }
}
