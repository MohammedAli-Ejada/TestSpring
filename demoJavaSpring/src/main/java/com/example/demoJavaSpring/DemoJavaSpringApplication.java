package com.example.demoJavaSpring;

import com.example.demoJavaSpring.TestCourse2.AppConfig;
import com.example.demoJavaSpring.TestCourse2.IShape;
import com.example.demoJavaSpring.TestCourse2.Triangle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class DemoJavaSpringApplication {
	public static void main(String[] args)
	{
		SpringApplication.run(DemoJavaSpringApplication.class, args);
/*
		//ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		context.registerShutdownHook();
		Triangle triangle=(Triangle) context.getBean("triangle");
		//triangle.Draw();



		//context.close();

		//work with interfaces
		ApplicationContext context2 = new ClassPathXmlApplicationContext("Beans.xml");
		IShape Shape=(IShape) context.getBean("circle");
		Shape.Draw();

		ApplicationContext context3 = new AnnotationConfigApplicationContext(AppConfig.class);
		IShape Shape2=(IShape) context3.getBean("line");
		Shape2.Draw();

		System.out.println(context.getMessage("SayHallo",null,"Default Say Hello" , null));
		*/
	}

}
