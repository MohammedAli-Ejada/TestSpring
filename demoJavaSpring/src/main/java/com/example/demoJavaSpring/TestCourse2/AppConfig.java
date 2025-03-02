package com.example.demoJavaSpring.TestCourse2;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan(basePackages = "com.example.demoJavaSpring.TestCourse2")
public class AppConfig {
    @Bean
    public PointTest point11() {
        PointTest p = new PointTest();
        p.setX(0);
        p.setY(0);
        return p;
    }

    @Bean
    public PointTest point21() {
        PointTest p = new PointTest();
        p.setX(10);
        p.setY(10);
        return p;
    }

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages"); // Refers to messages.properties
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
}
