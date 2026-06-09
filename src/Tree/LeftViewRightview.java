package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class LeftViewRightview {
	 static class Node
	  {
		  int data;
		  Node left ;
		  Node right;
		public Node(int data) {
			super();
			this.data = data;
			this.left = null;
			this.right = null;
		}
	  }
	 
		public static void main(String[] args)  {
			// TODO Auto-generated method stub
	        
			Node root = new Node(1);
			root.left = new Node(2);
			root.right = new Node(3);
			root.left.left = new Node(4);
			root.left.right = new Node(5);
			root.right.right = new Node(6);
			
			System.out.println("Original Tree Level Order:");
	        levelOrder(root);
	        
	        System.out.println("leftView");
	        
	        ArrayList<Integer>  leftview = leftView(root);
	        ArrayList<Integer> rightview = rightview(root);
	        
	        System.out.println(leftview);
	        System.out.println(rightview);
	        System.out.println();
	        
	        List<Integer> result = new ArrayList<>();
	        leftViewDFS(root, 0, result);
	        System.out.println(result);

		}
		
		private static ArrayList<Integer> leftView (Node root) {
			// TODO Auto-generated method stub
			
			ArrayList<Integer> list = new ArrayList<>();
			Queue<Node> q=  new LinkedList<>();
			
			q.add(root);
			
			while(!q.isEmpty())
			{
				int size = q.size();
				
				for(int i=0;i<size;i++)
				{
					Node currNode = q.poll();
					
					if(i==0)
					{
						list.add(currNode.data);
					}
					
					
					if(currNode.left != null ) q.add(currNode.left);
					if(currNode.right !=null) q.add(currNode.right);
					
				}
			}
			return list;
		}
		
		private static ArrayList<Integer> rightview (Node root) {
			// TODO Auto-generated method stub
			
			ArrayList<Integer> list = new ArrayList<>();
			Queue<Node> q=  new LinkedList<>();
			
			q.add(root);
			
			while(!q.isEmpty())
			{
				int size = q.size();
				
				 for (int i = 0; i < size; i++)
				{
					Node currNode = q.poll();
					
					if(i == size-1)
					{
						list.add(currNode.data);
					}
					
					
					if(currNode.left != null ) q.add(currNode.left);
					if(currNode.right !=null) q.add(currNode.right);
					
				}
			}
			return list;
		}
		
		static void leftViewDFS(Node root, int level, List<Integer> result) {
		    if (root == null) return;

		    // first time reaching this level
		    if (level == result.size()) {
		        result.add(root.data);
		    }

		    // go left first
		    leftViewDFS(root.left, level + 1, result);
		    leftViewDFS(root.right, level + 1, result);
		    
		}
		

		private static void levelOrder(Node root) {
			// TODO Auto-gener ated method stub
			if(root ==null)
			{
				return;
			}
			Queue<Node> q=  new LinkedList<>();
			
			q.add(root);
			q.add(null);
			
			while(!q.isEmpty())
			{
				Node currNode = q.remove();
				
				if(currNode == null)
				{
					System.out.println();
					if(q.isEmpty())
					{
						break;
					}else
					{
						q.add(null);
					}
				}else
				{
					System.out.print(currNode.data +"  " );
					
					if(currNode.left !=null)
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
}
