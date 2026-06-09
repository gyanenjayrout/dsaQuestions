package practcie;

import java.util.*;

import practcie.BinarayTreeeeY.Node;

public class practice1 {
	
	
	static class  Node 
	{
		int data;
		Node left;
		Node right;	
		
		Node(int data)
		{
			this.data = data;
		}
	
	}
	
public static class BinaryTree {
		
		static int idx =-1;
		
		public static Node BuildTree(int[] nodes)
		{
			idx++;
			
			if(nodes[idx]==-1)
			{
				return null;
			}
			
		Node newNoe =  new Node(nodes[idx]);
		
		newNoe.left=BuildTree(nodes);
		newNoe.right = BuildTree(nodes);
		
		return newNoe;
		}
		
		
	}





public static  void inorder(Node root) {
	
	
	if(root ==null)
	{
		return;
	}
	System.out.print(root.data + "  ");
	inorder(root.left);
	
	inorder(root.right);
	
	
	
}

public static void levelorder(Node root)
{
	if(root== null)
	{
		return;
	}
	
	Queue<Node> q = new LinkedList<>();
	
	q.add(root);
	q.add(null);
	  while(!q.isEmpty())
	  {
		  Node currNode  = q.remove();
		  
		  if(currNode== null)
		  {
			  System.out.println();
			  if(q.isEmpty())
			  {
				  break;
			  }
			  else
			  {
				  q.add(null);
			  }
			  
		  }
		  else
		  {
			  System.out.print(currNode.data +" ");
			  
			  if(currNode.left != null)
			  {
				  q.add(currNode.left);
			  }
			  
			  if(currNode.right !=null)
			  {
				  q.add(currNode.right);
			  }
	  }
}
	  
	  
	  
}
public static int countNodes(Node root){
	  if(root == null)
	  {
		   return  0;
	  }
	  
	  int left  = countNodes(root.left);
	  int right =  countNodes(root.right);
	  
	  return left+right+1;
}
public static int maxheightOfTree(Node root)
{
	if(root == null)
	{
		return 0;
	}
	
	int leftHeight = maxheightOfTree(root.left);
	int rightHeight = maxheightOfTree(root.right);
	
	return Math.max(leftHeight, rightHeight)+1;
}

public static int MAxDiameter(Node root)
{
	if(root == null)
	{
		return 0;
	}
	int leftDia = MAxDiameter(root.left);
	int rightDi = MAxDiameter(root.right);
	
	int diamaterThroughnode = maxheightOfTree(root.left)+MAxDiameter(root.right)+1;
	
	return  Math.max(Math.max(leftDia, rightDi), diamaterThroughnode);
}

static class TreeInfo

{
	int ht;
	int di;
	
	public TreeInfo(int ht, int di) {
		// TODO Auto-generated constructor stub
		this.ht  =ht;
		this.di =  di;
	}
}


public static TreeInfo diameter(Node root)
{
	if(root == null)
	{
		return new TreeInfo(0, 0);
	}
	TreeInfo  leftdi = diameter(root.left);
	TreeInfo  rightDi = diameter(root.right);
	
	int  crentHeight  = Math.max(leftdi.ht,rightDi.ht)+1;
	int diametrThroughNode  = leftdi.ht+rightDi.ht+1;
	
	int maxDiameter = Math.max(diametrThroughNode,Math.max(leftdi.di, rightDi.di));
	
	return new TreeInfo(crentHeight, maxDiameter);
	
}

public static int SumOfNode(Node root)
{
	if(root== null)
	{
		return 0;
	}
	
	int leftsum = SumOfNode(root.left);
	int rightsum = SumOfNode(root.right);
	return leftsum+rightsum+root.data;
}
	public static void main(String[] args) {
		int [] nodes  =  {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		
		
		Node root = BinaryTree.BuildTree(nodes);
		
		System.out.println();
		
		System.out.println(root.data);
		
		inorder(root);
		
		System.out.println();
		System.out.println("level order");
		levelorder(root);
		
		System.out.println();
		int countNodes = countNodes(root);
		
		System.out.println(countNodes);
		
		System.out.println(SumOfNode(root));
		System.out.println(maxheightOfTree(root));
		
		System.out.println(MAxDiameter(root));
		
		System.out.println(diameter(root).di);
					
				 
	}
	
	
	

	

	

}
