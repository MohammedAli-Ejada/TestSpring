package com.example.demoJavaSpring.TestCourse2;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent {
    public DrawEvent(Object source) {
        super(source);
    }

    public String toString(){
        return  "DrawEvent is Fired";
    }
}
