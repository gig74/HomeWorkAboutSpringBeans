package com.example.springboot.otherclass;

public class TestSecondBeanGroovy {
    TestPrototypeBeanGroovy testPrototypeBeanGroovy;
    public TestSecondBeanGroovy(TestPrototypeBeanGroovy testPrototypeBeanGroovy) {
        this.testPrototypeBeanGroovy = testPrototypeBeanGroovy;
        System.out.println("TestSecondBeanGroovy bean started!");
    }
    public String getMessage() {
        return "Method getMessage() from TestSecondBeanGroovy with testPrototypeBeanGroovy " + testPrototypeBeanGroovy.toString();
    }
}
