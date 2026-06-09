package Wissen_technology;

public class Stockprice {
public static void main(String[] args) {
		
		
		int arr[] = {7,1,5,3,6,4};
		
		int res = maxProfit(arr);
		
		System.out.println(res);
		
	}

private static int maxProfit(int[] arr) {
	// TODO Auto-generated method stub
	
	int maxprofit =0;
	
	int min =arr[0];
	for(int i=1;i<arr.length;i++)
	{
	    int profit = arr[i]-min;
	    
	    maxprofit = Math.max(maxprofit, profit);
	    
	    min = Math.min(min, arr[i]);
	}
	
	return maxprofit;
}
}