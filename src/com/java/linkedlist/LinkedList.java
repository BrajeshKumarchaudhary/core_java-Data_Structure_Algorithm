package com.java.linkedlist;

public class LinkedList {
       SingleNode head;
       SingleNode tail;
 
	public SingleNode getHead() {
		return head;
	}

	public void setHead(SingleNode head) {
		this.head = head;
	}

	public SingleNode getTail() {
		return tail;
	}

	public void setTail(SingleNode tail) {
		this.tail = tail;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		SingleNode node=new SingleNode();
		node .setData(20);
		list.setHead(node);
		node.setNext(null);
		list.setTail(null);
		

	}

}
