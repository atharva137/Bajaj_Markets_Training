package com.markets.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MathUtilsTest {
	MathUtils obj;
 
	@BeforeAll
	
	static void beforeAll() {
		System.out.println("Before ALl");
	}
	@BeforeEach
	 void init() {
		obj = new MathUtils();
	}
    
	@AfterEach
	void clean() {
		System.out.println("Cleaning up..");
	}
	
	@AfterAll
	
	static void afterall() {
		System.out.println("After all");
	}
	@Test
	void test() {
		System.out.println("Test ran");
	}

	@Test
	@Tag("Add")
	void testAdd() {

		int expected = 30;
		int actual = obj.sum(10, 20);

		assertEquals(expected, actual);
	}

	@Test
	void testValidAge() {

		assertTrue(obj.validAge(18));
	}

	@Disabled

	// @RepeatedTest(5,);
	void testAreaOfCircle(RepetitionInfo repetitioninfo) {
		System.out.println(repetitioninfo.getCurrentRepetition() + "/" + repetitioninfo.getTotalRepetitions());

		double expected = 78.5;
		double actual = obj.calCircleArea(5);

		assertEquals(expected, actual);
	}

	@Test
	@Tag("Exception")
	void testException() {

		assertThrows(ArithmeticException.class, () -> obj.div(1, 0));
	}
	

	@ParameterizedTest
	@ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE}) 
	void testOddEven(int number) {
		assertTrue(MathUtils.isOdd(number));
	}

}
