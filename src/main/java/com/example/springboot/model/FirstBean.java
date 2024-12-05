package com.example.springboot.model;

import org.springframework.stereotype.Component;

@Component
public class FirstBean {

    private SecondBean secondBean;

    public void setSecondBean(SecondBean secondBean) {
        this.secondBean = secondBean;
    }

    public FirstBean(PrototypeBean prototypeBean) {
        System.out.println("First bean started!");
        System.out.println("Prototype bean first " + prototypeBean.toString());
    }


}
