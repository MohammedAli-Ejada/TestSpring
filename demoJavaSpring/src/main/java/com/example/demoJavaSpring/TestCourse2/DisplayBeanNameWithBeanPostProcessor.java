package com.example.demoJavaSpring.TestCourse2;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayBeanNameWithBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("Before Initialization: " + beanName);
        return bean; // Return the same or modified bean
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("After Initialization: " + beanName);
        return bean; // Return the same or modified bean
    }
}
