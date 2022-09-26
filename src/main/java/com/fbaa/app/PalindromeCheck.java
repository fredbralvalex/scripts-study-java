package com.fbaa.app;

public class PalindromeCheck {

	public Boolean solution(String word) {

		char[] charArray = word.toCharArray();
		int i = 0;
		int idx = charArray.length - 1;
		while (i <= idx) {
			if (charArray[i] != charArray[idx]) {
				return false;
			}
			i++;
			idx--;
		}
		return true;
	}

}
