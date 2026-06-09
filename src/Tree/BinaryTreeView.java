package Tree;
import java.util.*;
/*
 * 
 * 🔧 Option 1: With result list (Standard and clean)

✅ Easier to maintain
✅ Better for interview readability
❌ Extra space (O(N))
🔧 Option 2: Modify the original list in-place

This is possible if you’re using something like an ArrayList in Java (or a list in Python). But:

    You need to be very careful with index positions while iterating and modifying the same list.

    It can be messy — inserting, merging, and removing from the same list can be error-prone.
 */
//TreeNode definition
class TreeNode3 {
 int val;
 TreeNode3 left, right;

 TreeNode3(int val) {
     this.val = val;
 }
}

public class BinaryTreeView {

 // ✅ Right Side View
 public List<Integer> rightSideView(TreeNode3 root) {
     List<Integer> result = new ArrayList<>();
     if (root == null) return result;

     Queue<TreeNode3> queue = new LinkedList<>();
     queue.offer(root);

     while (!queue.isEmpty()) {
         int levelSize = queue.size();

         for (int i = 0; i < levelSize; i++) {
        	 TreeNode3 curr = queue.poll();

             // Last node in this level
             if (i == levelSize - 1) result.add(curr.val);

             if (curr.left != null) queue.offer(curr.left);
             if (curr.right != null) queue.offer(curr.right);
         }
     }

     return result;
 }

 // ✅ Left Side View
 public List<Integer> leftSideView(TreeNode3 root) {
     List<Integer> result = new ArrayList<>();
     if (root == null) return result;

     Queue<TreeNode3> queue = new LinkedList<>();
     queue.offer(root);

     while (!queue.isEmpty()) {
         int levelSize = queue.size();

         for (int i = 0; i < levelSize; i++) {
        	 TreeNode3 curr = queue.poll();

             // First node in this level
             if (i == 0) result.add(curr.val);

             if (curr.left != null) queue.offer(curr.left);
             if (curr.right != null) queue.offer(curr.right);
         }
     }

     return result;
 }

 // ✅ Main method to test
 public static void main(String[] args) {
     BinaryTreeView treeView = new BinaryTreeView();

     // Creating the tree:
     //         1
     //       /   \
     //      2     3
     //       \     \
     //        5     4

     TreeNode3 root = new TreeNode3(1);
     root.left = new TreeNode3(2);
     root.left.right = new TreeNode3(5);
     root.right = new TreeNode3(3);
     root.right.right = new TreeNode3(4);

     System.out.println("Right Side View: " + treeView.rightSideView(root));
     System.out.println("Left Side View: " + treeView.leftSideView(root));
 }
}


