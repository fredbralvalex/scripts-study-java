package com.fbaa.app;

public class LongestNonRepeatingString {

	public String solution(String str) {
		int result = 0;
		int i0 = 0;
		String value = "";
		String token = "";
		for (int i = 0; i < str.length(); i++) {
			token = String.valueOf(str.charAt(i));
			i0 = i;

			while (true) {
				i0++;
				if (i0 >= str.length() || token.contains(String.valueOf(str.charAt(i0)))) {
					if (token.length() > result) {
						value = token;
					}
					result = Math.max(token.length(), result);
					break;
				}
				token = token + str.charAt(i0);
			}
		}

		return value;
	}
}
