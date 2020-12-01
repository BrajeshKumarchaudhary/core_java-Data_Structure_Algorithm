package com.datastructure.Tree.binaryTree;

public class BinaryTree {
  
	TreeNode root;
	private class TreeNode{
		TreeNode left;
		TreeNode right;
		int data;//Generic types
		TreeNode(int data){
			this.data=data;
		}
	}
	
	public TreeNode createBinaryTree() {
		TreeNode root=new TreeNode(10);
		TreeNode first=new TreeNode(2);
		TreeNode second=new TreeNode(3);
		TreeNode third=new TreeNode(4);
	    root.left=first;
	    root.right=second;
	    first.left=third;
	   this.root=root;
	   return this.root;
	}
	public void print(TreeNode root) {
		if(root==null) {
			return;
		}else {
		print(root.left);
		System.out.println(root.data);
		print(root.right);
		}
	}
	
	
	
	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		TreeNode binaryTree=tree.createBinaryTree();
		tree.print(binaryTree);
	}
}
