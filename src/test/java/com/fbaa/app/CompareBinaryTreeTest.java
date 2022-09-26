package com.fbaa.app;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.fbaa.app.btree.BinaryTree;

public class CompareBinaryTreeTest {

	@Test
	public void ShoulBeEquals() {
		List<Integer> list = Arrays.asList(10, 12, 15, 25, 30, 36);
		List<Integer> list2 = new ArrayList<>(list);
		BinaryTree<Integer> tree1 = new BinaryTree<>(list);
		BinaryTree<Integer> tree2 = new BinaryTree<>(list2);

		CompareBinaryTree<Integer> compare = new CompareBinaryTree<>();

		Boolean result = compare.solution(tree1.getRoot(), tree2.getRoot());

		assertEquals("It should be equals!!", true, result);

	}
}
