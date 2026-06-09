package BinarySearchTree;



public class Search_IN_BST {
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			
		}
	}
	
	public static Node insertTree(Node root, int val)
	{
		
		if(root ==null)
		{
			root = new Node(val);
			return root;
		}
		
		if(root.data> val)
		{
			root.left =insertTree(root.left, val);
		}
		else
		{
			root.right = insertTree(root.right, val);
		}
		
		return root;
	}
	
	 public static void printTree(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		printTree(root.left);
		System.out.print(root.data+ "->");
		printTree(root.right);
	}
	 
	 
	static  boolean  search(Node root, int x) {
	        // Your code here
	        if(root ==null)
	        {
	            return false;
	        }
	        
	        if(root.data>x)
	        {
	           return search(root.left, x); 
	        }
	        else if(root.data ==x)
	        {
	            return true;
	        }
	        
	        else
	        {
	           return  search(root.right, x);
	        }
	        
	       
	    }
	
	
	static int minValue(Node root)
	{
		
		if(root  ==null)	
		{
			return -2;
		}
		
		while(root.left !=null)
		{
			root =root.left;
		}
		
		return root.data;
		
	}
	
	
	
	
	public static void main(String[] args) {
		int [] nodes = {8,5,3,1,4,10,14,16};
		
		Node root =null;
		
		for(int num: nodes)
		{
			root = insertTree(root, num);
		}
		
		printTree(root);
		System.out.println();
		
		System.out.println(search(root, 4));
		
		System.out.println(minValue(root));
	}
}
