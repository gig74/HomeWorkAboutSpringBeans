package com.example.springboot.otherclass;

public class TestSecondBeanXml {
    TestPrototypeBeanXml testPrototypeBeanXml;
    public TestSecondBeanXml(TestPrototypeBeanXml testPrototypeBeanXml) {
        this.testPrototypeBeanXml = testPrototypeBeanXml;
        System.out.println("TestSecondBeanXml bean started!");
    }
    public String getMessage() {
        return "Method getMessage() from TestSecondBeanXml with testPrototypeBeanXml " + testPrototypeBeanXml.toString();
    }
}
