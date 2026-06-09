package practcie;

import java.util.LinkedList;
import java.util.Queue;

import LinkedList.CreateLinkedList;
import practcie.BinarayTreeeeY.BinaryTree.TreeInfo;


public class BinarayTreeeeY {
	
	
	static class Node{
		
		int data;
		Node left;
		Node right;
		
		public Node( int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.left=null;
			this.right  =null;
		}
	}
	
	
	static class BinaryTree
	{	
		
	   static int idx = -1;
	public static Node CreateTree( int node[])
	{
		idx++;
		if(node[idx] == -1)
		{
			return null;
		}
		Node newNode =  new Node(node[idx]);
		
		newNode.left = CreateTree(node);
		newNode.right = CreateTree(node);
		
		return newNode;
		
		
	}
	
	
	
	
	public static void inorder(Node root)
	{  
		if(root ==  null)
		{
			return;
		}
		
	        inorder(root.left);
	     System.out.print(root.data + "->");
	       inorder(root.right);
	       
	}
	
	public static void preorder(Node root)
	{
		if(root ==null)
		{
			return;
		}
		 System.out.print(root.data + "->");
		 preorder(root.left);
		 preorder(root.right);
		
	}
	
	public static void levelOrder(Node root)
	{
		if(root ==null)
		{
			return;
		}
		
		Queue<Node > q =  new LinkedList<>();
		
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty())
		{
			Node currNode = q.remove();
			
			if(currNode ==null)
			{
				System.out.println();
				if (q.isEmpty()) {
	                break;  // If the queue is empty, we are done
	            } else {
	                q.add(null);  // Add a marker for the next level
	            }
				
			}else
			{
				
				System.out.print(currNode.data+ " " );
				 if(currNode.left !=null)
				 {
					 q.add(currNode.left);
				 }
				 
				if (currNode.right != null) 
				{
		                q.add(currNode.right);
		            }
			}
		}
	}
	
	
	public static int CountNodes(Node root)
	{
		if(root==null)
		{
			return 0;
			
		}
		
		int leftcount = CountNodes(root.left);
		
		int rightcount  = CountNodes(root.right);
		
		return leftcount+rightcount+1;
	}
	
	
	public static int sumOfNodes(Node root)
	{
		if(root==null)
		{
			return 0;
			
		}
		
		int leftsum = CountNodes(root.left);
		
		int rightsm  = CountNodes(root.right);
		
		return leftsum+rightsm+root.data;
	}
	
	public static int maxheightOfTree(Node root)
	{
		
		if(root==null)
		{
			return 0;
			
		}
		
		int leftHeight = maxheightOfTree(root.left);
		int rightHeight = maxheightOfTree(root.right);
		
		return Math.max(leftHeight, rightHeight) +1;
		
		
	}
	
	
	static class TreeInfo
	{
		int height;
		int diameter;
		
		public TreeInfo(int height, int diameter) {
			// TODO Auto-generated constructor stub
			this.height  =  height;
			this.diameter = diameter;
		}
		
		
	}
	
	public static TreeInfo  diamteterofTree(Node root)
	{
		if(root == null)
		{
			return new TreeInfo(0, 0);
		}
		
		TreeInfo leftinfo  = diamteterofTree(root.left);
		TreeInfo rightinfo = diamteterofTree(root.right);
		
		int currheight  = Math.max(leftinfo.height, rightinfo.height)+1;
		
		int diamateerThroughNode =  leftinfo.height+rightinfo.height+1;
		
		int currentDiameeter = Math.max(diamateerThroughNode, Math.max(leftinfo.diameter, rightinfo.diameter));
				
				return new TreeInfo(currheight, currentDiameeter);
	}
	
	
	}
	
	
	public static void main(String[] args) {
		int node [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
	
		Node root = BinaryTree.CreateTree(node);
		
		System.out.println(root.data);
		
		System.out.println();
		
		BinaryTree.inorder(root);
	
		System.out.println();
		
		System.out.println();
		BinaryTree.preorder(root);
		
		System.out.println();
		
		BinaryTree.levelOrder(root);
		
		System.out.println();
		
		BinaryTree.CountNodes(root);
		
		TreeInfo treeInfo = BinaryTree.diamteterofTree(root);
		
		System.out.println(treeInfo.diameter);
		
		
	}

}
