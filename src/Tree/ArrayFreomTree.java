package Tree;
import java.util.*;
public class ArrayFreomTree {
	static class TreeNode {
	    int val;
	    TreeNode left, right;

	    TreeNode(int val) {
	        this.val = val;
	    }
	}
/*
 *      1
      /   \
     2     3
    / \   / \
   4   5 6   7
	
 */

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        TreeNode root = buildTree(arr, 0);
        
//        preeOrder(root);
//        Inorder(root);
//        postOrder(root);
        
        LevelOrderTraveersal(root);
        
        
        System.out.println("count of nodes :  " + countOFNodes(root));
        
        System.out.println("maxdaimter"  + diaamteer(root));
        
        System.out.println(diaamteer2(root).diam);
     
    }


	private static void preeOrder(TreeNode root) {
		// TODO Auto-generated method stub
		
		if(root ==null)
		{
			return;
		}
		
		System.out.println(root.val + " ");
		
		preeOrder(root.left);
		preeOrder(root.right);
	}
	
	private static void Inorder(TreeNode root)
	{
		if(root ==null)
		{
			return ;
		}
		
		Inorder(root.left);
		System.out.println(root.val +  "" );
		Inorder(root.right);
		
		
	}
	
	private static void postOrder(TreeNode root)
	{
		if(root ==null)
		{
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.val);
	}
	
	private static void LevelOrderTraveersal(TreeNode root)
	{
		
		Queue<TreeNode> q = new LinkedList<>();
		
		q.offer(root);
		q.offer(null);
		
		while(!q.isEmpty())
		{
			
			TreeNode currNode = q.remove();
			
			if(currNode ==null)
			{
				System.out.println();
				
				if(q.isEmpty()) break;
				else q.add(null);
			}else
			{
				System.out.print(currNode.val + "  " );
				
				if(currNode.left !=null) q.add(currNode.left);
				if(currNode.right !=null) q.add(currNode.right);
			}
			
		}
		
	}
	private static int countOFNodes(TreeNode root)
	{
		if(root ==null) return 0;
		
		
		int left = countOFNodes(root.left);
		int right = countOFNodes(root.right);
		
		return left +right+1;
	}

	private static int maxHeight(TreeNode root)
	{
		if(root ==null) return 0;
		
		int leftHeight = maxHeight(root.left);
		int rightHeight = maxHeight(root.right);
		
		
		int height = Math.max(leftHeight, rightHeight)+1;
		
		return height;
		
	}
	
	private static int diaamteer(TreeNode root)
	{
		if(root ==null) return 0;
		
	    int diam1 = diaamteer(root.left);
	    int diam2 = diaamteer(root.right);
	    int diam3 = maxHeight(root.left)+ maxHeight(root.right)+1;
	    
	    
	    return Math.max(Math.max(diam2, diam1), diam3);
	    
	    
	}
	
	static class TreeInfo
	{
		int ht;
		int diam;
		
		public TreeInfo(int ht, int diam) {
			// TODO Auto-generated constructor stub
			this.ht = ht;
			this.diam= diam;
			
			
		}
	}
	private static TreeInfo diaamteer2 (TreeNode root)
	{
		if(root == null)
		{
			return new TreeInfo(0, 0);
		}
		
		 TreeInfo leftInfo = diaamteer2(root.left);
		  TreeInfo rightInfo = diaamteer2(root.right);
		  
		  int myheight = Math.max(leftInfo.ht, rightInfo.ht)+1;
		  
		  
		  int diam1 = leftInfo.diam;
		  int diam2 = rightInfo.diam;
		  int diam3 = leftInfo.ht + rightInfo.ht+1;
		  
		  int diamter = Math.max(Math.max(diam2, diam1), diam3);
		  
		  
		  TreeInfo treeInfo = new TreeInfo(myheight, diamter);
		  
		  return treeInfo;
		  
		  
		
	}

	
	private static int sumofNode(TreeNode root)
	{
		if(root== null) return  0;
		
		int lefsm = sumofNode(root.left);
		int righsm = sumofNode(root.right);
		
		return lefsm + righsm+ root.val;
		
		
	}
	private static TreeNode buildTree(int[] arr, int i) {
		// TODO Auto-generated method stub
		
		if(i>= arr.length) return null;
		
		  TreeNode root = new TreeNode(arr[i]);
		  
	 root.left = buildTree(arr, 2*i+1); //I take current index, create node, recursively build left and right using index formula”
		root.right = buildTree(arr, 2*i+2);

		return root;
		
		
	}

}
