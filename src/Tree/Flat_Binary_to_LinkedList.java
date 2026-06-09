package Tree;


class TreeNode
{
	
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data ) {
		// TODO Auto-generated constructor stub
		
		this.data =  data;
	}
	
}
public class Flat_Binary_to_LinkedList {
	public void flatten(TreeNode root) {
		
		
		if(root ==null)
		{
			return;
		}
		
		flatten(root.left);
		flatten(root.right);
		
		TreeNode tempright = root.right;
		
		TreeNode current = root;
		
		root.right = root.left;
		
		
		while(current.right !=null)
		{
			current = current.right;
		}
		
		current.right = tempright;
	}

}
