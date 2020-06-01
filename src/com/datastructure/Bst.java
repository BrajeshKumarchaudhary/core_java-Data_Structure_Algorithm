package com.datastructure;

public class Bst {

	 BstNode root;
	Bst()
	{
		root=null;
	}
	   void insert(int key) { 
	       root = insertRec(root, key); 
	    } 
	public static BstNode searchNode(BstNode root,int key)
	{
		BstNode pointer = null;
		if(root==null|root.data==key)
		{
			pointer=root;
		}
		else {
			if(root.data>key)
			{
				searchNode(root.left,key);
			}
			else {
				searchNode(root.right,key);	
			}
		}
		return pointer;
	}
	
	
	public  static  BstNode insertRec(BstNode root,int key)
	{
		if(root==null)
		{
			root=new BstNode(key);
			return root;
		}
		else {
			if(root.data>key)
			{
				root.left=insertRec(root.left,key);
			}
			else {
				root.right=insertRec(root.left,key);
			}
		}
		return root;
	}
	  void inorder()  { 
	       inorderRec(root); 
	    } 
	static void inorderRec(BstNode root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.println(root.data); 
            inorderRec(root.right); 
        } 
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Bst tree=new Bst();
            tree.insert(1);
            tree.insert(2);
            tree.insert(3);
            tree.insert(4);
            tree.insert(5);
            tree.insert(6);
            tree.insert(7);
            tree.inorder();
	}

}

class BstNode
{
	int data;
	BstNode left;
	BstNode right;
	BstNode(int d)
	{
		data=d;
		left=right=null;
	}
}
