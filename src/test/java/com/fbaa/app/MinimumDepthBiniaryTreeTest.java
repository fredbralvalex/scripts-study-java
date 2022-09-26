package com.fbaa.app;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.fbaa.app.btree.BinaryTree;

public class MinimumDepthBiniaryTreeTest {

	@Test
	public void solution() {
		Integer[] lst = new Integer[] { 3, 9, 20, null, null, 15, 7 };

		BinaryTree<Integer> tree = new BinaryTree<>(Arrays.asList(lst));

		MinimumDepthBiniaryTree<Integer> solution = new MinimumDepthBiniaryTree<>();

		int result = solution.solution(tree.getRoot());
		assertEquals("2", 2, result);
	}
}
