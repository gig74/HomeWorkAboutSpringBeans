package com.example.springboot.otherclass;

public class TestPrototypeBean {
    private String typeContext;
    public String getTypeContext() {
        return typeContext;
    }
    public TestPrototypeBean(String typeContext) {
        this.typeContext = typeContext;
        System.out.println("TestPrototypeBean" + typeContext + " bean started!");
    }
}
