beans {

    testPrototypeBeanGroovy(com.example.springboot.otherclass.TestPrototypeBean,"Groovy") {
        bean ->
            bean.scope = "prototype"
    }
    testBeanGroovy(com.example.springboot.otherclass.TestBean, testPrototypeBeanGroovy) {
        bean ->
            bean.scope = "singleton"
    }

    testSecondBeanGroovy(com.example.springboot.otherclass.TestSecondBean, testPrototypeBeanGroovy) {
        bean ->
            bean.scope = "singleton"
    }

    secondObjecTestBeanGroovy(com.example.springboot.otherclass.TestBean, testPrototypeBeanGroovy) {
        bean ->
            bean.scope = "singleton"
    }
}