package Tree;
import java.util.*;


class TreeNode4 {
    int val;
    TreeNode4 left, right;
    TreeNode4(int val) { this.val = val; }
}

public class zigzag {
	 public static  List<List<Integer>> zigzagLevelOrder(TreeNode4 root) {
	        List<List<Integer>> result = new ArrayList<>();
	        
	        if (root == null) return result;
	        
	        Queue<TreeNode4> q = new LinkedList<>();
	        q.offer(root);
	        boolean leftToRight = true;

	        while (!q.isEmpty()) {
	            int size = q.size();
	            LinkedList<Integer> level = new LinkedList<>();

	            for (int i = 0; i < size; i++) {
	                TreeNode4 curr = q.poll();

	                if (leftToRight) {
	                    level.addLast(curr.val);
	                } else {
	                    level.addFirst(curr.val);
	                }

	                if (curr.left != null) q.offer(curr.left);
	                if (curr.right != null) q.offer(curr.right);
	            }

	            result.add(level);
	            leftToRight = !leftToRight;
	        }

	        return result;
	    }
	 public static  List<Integer> zigzagLevelOrderFlat(TreeNode4 root) {
		    List<Integer> result = new ArrayList<>();
		    if (root == null) return result;

		    Queue<TreeNode4> q = new LinkedList<>();
		    q.offer(root);
		    boolean leftToRight = true;

		    while (!q.isEmpty()) {
		        int size = q.size();
		        LinkedList<Integer> level = new LinkedList<>();

		        for (int i = 0; i < size; i++) {
		            TreeNode4 curr = q.poll();

		            if (leftToRight) {
		                level.addLast(curr.val);
		            } else {
		                level.addFirst(curr.val);
		            }

		            if (curr.left != null) q.offer(curr.left);
		            if (curr.right != null) q.offer(curr.right);
		        }

		        result.addAll(level); // ✅ Flattened here
		        leftToRight = !leftToRight;
		    }

		    return result;
		}
	 
	 public static void main(String[] args) {
	        /*
	                1
	               / \
	              2   3
	             / \   \
	            4   5   6
	        */

	        TreeNode4 root = new TreeNode4(1);
	        root.left = new TreeNode4(2);
	        root.right = new TreeNode4(3);
	        root.left.left = new TreeNode4(4);
	        root.left.right = new TreeNode4(5);
	        root.right.right = new TreeNode4(6);

	     
	    List<List<Integer>> zigzagLevelOrder = zigzag.zigzagLevelOrder(root);
	        System.out.println(zigzagLevelOrder); 
	        
	        List<Integer> zigzagLevelOrderFlat = zigzag.zigzagLevelOrderFlat(root);
	        System.out.println(zigzagLevelOrderFlat);
	        
	        // Output: [1, 3, 2, 4, 5, 6]
	    }

}
/*

Great question!

Let’s break it down:

✅ result.add(level)
Used when result is a List<List<Integer>>

Each level stays grouped as a separate list.

Example result:
[[1], [3, 2], [4, 5, 6]]

✅ result.addAll(level)
Used when result is a flat List<Integer>

All values from the current level are directly added (merged) into result

Example result:
[1, 3, 2, 4, 5, 6]


*/