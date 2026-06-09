package HackerRAnk;

public class MinimumMovestoMatchArrays {
	
	public static void main(String[] args) {
        int[] arr1 = {1234, 4321};
        int[] arr2 = {2345, 3214};

        int result = minimumMoves(arr1, arr2);
        System.out.println("Minimum Moves: " + result);
    }

	private static int minimumMoves(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		
		
		int totalmoves = 0;
		
		for(int i=0;i<arr1.length;i++)
		{
			String num1 = String.valueOf(arr1[i]);
			String num2 = String.valueOf(arr2[i]);
			
			
			for(int j = 0;j<num1.length();j++)
			{
				int digit1 = num1.charAt(j)-'0';
				int digit2  =num2.charAt(j) - '0';
				
				totalmoves = totalmoves+Math.abs(digit1-digit2);
			}
			

			
		}
		
		return totalmoves;
	}

}
/*
 * Explanation:

    Iterate through both arrays simultaneously.
    Convert each integer into its string representation to process individual digits.
    For each pair of digits, calculate the absolute difference and add it to the totalMoves.
    Repeat the process for all digits and elements.*
 */ 
