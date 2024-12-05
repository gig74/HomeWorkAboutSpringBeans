package com.example.springboot.otherclass;

public class TestBeanGroovy {
    TestPrototypeBeanGroovy testPrototypeBeanGroovy;
    public TestBeanGroovy(TestPrototypeBeanGroovy testPrototypeBeanGroovy) {
        this.testPrototypeBeanGroovy = testPrototypeBeanGroovy;
        System.out.println("TestBeanGroovy bean started!");
    }
    public String getMessage() {
        return "Method getMessage() from TestBeanGroovy with testPrototypeBeanGroovy " + testPrototypeBeanGroovy.toString();
    }
}
