package com.fbaa.app;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeCheckTest {

	@Test
	public void solution() {
		PalindromeCheck solution = new PalindromeCheck();	
		assertTrue("Should be True.", solution.solution("hannah"));
	}
	
	@Test
	public void solution2() {
		PalindromeCheck solution = new PalindromeCheck();	
		assertTrue("Should be True.", solution.solution("level"));
	}
	
	@Test
	public void solution3() {
		PalindromeCheck solution = new PalindromeCheck();	
		assertFalse("Should be False.", solution.solution("romaemor"));
	}
}
