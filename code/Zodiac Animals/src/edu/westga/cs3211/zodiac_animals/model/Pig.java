package edu.westga.cs3211.zodiac_animals.model;

public class Pig {
	
	private String name;
	private int weight;
	
	public Pig(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getWeight() {
		return this.weight;
	}
}