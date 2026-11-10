package edu.westga.cs3211.zodiac_animals.test.horse;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.zodiac_animals.model.Horse;

class TestCosntructor {

	@Test
	void testConstructor() {
		Horse horse = new Horse(12, "Charles");
		
		assertEquals("Charles", horse.getName());
	}

}
