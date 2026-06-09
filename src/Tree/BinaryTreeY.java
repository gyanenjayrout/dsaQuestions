package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeY {
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data = data;
			this.left=null;
			this.right  =null;
		}
		
		
	}
	/*
	 * In computer science, a binary tree
	 *  is a tree data structure in which each node has at most two children, referred to as the left child and the right child.
    1
   / \
  2   3
 / \    \ 
4   5    6

4 2 5 1 3 6 inoder 
1 4 2 5 3 6  preorder
4 2 5 3 6 1  postorder
1 
2 3 
4 5 6 
 level order
*/
	
	static class BinaryTree {
		static int idx = -1;
		
		public static Node BuildTree(int nodes[]) {
			idx++;
			if (nodes[idx] == -1) {
				return null;
			}
			
			Node newNode = new Node(nodes[idx]);
			newNode.left = BuildTree(nodes);
			newNode.right = BuildTree(nodes);
			return newNode;
		}

		
	}
	public static void printTree(Node root, String prefix, boolean isLeft) {
		if (root == null) {
			return;
		}
		
		// Print the current node
		System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.data);
		
		// Recursively print the left and right subtrees
		printTree(root.left, prefix + (isLeft ? "│   " : "    "), true);
		printTree(root.right, prefix + (isLeft ? "│   " : "    "), false);
	}
	
	
	public static void inOrderTraversal(Node root)
	{
		if(root == null)
		{
			return;
		}
		inOrderTraversal(root.left);
		System.out.print(root.data + " ");
		inOrderTraversal(root.right);
	}
	public static void preOrderTravasel(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		System.out.print(root.data + " ");
		preOrderTravasel(root.left);
		preOrderTravasel(root.right);
	}
	
	public static void postorder(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");
	}
	
	public static void LevelOrderTraversal(Node root) {  
	    if (root == null) {
	        return;
	    }
	    
	    // Create a queue to hold nodes for level-order traversal
	    Queue<Node> q = new LinkedList<>();
	    
	    // Add the root node to the queue
	    q.add(root);
	    q.add(null);  // Add a marker for the end of the current level
	    
	    while (!q.isEmpty()) {
	        Node currNode = q.remove();
	        
	        if (currNode == null) {
	            // End of the current level
	            System.out.println();  // Print a newline to separate levels
	            if (q.isEmpty()) {
	                break;  // If the queue is empty, we are done
	            } else {
	                q.add(null);  // Add a marker for the next level
	            }
	        } else {
	            // Print the current node's data
	            System.out.print(currNode.data + " ");
	            
	            // Add the left child to the queue if it exists
	            if (currNode.left != null) {
	                q.add(currNode.left);
	            }
	            
	            // Add the right child to the queue if it exists
	            if (currNode.right != null) {
	                q.add(currNode.right);
	            }
	        }
	    }
	}
	
	
	public static int CountNodes(Node root)
	{
	  if(root == null)
	  {
		  return 0;
	  }
	  
	  int leftNode = CountNodes(root.left);
	  int rightNode = CountNodes(root.right);
	  
	  return leftNode+rightNode+1;
	}

	
	public static int SumOfNodes(Node root)
	{
		if(root == null)
		  {
			  return 0;
		  }
		
		 int leftysum = SumOfNodes(root.left);
		  int rightsum = SumOfNodes(root.right);
		  
		return leftysum+rightsum+root.data;
	}
	
	public static int maxheightOfTree(Node root)
	{
		if(root == null)
		  {
			  return 0;
		  }
		
		 int leftHeight = maxheightOfTree(root.left);
		  int rightHeight = maxheightOfTree(root.right);
		  
		  int totalHeight = Math.max(leftHeight, rightHeight) +1;
		  
		   return totalHeight;
	}
	
	static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }
	
	public static TreeInfo diameterOfBinaryTree(Node root) {
        // Base case: If the tree is empty, its height and diameter are 0
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        // Recursively find the height and diameter of the left and right subtrees
        TreeInfo leftInfo = diameterOfBinaryTree(root.left);
        TreeInfo rightInfo = diameterOfBinaryTree(root.right);

        // Height of the current node will be max height of its subtrees + 1
        int currentHeight = Math.max(leftInfo.height, rightInfo.height) + 1;

        // The diameter at the current node will be the maximum of the following:
        // 1. The diameter of the left subtree
        // 2. The diameter of the right subtree
        // 3. The sum of the heights of the left and right subtrees (if path passes through the root)
        int diameterThroughRoot = leftInfo.height + rightInfo.height +1;
        int currentDiameter = Math.max(diameterThroughRoot, Math.max(leftInfo.diameter, rightInfo.diameter));

        // Return the height and diameter of the current node
        return new TreeInfo(currentHeight, currentDiameter);
    }
	
	
	public static void main(String[] args) {
		int nodes[] =  {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
	    BinaryTree tree = new BinaryTree();
	      Node root =   BinaryTree.BuildTree(nodes);
	      
	      System.out.println("Binary Tree Structure:");
			printTree(root, "", false);
	      
	      System.out.println(root.data);
	      
	      BinaryTreeY.inOrderTraversal(root);
	      System.out.println("inoder ");
	      BinaryTreeY.preOrderTravasel(root);
	      System.out.println(" preorder");
	      
	      System.out.println("------------------");
	      BinaryTreeY.postorder(root);
	      System.out.println(" postorder");
	      BinaryTreeY.LevelOrderTraversal(root);
	      
	      System.out.println( " level order");
	      
	      System.out.println("total Nodes presenbt: "  +CountNodes(root));
	      
           System.out.println();
	      
	      System.out.println("total sm of nodfes : "  +SumOfNodes(root));
	    
	      
            System.out.println();
	      
	      System.out.println("max height  ofnodfes : "  +maxheightOfTree(root));
	      
	      
	      
	      TreeInfo result = diameterOfBinaryTree(root);

	        // Print the diameter of the tree
	        System.out.println("The diameter of the tree is: " + result.diameter);
	     
	}

}
