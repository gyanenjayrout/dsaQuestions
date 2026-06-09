 

package Graph;

import java.util.ArrayList;

public class DepthFirstSearch {

    public static void dfs(int node, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {

        visited[node] = true;
        System.out.println(node);

        for(int neighbour : graph.get(node))
        {
            if(!visited[neighbour])
            {
                dfs(neighbour, graph, visited);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            graph.add(new ArrayList<>());
        }

        boolean[] visited = new boolean[graph.size()];

        graph.get(0).add(1);

        graph.get(1).add(2);
        graph.get(1).add(3);

        graph.get(2).add(4);
        graph.get(2).add(1);

        graph.get(3).add(1);

        graph.get(4).add(2);

        for(int i = 0; i < graph.size(); i++)
        {
            if(!visited[i])
            {
                dfs(i, graph, visited);
            }
        }
    }
}
/*
DFS = go through neighbors
MAIN LOOP = handle disconnected components
*/