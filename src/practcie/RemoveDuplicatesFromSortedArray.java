package practcie;
import java.util.*;
public class RemoveDuplicatesFromSortedArray {
	
	public static void main(String[] args) {
		int sortedArray[] = {1,1,2,3,3,3,4,4,5};
		
		int newLength =  removeDuplicates(sortedArray);
		System.out.println( " new Length : "+   newLength);
		System.out.println("sorted Array");
		System.out.println(Arrays.toString(Arrays.copyOf(sortedArray, newLength)));
//		for(int i=0;i<newLength;i++)
//		{
//			System.out.println(  sortedArray[i]);
//		}
		
	}
/*
	private static int removeDuplicates(int[] arr) {
		// TODO Auto-generated method stub
		 
		int index = 0;
		//The outer loop iterates through each element in the array.
		for( int i=0;i<arr.length;i++)
		{
			 boolean isDuplicate = false;
			 
//For each element, the inner loop checks all prior elements to see if the current element is a duplicate.
//If a duplicate is found, the inner loop sets isDuplicate to true and breaks, indicating that this element 
// be counted in the unique array.
			 
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					isDuplicate = true;
					break;
				}
			}
			
			if(!isDuplicate)
			{
				arr[index++] =arr[i];
			}
		}
		
		return index;
	}
	*/
	
	/*
	private static int removeDuplicates(int[] arr)
	{
		Set<Integer> set  =  new  HashSet<>();
		int index = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(!set.contains(arr[i]))
			{
				set.add(arr[i]);
				
				arr[index++]= arr[i];
			}
		}
		return index;
		
	}
	*/
	
	private static int removeDuplicates(int[] arr)
	{
		int index = 1;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[i-1])
			{
				arr[index++] = arr[i];
			}
		}
		
		return index;
	}
}
