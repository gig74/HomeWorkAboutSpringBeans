package com.example.springboot.otherclass;

public class TestBean {
    private TestPrototypeBean testPrototypeBean;
    public TestBean(TestPrototypeBean testPrototypeBean) {
        this.testPrototypeBean = testPrototypeBean;
        System.out.println("TestBean" + testPrototypeBean.getTypeContext() + " bean started!");
    }
    public String getMessage() {
        return "Method getMessage() from TestBean" + testPrototypeBean.getTypeContext() + " with testPrototypeBean " + testPrototypeBean.toString();
    }
}
