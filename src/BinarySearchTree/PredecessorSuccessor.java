package BinarySearchTree;


/*
 *       20
        /   \
       8     22
      / \
     4   12
        /  \
       10   14
*/

public class PredecessorSuccessor {
	
	
	static class Node {
	    int data;
	    Node left, right;

	    Node(int data) {
	        this.data = data;
	        this.left = this.right = null;
	    }
	}
	


static Node predecessor = null;
static Node successor = null;


private static void findPredecessorSuccessor(Node root, int key) {
	// TODO Auto-generated method stub
	
	
	if(root ==null)
	{
		return;
		
	}
	
	if(root.data ==key)
	{
		
	
		if (root.left !=null)
		{
			Node temp = root.left;
			
			while(temp.right !=null)
			{
				temp = temp.right;
			}
			
			predecessor  =temp;
		}
		
		
		
		if(root.right !=null)
		{
			Node temp = root.right;
			
			while(temp.left !=null)
			{
				temp  = temp.left;
				
			}
			successor = temp;
		}
		
		return;
	}
	
	if(root.data>key)
	{
		successor =root;
		findPredecessorSuccessor(root.left, key);
	}
	if(root.data<key)
	{
		predecessor = root;
		findPredecessorSuccessor(root.right, key);
	}
}


	
	public static void main(String[] args) {
		 Node root = new Node(20);
	        root.left = new Node(8);
	        root.right = new Node(22);
	        root.left.left = new Node(4);
	        root.left.right = new Node(12);
	        root.left.right.left = new Node(10);
	        root.left.right.right = new Node(14);

	        
	        int key = 10;
	        findPredecessorSuccessor(root, key);

	        if (predecessor != null) {
	            System.out.println("Predecessor is: " + predecessor.data);
	        } else {
	            System.out.println("No Predecessor");
	        }

	        if (successor != null) {
	            System.out.println("Successor is: " + successor.data);
	        } else {
	            System.out.println("No Successor");
	        }
	}
	



	

}
