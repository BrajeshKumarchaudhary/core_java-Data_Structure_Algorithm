package com.datastructure.LinkedList;

public class DoublyNode {
	int data;
	DoublyNode next;
	DoublyNode previous;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DoublyNode getNext() {
		return next;
	}

	public void setNext(DoublyNode next) {
		this.next = next;
	}

	public DoublyNode getPrevious() {
		return previous;
	}

	public void setPrevious(DoublyNode previous) {
		this.previous = previous;
	}
}
