package Array;

import java.util.*;

public class MoveAllZerosToend {
	
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,0,4,5,0,6,7,0,3,5,0,4};
		
		int res[] = moveallZerotoend(arr);
		
		System.out.println(Arrays.toString(res));
	}
	
static int [] moveallZerotoend(int []arr)
{
//	List<Integer> list = new ArrayList<>();
//	
//	for(int nums: arr)
//	{
//		if(nums!=0)
//		{
//			list.add(nums);
//		}
//	}
//	
//	for( int i=0;i<list.size();i++)
//	{
//	    arr[i] = list.get(i);
//	    
//	}
//	
//	int nz = list.size();
//	
//	for(int i=nz;i<arr.length;i++)
//	{
//		arr[i] =0;
//	}
	
	int j=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]!=0)
		{
			int temp  =arr[i];
			arr[i]  =arr[j];
			arr[j] =temp;
			j++;
			
		}
	}
	
	
	return arr;
}
	

}
