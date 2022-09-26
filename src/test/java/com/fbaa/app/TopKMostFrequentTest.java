package com.fbaa.app;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TopKMostFrequentTest {

	@Test
	public void solution() {
		Integer[] numbers = new Integer[] { 1, 1, 1, 3, 3, 5, 6, 7, 8, 9, 10 };
		Integer[] expected = new Integer[] { 1, 3 };
		TopKMostFrequent solution = new TopKMostFrequent();

		Integer[] result = solution.solution(numbers, 2);

		assertArrayEquals("They should be equals", expected, result);
	}
}
