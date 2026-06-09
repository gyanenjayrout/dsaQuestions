package BinaraySearch;
/*
 * 
 * 
 * we need to figure out sorted array 
 * 
 * if arr[start]<=arr[mid]  ---------> check left side
 * else  --------------------------->check right side
 * 
 * 
 * 
 */
public class SearchIn_RotatedArary {
public static void main(String[] args) {
	int [] nums = {4,5,6,7,0,1,2};
	
	int [] nums2 = {6,7,0,1,2,3,4};
	int target = 0;
	
	int search = search(nums2,target);
	
	System.out.println(search);
}

public static int search(int[] arr, int target) {
	
	int start=0;
	int end = arr.length-1;
	
	
	while(start<=end)
	{
		int mid = start +(end-start)/2;
		
	    if(arr[mid]==target)
	    {
	    	return mid;
	    }
	    
	    
	    if(arr[start]<=arr[mid]) //-------> Left side is sorted
	    {
	    	if(arr[start]<=target && target<arr[mid])
	    	{
	    		end = mid-1;
	    	}else
	    	{
	    		start= mid+1;
	    	}
	    }else  // right side is sorted
	    {
	    	if(arr[mid]<=target && target<=arr[end])
	    	{
	    		start=  mid+1;
	    	}else
	    	{
	    		end= mid-1;
	    	}
	    }
	}
	
	return -1;
	
}
}
