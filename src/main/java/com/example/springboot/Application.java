package com.example.springboot;

import com.example.springboot.otherclass.*;
import config.SpringBeans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        System.out.println("----------Default Annotation-------------");
        // Создание beans и запуск RestController (на порту 8080) с использованием аннотаций в классах
        SpringApplication.run(Application.class,args);
        //
        System.out.println("---------------JAVA---------------");
        // Запуск beans, описанных в файле Java контекста
        ApplicationContext applicationContextJava = new AnnotationConfigApplicationContext(SpringBeans.class);
        // Взятие созданных объектов и вызов их методов
        TestBean testBeanJava = (TestBean) applicationContextJava.getBean("testBeanJava");
        System.out.println("testBeanJava.getMessage() : " + testBeanJava.getMessage());
        TestSecondBean testSecondBeanJava = (TestSecondBean) applicationContextJava.getBean("testSecondBeanJava");
        System.out.println("testSecondBeanJava.getMessage() : " + testSecondBeanJava.getMessage());
        TestBean secondObjecTestBeanJava = (TestBean) applicationContextJava.getBean("secondObjecTestBeanJava");
        System.out.println("secondObjecTestBeanJava.getMessage() : " + secondObjecTestBeanJava.getMessage());
        //
        System.out.println("---------------XML----------------");
        // Запуск beans, описанных в файле XML контекста
        ApplicationContext applicationContextXml = new ClassPathXmlApplicationContext("spring-beans.xml");
        // Взятие созданных объектов и вызов их методов
        TestBean testBeanXml = (TestBean) applicationContextXml.getBean("testBeanXml");
        System.out.println("testBeanXml.getMessage() : " + testBeanXml.getMessage());
        TestSecondBean testSecondBeanXml = (TestSecondBean) applicationContextXml.getBean("testSecondBeanXml");
        System.out.println("testSecondBeanXml.getMessage() : " + testSecondBeanXml.getMessage());
        TestBean secondObjecTestBeanXml = (TestBean) applicationContextXml.getBean("secondObjecTestBeanXml");
        System.out.println("secondObjecTestBeanXml.getMessage() : " + secondObjecTestBeanXml.getMessage());
        //
        System.out.println("-------------Groovy---------------");
        // Запуск beans, описанных в файле Groovy контекста
        ApplicationContext groovyApplicationContext = new GenericGroovyApplicationContext("spring-beans.groovy");
        // Взятие созданных объектов и вызов их методов
        TestBean testBeanGroovy = (TestBean) groovyApplicationContext.getBean("testBeanGroovy");
        System.out.println("testBeanGroovy.getMessage() : " + testBeanGroovy.getMessage());
        TestSecondBean testSecondBeanGroovy = (TestSecondBean) groovyApplicationContext.getBean("testSecondBeanGroovy");
        System.out.println("testSecondBeanGroovy.getMessage() : " + testSecondBeanGroovy.getMessage());
        TestBean secondObjecTestBeanGroovy = (TestBean) groovyApplicationContext.getBean("secondObjecTestBeanGroovy");
        System.out.println("secondObjecTestBeanGroovy.getMessage() : " + secondObjecTestBeanGroovy.getMessage());
    }
}