package BinarySearchTree;

public class LwstCommanAncestor {
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data=data;
			left = null;
			right = null;
		}
	}
	
	public static Node insertTree(int val , Node root)
	{
		if(root == null)
		{
			root = new Node(val);
			return root;
		}
		
		if(val>root.data)
		{
			root.right = insertTree(val, root.right);
		}
		else
		{
			root .left = insertTree(val, root.left);
		}
		return root;
	}
	
	public static void inOrderTraversal(Node root)
	{
		if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ->");
            inOrderTraversal(root.right);
        }
		
	}
	public static Node lowestCommonAncestor(Node root, int  p, int q)
	{ 
		
		if(root ==null)
		{
			return null;
		}
		
		if(p<root.data && q<root.data)
		{
			 return lowestCommonAncestor(root.left, p, q);
		}
		
		
		if(p>root.data && q>root.data)
		{
			return lowestCommonAncestor(root.right, p,q);
		}
		
		return root;
		
	}
	
	/*LCA Function (LWCA): This function is where the LCA is found.

    It checks the values of p and q relative to the current node's data.
    If both p and q are less than root.data, the LCA must be in the left subtree, so it recursively calls LWCA on root.left.
    If both p and q are greater than root.data, it recursively calls LWCA on root.right.
    If neither condition is met, then root itself is the LCA.
    */
	
	
	
	
	
	public static void main(String[] args) {
		int nodes []=  {8,5,3,1,4,10,14,16};
		
		Node root  = null;
		
		for(int num : nodes)
		{
			root = insertTree(num, root);
		}
		
		inOrderTraversal(root);
		System.out.println("null");
		
		Node lca = lowestCommonAncestor(root, 3, 14);
		if(lca !=null)
		{
			System.out.println("the lowest comman ancecsetor is  "  +  lca.data);
		}
		else {
            System.out.println("Lowest Common Ancestor not found.");
        }
    
	}
	
	

}
