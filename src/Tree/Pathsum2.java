package Tree;

import Tree.InvertAtRreee.TreeNode;
import java.util.*;
public class Pathsum2 {
	
	 List<List<Integer>> result = new ArrayList<>();
	
	public List<List<Integer>> pathSum(TreeNode root, int targetSum) 
	{
		dfs(root,targetSum ,new ArrayList<>());
		
		return result;
	}

	private void dfs(TreeNode root, int targetSum,List<Integer>paths) {
		// TODO Auto-generated method stub
	
		
		if(root ==null) return ;
		
		paths.add(root.data);
		
		if(root.left == null && root.right ==null)
		{
			if(targetSum == root.data)
			{
				result.add(new ArrayList<>(paths));
			}
		}
		else 
		{
			dfs(root.left, targetSum-root.data, paths);
			dfs(root.right,targetSum-root.data, paths);
		}
		
		paths.remove(paths.size()-1);
	}

}
