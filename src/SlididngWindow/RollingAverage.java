package SlididngWindow;
/*
 * 
 * ✅ Rolling Average (Moving Average)

A Rolling Average (also called Moving Average) is a statistical method used to calculate the average of a fixed subset of numbers from a sliding window over a dataset.

It is commonly used in time-series analysis, such as stock prices, sensor data, or real-time monitoring.
✅ Formula for Rolling Average

For a window size k, the rolling average at position i is calculated as:
Rolling Average=∑(Last K Elements)K
Rolling Average=K∑(Last K Elements)​
✅ Example Calculation

Given an array:

arr = [1, 2, 3, 4, 5]

For a window size of 3, the rolling averages are:

    (1 + 2 + 3) / 3 = 2.0

    (2 + 3 + 4) / 3 = 3.0

    (3 + 4 + 5) / 3 = 4.0

Result: [2.0, 3.0, 4.0]

 */
import java.util.*;
public class RollingAverage {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int windowSize = 3;

        List<Double> rollingAverages = calculateRollingAverage(arr, windowSize);
        System.out.println("Rolling Averages: " + rollingAverages);
    }

	private static List<Double> calculateRollingAverage(int[] arr, int windowSize) {
		// TODO Auto-generated method stub
		
		int start =0;
		  double windowSum = 0;
		
		
		List<Double> result =  new ArrayList<>();
		
		for(int i=0;i<arr.length;i++)
		{
			windowSum  =  windowSum +arr[i];
	         
			if(i>=windowSize-1)
			{
				result.add(windowSum/windowSize);
				
				windowSum=  windowSum-arr[start];
			}
	         
	         
			
			
		}
		return result;
	}
}
