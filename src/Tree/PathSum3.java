package Tree;
import java.util.*;
public class PathSum3 {
	public int pathSum(TreeNode root, int targetSum) {

        Map<Long, Integer>prefixmap = new HashMap<>();
         prefixmap.put(0L,1);
       int count = dfs(root,0L, targetSum, prefixmap);
       return count;
        
    }

	private int dfs(TreeNode root, long currsum, int targetSum, Map<Long, Integer> prefixmap) {
		// TODO Auto-generated method stub
		
		if(root ==null) return 0;
		
		currsum = currsum+root.data;
		
		int count  = prefixmap.getOrDefault(currsum-targetSum, 0);
		
		prefixmap.put(currsum, prefixmap.getOrDefault(currsum, 0)+1);
		
		count = count+dfs(root.left, currsum, targetSum, prefixmap);
        count = count+ dfs(root.right, currsum, targetSum, prefixmap);
        
        prefixmap.put(currsum, prefixmap.get(currsum)-1);
		return count;
	}
}
