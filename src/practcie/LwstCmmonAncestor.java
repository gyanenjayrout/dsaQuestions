package practcie;



public class LwstCmmonAncestor {
	
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
	
	public static Node insertIntoTree(Node root, int val)
	{
		
		if(root ==null)
		{
			root = new Node(val);
			return root;
		}
		
		if(root.data>val)
		{
			root.left = insertIntoTree(root.left, val);
		}
		else
		{
			root.right = insertIntoTree(root.right, val);
		}
		 
		 
		 
		 return root;
		
	}
	
	
	
	public static void printBST(Node root)
	{
		if(root == null)
		{
			return ;
		}
		
		printBST(root.left);
		System.out.print(root.data+ "->");
		printBST(root.right);
	}
	
	public static Node LWCA(Node root, int p, int q)
	{
		if(root==null )
		{
			return null;
		}
		
		if(root.data>p && root.data>q)
		{
			return LWCA(root.left, p,q);
		}
		
		
		 if (root.data < p && root.data < q) {
	            return LWCA(root.right, p, q);
	        }
		
		
		return root;
		
	}
	
	
	
	public static void main(String[] args) {
		int nodes []=  {8,5,3,1,4,10,14,16};
		
		
		Node root  = null;
		for(int num: nodes)
		{
			root = insertIntoTree(root, num);
			
		}
		
		printBST(root);
		
		System.out.println();

        int p = 1, q = 5;
        Node lca = LWCA(root, p, q);
        if (lca != null) {
            System.out.println("Lowest Common Ancestor of " + p + " and " + q + " is: " + lca.data);
        } else {
            System.out.println("LCA does not exist for the given nodes.");
        }
		
		
	}

}
