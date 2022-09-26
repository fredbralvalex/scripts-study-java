package com.fbaa.app;

import com.fbaa.app.btree.Node;

public class InvertBinaryTree<T> {
	public Node<T> solution(Node<T> tree) {
		if (tree.left == null && tree.right == null) {
			return tree;
		}

		Node<T> right = tree.right;
		tree.right = tree.left ;
		tree.left = right;

		if (tree.left != null) {
			tree.left = solution(tree.left);
		}
		if (tree.right != null) {
			tree.right = solution(tree.right);
		}
		return tree;
	}
}
