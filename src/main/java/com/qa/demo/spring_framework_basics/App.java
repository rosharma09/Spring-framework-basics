package com.qa.demo.spring_framework_basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

	private static ApplicationContext context;

	public static void main(String[] args) {

		// getBean() is a method defined in two interfaces
		// 1. BeanFactory
		// 2. ApplicationContext --> super set of BeanFactory and hence we are going to
		// use the ApplicationContext

		// ApplicationContext is an interface and we need to use the class implementing
		// the ApplicationContext which is ClassPathXMLApplicationContext

		context = new ClassPathXmlApplicationContext("spring-sample.xml");

		// We can only instantiate the classes and not interfaces
		Vehicles obj = (Vehicles) context.getBean("vehicle");
		obj.run();

		// Animal example
		Animal obj1 = (Animal) context.getBean("dog");
		obj1.eat();

		Tyre t = (Tyre) context.getBean("tyre");
		System.out.println(t);

		Student stud = (Student) context.getBean("student");
		System.out.println(stud);
		
		
		MobilePhone mPhn = (MobilePhone) context.getBean("mobile");
		

	}
}
