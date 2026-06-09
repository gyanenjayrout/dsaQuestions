package Array;

import java.util.Arrays;

public class SecondLargest {
	
	public static void main(String[] args) {
		int arr[]  = {3,6,2,4,5};
		int res = findoutSecondLargest(arr);
		
		System.out.println(res);
				
		
			
				
	}
	
static int findoutSecondLargest(int[]arr)
{
	 // sort the Arraay And return n-2;
	
//	Arrays.sort(arr);
//	int n =arr.length;
//	int sceondlargest = 0;
//	int largest = arr[n-1];
//	
//	for(int i=n-2;i>=0;i++)
//	{
//		if(arr[i]!=largest)
//			
//		{
//			sceondlargest  = arr[i];
//			break;
//		}
//			
//	}
//	
//	return sceondlargest;
	
//	int largest =arr[0];
//	int secLargest =-1;
//	
//	for(int i=0;i<arr.length;i++)
//	{
//		if(arr[i]>largest)
//		{
//			largest =arr[i];
//		}
//		
//	}
//	
//	for(int i=0;i<arr.length;i++)
//	{
//		if(arr[i]>secLargest && arr[i]!=largest)
//		{
//			secLargest  =arr[i];
//		}
//	}
//	
//	return secLargest;
	
	int largest =arr[0];
	int secLargest=  -1;
	
	for(int i =1;i<arr.length;i++)
	{
		if(arr[i]>largest)
		{
			secLargest = largest;
			largest = arr[i];
		}
		
		else if(arr[i]<largest && arr[i]>secLargest)
		{
			secLargest =arr[i];
			
		}
	}
	
	return secLargest;
}

}
