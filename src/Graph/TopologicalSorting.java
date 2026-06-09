package Graph;
/*
 * ❌ No v → u
✅ DFS + stack (post-order)
✅ visited[] to avoid revisiting
 */
import java.util.*;
public class TopologicalSorting {
	public List<Integer> topological(int n,int [][] edges)
	{
		
		List<List<Integer>> graph = new ArrayList<>();
		boolean visited[] = new boolean[n];
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<n;i++)
		{
			graph.add(new ArrayList<>());
		}
		 // ✅ Directed graph
	    for (int[] edge : edges) {
	        int u = edge[0];
	        int v = edge[1];
	        graph.get(u).add(v);//“Topological sort is only valid for directed graphs, so I only add edge from u to v and not reverse.”
	    }
		
		for(int  i=0;i<n;i++)
		{
			if(!visited[i])
			{
				dfs(i, graph, stack, visited);
			}
		}
		
		 List<Integer> result = new ArrayList<>();
		 
		 while(!stack.isEmpty())
		 {
			 result.add(stack.pop());
		 }
		 
		 return result;
		
		
	}
	
	
	public void  dfs(int node, List<List<Integer>>graph,Stack<Integer>stack, boolean visited[] )
	{
		visited[node] = true;
		
		for(int neighbour : graph.get(node))
		{
			if(!visited[neighbour])
			{
				dfs(neighbour, graph, stack, visited);
			}
		}
		
		stack.push(node);
		
	}

}
