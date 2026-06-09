package Tree;

import Tree.ArrayFreomTree.TreeNode;

public class BalancedBinaryTreee {

	
	
	/*
	 * Find height of left subtree
Find height of right subtree
Check difference <= 1
Recursively check left and right subtree also balanced or not
	 */
	 public boolean isBalanced(TreeNode root) {
		 
		 if(root==null) return true;
		 
		 
		 int left  = height(root.left);
		 int right = height(root.right);
		 
		 if(Math.abs(right-left)>1) return false;
		 
		 return isBalanced(root.left) && isBalanced(root.right);
	/*
	 * Brute force checks height at every node separately and recursively validates subtrees. 
	 * But height gets recomputed multiple times, so worst-case complexity becomes O(n²). We can optimize using postorder DFS.”
	 */
		 
		 
	 }

	private int height(TreeNode root) {
		// TODO Auto-generated method stub
	/*
	 * “I use postorder DFS because balance depends on left and right subtree heights. 
	 * If any subtree is unbalanced, I return -1 early; otherwise return height.”	
	 */
		if(root ==null) return 0;
		return Math.max(height(root.left), height(root.right))+1;
	
	}
	
	 public boolean isBalanced2(TreeNode root)
	 {
		 return heightt(root) !=-1;
	 }

	private int heightt(TreeNode root) {
		// TODO Auto-generated method stub
		
		if(root ==null) return 0;
		
		int left = heightt(root.left);
		if(left ==-1) return -1;
		
		int right = heightt(root.right);
		if(right ==-1) return -1;
		
		if(Math.abs(right-left)>1) return -1;
		
		return 1+Math.max(left, right);
	}
	
	
}
