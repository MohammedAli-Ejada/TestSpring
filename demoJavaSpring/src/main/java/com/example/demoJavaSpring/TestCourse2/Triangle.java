package com.example.demoJavaSpring.TestCourse2;


public class Triangle {

    private Point Point1;
    private Point Point2;
    private Point Point3;

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

    public void Draw(){
        System.out.println("Points Value => "+
                "("+getPoint1().getX()+"," +getPoint1().getY()+")"+" , "+
                "("+getPoint2().getX()+"," +getPoint2().getY()+")" +" , "+
                "("+getPoint3().getX()+"," +getPoint3().getY()+")"
        );
    }
}
