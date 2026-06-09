package Array;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {
	
	
	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3,3,3};
		
		int arr2[] = {1,1,1,2,2,3,3,3};
		
		
		
		int length  =removeduplicates(arr);
		
		int length2 = removeDuplicatesAllowTwice(arr2);
		System.out.println(Arrays.toString(Arrays.copyOf(arr, length)));
		System.out.println(Arrays.toString(Arrays.copyOf(arr2, length2)));

		
	}
	
	public static int removeduplicatesssss(int[] arr) {
	    int index = 0;

	    for (int i = 1; i < arr.length; i++) {
	        if (arr[index] != arr[i]) {
	            index++;
	            arr[index] = arr[i];
	        }
	    }
	    return index + 1;
	}
	
	
	public static int removeDuplicatesAllowTwice(int[] nums) {
	    if (nums.length <= 2) return nums.length;

	    int i = 2; // start from index 2, because first two elements can stay

	    for (int j = 2; j < nums.length; j++) { //1,1,1,2,2,3,3,“If current value equals value 2 positions back → it’s 3rd duplicate → skip it”
	        if (nums[j] != nums[i - 2]) {
	            nums[i] = nums[j];
	            i++;
	        }
	    }
	    return i;
	}
	
  static int removeduplicates(int []arr)
  {
	  
	  
	  
//	  Set<Integer> set =new HashSet<>();
//	  int index =  0;
//	  for(int i=0;i<arr.length;i++)
//	  {
//		  if(!set.contains(arr[i]))
	  
//		  
//		  {
//			  set.add(arr[i]);
//		  
//		  arr[index++] = arr[i];
//			  
//		  }
//  }
	 
	  
	/*
	 * modifying the original array in-place (i.e., without creating a new array), and the unique elements 
	 * are stored in the first index positions of the original array. After running the removeduplicates
	 *  method, the unique elements are found at the start of the array, and their number is determined by the value of index.*/  
	  if(arr.length ==0)
	  {
		  return 0;
	  }
	  int index = 1; 
	  //Step 2: Initialize index to 1 (this will track the position for unique elements)
	   
	  // Step 3: Start iterating from the second element (i = 1) since the first element is
	  for(int i=1;i<arr.length;i++)
	  {
		// Step 4: If the current element is different from the previous one
		  if(arr[i] !=arr[i-1])
		  {
			   // Step 5: Place the unique element at the `index` position
			  arr[index++] =arr[i];  //
			  
		  }
	  }
	return index;  
	
	
	
  }
}
