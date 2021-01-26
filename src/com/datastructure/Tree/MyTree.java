package com.datastructure.Tree;

import java.util.Queue;

import com.java.linkedlist.LinkedList;

public class MyTree {

	public  static void  printPreorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.println(root.data); //preorder
		printPreorder(root.left);
		printPreorder(root.right);
	}
	public  static void  inPreorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		
		inPreorder(root.left);
		System.out.println(root.data); //inorder
		inPreorder(root.right);
	}
	public  static void  postPreorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		
		inPreorder(root.left);
		inPreorder(root.right);
		System.out.println(root.data); //postorder
	}
	
	public  static void levelOrderTraversal(Node root)
	{
		if(root==null)
		{
			return;
		} 
		Queue<Node> q=new java.util.LinkedList<Node>();
		  q.add(root);
		  while(!q.isEmpty())
		  {
			  Node tempnode=q.poll();
			  System.out.println(tempnode.data);
			  if(tempnode.left!=null)
			  {
				  q.add(tempnode.left);
			  }
			  if(tempnode.right!=null)
			  {
                 q.add(tempnode.right);				  
			  }
		  }
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Node root =new Node(1);
        root.left =new Node(2);
        root.right =new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        System.out.println("preorder of tree");
        printPreorder(root);
        System.out.println("postorder of tree");
        postPreorder(root);
        System.out.println("inorder of tree");
        inPreorder(root);
        System.out.println("levelorder of tree");
        levelOrderTraversal(root);
       }

	
}


class Node
{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data=data;
		this.left=this.right=null;
	}
}
