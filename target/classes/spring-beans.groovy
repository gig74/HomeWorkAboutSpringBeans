beans {

    testPrototypeBeanGroovy(com.example.springboot.otherclass.TestPrototypeBeanGroovy) {
        bean ->
            bean.scope = "prototype"
    }
    testBeanGroovy(com.example.springboot.otherclass.TestBeanGroovy, testPrototypeBeanGroovy) {
        bean ->
            bean.scope = "singleton"
    }

    testSecondBeanGroovy(com.example.springboot.otherclass.TestSecondBeanGroovy, testPrototypeBeanGroovy) {
        bean ->
            bean.scope = "singleton"
    }

    secondObjecTestBeanGroovy(com.example.springboot.otherclass.TestBeanGroovy, testPrototypeBeanGroovy) {
        bean ->
            bean.scope = "singleton"
    }
}