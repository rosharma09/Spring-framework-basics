package com.qa.demo.spring_framework_basics;

public class Employee {
	
	private String e_name;
	private String dept;
	private int age;
	private int rollNo;
	
	public Employee(String e_name, String dept, int age, int rollNo) {
		super();
		this.e_name = e_name;
		this.dept = dept;
		this.age = age;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Employee [e_name=" + e_name + ", dept=" + dept + ", age=" + age + ", rollNo=" + rollNo + "]";
	}
	
}
