package com.example.springboot.otherclass;
public class TestBeanXml {
    TestPrototypeBeanXml testPrototypeBeanXml;
    public TestBeanXml(TestPrototypeBeanXml testPrototypeBeanXml) {
        this.testPrototypeBeanXml = testPrototypeBeanXml;
        System.out.println("TestBeanXml bean started!");
    }
    public String getMessage() {
        return "Method getMessage() from TestBeanXml with testPrototypeBeanXml " + testPrototypeBeanXml.toString();
    }
}
