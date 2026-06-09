package practcie;



public class BuildABinaryTreee {
static class Node{
		
		int data;
		Node left;
		Node right;
		
		public Node( int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.left=null;
			this.right  =null;
		}
	}

static int idx =-1;
public  static Node createTree(int [] node)
{
	
	idx++;
	if(node[idx] == -1)
	{
		return null;
	}
	
	Node newNode  = new Node(node[idx]);
	
	newNode .left = createTree(node);
	newNode.right  = createTree(node);
	return newNode;
	
	
}

public static Node LWCA(Node root, int p, int q)
{
	if(root ==null || root.data==p || root.data ==q)
	{
		return root;
	}
	
	Node leftNode =LWCA(root.left, p,q);
	
	Node rightNode  =LWCA(root.right,p,q);
	
	if(leftNode !=null && rightNode !=null)
	{
		return root;
	}
	
   return leftNode != null ? leftNode:rightNode;
}




	
	public static void main(String[] args) {
		int node [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		Node root  =createTree(node);
		
		root = LWCA(root, 4,6);
		if(root==null)
		{
			System.out.println("not present");
		}else
		{
			System.out.println("root is"+ root.data);
			}
		
	}

}
