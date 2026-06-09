package Array_2D;

public class Row_wise_Traversal {
	
	public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        for(int i=0;i<matrix.length;i++)
        {
        	for(int j=0;j<matrix[i].length;j++)
        	{
        		System.out.print(matrix[i][j]);
        	}
        	
        	System.out.println();
        }
        
        //3️⃣ Using Enhanced For-Loop (for-each Loop)
        //This is a simpler way to iterate over a 2D array but only works for row-wise traversal.
        
        System.out.println("For-Loop (for-each Loop)");
        
        for(int [] row:matrix)
        {
        	for(int num:row)
        	{
        		System.out.print(num);
        	}
        	System.out.println();
        }
        
	}

}
