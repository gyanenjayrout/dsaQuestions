

package Tree;

import java.util.*;

public class InvertAtRreee {
	
	
	    static class TreeNode {
	        int data;
	        TreeNode left, right;

	        TreeNode(int data) {
	            this.data = data;
	            this.left = null;
	            this.right = null;
	        }
	    }
	
	public static TreeNode invertTreePostorder(TreeNode root) {
	    if (root == null) {
	        return null; // Base case: If the tree is empty, return null.
	    }

	    // Recursive calls to invert the left and right subtrees
	    TreeNode leftNode = invertTreePostorder(root.left);
	    TreeNode rightNode = invertTreePostorder(root.right);

	    // Swap the left and right children
	    root.left = rightNode;
	    root.right = leftNode;

	    return root; // Return the root of the inverted subtree.
	}
	
	public static TreeNode inveerttrePreOrdeer(TreeNode root)
	{
		
		
		if(root == null) return null;
		
		TreeNode temp = null;
		temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		inveerttrePreOrdeer(root.left);
		inveerttrePreOrdeer(root.right);
		
		return root;
		
	}
	
	public static TreeNode inveerttreLEEVlOrder(TreeNode root)
	{
		if(root ==null) return null ;
		Queue<TreeNode> q= new LinkedList<>();
		
		q.add(root);
		
		while(!q.isEmpty())
		{
			TreeNode curr = q.poll();
			
			TreeNode temp = null;
			temp = curr.left;
			curr.left = curr.right;
			curr.right = temp;
			
			  if (curr.left != null) q.add(curr.left);
		        if (curr.right != null) q.add(curr.right);
		}
		
		return root;
		
		
			
	}
	
	 public static void main(String[] args) {
	        // Create the binary tree
		 TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(3);
	        root.left.left = new TreeNode(4);
	        root.left.right = new TreeNode(5);
	        root.right.right = new TreeNode(6);

	        System.out.println("Original Tree Level Order:");
	        levelOrder(root);
	        System.out.println();

	        // Invert the binary tree
//	        invertTreePostorder(root);
	        
	        inveerttrePreOrdeer(root);
	        

	        System.out.println("Inverted Tree Level Order:");
	        levelOrder(root);
	        
	    }

	private static void levelOrder(TreeNode root) {
		// TODO Auto-generated method stub
		
		if(root ==null)
		{
			return;
		}
		
		Queue<TreeNode> q =  new LinkedList<>();
		
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty())
		{
			TreeNode curNode = q.remove();
			
			if(curNode ==null)
			{
				System.out.println();
				
				if(q.isEmpty())
				{
					break;
				}else
				{
					q.add(null);
				}
			}else
			{
				System.out.print(curNode.data + " ");
				if(curNode.left !=null)
				{
					q.add(curNode.left);
				}
				
				if(curNode.right !=null)
				{
					q.add(curNode.right);
				}
			}
		}
		
		
		
		
	}

}
