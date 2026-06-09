package practcie;

import java.util.ArrayList;
import java.util.List;

public class practice2 {
	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			
		}

}
	
	private static void inOrder(Node root) {
		// TODO Auto-generated method stub
		if(root ==null)
		{
			return;
		}
		inOrder(root.left);
		System.out.print( root.data +" ->");
		inOrder(root.right);
		
		
		
		
	}

	private static Node createbinaryTree(Node root, int val) {
		// TODO Auto-generated method stub
		  if(root == null)
		  {
			  root = new Node(val);
			  return root;
		  }
		  
		  if(val >root.data)
		  {
			 root.right= createbinaryTree(root.right, val);
		  }
		  
		  if(val<root.data)
		  {
			 root.left = createbinaryTree(root.left, val);
		  }
		  return root;
	}
	
	public static void printwayfromrootTOleaf(Node root, List<Integer>paths)
	{
		
		
		if(root == null)
		{
			return ;
		}
		paths.add(root.data);
		
		if(root.left == null && root.right ==null)
		{
			for(int num: paths)
			{
				System.out.print(num +"->");
			}
			System.out.print("->null");
			System.out.println();
		}
		else
		{
			printwayfromrootTOleaf(root.left,paths);
			printwayfromrootTOleaf(root.right, paths);
		}
		
		paths.remove(paths.size()-1);
		
	}
	
	public static boolean search(Node root ,int val)
	{
		if(root.data>val)
		{
			return search(root.left, val);
		}
		else if(root.data== val)
		{
			return true;
		}
		else
		{
			return search(root.right,val);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		int arr []  = {8,5,3,1,4,6,10,11,14};
		
		Node root = null;
		
		for(int i=0;i<arr.length;i++)
		{
			 root =createbinaryTree(root, arr[i]);
		}
		
		inOrder(root);
		System.out.println("null");
		
		printwayfromrootTOleaf(root, new ArrayList<>());
		
		if(search(root, 4))
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}
		
		
	}

	

}
