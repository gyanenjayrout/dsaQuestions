package practcie;

import java.util.Arrays;

public class mAximumsumofsubarray {
	
public static void main(String[] args) {
	int[]arr  = {2,-3,4,-1,-2,1,5,-3};
	
	int [] res  = FindMaxSubArary(arr);
	System.out.println(Arrays.toString(res));
}

private static int[] FindMaxSubArary(int[] arr) {
	// TODO Auto-generated method stub
	
	int maxlength = Integer.MIN_VALUE;
	int sum = 0;
	
	int start =0;
	int end  =0;
	int temp =0;
	
	for(int i=0;i<arr.length;i++)
	{
		sum  =sum+arr[i];
		
		if(sum>maxlength)
		{
			maxlength = sum;
			start = temp;
			end  =i;
		}
		
		if(sum<=0)
		{
			sum =0;
			temp = i+1;
		}
	}
	return Arrays.copyOfRange(arr, start, end+1);
}

}
