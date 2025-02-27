package com.example.demoJavaSpring;

import com.example.demoJavaSpring.TestCourse2.Triangle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DemoJavaSpringApplication {
	public static void main(String[] args)
	{
		SpringApplication.run(DemoJavaSpringApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Triangle triangle=(Triangle) context.getBean("triangle");
		triangle.Draw();
	}

}
