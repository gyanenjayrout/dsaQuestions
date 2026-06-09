package TwoPointerApproach;

import java.util.*;

public class moveZerosToend {
public static void main(String[] args) {
		
		int[] arr = {1,0,4,5,0,6,7,0,3,5,0,4};
		
		int res[] = moveallZerotoend(arr);
		
		System.out.println(Arrays.toString(res));
	}

public void moveZeroes(int[] nums) {

    int index = 0;

    for (int i = 0; i < nums.length; i++) {

        if (nums[i] != 0) {

            if (i != index) { //avoid self swap
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }

            index++;
        }
    }
}
/*
private static int[] moveallZerotoend(int[] arr) {
	// TODO Auto-generated method stub
	
	List<Integer>  list =  new ArrayList<>();
	
	for(int num: arr)
	{
		if(num !=0)
		{
			list.add(num);
			
		}
	}
	int index = 0;
	
	for(int num :list)
	{
		arr[index++] =num;
	}
	
	for(int i= list.size();i<arr.length;i++)
	{
		arr[index++] =0;
	}
	return arr;
	//O(n)+O(k)+O(n−k)=O(2n)
}
*/

private static int[] moveallZerotoend(int[] arr) {
	// TODO Auto-generated method stub
	int i=0;
	for(int j=0;j<arr.length;j++)
	{
		if(arr[j]!=0)
		{
			swap(arr, i, j);
			i++;
		}
	}
	return arr;
}
private static void swap(int[] arr, int i, int j) {
	// TODO Auto-generated method stub
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] =temp;
}

}
