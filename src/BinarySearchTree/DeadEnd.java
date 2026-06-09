package BinarySearchTree;

import java.util.HashSet;
import java.util.Set;

public class DeadEnd {
	
	static class Node {
	    int data;
	    Node left;
	    Node right;

	    Node(int data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	    
	}
	
	/*
	
	 public static  boolean isDeadEnd(Node root) {
		 Set<Integer> leafNodes =  new HashSet<>();
		 Set<Integer> otherNodes = new HashSet<>();

		 
		 traverseTree(root, leafNodes, otherNodes);
		 
		 for(int leaf :leafNodes)
		 {
			 
			 if(otherNodes.contains(leaf-1) && otherNodes.contains(leaf+1))
			 {
				 return true ;
			 }
			 
			
			 
		 }
		 return false;
	 }

	private  static void traverseTree(Node root, Set<Integer> leafNodes, Set<Integer> otherNodes) {
		// TODO Auto-generated method stub
		
		if(root ==null)
		{
			return ;
		}
		
		otherNodes.add(root.data);
		
		if(root.left==null && root.right==null)
		{
			leafNodes.add(root.data);
		}
		
		else
		{
			traverseTree(root.left, leafNodes,otherNodes );
			traverseTree(root.right, leafNodes,otherNodes );
		}
		
		}
		
		*/
	
	
	private static boolean isDeadEnd(Node root) {
		// TODO Auto-generated method stub
		
		
		return isDeaduntill(root, 1, Integer.MAX_VALUE);
	}	
	
	    private static boolean isDeaduntill(Node root, int min, int maxValue) {
		// TODO Auto-generated method stub
	    	
	    	if(root ==null)
	    	{
	    		return false;
	    	}
	    	
	    	if(root.left ==null || root.right ==null)
	    	{
	    		return (root.data ==min && root.data ==maxValue);
	    	}
		return isDeaduntill(root, min, root.data-1)|| isDeaduntill(root,root.data-1, Integer.MAX_VALUE);
	}

		public static void main(String[] args) {
	        // Construct the BST
	        Node root = new Node(8);
	        root.left = new Node(7);
	        root.right = new Node(10);
	        root.left.left = new Node(2);
	        root.right.left = new Node(9);
	        root.right.right = new Node(13);

	      

	        // Check if the BST has a dead end
	        boolean result = isDeadEnd(root);

	        // Print the result
	        if (result) {
	            System.out.println("The BST contains a dead end.");
	        } else {
	            System.out.println("The BST does not contain a dead end.");
	        }
	    }

	
	


}
