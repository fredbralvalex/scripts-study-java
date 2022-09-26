package com.fbaa.app;

public class DetectCircularList {

	public class Node<T> {
		T value;
		Node<T> next;

		public Node(T value) {
			this.value = value;
		}
		
		@Override
		public boolean equals(Object o) {
			if (o == null) return false;
			if (!(o instanceof Node)) return false;
			
			return ((Node<?>)o).value == value;
		}
	}

	public boolean solution(Node<?> node) {
		Node<?> slow = node;
		Node<?> fast = node;
		if (slow == null) {
			return false;
		}
		
		while(slow.next != null && fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow.equals(fast)) {
				return true;
			}
		}
		return false;
	}
}
