package com.datastructure.Tree.binaryTree;

/**
 * @author brajesh
 *A binary Tree is tree in which each node have zero,one and two child. 
 *It is a family of dataStructure (BST,HEAP Tree ,AVL tree etc)
 *Why We Need to learn Binary tree ?.
 *
 *
 */
public class BinaryTreeByLinkedlist<T> {

	BinaryNode<T> root=null;	
	
	public BinaryTreeByLinkedlist(T data) {
		BinaryNode<T> node=new BinaryNode<>();
		node.setData(data);
		node.setLeft(null);
		node.setRight(null);
		this.root=node;
	}
	
	public BinaryNode<T> createNode(T data) {
		BinaryNode<T> searchNode=new BinaryNode<>();
		searchNode.setData(data);
		searchNode.setLeft(null);
		searchNode.setRight(null);
		return searchNode;
	}

	private BinaryNode<T> searchNode(BinaryNode<T> root) {
		if(root==null) {
			return root;
		}else if(root.left==null) {
			return searchNode(root);
		}else if(root.right==null) {
			return searchNode(root);
		}else {
			return searchNode(root.left);
		}
	}

	public void print(BinaryNode<T> root2) {
      if(root2==null) {
    	  return;
      }
      print(root2.left);
      System.out.println(root2.data);
      print(root2.right);
		
	}
	
	
}
