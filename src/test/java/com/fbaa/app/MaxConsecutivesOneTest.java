package com.fbaa.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxConsecutivesOneTest {

	@Test
	public void maxConsecutives1() {
		Integer[] numbers = new Integer[] { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };

		MaxConsecutivesOne solution = new MaxConsecutivesOne();
		int result = solution.maxConsecutives(numbers, 2);

		assertEquals("It should be equals.", 6, result);
	}

	@Test
	public void maxConsecutives2() {
		Integer[] numbers = new Integer[] { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };

		MaxConsecutivesOne solution = new MaxConsecutivesOne();
		int result = solution.maxConsecutives(numbers, 3);

		assertEquals("It should be equals.", 10, result);
	}
}
