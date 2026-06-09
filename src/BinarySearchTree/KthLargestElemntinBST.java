package BinarySearchTree;
import java.util.*;
public class KthLargestElemntinBST {
	
	/*    20
       /    \
     10      30
    /   \       \
   5     15      40
*/
	static class Node
	{
	    int data;
	    Node left;
	    Node right;
	    Node(int data)
	    {
	        this.data = data;
	        left=null;
	        right=null;
	    }
	}
	
	static int count = 0;
	static int result = -1;
	
	
	public  static int findKthLargest(Node root, int k)
	{
		
		count  =0;
		result = -1;
				
		reveerseOrdeertravsersal(root, k);
		
		return result;
		
	}


	private  static void reveerseOrdeertravsersal(Node root, int k) {
		// TODO Auto-generated method stub
		if(root ==null || count>=k)
		{
			return ;
		}
		
		reveerseOrdeertravsersal(root.right, k);
		
		count++;
		
		if(count ==k)
		{
			result = root.data;
			
			return;
		}
		reveerseOrdeertravsersal(root.left,k);
	}
	
	public int kthLargest_USingItterrative(Node root, int k) {
	    Stack<Node> stack = new Stack<>();

	    while (true) {
	        while (root != null) {
	            stack.push(root);
	            root = root.right;  // go right first
	        }

	        root = stack.pop();
	        k--;

	        if (k == 0) return root.data;

	        root = root.left;  // then go left
	    }
	}

	
	
	public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(15);
        root.right.right = new Node(40);

        int k = 3;
        System.out.println("The " + k + "-th largest element is: " + findKthLargest(root, k));
    }
	
//	    // return the Kth largest element in the given BST rooted at 'root'
//	    public int kthLargest(Node root, int k) {
//	        // Your code here
//	        
//	       if(root ==null)
//			{
//				return -1;
//			}
//			
//			 List<Integer> tree = new ArrayList<>();
//			 storeitInOrder(root, tree );
//			 
//			 
//			 
//			 return tree.get(tree.size()-k);
//			 
//	    }
//	    
//	    public static void storeitInOrder(Node root, List<Integer>tree)
//	    {
//	        
//	        if(root ==null)
//	        {
//	            return;
//	        }
//	        storeitInOrder(root.left, tree);
//	        
//	        tree.add(root.data);
//	        
//	        storeitInOrder(root.right, tree );
//	    }


}
