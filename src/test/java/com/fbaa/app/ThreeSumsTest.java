package com.fbaa.app;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ThreeSumsTest {

	@Test
	public void solution() {
		Integer[] list = new Integer[] { 12, 3, 1, 2, -6, 5, -8, 6 };
		ThreeSums solution = new ThreeSums();
		Integer[][] result = solution.solution(list, 0);
		Integer[][] expected = new Integer[][] { { -8, 2, 6 }, { -8, 3, 5 }, { -6, 1, 5 } };

		assertArrayEquals("it must be equals", expected, result);
	}
}
