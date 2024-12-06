package com.example.springboot.otherclass;

public class TestSecondBean {
    private TestPrototypeBean testPrototypeBean;

    public TestSecondBean(TestPrototypeBean testPrototypeBean) {
        this.testPrototypeBean = testPrototypeBean;
        System.out.println("TestSecondBean" + testPrototypeBean.getTypeContext() + " bean started!");
    }
    public String getMessage() {
        return "Method getMessage() from TestSecondBean" + testPrototypeBean.getTypeContext() + " with testPrototypeBean " + testPrototypeBean.toString();
    }
}
