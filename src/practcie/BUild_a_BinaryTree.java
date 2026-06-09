package practcie;

import java.util.ArrayList;
import java.util.List;

public class BUild_a_BinaryTree {
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node( int data)
		{
			 this.data = data;
		}
		
	}
	

	private static Node insert(Node root, int val) {
		// TODO Auto-generated method stub
		
		if(root ==null)
		{
	      root =  new  Node(val);
			return root;
		}
		
		if(root.data>val)
		{
			root.left =  insert(root.left, val);
		}
		
		if(root.data<val)
		{
			root.right = insert(root.right, val);
		}
		
		
		return root;
	}
	
	public static void inorder(Node root)
	{
		if(root ==null)
		{
			return;
		}
		inorder(root.left);
		System.out.print(root.data +" ");
		inorder(root.right);
		
			
	}
	
	public static  Node deleteNode(Node root, int val)
	{
		
		if(root ==null)
		{
			return null;
		}
		
		if(root.data>val)
		{
			root.left = deleteNode(root.left, val);
		}
		else if (root.data<val)
		{
			root.right=  deleteNode(root.right, val);
		}
		else
		{
			if(root.left==null && root.right==null)
			{
				return  null;
			}
			
			else if(root.left==null)
			{
				return root.right;
			}
			else if(root.right== null)
			{
				return root.left;
			}
			
			Node is = inordersuccseion(root, val);
			
			root.data = is.data;
			
			root.right = deleteNode(is,val);
					
		}
		return root;
		
		
	}
	
	
	private static void printrange(Node root, int x, int y) {
		// TODO Auto-generated method stub
		
		if(root == null)
		{
			return;
		}
		
		if(x<=root.data && root.data<=y)
		{
			printrange(root.left, x, y);
			
			System.out.print(root.data +" ");
            printrange(root.right, x, y);
		}
		else if(x>=root.data)
		{
			printrange(root.right, x, y);
		}
		else if(y<=root.data)
		{
			printrange(root.left, x, y);
		}
			
		
	}
	
	public static void printwayfromrootTOleaf(Node root, List<Integer> paths)
	
	{
		 if(root==null)
		 {
			 return;
		 }
		 paths.add(root.data);
		 
		 if(root.left ==null && root.right==null)
		 {
			 printpath(paths);
		 }
		 else
		 {
			 printwayfromrootTOleaf(root.left, paths);
			 printwayfromrootTOleaf(root.right, paths);
		 }
		 
		 paths.remove(paths.size()-1);
	}
	
	
	 

	
	private static void printpath(List<Integer> paths) {
		// TODO Auto-generated method stub
		 for(int num:paths)
		 {
			 System.out.print(num +"->");
		 }
		 System.out.print("null");
		 
		 System.out.println();
	}

	private static Node inordersuccseion(Node root, int val) {
		// TODO Auto-generated method stub
		
		while(root.left !=null && root !=null)
		{
			root = root.left;
		}
		return root;
	}

	public static void main(String[] args) {
		int values[] = {8,5,3,1,4,6,10,11,14};
		Node root = null;
		
		for(int i=0;i<values.length;i++)
		{
			root = insert(root, values[i]);
		}
		
		 inorder(root);
		 
		 deleteNode(root, 6);
		 System.out.println();
		 
		 System.out.println("after deleeted");
		
		 inorder(root);
		 
		 System.out.println();
		 
		 printrange(root, 6,10);
		 
		 System.out.println();
		 
		 printwayfromrootTOleaf(root, new ArrayList<>());
		
		
	}

	



}
