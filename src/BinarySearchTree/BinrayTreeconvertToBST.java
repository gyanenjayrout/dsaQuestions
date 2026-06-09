package BinarySearchTree;

import java.util.LinkedHashSet;
import java.util.*;
/*O(n) for the first in-order traversal to collect the values.
O(n log n) for sorting the values.
O(n) for the second in-order traversal to assign sorted values back.*/
public class BinrayTreeconvertToBST {
	
	static class Node
	{
		int data ;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data =data;
			left = null;
			right = null;
		}
	}
	
	private static Node converIttoBST(Node root) {
		// TODO Auto-generated method stub
		
		if(root ==null)
		{
			return null;
		}
		
		 List<Integer> tree = new ArrayList<>();
		
		storeitInOrder(root, tree );
		 tree.sort(Integer::compareTo); // Sort the elements in ascending order
		int [] index= {0};
		buildBSTFromSortedList(root, tree, index);
		
		return root;
		
		
		
	}
	
	
	


	private static void storeitInOrder(Node root, List<Integer> tree) {
		// TODO Auto-generated method stub
		
		if(root ==null)
		{
			return;
		}
		
		storeitInOrder(root.left, tree);
		tree.add(root.data);
		storeitInOrder(root.right, tree);
		
	}
	private static void buildBSTFromSortedList(Node root, List<Integer> tree, int[] index) {
		// TODO Auto-generated method stub
		if(root==null)
		{
			return;
		}
		
		buildBSTFromSortedList(root.left,tree, index);
		
		root.data = tree.get(index[0]);
		index[0]++;
		
		buildBSTFromSortedList(root.right, tree, index);
		
		
		
	}

	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left =new Node(2);
		root.right = new Node(3);
		
		
		converIttoBST(root);
		
	}


	

}
