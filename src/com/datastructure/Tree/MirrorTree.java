package com.datastructure.Tree;

public class MirrorTree {
     Node1 root;
	
    private  Node1  mirror(Node1 root) {
    	if(root==null) {
    		return root;
    	}else {
    		Node1 left=mirror(root.left);
    		Node1 right= mirror(root.right);
    		root.left=right;
    		root.right=left;
    	}
    	return root;
    }
    
    private static void inorder() {
    	
    }
	
	
	public static void main(String[] args) {

	}

}

class Node1 {
	Node1 left;
	Node1 right;
	int data;

	public Node1(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
