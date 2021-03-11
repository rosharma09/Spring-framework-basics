package com.qa.demo.spring_framework_basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicles{
	
	@Autowired
	private Tyre tyre;

	public void run() {

		System.out.println("Car is running " +tyre);
	}

}
