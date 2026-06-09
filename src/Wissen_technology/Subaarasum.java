package Wissen_technology;


import java.util.HashMap;

//import javax.print.attribute.HashAttributeSet;

public class Subaarasum {
public static void main(String[] args) {
	int arr [ ]= {1,0,1,2,1,0,4,1,3};
	
	int k = 4;
	int subarraySum = subarraySum(arr, k);
	System.out.println(subarraySum);
}

private static int subarraySum(int[] arr, int k) {
	// TODO Auto-generated method stub
	
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		int currsum=0;
		for(int j=i;j<arr.length;j++)
		{
			currsum =  currsum+arr[i];
			
			
			if(currsum==k)
			{
				count++;
			}
		}
	}
	
	return count;
}
}
