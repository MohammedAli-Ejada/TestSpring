package com.example.demoJavaSpring.TestCourse2;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.Resource;
import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements IShape{
    private Point Center;

    public Point getCenter() {
        return Center;
    }

    @Autowired
    @Qualifier("circleRelated")
    public void setCenter(Point center) {
        Center = center;
    }
//    @Resource(name = "point3")
//    public void setCenter(Point center) {
//        Center = center;
//    }

    @Override
    public void Draw() {
        System.out.println("Points Value For Circle => "+
                "("+getCenter().getX()+"," +getCenter().getY()+")"
        );
    }

    @PostConstruct
    public void MyInitCircle() {
        System.out.println("Init Circle");
    }

    @PreDestroy
    public void MyDestroyCircle() {
        System.out.println("Destroy Circle");
    }
}
