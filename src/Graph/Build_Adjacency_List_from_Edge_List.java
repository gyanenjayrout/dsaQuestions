package Graph;
//Build Adjacency List from Edge List

import java.util.*; 
public class Build_Adjacency_List_from_Edge_List {
public static void main(String[] args) {
	int[][] edges = {{1,2},{1,3},{2,4},{3,4}};
//Convert Edge List → Adjacency List
	
	Map<Integer, List<Integer>> graph = new HashMap<>();
	
	for(int []edge: edges)
	{
		int u = edge[0];
		int v = edge[1];
		
	   graph.putIfAbsent(u, new ArrayList<>());
	   graph.putIfAbsent(v,  new ArrayList<>()); 
	   
	   
	   graph.get(u).add(v);
	   graph.get(v).add(u);
	   
	}
	
//	 List<List<Integer>> adj = new ArrayList<>();
//
//	 for(int i=0;i<=n;i++){
//	     adj.add(new ArrayList<>());
//	 }
//
//	 for(int[] edge : edges){
//	     int u = edge[0];
//	     int v = edge[1];
//
//	     adj.get(u).add(v);
//	     adj.get(v).add(u);
//	 }
	
}
}
