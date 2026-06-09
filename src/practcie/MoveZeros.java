package practcie;

import java.util.*;

public class MoveZeros {

	public static void main(String[] args) {
		
		int[] arr = {1,0,4,5,0,6,7,0,3,5,0,4};
		
	 moveallZerotoend(arr);
		
		System.out.println(Arrays.toString(arr));
	}

	private static void moveallZerotoend(int[] arr) {
		// TODO Auto-generated method stub\
		
	int i=0;
	for(int j=0;j<arr.length;j++)
	{
		if(arr[j] != 0)
		{
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			i++;
		}
	}

}
}