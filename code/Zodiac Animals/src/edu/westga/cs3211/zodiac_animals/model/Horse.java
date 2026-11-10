package edu.westga.cs3211.zodiac_animals.model;

public class Horse {

	private int age;
	private String name;
	
	public Horse(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
