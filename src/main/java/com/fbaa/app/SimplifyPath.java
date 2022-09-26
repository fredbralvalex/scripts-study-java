package com.fbaa.app;

import java.util.Stack;
import java.util.stream.Collectors;

public class SimplifyPath {

	public String simplify(String path) {
		int i0 = 0;
		Stack<String> stack = new Stack<>();

		if (!path.endsWith("/")) {
			path = path + "/";
		}

		for (int i = 0; i < path.length(); i++) {
			if (path.charAt(i) == '/') {
				String current = path.substring(i0, i);
				i0 = i;
				if (!current.equals("")) {
					if (current.equals("/..")) {
						if (stack.size() > 0) {
							stack.pop();
						}
					} else if (current.equals("/.") || current.equals("/")) {
						continue;
					} else {
						stack.push(current);
					}

				}
			}

		}

		if (stack.size() == 0) {
			stack.push("/");
		}
		return stack.stream().collect(Collectors.joining());
	}
}
