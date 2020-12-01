package com.datastructure.LinkedList;

public class DoublyLinkedList {

	DoublyNode head;
	DoublyNode tail;
	int size;
	
	
	public DoublyNode getHead() {
		return head;
	}
	public void setHead(DoublyNode head) {
		this.head = head;
	}
	public DoublyNode getTail() {
		return tail;
	}
	public void setTail(DoublyNode tail) {
		this.tail = tail;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public DoublyNode createDoubleLinkedList(int data) {
		DoublyNode node=new DoublyNode();
		    node.setData(data);
		    node.setNext(null);
		    node.setPrevious(null);
		    this.setHead(node);
		    this.setTail(null);
		    this.setSize(1);
		    return node;
	}
	
	public boolean checkEmptyList() {
		return head==null;
	}
	
	public DoublyNode deleteNode() {
		this.setHead(null);
		this.setSize(0);
		return this.getHead();
	}
	//insertion operation
	public void pushDataAtffront(int data) {
	   DoublyNode node=new DoublyNode();
	   node.setData(data);
	   if(this.checkEmptyList()) {
		   node.setPrevious(null);
		  this.setHead(node);
		  this.setTail(null);
		  this.setSize(1);
	   }else {
		   node.setNext(this.getHead());
		   node.setPrevious(null);
		   this.setSize(this.getSize()+1);
		   this.getHead().setPrevious(node);
		   this.setTail(node);
	   }
		
	}
	
	public void addNodeAtheEnd(int data) {
		DoublyNode node=new DoublyNode();
		node .setData(data);
		if(this.checkEmptyList()) {
			node.setNext(null);
			node.setPrevious(null);
			this.setHead(node);
			this.setTail(node);
			this.setSize(1);
		}else {
			DoublyNode  last=this.getTail();
			last.setNext(node);
			node.setNext(null);
			node.setPrevious(last);
			this.setTail(node);
			this.setSize(this.getSize()+1);
		}
	}
	
}
