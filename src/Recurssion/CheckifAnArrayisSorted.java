package Recurssion;

public class CheckifAnArrayisSorted {
	
	
public static void main(String[] args) {
	int [] arr = {1,2,3,4,5};
	boolean sorted = isSorted(arr, 0);
	
	System.out.println(sorted);
}

private static boolean isSorted(int[] arr, int index) {
	 if(index == arr.length-1) return true;
	 
	 if(arr[index]<arr[index+1])
	 {
		 return isSorted(arr, index+1);
	 }
		 return false;

	
	
	// TODO Auto-generated method stub
	
}
}
