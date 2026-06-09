package Tree;

import Tree.InvertAtRreee.TreeNode;

public class KthLevelOFbinaryTree {
	
	public void kthLEVEL(TreeNode root, int k)
	{
	
		if(root ==null) return;
		
		if(k==1)
		{
			System.out.println(root.data);
			return;
		}
		
		kthLEVEL(root.left,k-1);
		kthLEVEL(root.right, k-1);
	}

}
