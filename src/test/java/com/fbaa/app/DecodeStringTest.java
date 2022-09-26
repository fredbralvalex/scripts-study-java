package com.fbaa.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecodeStringTest {
	@Test
	public void decodeString1() {
		DecodeString decoder = new DecodeString();
		String input = "2[a]3[bc]";
		String expected = "aabcbcbc";
		String result = decoder.decode(input);

		assertEquals("It need to be the same", expected, result);
	}

	@Test
	public void decodeString2() {
		DecodeString decoder = new DecodeString();
		String input = "3[a2[c]]";
		String expected = "accaccacc";
		String result = decoder.decode(input);

		assertEquals("It need to be the same", expected, result);
	}

	@Test
	public void decodeString3() {
		DecodeString decoder = new DecodeString();
		String input = "2[abc]3[cd]ef";
		String expected = "abcabccdcdcdef";
		String result = decoder.decode(input);

		assertEquals("It need to be the same", expected, result);
	}
}
