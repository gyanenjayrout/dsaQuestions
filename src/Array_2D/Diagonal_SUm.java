package Array_2D;

public class Diagonal_SUm {
	
	public static void main(String[] args) {
		 int[][] matrix = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };
		 
		 int sum =0;
		  int n = matrix.length;
		  
	
		  int totalDiagonalSum = 0;

		  for (int i = 0; i < matrix.length; i++) {
		      for (int j = 0; j < matrix[i].length; j++) {
		          if (i == j) {
		              totalDiagonalSum += matrix[i][j];
		          } 
		          else if (i + j == matrix.length - 1) {
		              totalDiagonalSum += matrix[i][j];
		          }
		      }
		  }
		  System.out.println("Total Diagonal Sum: " + totalDiagonalSum);
		  
		 for(int i=0;i<matrix.length;i++)
		 {
			 sum = sum+matrix[i][i];
			 
			 if(i!= n-i-1)
			 {
				 sum = sum+ matrix[i][n-i-1];
			 }
		 }
		 
		 System.out.println("sum is " + sum);
		 
		 
  System.out.println("=======================================================");
		 
		 for(int i = 0; i < matrix.length; i++)
		 {
		   System.out.print(matrix[i][i]);
		
		 }
		 System.out.println();
		 for(int i = 0; i < matrix.length; i++)
		 {
		  
		   System.out.print(matrix[i][n-i-1]);
		 }

		
	}

}
