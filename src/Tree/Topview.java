package Tree;
import java.util.*;

	/*
	 * BFS O(n) + n inserts into TreeMap
= O(n log n)
TreeMap sorted keys => log n cost
HashMap unsorted => O(1) avg

sc = O(h)
	 */

public class Topview
{
   class TreeNode {
	    int val;
	    TreeNode left, right;

	    TreeNode(int val) {
	        this.val = val;
	    }
	   
	}
	
	 class Pair
	 {
	 	TreeNode node;
	 	int  hd;
	 	
	 	public Pair(TreeNode root, int hd) {
	 		// TODO Auto-generated constructor stub
	 		
	 		this.node = root;
	 		this.hd = hd;
	 	}
	 }	
	
	 public ArrayList<Integer> topView(TreeNode root) {
		 
		 ArrayList<Integer> result = new ArrayList<>();
		 if(root == null) return result;
		 Queue<Pair> q = new LinkedList<>();
		 
		 Map<Integer, Integer> map = new TreeMap<>(); // insertion order need to be follwed
		 
		 q.add(new Pair(root, 0));
		 
		while(!q.isEmpty())
		{
			
			Pair curr = q.poll();
			
			if(!map.containsKey(curr.hd))
			{
				map.put(curr.hd, curr.node.val);
			}
			
			if(curr.node.left !=null)
			{
				q.add(new Pair(curr.node.left, curr.hd-1));
			}
			
			if(curr.node.right !=null)
			{
				q.add(new Pair(curr.node.right, curr.hd+1));
			}
		}
		
		for(int value: map.values())
		{
			result.add(value);
		}
		 
		 return result;
		 
	 }
	 
	   public ArrayList<Integer> bottomView(TreeNode root) {

	        ArrayList<Integer> result = new ArrayList<>();
	        if(root == null) return result;

	        TreeMap<Integer, Integer> map = new TreeMap<>();
	        Queue<Pair> q = new LinkedList<>();

	        q.offer(new Pair(root, 0));

	        while(!q.isEmpty()) {

	            Pair curr = q.poll();

	            // overwrite always
	            map.put(curr.hd, curr.node.val);

	            if(curr.node.left != null)
	                q.offer(new Pair(curr.node.left, curr.hd - 1));

	            if(curr.node.right != null)
	                q.offer(new Pair(curr.node.right, curr.hd + 1));
	        }

	        for(int val : map.values()) {
	            result.add(val);
	        }

	        return result;
	    }
	
}