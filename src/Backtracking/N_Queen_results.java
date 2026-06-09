package Backtracking;
import java.util.*;

/*
 * 
 * The difference between rows (placedRow - row) and the difference between columns (c - col) must not be equal.
Reason for Math.abs: Queens on the same diagonal have the same absolute difference between rows and columns.

    Example:
        Queen 1: (2, 3)
        Queen 2: (4, 5)
        Diagonal difference: |4 - 2| == |5 - 3| == 2
        
        
        Key Takeaways for Interviews

    Purpose of isSafe: To check if a queen at (row, col) is not under attack.
    Row Conflict: Queens cannot be in the same row.
    Diagonal Conflict: Use the absolute difference of rows and columns to detect queens on the same diagonal.
    Efficiency: The check runs in O(n), where n is the number of columns already processed (length of current list).

This ensures that the solution avoids placing queens in invalid positions during the backtracking process.
 */
public class N_Queen_results {
	
	    public ArrayList<ArrayList<Integer>> nQueen(int n) {
	       ArrayList<ArrayList<Integer>> result = new ArrayList<>(); // Corrected type
	        List<Integer> current = new ArrayList<>();
	        
	        helper(n, 0, result, current);
	        
	        return result;
	    }
	    
	     public void helper(int n, int col, ArrayList<ArrayList<Integer>> result, List<Integer> current) {
	         
	         if(col ==n)
	         {
	             result.add(new ArrayList<>(current));
	             return;
	         }
	         
	        // Try placing the queen in each row of the current column
	        for (int row = 1; row <= n; row++) {
	            if (isSafe(row, col, current)) {
	                current.add(row);  // Place queen in this row
	                helper(n, col + 1, result, current);  // Recur for the next column
	                current.remove(current.size() - 1);  // Backtrack
	            }
	        }
	         
	         
	         
	     }
	     
	     public boolean isSafe(int row, int col, List<Integer> current)
	     {
	         // Check the same row
	         
	         for(int c=0;c<current.size();c++)
	         {
	             int placedrow = current.get(c);
	             
	          // Check if another queen is in the same row   
	             if(placedrow ==row)
	             {
	                 return false;
	             }
	             /*
	              * 
	              * If another queen is already in the same row, it means the queens are attacking each other horizontally.
                     Reason: Two queens in the same row can attack each other directly.
	              */
	             
	             if(Math.abs(row-placedrow) == Math.abs(c-col))
	             {
	                 return false;
	             }
	             
	             
	         }
	        
	        return true;
	     }
	     
	   
	   
	
}
