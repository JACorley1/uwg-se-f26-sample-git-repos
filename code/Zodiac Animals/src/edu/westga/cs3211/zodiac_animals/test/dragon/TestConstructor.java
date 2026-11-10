package edu.westga.cs3211.zodiac_animals.test.dragon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.zodiac_animals.model.Dragon;

class TestConstructor {

	@Test
	void testConstuctorInitialization() {
		Dragon dragon = new Dragon(3, 12);
		
		assertEquals(3, dragon.getAge());
		assertEquals(12, dragon.getWingSpan());
	}
	
	@Test
	void testSetters() {
		Dragon dragon = new Dragon(3, 12);
		
		dragon.setAge(6);
		dragon.setWingSpan(20);
		
		assertEquals(6, dragon.getAge());
		assertEquals(20, dragon.getWingSpan());
	}

}
