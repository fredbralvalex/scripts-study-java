package com.fbaa.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestNonRepeatingStringTest {

	@Test
	public void solution01() {
		LongestNonRepeatingString solution = new LongestNonRepeatingString();
		String result = solution.solution("abcabcbb");
		String expected = "abc";
		
		assertEquals("It should be equals", expected, result);
	}
	@Test
	public void solution02() {
		LongestNonRepeatingString solution = new LongestNonRepeatingString();
		String result = solution.solution("zzzabcdzzz");
		String expected = "zabcd";
		
		assertEquals("It should be equals", expected, result);
	}
	@Test
	public void solution03() {
		LongestNonRepeatingString solution = new LongestNonRepeatingString();
		String result = solution.solution("zzzabcdadjhj");
		String expected = "zabcd";
		
		assertEquals("It should be equals", expected, result);
	}
}
