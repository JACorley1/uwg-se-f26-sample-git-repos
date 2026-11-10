package edu.westga.cs3211.zodiac_animals.model;

public class Dragon {

	private int age;
	
	private int wingSpan;
	
	public Dragon(int age, int wingSpan) {
		
		this.age = age;
		this.wingSpan = wingSpan;
	}
	
	public int getAge() {
		
		return this.age;
	}

	public int getWingSpan() {
		
		return this.wingSpan;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}
}
