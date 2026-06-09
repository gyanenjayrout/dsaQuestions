package Tree;

import practcie.practice1.BinaryTree;


public class BuildABinaryTreeusingPostorderTraversal {
	
	static int idx; 
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data = data;
			this.left=null;
			this.right  =null;
		}
	}
		
		
			
			
	 public static Node BuildTree(int [] nodes)
			{
				  
				  
				  if(idx<0)
				  {
					  return null;
				  }
				  
				Node newNode = new Node(nodes[idx--]);
				
				newNode.right = BuildTree(nodes);
				newNode.left = BuildTree(nodes);
			
				return newNode;
				  
			}
		
		
		 public static void inorderTraversal(Node root) {
		        if (root == null) {
		            return;
		        }
		        inorderTraversal(root.left);
		        System.out.print(root.data + " ");
		        inorderTraversal(root.right);
		    }
	
	
	public static void main(String[] args) {
		int [] nodes  =  {4, 5, 2, 6, 3, 1};
		idx = nodes.length-1;
		Node root =BuildTree(nodes);
		
		
		
		System.out.println();
		
		System.out.println(root.data);
		
		inorderTraversal(root);
					
				 
	}

}
