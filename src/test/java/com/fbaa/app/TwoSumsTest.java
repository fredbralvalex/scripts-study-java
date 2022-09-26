package com.fbaa.app;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TwoSumsTest {

	@Test
	public void solution() {
		TwoSums solution = new TwoSums();
		Integer[] result = solution.solution(new Integer[] { 4, 1, 2, -2, 11, 15, 1, -1, -6, -4 }, 9);
		Integer[] expected = new Integer[] { -2, 11 };

		assertArrayEquals("should be equals.", expected, result);

	}
}
