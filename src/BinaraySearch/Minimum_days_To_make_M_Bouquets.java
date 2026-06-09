package BinaraySearch;

import java.util.Arrays;

public class Minimum_days_To_make_M_Bouquets {
	
	public static void main(String[] args) {
	int []	bloomDay = {1,10,3,10,2};
		int m = 3, k = 1;
		
		int minDays = minDays(bloomDay, m, k);
		
		System.out.println(minDays);
	}
	 public static int minDays(int[] bloomDay, int m, int k) 
	 {
		 int n=  bloomDay.length;
		 
		 long total = (long) m*k;
		 
		 if(total>n) return -1;
		 
		 
		 int low = Arrays.stream(bloomDay).min().getAsInt();
		 int high = Arrays.stream(bloomDay).max().getAsInt();
		 
		 int ans= 0;
		 
		 while(low<=high) {
			 int mid = low+(high-low)/2;
			 
			boolean  poosible  =poosibletomakeBokay(bloomDay, mid, m, k);
			
			if(poosible)
			{
				ans = mid;
				high = mid-1;
			}else
			{
				low = mid+1;
			}
			
		 }
		 return ans;
		 
	 }
	private static boolean poosibletomakeBokay(int[] bloomDay, int mid, int m, int k) {
		// TODO Auto-generated method stub
		
		  int bouquets = 0;
	        int count =0;
		
		for(int i=0;i<bloomDay.length;i++ )
		{
			
			if(bloomDay[i]<=mid)
			{
				count++;
				
				if(count==k)
				{
					bouquets++;
					count=0;
				}
			}else
			{
				count =0;
			}
			
		}
		
		return bouquets>=m;
		
	}
}
