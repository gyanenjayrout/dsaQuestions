package BinaraySearch;

public class SearchThegivenNmber {
	
	public static void main(String[] args) {
		
		int arr []  = { 1,2,4,5,6,7};
		
		
		int index = finthegivennumber(3, arr);
		
		System.out.println(index);
	}

	private static int finthegivennumber(int key, int [] arr) {
		// TODO Auto-generated method stub
		
		int start  =0;
		int end = arr.length-1;
		
		
		while(start<=end)
		{
			int mid = start+(end-start)/2;
			
			
			if(arr[mid]==key)
			{
				return mid;
			}
			
			else if(arr[mid]>key)
			{
				 end = mid - 1; // Reduce search space correctly
			}
			else
			{
				start = mid+1;
			}
		}
		// Returning start or end both would work based on specific use case
        return start; // Lower bound or next greater element position
        // return end; // Previous smaller element position
        
        /*Lower Bound: You want the smallest index where the element is greater than or equal to the key.
Next Greater Element: You want the index of the smallest element in the array that is strictly greater than the key.*/
    }
	
	

}
