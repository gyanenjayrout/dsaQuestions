package Tree;

import Tree.BinaryTreeY.Node;


public class DiameteerOfTreeeee {
	 
	static class TreeInfo
	{
		int diameter;
		int ht;
		
		public TreeInfo(int dia, int ht) {
			this.diameter = dia;
			this.ht = ht;
			// TODO Auto-generated constructor stub
		}
	}
	
	public static TreeInfo diameterOfBinaryTree(Node root) {
		if(root == null)
		{
			return new TreeInfo(0, 0);
		}
		
		
		TreeInfo left = diameterOfBinaryTree(root.left);
		TreeInfo right = diameterOfBinaryTree(root.right);
		
		int myHeight = Math.max(left.ht, right.ht);
		
		int diam1 = left.diameter;
		int diam2 = right.diameter;
		int diam3 = left.ht+right.ht+1;
		
		
		int diam = Math.max( diam3, Math.max(diam1, diam2));
		
		TreeInfo  info = new TreeInfo(diam, myHeight);
		
		
		
		return info;
		
	}
	
	
	public static int diameterOfBinaryTreeUsingheight(Node root)
	{
		if(root ==null) return 0;
		
		int daim1 = diameterOfBinaryTreeUsingheight(root.left);
		int diam2 = diameterOfBinaryTreeUsingheight(root.right);
		
		int diam3 = height(root.left)+height(root.right)+1;
		
		int diam = Math.max(daim1, Math.max(diam2, diam3));
		return diam;
		
	}


	private static int height(Node root) {
		// TODO Auto-generated method stub
		
		if(root == null) return 0;
		
		int left = height(root.left);
		int right = height(root.right);
		
		return Math.max(left, right)+1;
	}
}
