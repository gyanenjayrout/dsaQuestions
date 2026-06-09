package Array_2D;

public class ADD_Dioganls {
	public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int n = matrix.length;
        
	int sum = 0;
	  for(int i=0;i<matrix.length;i++)
	  {
		   sum  += matrix[i][i];
		   
		   if(i!=n-i-1)
		   {
			   sum = sum+matrix[i][n-i-1];
		   }
	  }
	  
	  System.out.println(sum);
	  
	  
	  

	
	}

}
