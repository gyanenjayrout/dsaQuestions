package Greedy;

import java.util.Arrays;

public class Traianplatfom {
	 static int findPlatform(int arr[], int dep[]) {
		 
		 
		    int maxTrains = 1; // At least one train needs a platform
		    
		    for(int i=0;i<arr.length;i++)
		    {
		    	int count =0;
		    	
		    	for(int j=0;j<arr.length;j++)
		    	{
		    		if(i==j)continue;
		    		
		    		if(arr[i]>arr[j]&& arr[i]<=dep[j]) count++;
		    		else if(arr[j]>arr[i]&& arr[j]<=dep[i])count++;
		    		
		    		maxTrains = Math.max(maxTrains, count);
		    	}
		    }
		    return maxTrains;
	 }
	 public static int findMinimumPlatforms(int[] arr, int[] dep) {
		    Arrays.sort(arr);
		    Arrays.sort(dep);

		    int i = 0, j = 0;
		    int platform_needed = 0, max_platforms = 0;
		    int n = arr.length;

		    while (i < n && j < n) {
		        if (arr[i] <= dep[j]) {
		            platform_needed++;
		            i++;
		        } else {
		            platform_needed--;
		            j++;
		        }

		        max_platforms = Math.max(max_platforms, platform_needed);
		    }

		    return max_platforms;
		}

}
