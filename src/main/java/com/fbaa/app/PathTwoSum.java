package com.fbaa.app;

import java.util.ArrayList;
import java.util.List;

import com.fbaa.app.btree.Node;

public class PathTwoSum {

	public Integer[][] solution(Node<Integer> root, int sum) {
		List<Integer[]> result = new ArrayList<>();

		if (root != null) {
			deepFirstSearch(root, new ArrayList<>(), 0, sum, result);
		}
		Integer[][] response = new Integer[result.size()][];
		return result.toArray(response);
	}

	private void deepFirstSearch(Node<Integer> node, List<Integer> currentPath, int sum, int expected,
			List<Integer[]> result) {
		if (node == null || node.value == null) {
			return;
		}

		sum = sum + node.value;
		boolean noChild = node.left == null && node.right == null;

		List<Integer> actualPath = new ArrayList<>(currentPath);
		actualPath.add(node.value);

		if (noChild && sum == expected) {
			Integer[] list = new Integer[actualPath.size()];
			result.add(actualPath.toArray(list));
			return;
		}

		deepFirstSearch(node.left, actualPath, sum, expected, result);
		deepFirstSearch(node.right, actualPath, sum, expected, result);

	}

}
