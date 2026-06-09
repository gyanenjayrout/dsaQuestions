  package Array_2D;

public class Diagonal_Traversal {
	
	public static void main(String[] args) {
		 int[][] matrix = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };
		 
		 for(int i=0;i<matrix.length;i++)
		 {
			 System.out.print(matrix[i][i] +" ");
//			 Indexes Traversed: (0,0), (1,1), (2,2)
		 }
		 
		 System.out.println();
		 
		 for(int i=0;i<matrix.length;i++)
		 {
			 System.out.print(matrix[i][matrix.length-i-1]+  " "); //(0,2), (1,1), (2,0)
		 }
	}

}
