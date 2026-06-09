package PrefixSum;

import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        // Initialize all values in result to 1
        Arrays.fill(result, 1); //Multiplication should start from 1, not 0 (multiplicative identity). 
        //result []={1,1,1,1,1};

        // Iterate through each element
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    result[i] *= arr[j];  // Store product directly in result
                }
            }
        }

        return result;  // Return the result array
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4};
        System.out.println("Product Except Self: " + Arrays.toString(productExceptSelf(arr)));
        
        System.out.println("Product Except Self using prefix and suffix : " + Arrays.toString(productExceptSelfUsingPrefixSuffix(arr)));
        
        System.out.println("Product Except Self using prefix and suffix : " + Arrays.toString(productusingprefsuf(arr)));
    }

	private static int[] productusingprefsuf(int[] arr) {
		// TODO Auto-generated method stub
		 int n = arr.length;
	        int[] result = new int[n];
	        
	        result[0]=1;
	        
	        for(int i=1;i<arr.length;i++)
	        {
	        	result[i] =  result[i-1]*arr[i-1]; 
	        }
	        
// / Step 2: Multiply suffix in-place
	        int suffix = 1;
	        
	        for(int i=n-1;i>=0;i--)
	        {
	        	  result[i] = result[i] * suffix;
	        	  suffix = suffix * arr[i];
	        }
		return result;
	}

	private static int[] productExceptSelfUsingPrefixSuffix(int[] arr) {
		
		int result [] =new int [arr.length];
		int prefix [ ]=  new int [arr.length];
		int suffix[]=  new int [arr.length];
		
		prefix[0] = 1 ;// because no elements before index 0
				
		for(int i=1;i<arr.length;i++)
		{
			prefix[i]= prefix[i-1]*arr[i-1]; 
		}
		
		suffix[arr.length-1]=1;
		
		for(int i = arr.length-2;i>=0;i--)
		{
			suffix[i] = suffix[i+1]* arr[i+1];
		}
		
		for(int i=0;i<arr.length;i++)
		{
			result[i]= prefix[i]* suffix[i];
		}
		
		// TODO Auto-generated method stub
		return result;
	}
}
	/*
	 * ✅ Example Execution (for arr = [1, 2, 3, 4]):
	 * Index (i)	prefix[i] Calculation	            prefix Array
		0	         prefix[0] = 1	                   [1, 0, 0, 0]
		1	       1 * arr[0] = 1 * 1 = 1	            [1, 1, 0, 0]
		2	       1 * arr[1] = 1 * 2 = 2	            [1, 1, 2, 0]
		3	       2 * arr[2] = 2 * 3 = 6	            [1, 1, 2, 6]
		
		prefix = [1, 1, 2, 6]
		
		
		Index (i)	 suffix[i] Calculation	               suffix Array
			3             (last) Suffix[3] = 1	            [0, 0, 0, 1]
			2	       suffix[2] = 1 * arr[3] = 4	        [0, 0, 4, 1]
			1	      suffix[1] = 4 * arr[2] = 12         	[0, 12, 4, 1]
			0	       suffix[0] = 12 * arr[1] = 24	        [24, 12, 4, 1]
	 */
	
//	// Traverse for each element (O(n²) complexity)
//    for (int i = 0; i < n; i++) {
//        int product = 1;  // Store product of other elements
//
//        for (int j = 0; j < n; j++) {
//            if (i != j) {  // Exclude the current element
//                product *= arr[j];
//            }
//        }
//
//        result[i] = product; // Store the computed product
//    }
//
//    return result;
//}
