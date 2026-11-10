package edu.westga.cs3211.zodiac_animals.test.snake;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.zodiac_animals.model.Snake;

/**
 * Test class for the constructor of the Snake class.
 * @author Riley & Demetrius
 * @version 11/10/2026
 */
public class TestConstructor {

	@Test
	public void test() {
		Snake diamondBack = new Snake(4.2, "grey");
		assertEquals("grey", diamondBack.getColor());
		assertEquals(4.2, diamondBack.getLength(), .001);
	}

}
