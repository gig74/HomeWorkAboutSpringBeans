package com.example.springboot.model;

import org.springframework.stereotype.Component;

@Component
public class SecondBean {
    public SecondBean(PrototypeBean prototypeBean) {
        System.out.println("Second bean started!");
        System.out.println("Prototype bean second " + prototypeBean.toString());
    }
}
