package com.example.demoJavaSpring.TestCourse2;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Triangle implements ApplicationContextAware, BeanNameAware , InitializingBean , DisposableBean , IShape {
 // private  List<Point> pointList;
//    public List<Point> getPointList() {
//        return pointList;
//    }
//
//    public void setPointList(List<Point> pointList) {
//        this.pointList = pointList;
//    }
//
//    public void Draw(){
//        for (Point point : pointList)
//        {
//            System.out.println("Point Value => "+
//                    "("+point.getX()+"," +point.getY()+")"+" , "
//            );
//        }
//
//    }


    private Point Point1;
    private Point Point2;
    private Point Point3;

    private  ApplicationContext context;
    public Point getPoint1() {
        return Point1;
    }

    public void setPoint1(Point point1) {
        Point1 = point1;
    }

    public Point getPoint2() {
        return Point2;
    }

    public void setPoint2(Point point2) {
        Point2 = point2;
    }

    public Point getPoint3() {
        return Point3;
    }

    public void setPoint3(Point point3) {
        Point3 = point3;
    }

    @Override
    public void Draw(){
        System.out.println("Points Value => "+
                "("+getPoint1().getX()+"," +getPoint1().getY()+")"+" , "+
                "("+getPoint2().getX()+"," +getPoint2().getY()+")" +" , "+
                "("+getPoint3().getX()+"," +getPoint3().getY()+")"
        );
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=applicationContext;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");

    }

    public void MyInit() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    public void MyCleanUp() throws Exception {
        System.out.println("destroy");

    }
}
