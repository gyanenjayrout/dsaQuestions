package practcie;

import java.util.*;

/*
 * 
              8
            /   \ 
           7     10
         /      /   \
        2      9     13
        
        
        
        *
        */

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
	
	private static boolean isDeadEnd(Node root) {
		// TODO Auto-generated method stub
		
		Set<Integer>otherNodes  =  new HashSet<>();
		Set<Integer>leafNodes  =  new HashSet<>();
		
		travsersetreee(root, otherNodes,leafNodes);
		
		for(int leaf:leafNodes ) {
			if(otherNodes.contains(leaf-1) && otherNodes.contains(leaf+1))
			{
				return true;
			}
		}
		
		
		return false;
	}
	
	
	
	private static void travsersetreee(Node root, Set<Integer> otherNodes, Set<Integer> leafNodes) {
		// TODO Auto-generated method stub
		
		if(root ==null)
		{
			return ;
		}
		
		otherNodes.add(root.data);
		
		if(root.left==null && root.right ==null)
		{
			leafNodes.add(root.data);
		}
		else
		{
			travsersetreee(root.left, otherNodes, leafNodes);
			travsersetreee(root.right, otherNodes, leafNodes);
		}
	}



	public static void main(String[] args) {
		Node root  = new Node(8);
		root.left = new  Node(7);
		root.right = new Node(10);
		root.left.left = new Node(2);
		root.right.left = new Node(9);
		root.right.right = new Node(13);
		
		  boolean result = isDeadEnd(root);

	        // Print the result
	        if (result) {
	            System.out.println("The BST contains a dead end.");
	        } else {
	            System.out.println("The BST does not contain a dead end.");
	        }
		
	}




	

}
