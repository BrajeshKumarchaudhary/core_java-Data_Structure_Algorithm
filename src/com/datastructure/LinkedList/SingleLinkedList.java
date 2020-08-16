package com.datastructure.LinkedList;

/*
 * Single linked List
 */
public class SingleLinkedList {
	SingleNode head;
	SingleNode tail;
	int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

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

	/**
	 * @param data
	 * @return
	 */
	public SingleNode createLinkedListNode(int data) {
		SingleNode node = new SingleNode();
		node.setData(data);
		node.setNext(null);
		tail = node;
		head = node;
		size = 1;
		return node;
	}

	/**
	 * @param head
	 */
	public void printList() {
		if (existLinkedList()) {
			return;
		}
		SingleNode tempnode=head;
		for(int i=0;i<getSize();i++) {
			System.out.print(tempnode.getData());
			if (i != getSize() - 1) {
				System.out.print(" -> ");
			}
			tempnode =tempnode.getNext();
		}
	}

	public boolean existLinkedList() {
		return head ==null;
	}

	public boolean searchNode(int data) {
		SingleNode temp = head;
		boolean check = false;
		if (!existLinkedList()) {
			while (temp.getNext() != null) {
				if (temp.getData() == data) {
					check = true;
					break;
				}
				temp = temp.getNext();
			}
		} else {
			System.out.println("Linked List not exists");
		}
		return check;
	}

	public void deleteEntireList() {
		System.out.println("Deleting enrire List");
		head = null;
		tail = null;
	}

	public void deletionOfNode(int location) {
		if (existLinkedList()) {
			System.out.println("LinkedList Not exists");
			return;
		} else if (location == 0) {
			// delete first Node;
			head = head.getNext();
			setSize(getSize() - 1);
			if (getSize() == 0) {
				tail = null;// it means no more node in linked list
			}
		} else if (location >= getSize()) {
			// need to delete last node;
			SingleNode tempnode = head;
			int count = 0;
			while (count == getSize() - 1) {
				tempnode = tempnode.getNext();
			}
			if (tempnode == head) {
				head = tail = null;
				setSize(getSize() - 1);
				return;
			}
			tempnode.setNext(null);
			tail = tempnode;
			setSize(getSize() - 1);
		} else {
			// inside LinkedList
			SingleNode tempnode = head;
			for (int i = 0; i < location - 1; i++) {
				tempnode = tempnode.getNext();
			}
			tempnode.setNext(tempnode.getNext().getNext());
			setSize(getSize() - 1);
		}
	}
	public void insertInLinkedList(int nodeValue, int location) {
		SingleNode node = new SingleNode();
		node.setData(nodeValue);
		if (existLinkedList()) { // Linked List does not exists
			System.out.println("The linked list does not exist!!");
			return; 
		} else if (location == 0) {// insert at first position
			node.setNext(head);
			head = node;
		} else if (location >= size) {// insert at last position
			node.setNext(null);
			tail.setNext(node);
			tail = node; 
		} else {// insert at specified location
			SingleNode tempNode = head;
			int index = 0;
			while (index < location - 1) {// loop till we reach specified node
				tempNode = tempNode.getNext();
				index++;
			}//tempNode currently references to node after which we should insert new node
			SingleNode nextNode = tempNode.getNext(); //this is the immediate next node after new node
			tempNode.setNext(node);//update reference of tempNode to reference to new node
			node.setNext(nextNode);//update newly added nodes' next.
		}
		setSize(getSize()+1);
	}


}
