package Graph;
import java.util.*;
public class CountCompleteComponenets {
	 public int countComponents(int n, int[][] edges) {

	        List<List<Integer>> graph = new ArrayList<>();
			boolean visited[] = new boolean[n];
			int count =0;
			
			for(int i=0;i<n;i++)
			{
				graph.add(new ArrayList<>());
			}
			 
		    for (int[] edge : edges) {
		        int u = edge[0];
		        int v = edge[1];
		        graph.get(u).add(v);
	            graph.get(v).add(u);
		    }
	        
	        for(int i=0;i<n;i++)
	        {
	            if(!visited[i])
	            {
	            	List<Integer> component = new ArrayList<>();
	                dfs(i, graph, visited, component);
	                int nodes = component.size();
	                int edgecount =0;
	                
	                for(int node : component)
	                {
	                	edgecount = edgecount + graph.get(node).size();
	                }
	                
	                if(edgecount == nodes *(nodes-1)/2)
	                {
	                	count++;
	                }
	            }
	        }

	        return count;
	        
	    }

	    public void dfs(int node, List<List<Integer>> graph, boolean[] visited, List<Integer>component)
	    {
	        visited[node] = true;
	        component.add(node);

	        for(int neighbour: graph.get(node))
	        {
	            if( !visited[neighbour])
	            {
	            	dfs(neighbour, graph, visited, component);
	            }
	        }
	    }
}
