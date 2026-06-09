package Tree;

import java.util.*;

public class KthLargestSuminBianryTree {
	public long kthLargestLevelSum(TreeNode root, int k) {

        Queue<TreeNode> q = new LinkedList<>();

       PriorityQueue<Long> pq = new PriorityQueue<>();
        q.offer(root);

        while(!q.isEmpty())
        {
            int size = q.size();
            long sum =0;

            for(int i=0;i<size;i++){
                TreeNode  node = q.poll();
                sum = sum+ node.data;


                if(node.left !=null ) q.offer(node.left);
                if(node.right !=null) q.offer(node.right);
            }

            pq.add(sum);
            
            if (pq.size() > k) {
                pq.poll();
            }
        }
    
        if(pq.size()< k) return -1;

        return pq.peek();
       
    }
}

/*
 * ✅ Time Complexity (TC)
Step 1: BFS Traversal
You visit every node once
👉 O(N)

 * Step 2: Heap Operations

For each level:

You do pq.add(sum) → O(log k)
Sometimes pq.poll() → O(log k)

👉 Number of levels = L

So:

Heap work = O(L log k)

✅ Final Time Complexity
O(N + L log k)

🧠 Simplify for interview:
Worst case: skewed tree → L ≈ N
👉 O(N log k)



✅ Space Complexity (SC)
1. Queue (BFS)
Stores nodes of one level
Worst case = width of tree
O(W)

2. Heap
Stores at most K elements
O(K)

Time Complexity: O(N log K)
Space Complexity: O(W + K), where W is max width of tree
 */
