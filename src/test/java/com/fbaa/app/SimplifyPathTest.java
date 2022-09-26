package com.fbaa.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimplifyPathTest {
	@Test
	public void simplifyPath() {
		SimplifyPath solution = new SimplifyPath();
		String result = solution.simplify("/home/");
		String expected = "/home";
		assertEquals("It should be equals.", expected, result);
	}

	@Test
	public void simplifyPath1() {
		SimplifyPath solution = new SimplifyPath();
		String result = solution.simplify("/home/../");
		String expected = "/";
		assertEquals("It should be equals.", expected, result);
	}

	@Test
	public void simplifyPath2() {
		SimplifyPath solution = new SimplifyPath();
		String result = solution.simplify("/home/../home/./");
		String expected = "/home";
		assertEquals("It should be equals.", expected, result);
	}

	@Test
	public void simplifyPath3() {
		SimplifyPath solution = new SimplifyPath();
		String result = solution.simplify("/home/../home");
		String expected = "/home";
		assertEquals("It should be equals.", expected, result);
	}

	@Test
	public void simplifyPath4() {
		SimplifyPath solution = new SimplifyPath();
		String result = solution.simplify("/home/../home/etc/.././url/echo");
		String expected = "/home/url/echo";
		assertEquals("It should be equals.", expected, result);
	}

}
