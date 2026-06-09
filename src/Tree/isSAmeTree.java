package Tree;
/*For every node:
 * Both null        -> true
One null         -> false
Value different  -> false
Else check left and right

Compare node value + recursively compare left and right.
 */

public class isSAmeTree {
	
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
  
	 public static boolean isSameTree(TreeNode p, TreeNode q) {
	        

	        if(p == null && q ==null) return true;

	        if(p == null || q==null)  return false;

	        if(p.val != q.val )  return false;
	        /*
	         * Meaning:

If current node tree exactly matches subRoot, we found answer.

So no need search more.

n = root nodes
m = subRoot nodes
	         */

	        return isSameTree(p.left , q.left ) && isSameTree(p.right , q.right );


	      
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
	        
	       System.out.println( isSameTree( p,  q));
}
}
