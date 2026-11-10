package edu.westga.cs3211.zodiac_animals.test.pig;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.zodiac_animals.model.Pig;

public class TestConstructor {

	@Test
	public void testConstructor() {
		Pig animal = new Pig("Billy", 200);
		
		String specification = animal.getName() + " is " + animal.getWeight() + " lbs.";
		assertEquals("Billy is 200 lbs.", specification);
	}

}
