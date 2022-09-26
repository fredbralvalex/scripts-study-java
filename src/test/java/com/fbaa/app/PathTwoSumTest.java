package com.fbaa.app;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

import com.fbaa.app.btree.BinaryTree;

public class PathTwoSumTest {

	@Test
	public void seachPathTwoSum() {
		Integer[] numbers = new Integer[] { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, 5, 1 };
		BinaryTree<Integer> tree = new BinaryTree<>(Arrays.asList(numbers));

		Integer[][] expected = new Integer[][] { { 5, 4, 11, 2 }, { 5, 8, 4, 5 } };
		tree.printAsTree();

		PathTwoSum solution = new PathTwoSum();
		Integer[][] result = solution.solution(tree.getRoot(), 22);
		assertArrayEquals("Should be equals", expected, result);

	}

}
