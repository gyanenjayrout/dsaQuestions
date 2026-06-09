package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode1 {
    int val;
    TreeNode1 left, right;

    TreeNode1(int val) {
        this.val = val;
    }
}


class Binarytree
{
	
	public List<List<Integer>> levelOrder(TreeNode1 root)
	{
		
		
		  List<List<Integer>> result = new ArrayList<>();
		
		if(root == null ) return result;
		
		Queue<TreeNode1>q = new LinkedList<>();
		q.offer(root);
		
		while(!q.isEmpty())
		{
			
			int leevlsize = q.size();
			
			List<Integer> current =   new ArrayList<>();
			
			for(int i=0;i<leevlsize;i++)
			{
				
				TreeNode1 node = q.poll();
				current.add(node.val);
				
				if(node.left !=null) q.offer(node.left);
				if(node.right !=null) q.offer(node.right);
			}
			
			result.add(current);
		}
		
		return result;
	}
	
	public List<List<Integer>> ZIG_ZAG(TreeNode1 root)
	{
		
		
		
		  List<List<Integer>> result = new ArrayList<>();
		
		if(root==null) return null;
		
		  boolean leftToRight = true;
		
		Queue<TreeNode1> q=  new LinkedList<>();
		q.offer(root);
		
		while(!q.isEmpty())
		{
			int levelsize = q.size();
			
			LinkedList<Integer> level = new LinkedList<>();
			
			for(int i=0;i<levelsize;i++)
			{
				TreeNode1 node = q.poll();
				
				if(leftToRight) level.addLast(node.val);
				else level.addFirst(node.val);
				
				if(node.left !=null) q.offer(node.left);
				if(node.right !=null) q.offer(node.right);
			}
			result.add(level);
			leftToRight = !leftToRight;// leftToRight = !leftToRight; is how we flip the direction at each level in zigzag traversal.
			/*
			 * It's a toggle:

If leftToRight is true, it becomes false

If false, it becomes true
			 */
		}
		
		
		return result;
		
	}
	
	public List<Integer> rightview(TreeNode1 root)
	{
		List<Integer> result = new ArrayList<>();
		
		if(root==null) return null;
		
		Queue<TreeNode1> q= new LinkedList<>();
		
		q.offer(root);
		while(!q.isEmpty())
		{
			
			int size = q.size();
			
			for(int i=0;i<size;i++)
			{
				TreeNode1 node = q.poll();
				if(i==size-1) result.add(node.val);
				
				if(node.left !=null) q.offer(node.left);
				if(node.right!=null) q.offer(node.right);
			}
		}
		
		
		return result;
		
	}
	
	public List<Integer> LeftView(TreeNode1 root)
	{
		List<Integer> result = new ArrayList<>();
		
		if(root==null) return null;
		
		Queue<TreeNode1> q= new LinkedList<>();
		
		q.offer(root);
		while(!q.isEmpty())
		{
			
			int size = q.size();
			
			for(int i=0;i<size;i++)
			{
				TreeNode1 node = q.poll();
				if(i==0) result.add(node.val);
				
				if(node.left !=null) q.offer(node.left);
				if(node.right!=null) q.offer(node.right);
			}
		}
		
		
		return result;
		
	}
	public List<Integer> flatLevelOrder(TreeNode1 root) {
		
		List<Integer > result = new ArrayList<>();
		
		if(root ==null) return null;
		
		Queue<TreeNode1> q=  new LinkedList<>();
		
		q.offer(root);
		
		while(!q.isEmpty())
		{
			TreeNode1 node = q.poll();
			
			result.add(node.val);
			
			if(node.left!=null ) q.offer(node.left);
			if(node.right !=null) q.offer(node.right);
		}
		
		
		return result;
	}
	
	
}
public class LEVELORDERTRAVESRAL {
   
	
public static void main(String[] args) {
	TreeNode1 root  =  new TreeNode1(1);
	root.left = new TreeNode1(2);
	root.right = new TreeNode1(3);
	
	root.left.left = new TreeNode1(4);
	root.left.right = new TreeNode1(5);
	
	root.right.left = new TreeNode1(6);
	root.right.right = new TreeNode1(7);
	
	
	Binarytree bt = new Binarytree();
	
	List<List<Integer>> levels  = bt.levelOrder(root);
	
	
	for(List<Integer> level: levels )
	{
		System.out.println(level);
	}
	
     List<List<Integer>> zig_ZAG = bt.ZIG_ZAG(root);
     
     for(List<Integer> level : zig_ZAG)
     {
    	 System.out.println(level);
     }
     
     List<Integer> rightview = bt.rightview(root);
     System.out.println(rightview);
     
     
     List<Integer> leftView = bt.LeftView(root);
     
     System.out.println(leftView);
     
     List<Integer> flat = bt.flatLevelOrder(root);
     
     System.out.println(flat);
}
}
