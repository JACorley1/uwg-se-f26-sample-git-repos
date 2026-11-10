package edu.westga.cs3211.zodiac_animals.model;

/**
 * Models snakes 
 * @author Riley & Demetrius
 * @version 11/10/2026
 */
public class Snake {
	private double length;
	private String color;
	
	/**
	 * Creates a snake with a color and length.
	 * @param length the length of the snake.
	 * @param color the snake's color.
	 * @precondition color cannot be null or empty.
	 * @postcondition a snake object has been created.
	 */
	public Snake(double length, String color) {
		if (color == null) {
			throw new IllegalArgumentException("Color cannot be null.");
		}
		if (color.isEmpty()) {
			throw new IllegalArgumentException("Color cannot be empty.");
		}
		this.length = length;
		this.color = color;
	}
	
	/**
	 * Gets the snakes color
	 * 
	 * @precondition: none
	 * @return returns the snakes color
	 */
	public String getColor() {
		return this.color;
	}
	
	/**
	 * Gets the snakes length
	 * 
	 * @precondition: none
	 * @return returns the snakes length
	 */
	public double getLength() {
		return this.length;
	}

	
	
	
	
	
	
	
	
	
	
	
}
