package Graph;

import java.util.ArrayList;

public class CycleDFS {
	public static boolean dfs(int node, int parent,
            ArrayList<ArrayList<Integer>> graph,
            boolean[] visited) {
		
		visited[node] = true;
		
		for(int neighbor : graph.get(node))
		{
		   
		   if (!visited[neighbor]) {
               if (dfs(neighbor, node, graph, visited)) {
                   return true;
               }
           }
		   else
		   {   
			   if(neighbor != parent)
			   {
				   return true;
			   }
		   }
		}
		
		
		
		
				return false;
		
		
		
	}

}
