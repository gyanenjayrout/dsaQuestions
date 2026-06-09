package Tree;

public class leafNodeAtSameLevel {
	
	    Integer leafLevel = null;

	    public boolean check(TreeNode root) {

	        return dfs(root, 0);
	    }

	    public boolean dfs(TreeNode root, int level) {

	        if(root == null)
	            return true;

	        // leaf node
	        if(root.left == null && root.right == null) {

	            // first leaf
	            if(leafLevel == null) {
	                leafLevel = level;
	                return true;
	            }

	            // compare levels
	            return leafLevel == level;
	        }

	        return dfs(root.left, level + 1)
	            && dfs(root.right, level + 1);
	    }
	
}
