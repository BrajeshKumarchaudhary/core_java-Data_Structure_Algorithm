package com.datastructure.Stack;

public class StackDSUsingLinkedList {
	
	public LinkedList<Integer> createStack() {
		LinkedList<Integer> stack=new LinkedList<>();
		return stack;
	}

}

class LinkedList<T> {
	Node head;

	private class Node<T> {
		Node next;
		T data;

		public Node(T data) {
			this.data = data;

		}
	}

	public Node<T> createList(T data) {
		Node<T> node = new Node<>(data);
		if (this.head == null) {
			this.head = node;
			head.next = null;
			return this.head;
		} else {
			node.next = head;
		}
		return node;
	}

}
