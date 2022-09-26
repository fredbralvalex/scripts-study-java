package com.fbaa.app;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.fbaa.app.btree.BinaryTree;
import com.fbaa.app.btree.Node;

public class InvertBinaryTreeTest {
	@Test
	public void solutionTest() {

		Integer[] lst = new Integer[] { 1, 3, 2, 7, 6, 5, 4, null, null, null, null, null, null, 9, 8 };
		Integer[] lst2 = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, null, null, null, null, null, null };
//		List<Integer> arr = Arrays.asList(lst2);

		BinaryTree<Integer> tree = new BinaryTree<>(Arrays.asList(lst2));
		BinaryTree<Integer> invertedTree = new BinaryTree<>(Arrays.asList(lst));

		InvertBinaryTree<Integer> solution = new InvertBinaryTree<>();
		Node<Integer> rootInvertedTree = solution.solution(tree.getRoot());
		BinaryTree<Integer> tree2 = new BinaryTree<>(rootInvertedTree);

		invertedTree.printAsTree();
		System.out.println("............");
		tree2.printAsTree();

		CompareBinaryTree<Integer> compare = new CompareBinaryTree<>();
		Boolean result = compare.solution(tree2.getRoot(), invertedTree.getRoot());
		assertEquals("It should be equals!!", true, result);
	}
}
