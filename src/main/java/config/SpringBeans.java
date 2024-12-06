package config;

import com.example.springboot.otherclass.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeans {
    @Bean("testPrototypeBeanJava")
    @Scope("prototype")
    public TestPrototypeBean testPrototypeBeanJava() {
        return new TestPrototypeBean("Java");
    }
    @Bean("testBeanJava")
    @Scope("singleton")
    public TestBean testBeanJava(TestPrototypeBean testPrototypeBeanJava) {
        return new TestBean(testPrototypeBeanJava);
    }
    @Bean("testSecondBeanJava")
    @Scope("singleton")
    public TestSecondBean testSecondBeanJava(TestPrototypeBean testPrototypeBeanJava) {
        return new TestSecondBean(testPrototypeBeanJava);
    }
    @Bean("secondObjecTestBeanJava")
    @Scope("singleton")
    public TestBean secondObjecTestBeanJava(TestPrototypeBean testPrototypeBeanJava) {
        return new TestBean(testPrototypeBeanJava);
    }
}
