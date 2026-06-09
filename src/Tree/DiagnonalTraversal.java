

package Tree;
import java.util.*;

import Tree.ArrayFreomTree.TreeNode;
public class DiagnonalTraversal {
	 public List<Integer> diagonal(TreeNode root) {
		 
		 List<Integer> result = new ArrayList<>();
		 if(root == null) return result;
		 
		 Queue<TreeNode> q= new LinkedList<>();
		 
		 q.offer(root);
		 
		 while(!q.isEmpty())
		 {
			 
			 TreeNode currNode = q.poll();
			 
			 while(currNode!= null)
			 {
				 result.add(currNode.val);
				 
				 if(currNode.left !=null) q.offer(currNode.left);
				 
                   currNode= currNode.right;
			 }
		 }
		 
	      return result;
		 
		 
	 }
	 
	  public List<List<Integer>> diagonal2(TreeNode root) {

	        Map<Integer, List<Integer>> map = new TreeMap<>();
	        helper(root, 0, map);

	        List<List<Integer>> result = new ArrayList<>();

	        for(List<Integer> list : map.values()) {
	            result.add(list);
	        }

	        return result;
	    }

	    public void helper(TreeNode node, int d,
	                       Map<Integer, List<Integer>> map) {

	        if(node == null) return;

	        map.putIfAbsent(d, new ArrayList<>());
	        map.get(d).add(node.val);

	        helper(node.left, d + 1, map); // next diagonal
	        helper(node.right, d, map);    // same diagonal
	    }
}
