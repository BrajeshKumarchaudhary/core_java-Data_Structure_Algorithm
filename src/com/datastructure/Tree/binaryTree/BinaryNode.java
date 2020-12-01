package com.datastructure.Tree.binaryTree;


public class BinaryNode<T> {
	BinaryNode left;
	BinaryNode right;
	T data;
	public BinaryNode getLeft() {
		return left;
	}
	public void setLeft(BinaryNode left) {
		this.left = left;
	}
	public BinaryNode getRight() {
		return right;
	}
	public void setRight(BinaryNode right) {
		this.right = right;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
}
