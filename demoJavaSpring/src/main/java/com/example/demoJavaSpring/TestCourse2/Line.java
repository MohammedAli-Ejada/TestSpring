package com.example.demoJavaSpring.TestCourse2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Line implements IShape , ApplicationEventPublisherAware {
    private PointTest Point1;
    private PointTest Point2;

    private ApplicationEventPublisher publisher;
    @Autowired
    private MessageSource messageSource;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public PointTest getPoint1() {
        return Point1;
    }
    @Autowired
    public void setPoint1(@Qualifier("point11") PointTest point1) {
        Point1 = point1;
    }

    public PointTest getPoint2() {
        return Point2;
    }

    @Autowired
    public void setPoint2(@Qualifier("point21") PointTest point2) {
        Point2 = point2;
    }

    @Override
    public void Draw() {
        System.out.println("Points Value => "+
                "("+getPoint1().getX()+"," +getPoint1().getY()+")"+" , "+
                "("+getPoint2().getX()+"," +getPoint2().getY()+")"
        );

        System.out.println(this.messageSource.getMessage("SayHallo",null,"Default Say Hello" , null));
        System.out.println(this.messageSource.getMessage("printLine",new Object[]{getPoint1().getX() ,getPoint1().getY() ,getPoint2().getY(), getPoint2().getY() },"Default Say Hello" , null));

        publisher.publishEvent(new DrawEvent(this));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher=applicationEventPublisher;
    }
}
