package Tree;

import Tree.InvertAtRreee.TreeNode;

public class PathSum {
	
	 public boolean hasPathSum(TreeNode root, int targetSum)
	 {
		 if(root== null) return false;
		 
		 if(root.left ==null && root.right ==null)
		 {
			 return root.data == targetSum;
		 }
		 
		 targetSum = targetSum-root.data;
		 
		 
		 
		return hasPathSum(root.left, targetSum)|| hasPathSum(root.right, targetSum);
		 
	 }
	
	
	public static void main(String[] args) {
		
	}

}
