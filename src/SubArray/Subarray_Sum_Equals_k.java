package SubArray;
 //only positive numbers
public class Subarray_Sum_Equals_k {
	/*
	 * Problem: Find the total number of subarrays whose sum equals a given value k.
Approaches:

    HashMap + Prefix Sum (handles negative values):
    Tracks cumulative sums (prefixSum) and checks if prefixSum - k exists.
    Sliding Window (only for positive values):
    Uses a two-pointer approach to adjust the window size dynamically.
    
    
    
    
    
	 */
	public static void main(String[] args) {
		int arr [ ]= {1,0,1,2,1,0,4,1,3};
		
		int k = 4;
		int subarraySum = subarraySum(arr, k);
		
		System.out.println(subarraySum);
		
	
}

	private static int subarraySum(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		int sum = 0;
	    int count = 0;
	    int start = 0;

	    for (int i = 0; i < arr.length; i++) {
	        sum += arr[i];

	        while (start <= i && sum > k) {
	            sum -= arr[start];
	            start++; // Increment start to contract the window
	        }

	        if (sum == k) {
	            count++;
	        }
	    }
	    return count;
	}
}




/*
 * 
 * n your array [1, 0, 1, 2, 1, 0, 4, 1, 3], multiple overlapping subarrays sum to k = 4. 
 * The sliding window approach may overlook some of
 *  these due to its mechanism of expanding and contracting the window.
 */

/*
 * 
 * 
 * 
 * 
 * 
	public  static String getOriginalString(String input1) {
	    // Check if the input string has an odd length
		// Check if the input string has an odd length
		 // Remove all 'i' characters to get the intermediate string
        String intermediateString = input1.replace("i", "");
        
        // Loop to find the original string
        for (int i = 0; i <= input1.length() - intermediateString.length(); i++) {
            String candidateOriginal = input1.substring(i, i + intermediateString.length());
            
            // Check if removing 'i' from this candidate gives the intermediate string
            if (candidateOriginal.replace("i", "").equals(intermediateString)) {
                return candidateOriginal; // Found the original string
            }
        }

        // If no valid original string is found
        return "notpossible";
	    /*
	     *   int count = 0;
        for (int i = 0; i < input1.length(); i++) {
            if (input1.charAt(i) == 'i') {
                count++;
            }
        }

        // If all characters are 'i' or no 'i' exists, return "Not possible"
        if (count == 0 || count == input1.length()) {
            return "Not possible";
        }

        // Calculate originalLength and concatedLength
        int len = input1.length();
        int originalLength = (len + count) / 2;
        int concatedLength = len - originalLength;

        System.out.println("Original Length: " + originalLength);
        System.out.println("Concatenated Length: " + concatedLength);

        // Extract the substring from the originalLength index
        StringBuilder s = new StringBuilder();
        for (int i = originalLength; i < input1.length(); i++) {
            s.append(input1.charAt(i));
        }
        
        

        return s.toString();
        
        
        
	  
	}
	
	
	public static void main(String[] args) {
		
		String s   = "izizibibzzbb";
		
		System.out.println(getOriginalString(s));
		
	}
 * 
 * 
 */
