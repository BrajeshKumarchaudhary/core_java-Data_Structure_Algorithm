package com.datastructure.Tree.binaryTree.problems;

/**
 * @author brajesh http://cslibrary.stanford.edu/110/BinaryTrees.html
 */
public class Build123 {

	TreeNode root;

	private class TreeNode {
		TreeNode left;
		TreeNode right;
		int data;

		TreeNode(int data) {
			this.data = data;
		}
	}

	// call newNode() three times
	public TreeNode build123a() {
		TreeNode root = new TreeNode(2);
		TreeNode lchild = new TreeNode(1);
		TreeNode rchild = new TreeNode(3);
		root.left = lchild;
		root.right = rchild;
		this.root = root;
		return root;
	}

	// call newNode() three times, and use only one local variable
	public TreeNode build123b() {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		this.root = root;
		return root;
	}

	// compute the number of nodes in tree
	public int size(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			return (size(this.root.left) + size(this.root.right));
		}
	}

	/*
	 * Compute the "maxDepth" of a tree -- the number of nodes along the longest
	 * path from the root node down to the farthest leaf node.
	 */
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			int ldepth = maxDepth(root.left);
			int rdepth = maxDepth(root.right);
			if (ldepth > rdepth) {
				return ldepth + 1;
			} else {
				return rdepth + 1;
			}
		}
	}
	/*
	 * Compute the "height" of a tree -- the number of nodes along the longest
	 * path from the root node down to the farthest leaf node.
	 */
	public int heightTree(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			int ldepth = maxDepth(root.left);
			int rdepth = maxDepth(root.right);
			if (ldepth > rdepth) {
				return ldepth + 1;
			} else {
				return rdepth + 1;
			}
		}
	}

	/*
	 * Given a non-empty binary search tree, return the minimum data value found in
	 * that tree. Note that the entire tree does not need to be searched.
	 */
	public int minValue(TreeNode root) {
		TreeNode current = root;
		if (current == null) {
			return 0;
		}
		while (current.left != null) {
			current = current.left;
		}
		return current.data;
	}

	/*
	 * Given a non-empty binary search tree, return the maximum data value found in
	 * that tree. Note that the entire tree does not need to be searched.
	 */
	public int maxValue(TreeNode root) {
		TreeNode current = root;
		if (current == null) {
			return 0;
		}
		while (current.right != null) {
			current = current.right;
		}
		return current.data;
	}

	/*
	 * Given a binary search tree, print out its data elements in increasing sorted
	 * order.
	 */
	public void printTree(TreeNode root) {
		if (root == null) {
			return;
		}
		// InOrder Traversal
		printTree(root.left);
		System.out.println(root.data);
		printTree(root.right);

	}

	/*
	 * Given a binary tree, print its nodes according to the "bottom-up" postorder
	 * traversal.
	 */
	public void printPostOrderTraversal(TreeNode root) {
		if (root == null) {
			return;
		}
		// first recur on both subtrees
		printTree(root.left);
		printTree(root.right);
		// then deal with the node
		System.out.println(root.data);
	}

	/*
	 * Given a tree and a sum, return true if there is a path from the root down to
	 * a leaf, such that adding up all the values along the path equals the given
	 * 
	 * sum. Strategy: subtract the node value from the sum when recurring down, and
	 * check to see if the sum is 0 when you run out of tree.
	 */
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return (sum == 0);
		} else {

			// otherwise check both subtrees
			int subsum = sum - root.data;
			return hasPathSum(root.left, subsum) || hasPathSum(root.right, subsum);
		}
	}

	/*
	 * Given a binary tree, print out all of its root-to-leaf paths, one per line.
	 * Uses a recursive helper to do the work.
	 */
	public void printPaths(TreeNode root) {
     int path[]=new int[1000];
     printPathsRecur(root,path,0);
	}
	
	/*
	 Recursive helper function -- given a node, and an array containing
	 the path from the root node up to but not including this node,
	 print out all the root-leaf paths.
	*/
	private void printPathsRecur(TreeNode root2, int[] path, int pathLength) {
	if(root2==null)	{
		return;
	}
	path[pathLength++]=root2.data;
	//check if it is leafNode then print The Path
	if(root2.left==null||root2.right==null) {
		printArrayPath(path,pathLength);
	}else {
		// otherwise try both subtrees
	printPathsRecur(root2.left,path,pathLength);
	printPathsRecur(root2.right,path,pathLength);
	}
	}

	private void printArrayPath(int[] path, int pathLength) {
		for(int i=0;i<pathLength;i++) {
			System.out.print(" "+path[i]);
		}
		System.out.println();
	}
	
	/*
	 Change a tree so that the roles of the
	 left and right pointers are swapped at every node.
	 So the tree...
	       4
	      / \
	     2   5
	    / \
	   1   3

	 is changed to...
	       4
	      / \
	     5   2
	        / \
	       3   1
	*/
	public TreeNode mirror(TreeNode rootNode) {
		if(rootNode==null) {
			
		}else {
			TreeNode temp=rootNode;
			//do on the subtree
			mirror(rootNode.left);
			mirror(rootNode.right);
			//swapp the pointer
			temp=rootNode.left;
			rootNode.left=rootNode.right;
			rootNode.right=temp.left;
		}
		return rootNode;
	}
	
	/*
	 Given two trees, return true if they are
	 structurally identical.
	*/
	public boolean isSameTree(TreeNode treeRoot1,TreeNode treeRoot2) {
		//1.both are empty
		if(treeRoot1==null&&treeRoot2==null) {
			return true;
		}else if(treeRoot1!=null&&treeRoot2!=null){
			//2.both are not empty so compare them
			return (treeRoot1.data==treeRoot2.data&&isSameTree(treeRoot1.left,treeRoot2.left)&&isSameTree(treeRoot1.right, treeRoot2.right));
		}else {
          //3.one is null and one is not null
			return false;
		}

	}
	/*
	 Returns true if a binary tree is a binary search tree.
	*/
	public boolean isBST1(TreeNode rootNode) {
		//empty Tree
		if(rootNode==null) {
			return true;
		}else {
			 // do the subtrees contain values that do not
			  // agree with the node?
			if(rootNode.left!=null&&maxValue(rootNode.left)>rootNode.data) {
				return false;
			}
			if(rootNode.right!=null&&minValue(rootNode.right)<=rootNode.data) {
				return false;
			}
			
		}
		return isBST1(rootNode.left)&&isBST1(rootNode.right);
		
	}
	/**
	  Efficient BST helper -- Given a node, and min and max values,
	  recurs down the tree to verify that it is a BST, and that all
	  its nodes are within the min..max range. Works in O(n) time --
	  visits each node only once.
	*/
	private boolean isBST2(TreeNode node, int min, int max) {
	  if (node==null) {
	    return(true);
	  }
	  else {
	   // left should be in range  min...node.data
	    boolean leftOk = isBST2(node.left, min, node.data);

	    // if the left is not ok, bail out
	    if (!leftOk) return(false);

	    // right should be in range node.data+1..max
	    boolean rightOk = isBST2(node.right, node.data+1, max);

	    return(rightOk);
	  }
	}
	
}
