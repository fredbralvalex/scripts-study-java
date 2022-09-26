package com.fbaa.app;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.fbaa.app.btree.BinaryTree;

public class BinaryTreeTraversalTest {

	@Test
	public void createBinaryTreeTest() {
//		Integer[] lst = new Integer[] { 10, 12, 15, 25, 30, 36 };
//		Integer[] lst2 = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		Integer[] lst2 = new Integer[] { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 0, 5, 1};
//		Integer[] lst2 = new Integer[] { 1, 3, 2, 7, 6, 5, 4, 9, 8 };
		List<Integer> arr = Arrays.asList(lst2);
		BinaryTree<Integer> tree = new BinaryTree<>(arr);

		tree.printLinkedList();
		System.out.println("............");
		tree.printPreorderTraversal();
		// List<Integer> list = tree.inorderTraversal();
		System.out.println("............");
		tree.printAsTree();
		// assertArrayEquals(arr.toArray(), list.toArray());

	}
}
