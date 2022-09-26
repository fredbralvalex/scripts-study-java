package com.fbaa.app;

import java.util.LinkedList;
import java.util.Queue;

import com.fbaa.app.btree.Node;

public class MinimumDepthBiniaryTree<T> {

	public class Tuple {
		Node<T> node; 
		int level;
		public Tuple(Node<T> node, int level) {
			this.node = node;
			this.level = level;
		}
	}
	
	public int solution(Node<T> root) {
	

		Queue<Tuple> queue = new LinkedList<>();
		queue.add(new Tuple(root, 0));
		
		while(queue != null && queue.size() > 0) {
			Tuple tuple = queue.poll();		
			if (tuple != null) {				
				if (tuple.node.left == null && tuple.node.right == null) {
					return tuple.level;
				}
				int level = tuple.level + 1;
				if (tuple.node.left != null) {
					queue.add(new Tuple(tuple.node.left, level));
				}
				
				if (tuple.node.right != null) {
					queue.add(new Tuple(tuple.node.right, level));
				}
			}
		}
		
		return 0;
	}
}
