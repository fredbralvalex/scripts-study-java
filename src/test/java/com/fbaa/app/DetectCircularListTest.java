package com.fbaa.app;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DetectCircularListTest {

	@Test
	public void solutionNotBeCircular() {
		DetectCircularList solution = new DetectCircularList();
		DetectCircularList.Node<Integer> node0 = solution.new Node<Integer>(0);
		DetectCircularList.Node<Integer> node1 = solution.new Node<Integer>(1);
		DetectCircularList.Node<Integer> node2 = solution.new Node<Integer>(2);
		DetectCircularList.Node<Integer> node3 = solution.new Node<Integer>(3);
		DetectCircularList.Node<Integer> node4 = solution.new Node<Integer>(4);
		node0.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		boolean result = solution.solution(node0);
		assertFalse("shouldnt be circular", result);
	}

	@Test
	public void solutionBeCircular() {
		DetectCircularList solution = new DetectCircularList();
		DetectCircularList.Node<Integer> node0 = solution.new Node<Integer>(0);
		DetectCircularList.Node<Integer> node1 = solution.new Node<Integer>(1);
		DetectCircularList.Node<Integer> node2 = solution.new Node<Integer>(2);
		DetectCircularList.Node<Integer> node3 = solution.new Node<Integer>(3);
		DetectCircularList.Node<Integer> node4 = solution.new Node<Integer>(4);
		node0.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node0;

		boolean result = solution.solution(node0);
		assertTrue("should be circular", result);
	}
}
