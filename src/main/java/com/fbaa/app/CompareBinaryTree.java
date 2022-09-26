package com.fbaa.app;

import com.fbaa.app.btree.Node;

public class CompareBinaryTree<T> {
	public Boolean solution(Node<T> tree1, Node<T> tree2) {
		if (tree1 == null && tree2 == null) {
			return true;
		} else if (tree1 != null && tree2 != null && tree1.value == tree2.value) {
			return solution(tree1.right, tree2.right) && solution(tree1.left, tree2.left);
		} else {
			return false;
		}
	}
}
