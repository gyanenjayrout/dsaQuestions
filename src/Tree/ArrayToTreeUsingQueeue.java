package Tree;
/*
 *            1
           /     \
          2       3
           \     / \
            5   6   7
 */
import java.util.*;
class TreeNodeeee {

    int val;

    TreeNodeeee left;
    TreeNodeeee right;

    TreeNodeeee(int val) {
        this.val = val;
    }
}

public class ArrayToTreeUsingQueeue {
	
	private static TreeNodeeee  bildTreee(Integer [] arr)
	{
		 if(arr.length == 0 || arr[0] == null)
		        return null;
		
		 TreeNodeeee root = new TreeNodeeee(arr[0]);
		Queue<TreeNodeeee>  q = new LinkedList();
		
		
		q.offer(root);
		int  i=1;
		
		while(!q.isEmpty() && i<arr.length)
		{
			TreeNodeeee curr = q.poll();
			
			//left
			 if(i < arr.length && arr[i] != null) {
			
			curr.left = new TreeNodeeee(arr[i]); //Create a new node and attach it as left child of current node.
			q.offer(curr.left);
			}
			i++;
			
	
			//right
			
			if(i<arr.length && arr[i] !=null)
			{
				curr.right = new TreeNodeeee(arr[i]);//Create a new node and attach it as right child of current node.
				q.offer(curr.right);
			}
			i++;
		}
		return root;
		
	}
	
	
	public static void main(String[] args) {
		

        Integer[] arr = {1,2,3,null,5,6,7};

        TreeNodeeee root = bildTreee(arr);

        System.out.println("Inorder Traversal:");
		
//		inorder(root);
		leveleOrder(root);
	}


	private static void inorder(TreeNodeeee root) {
		// TODO Auto-generated method stub
		
		if(root ==null)
		{
			return ;
		}
	
		
		inorder(root.left);
		System.out.println(root.val);
		inorder(root.right);
		
	}
	
	private static void preOrder(TreeNodeeee root)
	{
		if(root ==null) return ;
		
		
		System.out.println(root.val);
		preOrder(root.left);
		preOrder(root.right);
	}
	
	
	private static void postOrder(TreeNodeeee root)
	{
		if(root ==null) return;
		
		
		postOrder(root.left);
		postOrder(root.right);
		
		System.out.println(root.val);
		
		
		
	}
	
	
	private static void leveleOrder(TreeNodeeee root)
	{
		
		Queue<TreeNodeeee> qe = new LinkedList<TreeNodeeee>();
		
		
		qe.offer(root);
		qe.offer(null);
		
		while(!qe.isEmpty())
		{
			TreeNodeeee curr = qe.poll();
			
			if(curr ==null)
			{
				System.out.println();
				if(qe.isEmpty())
				{
					break;
				}else
				{
					qe.offer(null);
				}
			}else
			{
				System.out.print(curr.val );
			
				
				if(curr.left !=null)  qe.offer(curr.left);
				if(curr.right !=null)  qe.offer(curr.right);
			}
		}
	}
	
	private static int height(TreeNodeeee root)
	{
		
		if(root ==null) return 0;
		
		int leftheight = height( root.left);
		int rightheight = height( root.right);
		
		
		return Math.max(leftheight, rightheight)+1;
		
	}
	
	
	private static int diamteer(TreeNodeeee root)
	{
		
		
		  if(root ==null) return 0;
		  
		  
		  int diam1 = diamteer(root.left);
		  int diam2 = diamteer(root.right);
		  int diam = height(root.left) + height(root.right);
		  
		  
		  return Math.max(diam, Math.max(diam2, diam1));
		  
		  
	}
	
	class pair
	{
		TreeNodeeee node;
		int hd;
		
		pair(TreeNodeeee root,int hd)
		{
			this.node = root;
			this.hd = hd;
		}
		
	}
	
	private List<Integer> topview(TreeNodeeee root)
	{
		 ArrayList<Integer> result = new ArrayList<>();
		 if(root == null) return result;
		
		Queue<pair>  q = new LinkedList<>();
		
		Map<Integer, Integer> map = new TreeMap<>();
		
		q.add(new pair(root, 0));
		
		while(!q.isEmpty())
		{
			pair curr = q.poll();
			
			if(!map.containsKey(curr.hd))
			{
				map.put(curr.hd, curr.node.val);
			}
			
			if(curr.node.left !=null) q.add(new pair(curr.node.left, curr.hd-1));
			if(curr.node.right !=null) q.add(new pair(curr.node.right, curr.hd+1));
			
		}
		
		
		for(int value : map.values())
		{
			result.add(value);
		}
		
		return result;
	}
	
	

}
