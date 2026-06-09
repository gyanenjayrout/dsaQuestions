package BinarySearchTree;
import java.util.*;
import BinarySearchTree.KthLargestElemntinBST.Node;
/*       20
       /    \
     10      30
    /   \       \
   5     15      40*/
public class KthSmallestElement {
	
	static class TreeNode
	{
	    int data;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int data)
	    {
	        this.data = data;
	        left=null;
	        right=null;
	    }
	}
	
	    static int count  =0;
	    static int result = -1;
	    
	    
	    public static  int kthSmallest(TreeNode root, int k) {

	        result = -1;
	        count = 0;
	        InOrderTravsersal(root, k);
	        return result;    
	    }

	    public static void  InOrderTravsersal(TreeNode root , int k)
	    {
	        if(root ==null || count>=k)
	        {
	            return ;
	        }

	        InOrderTravsersal(root.left,k);
	     count++;
	        if(count ==k)
	        {
	            result = root.data;
	            return ;
	        }
	        InOrderTravsersal(root.right,k);
	    }
	    
	    
	    public int kthSmallest_UsingItterative(TreeNode root, int k) {
	        Stack<TreeNode> stack = new Stack<>();

	        while (true) {
	            while (root != null) {
	                stack.push(root);
	                root = root.left;
	            }

	            root = stack.pop();
	            k--;

	            if (k == 0) return root.data;

	            root = root.right;
	        }
	    }
	    

		public static void main(String[] args) {
	        TreeNode root = new TreeNode(20);
	        root.left = new TreeNode(10);
	        root.right = new TreeNode(30);
	        root.left.left = new TreeNode(5);
	        root.left.right = new TreeNode(15);
	        root.right.right = new TreeNode(40);

	        int k = 3;
	        System.out.println("The " + k + "-th largest element is: " + kthSmallest(root, k));
	    }
	
}
