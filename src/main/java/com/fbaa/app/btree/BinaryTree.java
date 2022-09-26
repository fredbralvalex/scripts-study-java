package com.fbaa.app.btree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class ListNode<T> {
	T data;
	ListNode<T> next;

	ListNode(T data) {
		this.data = data;
		next = null;
	}
}

public class BinaryTree<T> {

	ListNode<T> head;
	Node<T> root;

	public BinaryTree(Node<T> root) {
		this.root = root;
//		inorderTree();
	}

//	private void inorderTree() {
//		inorderNode(root);
//	}
//
//	private void inorderNode(Node<T> node) {
//		if (node != null) {
//			// push to list
//			inorderNode(node.left);
//			inorderNode(node.right);
//		}
//
//	}

	public BinaryTree(List<T> list) {
		Collections.reverse(list);
		for (T item : list) {
			this.push(item);
		}
		convert2BinaryKey();
	}

	public Node<T> getRoot() {
		return this.root;
	}

	private void push(T item) {
		ListNode<T> newNode = new ListNode<T>(item);
		newNode.next = head;
		head = newNode;
	}

	void convert2BinaryKey() {
		Queue<Node<T>> queue = new LinkedList<>();

		if (head == null) {
			root = null;
		}

		root = new Node<T>(head.data);
		queue.add(root);
		head = head.next;
		while (head != null) {
			Node<T> parent = queue.peek();
			Node<T> left = null, right = null;

			left = new Node<T>(head.data);
			queue.add(left);
			head = head.next;
			if (head != null) {
				right = new Node<T>(head.data);
				queue.add(right);
				head = head.next;
			}

			parent.left = left;
			parent.right = right;

			queue.poll();
		}
	}

	List<T> inorderTraversal() {
		List<T> result = new ArrayList<T>();
		inorderTraversal(root, result);
		return result;
	}

	private void inorderTraversal(Node<T> node, List<T> result) {
		if (node != null) {
			inorderTraversal(node.left, result);
			result.add(node.value);
			inorderTraversal(node.right, result);
		}
	}

	public void printLinkedList() {
		printLinkedList(head);
	}

	private void printLinkedList(ListNode<T> node) {
		if (node != null) {
			System.out.println(node.data);
			printLinkedList(node.next);
		}
	}

	public void printInorderTraversal() {
		printInorderTraversal(root);
	}

	private void printInorderTraversal(Node<T> node) {
		if (node != null) {
			printInorderTraversal(node.left);
			System.out.println(node.value);
			printInorderTraversal(node.right);
		}
	}

	public void printPreorderTraversal() {
		printPreorderTraversal(root);
	}

	private void printPreorderTraversal(Node<T> node) {
		if (node != null) {
			System.out.println(node.value);
			printPreorderTraversal(node.left);
			printPreorderTraversal(node.right);
		}
	}

	void printPostorderTraversal() {
		printPostorderTraversal(root);
	}

	private void printPostorderTraversal(Node<T> node) {
		if (node != null) {
			printPostorderTraversal(node.left);
			printPostorderTraversal(node.right);
			System.out.println(node.value);
		}
	}

	public void printAsTree() {
		printNode(root, 0, "");
	}

	private void printNode(Node<T> node, int level, String position) {
		if (node != null) {
			if (node.value != null) {
				System.out.println("[" + level + ":" + position + "] " + node.value);
			}
			printNode(node.left, level + 1, position + "L");
			printNode(node.right, level + 1, position + "R");
		}

	}

}
