package Tree;

import Tree.isSAmeTree.TreeNode;

public class isSubTreee {
	static class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val)
		{
			this.val = val;
			this.left=null;
			this.right  =null;
		}
		
		
	}
	
	public static  boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        if (subRoot == null) return true; 
        //Empty tree is always subtree of any tree.
        if (root == null) return false;
        //Main tree finished, but subRoot still exists.

        if (isSameTree(root, subRoot)) {
            return true; 
            //We return true immediately when current subtree matches. Otherwise recursively search left and right; if either returns true, subtree exists.
        }

        return isSubtree(root.left, subRoot)
            || isSubtree(root.right, subRoot);
    }

    public static  boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left)
            && isSameTree(p.right, q.right);
    }
    
    public static void main(String[] args) {
        // Create the binary tree
	 TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        p.left.left = new TreeNode(4);
        p.left.right = new TreeNode(5);
        p.right.right = new TreeNode(6);
        
        
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        q.left.left = new TreeNode(4);
        q.left.right = new TreeNode(5);
        q.right.right = new TreeNode(6);
        
       System.out.println( isSubtree( p,  q));
}

}
