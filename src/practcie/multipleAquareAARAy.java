package practcie;

import java.util.Arrays;

public class multipleAquareAARAy {
	public static void main(String[] args) {
		int [] arr  = {-4,-1,0,3,10};
		
		 int [] res = sqrtOfSortedArray(arr);
		 
		 System.out.println(Arrays.toString(res));
		
	}

	private static int[] sqrtOfSortedArray(int[] arr) {
		// TODO Auto-generated method stub
		
	int start =0;
	int end = arr.length-1;
	int index = arr.length-1;
	
	int result [] = new int [arr.length];
	
	while(start<=end)
	{
		int leftsqueare  = arr[start]* arr[start];
		int rightSquarr = arr[end]* arr[end];
		
		
		if(leftsqueare>rightSquarr)
		{
			result[index--] = leftsqueare;
			start++;
		}
		else 
		{
			result[index--] = rightSquarr;
			end--;
			
		}
		
	}
		return result;
	}

}
