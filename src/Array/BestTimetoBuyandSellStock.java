package Array;

import java.util.Arrays;

public class BestTimetoBuyandSellStock {
	public static void main(String[] args) {
		
		
		int arr[] = {7,1,5,3,6,4};
		
		int res = maxProfit(arr);
		
		System.out.println(res);
		
	}
	
	
	
	
static  int maxProfit(int[] prices) {
	
	int min =prices[0];
	
	int profit = 0;
	
	for(int i=1;i<prices.length;i++)
	{
		
		
		//evry day is selling day and we need to figure out the max profit
		  int cost  = prices[i]-min;
		  
		  profit  = Math.max(cost, profit);
		  
		  min =  Math.min(min, prices[i]);
	}
	
	
	return profit;
	
	}

}
