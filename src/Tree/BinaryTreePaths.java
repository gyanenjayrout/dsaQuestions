package Tree;
import java.util.*;
public class BinaryTreePaths {
	public List<String> binaryTreePaths(TreeNode root) {

        List<String> result = new ArrayList<>();

        if(root ==null) return result;

        dfs(root, "", result);
        return result;
    }

    public void dfs(TreeNode root, String path, List<String> result)
    {

        if(root ==null)  return;
        path = path+root.data;

        if(root.left == null && root.right == null)
        {
            result.add(path);
            return;
        }
        path = path+ "->";

        dfs(root.left, path , result);
        dfs(root.right, path, result);
    }
}
/*
 * This is DFS + Backtracking / Path Building
 * Go root to leaf
Store path when leaf reached
 * 
 * ✅ Why No Explicit Backtracking Needed?

Because Java String is immutable.

Each call gets separate copy.
With immutable String, each recursive call gets its own path snapshot, so manual backtracking isn’t required.

Traversal is O(n), but string creation adds path-copy cost, so total is O(n * h), worst case O(n²).

✅ TC / SC
Time: O(n * pathLength)
Space: O(h)
 */
