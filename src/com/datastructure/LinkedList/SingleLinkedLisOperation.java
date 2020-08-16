package com.datastructure.LinkedList;

public class SingleLinkedLisOperation {

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		list.createLinkedListNode(20);
		list.insertInLinkedList(10, 1);
		list.printList();
		System.out.println();
		list.insertInLinkedList(20, 2);
		list.printList();
		System.out.println();
		list.insertInLinkedList(30, 3);
		list.printList();
		System.out.println();
		list.insertInLinkedList(40, 0);
		list.printList();
		System.out.println();
		if(list.searchNode(40))
		{
			System.out.println("Value Found");
		}
		list.deletionOfNode(4);
		System.out.println("After Deletion:0 position");
		list.printList();
		System.out.println();
		
		
	}

}
