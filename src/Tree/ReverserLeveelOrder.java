package Tree;


import java.util.*;

class Node
{
	int data;
	Node left;
	Node right;
	
	Node(int data)
	{
		 this.data = data;
		left = null;
		right = null;
	}
}

 public class ReverserLeveelOrder {
    public ArrayList<Integer> reverseLevelOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result; // Return empty list if root is null
        }

        Queue<Node> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        queue.offer(root);

        // Perform normal level order traversal but push to stack
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            stack.push(current.data);

            // Add right child before left to reverse the order
            if (current.right != null) {
                queue.offer(current.right);
            }
            if (current.left != null) {
                queue.offer(current.left);
            }
        }

        // Pop elements from stack to result list
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        return result;
    }
    
    public static void main(String[] args) {
    	ReverserLeveelOrder tree = new ReverserLeveelOrder();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ArrayList<Integer> result = tree.reverseLevelOrder(root);
        System.out.println(result); // Output: [4, 5, 6, 7, 2, 3, 1]
    }

}


