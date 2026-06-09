package kadens_Algorithm;

import java.util.Arrays;
/*
public class mAxSumOFsubARRAY {
	
	public static void main(String[] args) {
		int[]arr  = {2,-3,4,-1,-2,1,5,-3};
		
		int [] res  = FindMaxSubArary(arr);
		System.out.println(Arrays.toString(res));
	}

	
	static int[] FindMaxSubArary(int []arr)
	{
	int n= arr.length;
	int max= 0;
	int start = 0;
	int end =0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				int sum = 0;
				for(int k = i;k<=j;k++)
				{
					sum = sum+arr[k];
//					max = Math.max(max, sum);
				}
				
				if(sum>max)
				{
					max=sum;
					start  =i;
					end = j;
					
							
				}
			}
		}
		
		return Arrays.copyOfRange(arr, start, end+1);
	}
}
*/
//---------------------------------------------Better---------------------------------
/*
public class mAxSumOFsubARRAY {
	
	public static void main(String[] args) {
		int[]arr  = {2,-3,4,-1,-2,1,5,-3};
		
		int [] res  = FindMaxSubArary(arr);
		System.out.println(Arrays.toString(res));
	}
	
	static int [] FindMaxSubArary(int []arr)
	{
		int n= arr.length;
		int max= Integer.MIN_VALUE;
		int start = 0;
		int end =0;
		for(int i=0;i<n;i++)
		{
			int sum = 0;
			for(int j=i;j<n;j++)
			{
				sum = sum+arr[j];
				
				if(sum>max)
				{
					max=sum;
					start  =i;
					end = j;
					
							
				}
			}
			
			
		}
		return Arrays.copyOfRange(arr, start, end+1);
	}

} */
//-------------------------------optimal-----------------------------
public class mAxSumOFsubARRAY {
	
	public static void main(String[] args) {
		int[]arr  = {2,-3,4,-1,-2,1,5,-3};
		
		int [] res  = FindMaxSubArary(arr);
		System.out.println(Arrays.toString(res));
	}
	
	
static int [] 	FindMaxSubArary(int []arr)
{
	
	int n= arr.length;
	int max= Integer.MIN_VALUE;
	int start = 0;
	int end =0;
	int tempStart = 0;
	int sum=0;
	for(int i=0;i<n;i++)
	{
		
		
		sum = sum+arr[i];
		
		if(sum>max)
		{
			max =sum;
			start =tempStart;
			end = i;
		}
		
		if(sum<0)
		{
			sum=0;
			tempStart = i + 1;
		}
	}
	
	return Arrays.copyOfRange(arr, start, end+1);
}
	
	
}

