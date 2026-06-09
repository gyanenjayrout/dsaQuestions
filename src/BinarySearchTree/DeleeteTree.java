package BinarySearchTree;

import java.util.ArrayList;



public class DeleeteTree {
	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			
		}
	}
	
	public static Node insert(Node root, int val)
	{
		 if(root==null)
		 {
			 root = new Node(val);
			 return root;
		 }
		 
		 
		 if(root.data>val)
		 {
			root.left =  insert(root.left, val);
		 }
		 else
		 {
			 root.right   =insert(root.right, val);
		 }
		 return root;
	}
	
	public static void inOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		inOrder(root.left);
	System.out.print(root.data);
	
	inOrder(root.right);
		
	}
	
	
	public static Node deleteNode(Node root, int val) {
	    // Base case: if the tree is empty
	    if (root == null) {
	        return null;
	    }

	    // If the value to be deleted is smaller than the root's value,
	    // then it lies in the left subtree
	    if (root.data > val) {
	        root.left = deleteNode(root.left, val);
	    }
	    // If the value to be deleted is greater than the root's value,
	    // then it lies in the right subtree
	    else if (root.data < val) {
	        root.right = deleteNode(root.right, val);
	    }
	    // If the value is the same as the root's value, this is the node to be deleted
	    else {
	        // Case 1: Node with no child (leaf node)
	        if (root.left == null && root.right == null) {
	            return null;
	        }
	        // Case 2: Node with only one child (right child only)
	        else if (root.left == null) {
	            return root.right;
	        }
	        // Case 2: Node with only one child (left child only)
	        else if (root.right == null) {
	            return root.left;
	        }
	        // Case 3: Node with two children
	        // Find the in-order successor (smallest node in the right subtree)
	        Node inOrderSuccessor = findInOrderSuccessor(root.right);
	        // Replace the root's data with the in-order successor's data
	        root.data = inOrderSuccessor.data;
	        // Delete the in-order successor
	        root.right = deleteNode(root.right, inOrderSuccessor.data);
	    }

	    return root;
	}

	// Helper method to find the in-order successor
	public static Node findInOrderSuccessor(Node root) {
	    while (root != null && root.left != null) {
	        root = root.left;
	    }
	    return root;
	}
	
	public static void printrange(Node root, int x, int y)
	{
		if(root==null)
		{
			return;
		}
		if(x<=root.data && root.data<=y)
		{
			printrange(root.left, x, y);
			System.out.print(root.data + " ");
			printrange(root.right, x, y);
		}
		else if(y<=root.data)
		{
			printrange(root.left, x, y);
		}
		else
		{
			printrange(root.right, x, y);
		}
	}
	
	
	public static void printwayfromrootTOleaf(Node root , ArrayList<Integer> path)
	{
		
		/*The ArrayList provides O(1) time complexity for accessing elements by index,
		 *  which is beneficial since each recursive call needs to access and print each 
		 *  element in the path from the root to the current leaf node.*/
		
		if(root ==null)
		{
			return;
		}
		
		path.add(root.data);
		
		if(root.left==null && root.right==null)
		{
		   printpath(path);
		}
		else
		{
			printwayfromrootTOleaf(root.left, path);
			printwayfromrootTOleaf(root.right, path);
		}
		
		path.remove(path.size()-1);
		
	/*
	 In this code, an ArrayList is used to store the path from the root to each leaf node during traversal. Here’s why an ArrayList is preferred over a LinkedList for this purpose:

1. Efficient Access and Removal
•	ArrayList allows for fast access to elements at any index because it is backed by an array. When printing the path or accessing the last element, it’s more efficient with an ArrayList.
•	At the end of each recursion call, we use paths.remove(paths.size() - 1) to backtrack, which removes the last element from the list. For ArrayList, this operation is generally faster compared to LinkedList, where accessing the last element requires traversing the list.
2. Frequent Random Access
•	The ArrayList provides O(1) time complexity for accessing elements by index, which is beneficial since each recursive call needs to access and print each element in the path from the root to the current leaf node.
•	LinkedList does not have direct access to elements, which can slow down the traversal if we need to access elements randomly within the list.
3. Memory Efficiency
•	ArrayList typically consumes less memory for storing small paths compared to LinkedList, as LinkedList has additional overhead due to storing node references (both next and prev pointers in a doubly linked list).
Summary
For tasks like printing paths and removing elements from the end (backtracking), ArrayList is more efficient and simpler to use, as it is optimized for random access and removal from the end.
*/	
		
	}
	
   public static void printpath(ArrayList<Integer> path)
   {
	   
	   for(int i=0;i<path.size();i++)
	   {
		   System.out.print(path.get(i)+ "->");
	   }
	   
	   System.out.println("->null");
   }


	
	public static void main(String[] args) {
		int arr[] = {8,5,3,1,4,6,10,11,14};
		Node root = null;
		
		for(int i=0;i<arr.length;i++)
		{
			root = insert(root, arr[i]);
		}
		inOrder(root);
		
//		deleteNode(root, 5);
		
		System.out.println();
		inOrder(root);
		System.out.println();
		System.out.println();
		System.out.println();
		printrange(root, 6,10);
		
		System.out.println();
		System.out.println();
		
		printwayfromrootTOleaf(root, new ArrayList<>());
		
	}

	
	

}
