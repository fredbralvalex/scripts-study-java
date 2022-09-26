package com.fbaa.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public Boolean solution(String str) {

		Map<String, String> map = new HashMap<>();
		map.put("]", "[");
		map.put(")", "(");
		map.put("}", "{");

		Stack<String> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			String element = str.charAt(i) + "";

			if (map.containsKey(element)) {

				if (stack.isEmpty() || !map.get(element).equals(stack.pop())) {
					return false;
				}
			}

			if (map.containsValue(element)) {
				stack.push(element);
			}

		}

		return stack.isEmpty();
	}

}
