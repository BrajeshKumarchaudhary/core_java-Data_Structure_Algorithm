package com.datastructure.Tree.binaryTree;

public class BinaryOps {

	public static void main(String[] args) {
	BinaryTreeByLinkedlist<Integer> binaryrootTree=new BinaryTreeByLinkedlist<>(10);
	BinaryNode<Integer> firstNode=binaryrootTree.createNode(2);
	BinaryNode<Integer> ndNode=binaryrootTree.createNode(3);
	BinaryNode<Integer> rdstNode=binaryrootTree.createNode(4);
	BinaryNode<Integer> fourthNode=binaryrootTree.createNode(5);
	binaryrootTree.root.left=firstNode;
	binaryrootTree.root.right=rdstNode;
	firstNode.left=fourthNode;
	binaryrootTree.print(binaryrootTree.root);
}
}
