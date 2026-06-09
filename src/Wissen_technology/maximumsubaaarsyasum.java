package Wissen_technology;

import java.util.Arrays;

public class maximumsubaaarsyasum {
public static void main(String[] args) {
	int[]arr  = {2,-3,4,-1,-2,1,5,-3};
	
	int  res  = FindMaxSubArary(arr);
	int [] resultarray  = findmaxsumarray(arr);
	System.out.println(res);
	System.out.println(Arrays.toString(resultarray));
}

private static int[] findmaxsumarray(int[] arr) {
	// TODO Auto-generated method stub
	
	int currsum=0;
	int maxsum=0;
	int tempstart =0;
	int start =0;
	int end =0;
	
	for(int i=0;i<arr.length;i++) {
		currsum = currsum+arr[i];
		
		
		if(currsum>maxsum)
		{
			maxsum =currsum;
			start=tempstart;
			end =i;
		}
		
		if(currsum<0)
		{
			tempstart=i+1;
		}
		
		
		
	}
	return Arrays.copyOfRange(arr, start, end+1);
}

private static int FindMaxSubArary(int[] arr) {
	// TODO Auto-generated method stub
	
	int currsum=0;
	
	int maxsum=0;
	
	for(int i=0;i<arr.length;i++)
	{
		currsum = currsum+arr[i];
		
		maxsum = Math.max(maxsum, currsum);
		
		
		if(currsum<0)
		{
			currsum=0;
		}
	}
	return maxsum;
}

//private static int FindMaxSubArary(int[] arr) {
//	// TODO Auto-generated method stub
//	
//	
//	int maxsum = 0;
//	
//	for(int i=0;i<arr.length;i++)
//	{
//		int currsum =0;
//		for(int j=i;j<arr.length;j++)
//		{
//		  currsum = currsum+arr[j];
//		  
//		  maxsum = Math.max(maxsum, currsum);
//		}
//	}
//	return maxsum;
//}
}
