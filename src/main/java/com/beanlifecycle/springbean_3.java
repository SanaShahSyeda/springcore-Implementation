package com.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class springbean_3 {
    private String subject;

    public springbean_3() {
        super();
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "{" +
                " subject='" + getSubject() + "'" +
                "}";
    }

    public springbean_3(String subject) {
        this.subject = subject;
    }

    @PostConstruct
    public void init() {
        System.out.println("Starting method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Ending method");
    }
}
