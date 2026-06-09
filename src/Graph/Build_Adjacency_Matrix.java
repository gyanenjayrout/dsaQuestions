package Graph;
/*
 * matrix[i][j] = 1  → edge exists between i and j
matrix[i][j] = 0  → no edge

 * 
 */
public class Build_Adjacency_Matrix {
	
public static void main(String[] args) {
	int[][] edges = {
		    {1,2},
		    {1,3},
		    {2,4},
		    {3,4}
		};
	
	int n= 4;
	int [][] matrix = new int[n+1][n+1];
	
	for(int [] edge : matrix )
	{
		int u = edge[0];
		int v = edge[1];
		
		matrix[u][v] = 1;
		matrix[v][u] = 1;
		
				
	}
	//edges = [[0,1], [0,2], [1,3], [2,3]]  -- starting from 0 to n-1
	int[][] edges2 = {
		    {0,1},
		    {0,2},
		    {1,3},
		    {2,3}
		};

		int x = 4;

		int[][] matrix2 = new int[x][x];
		
		/*
 0 0 0 0  Initial matrix:
0 0 0 0
0 0 0 0
0 0 0 0
		 */

		for(int[] edge : edges2)
		{
		    int u = edge[0];
		    int v = edge[1];

		    matrix2[u][v] = 1;
		    matrix2[v][u] = 1; // because undirected graph
		}
		
		/*
		 *  Final Matrix
   0 1 2 3
0 [0 1 1 0]
1 [1 0 0 1]
2 [1 0 0 1]
3 [0 1 1 0] 

 0 connected to 1
0 connected to 2
1 connected to 3
2 connected to 3


		 */

}
}


/*
 * 
 * matrix =
[   1 2 3 4 5
 1 [0 0 0 0 0]
 2 [0 0 1 1 0]
 3 [0 1 0 0 1]
 4 [0 1 0 0 1]
 5 [0 0 1 1 0]
]
 */

