 package Tree;

import Tree.BinaryTreeY.BinaryTree;
import Tree.BinaryTreeY.Node;

public class LowestCOmmonAncestor {
	
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
	
	static int idx = -1;
	
	public static Node BuildTree(int nodes[]) {
		idx++;
		if (nodes[idx] == -1) {
			return null;
		}
		
		Node newNode = new Node(nodes[idx]);
		newNode.left = BuildTree(nodes);
		newNode.right = BuildTree(nodes);
		return newNode;
	}
	
	public static void inOrderTraversal(Node root)
	{
		if(root == null)
		{
			return;
		}
		inOrderTraversal(root.left);
		System.out.print(root.data + " ");
		inOrderTraversal(root.right);
	}
	
	public static Node lowestCommonAncestor(Node root, int p, int q)
	{
		if (root ==null || root.data==p || root.data==q)
		{
			return root;
		}
		
		Node left=  lowestCommonAncestor(root.left, p,q);
		Node right = lowestCommonAncestor(root.right,p,q);
		
		if(left != null && right !=null)
		{
			return root;
		}
		
		
	   return (left != null) ? left : right;
		
	}
	
	
	
	

	
	public static void main(String[] args) {
int nodes[] =  {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
	   
	      Node root =  BuildTree(nodes);
	      inOrderTraversal(root);
	      
	      System.out.println("lwstcommon ancestoerr");
	      
	      
	   System.out.println(lowestCommonAncestor(root, 2,4).data);
	     
	}

}
