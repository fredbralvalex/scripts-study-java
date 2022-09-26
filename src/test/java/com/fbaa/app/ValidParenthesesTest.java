package com.fbaa.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidParenthesesTest {

	@Test
	public void solution () {
		ValidParentheses solution = new ValidParentheses();
		
		Boolean result = solution.solution("[]{}[]()");
		
		assertEquals("it Should be true.", true, result);
	}
	
	@Test
	public void solutionFalse () {
		ValidParentheses solution = new ValidParentheses();
		
		Boolean result = solution.solution("[]{}[]())");
		
		assertEquals("it Should be false.", false, result);
	}
}
