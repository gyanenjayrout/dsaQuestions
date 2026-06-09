package Wissen_technology;

import java.util.Arrays;

public class moveZeros {
public static void main(String[] args) {
		
		int[] arr = {1,0,4,5,0,6,7,0,3,5,0,4};
		
		int res[] = moveallZerotoend(arr);
		
		System.out.println(Arrays.toString(res));
	}

private static int[] moveallZerotoend(int[] arr) {
	// TODO Auto-generated method stub
	
	
	int j=0;
	
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i] !=0)
		{
			int temp= arr[i];
			arr[i]= arr[j];
			arr[j] = temp;
			j++;
		}
	}
	return arr;
}

}
