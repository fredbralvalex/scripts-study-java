package com.fbaa.app;

import java.util.Stack;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DecodeString {

	public String repeat(String string, int times){
		String tmp = new String(new char[times]);
		return tmp.replace("\0", string);
	}
	
	public String decode(String input) {
		Stack<String> stack = new Stack<>();
		String token = "";
		Integer number = 0;
		StringBuilder sb = new StringBuilder();
		sb.toString().contains("a");
		sb.toString().toLowerCase();
		sb.append("");
		Pattern pattern = Pattern.compile("[0-9]*");

		for (int i = 0; i < input.length(); i++) {
			Character c = input.charAt(i);
			if (c.equals('[')) {
				if (token != "") {
					stack.push(token);
					token = "";
				}
				stack.push(number.toString());
				number = 0;
			} else if (c.equals(']')) {
				if (token != "") {
					stack.push(token);
					token = "";
				}

				String newStr = "";
				String first = stack.pop();
				while (stack.size() > 0 && !pattern.matcher(first.toString()).matches()) {
					newStr = first + newStr;
					first = stack.pop();
				}
				newStr = repeat(newStr, Integer.parseInt(first));
				stack.push(newStr);
			} else {
				if (pattern.matcher(c.toString()).matches()) {
					number = 10 * number + Integer.parseInt(c.toString());
				} else {
					token = token + c;
				}
			}
		}

		if (token != "") {
			stack.push(token);
		}

		return stack.stream().collect(Collectors.joining());
	}
}

class isogram {
	public static boolean isIsogram(String str) {
		// str.length() == str.toLowerCase().chars().distinct().count();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (sb.toString().contains(c.toString().toLowerCase())) {
				return false;
			} else {
				sb.append(c);
			}
		}

		return true;
	}
}