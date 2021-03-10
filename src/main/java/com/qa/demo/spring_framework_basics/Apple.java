package com.qa.demo.spring_framework_basics;

public class Apple implements MobilePhone{
	
	private String mobNumber;

	public void call(int number) {
		System.out.println("Calling the dailed Number: " + String.valueOf(number));
		dailNumber(String.valueOf(number));
	}

	public int dailNumber(String number) {
		System.out.println("Dailing the number: "+Integer.parseInt(number));
		return Integer.parseInt(number);
	}

	@Override
	public String toString() {
		return "Apple [mobNumber=" + mobNumber + "]";
	}

	public String getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}

}
