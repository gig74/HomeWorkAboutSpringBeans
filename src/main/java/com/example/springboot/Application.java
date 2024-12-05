package com.example.springboot;

import com.example.springboot.otherclass.TestBeanGroovy;
import com.example.springboot.otherclass.TestBeanXml;
import com.example.springboot.otherclass.TestSecondBeanGroovy;
import com.example.springboot.otherclass.TestSecondBeanXml;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        System.out.println("---------- Annotation-------------");
        // Создание beans и запуск RestController (на порту 8080) с использованием аннотаций в классах
        SpringApplication.run(Application.class,args);
        //
        System.out.println("---------------XML----------------");
        // Запуск beans, описанных в файле XML контекста
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans.xml");
        // Взятие созданных объектов и вызов их методов
        TestBeanXml testBeanXml = (TestBeanXml) applicationContext.getBean("testBeanXml");
        System.out.println("testBeanXml.getMessage() : " + testBeanXml.getMessage());
        TestSecondBeanXml testSecondBeanXml = (TestSecondBeanXml) applicationContext.getBean("testSecondBeanXml");
        System.out.println("testSecondBeanXml.getMessage() : " + testSecondBeanXml.getMessage());
        TestBeanXml secondObjecTestBeanXml = (TestBeanXml) applicationContext.getBean("secondObjecTestBeanXml");
        System.out.println("secondObjecTestBeanXml.getMessage() : " + secondObjecTestBeanXml.getMessage());
        //
        System.out.println("-------------Groovy---------------");
        // Запуск beans, описанных в файле Groovy контекста
        ApplicationContext groovyApplicationContext = new GenericGroovyApplicationContext("spring-beans.groovy");
        // Взятие созданных объектов и вызов их методов
        TestBeanGroovy testBeanGroovy = (TestBeanGroovy) groovyApplicationContext.getBean("testBeanGroovy");
        System.out.println("testBeanGroovy.getMessage() : " + testBeanGroovy.getMessage());
        TestSecondBeanGroovy testSecondBeanGroovy = (TestSecondBeanGroovy) groovyApplicationContext.getBean("testSecondBeanGroovy");
        System.out.println("testSecondBeanGroovy.getMessage() : " + testSecondBeanGroovy.getMessage());
        TestBeanGroovy secondObjecTestBeanGroovy = (TestBeanGroovy) groovyApplicationContext.getBean("secondObjecTestBeanGroovy");
        System.out.println("secondObjecTestBeanGroovy.getMessage() : " + secondObjecTestBeanGroovy.getMessage());
    }
}