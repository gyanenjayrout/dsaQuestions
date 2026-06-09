package TwoPointerApproach;
/*
 * ven though the array is sorted, squaring breaks the order because negative numbers become positive. 
 * So the largest square will come from either the most negative element (left) or
 *  the most positive element (right). Hence, I use two pointers and fill the result from the end
 */
import java.util.Arrays;

public class SquaresofaSortedArray {
public static void main(String[] args) {
		
		int [] arr  = {-4,-1,0,3,10};
		
		 int [] res = sqrtOfSortedArray(arr);
		 
		 System.out.println(Arrays.toString(res));
		
	}

private static int[] sqrtOfSortedArray(int[] arr) {
	// TODO Auto-generated method stub
	int start = 0;
	int end = arr.length-1;
	int res []  =new int [arr.length];
	int index= arr.length-1;
	while(start<=end)
		
	{
		int left  = arr[start]* arr[start];
		int right  =arr[end]* arr[end];
		
		if(left<right)
		{
			res[index--] =right;
			end--;
		}
		else 
		{
			res[index--]=left;
			start++;
		}
//		else
//		{
//			res[index--] =left;
//			start++;
//			end--;
//		}
	}
	return res;
}

//private static int[] sqrtOfSortedArray(int[] arr) {
//	// TODO Auto-generated method stub
//	int res []  =new int [arr.length];
//	for(int i=0;i<arr.length;i++)
//	{
//		res[i] =arr[i]*arr[i];
//	}
//	Arrays.sort(res);
//	return res;
//}


}
