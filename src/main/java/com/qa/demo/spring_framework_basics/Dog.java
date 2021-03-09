package com.qa.demo.spring_framework_basics;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

	public void eat() {
		System.out.println("Dog is eating");
	}

}
