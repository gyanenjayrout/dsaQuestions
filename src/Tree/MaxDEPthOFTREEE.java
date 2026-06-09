package Tree;

import java.util.*;

public class MaxDEPthOFTREEE {
	public int maxDepth(TreeNode root) {
		
		Queue<TreeNode> q=  new LinkedList<>();
		
		q.offer(root);
		
		int size =0;
		
		while(!q.isEmpty())
		{
			for(int i=0;i<q.size();i++)
			{
				TreeNode currNode = q.poll();
				
				if(currNode.left !=null) q.add(currNode.left);
				if(currNode.right !=null) q.add(currNode.right);
			}
			size++;
		}
		
		return size;
	}
}
