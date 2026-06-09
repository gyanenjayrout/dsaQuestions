package Graph;
import java.util.*;
public class BredthFirstSearch {
	 public void bfs(int start, List<List<Integer>> graph, int n) {
		 
		boolean visited []= new boolean[graph.size()];
		
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(start);
		visited[start ]= true;
		
		while(!q.isEmpty())
		{
			int node = q.poll();
			  System.out.print(node + " "); // optional
			
			for(int neighbour : graph.get(node))
			{
				if(!visited[neighbour])
				{
					visited[neighbour]= true;
					q.offer(neighbour);
				}
			}
		}
	 }
	 
	 
	 



}
/*
 * 0 → friends: 1,2
1 → friends: 0,3
2 → friends: 0,4
 */
