package OverlApping;
import java.util.*;
public class InsertIntervals {

	
	public int[][] insert(int[][] intervals, int[] newInterval) {
		
		 List<int[]> result = new ArrayList<>();
	      Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
	       int i=0;
			int n = intervals.length;

	        while(i<n && intervals[i][1]<newInterval[0]) // before new Intevral
	        {
	            result.add(intervals[i]);
	            i++;
	        }
	       /// 2. Merge all overlapping intervals
	        while(i<n && intervals[i][0]<= newInterval[1])
	        {
	            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
	            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
	            i++; 
	        }

	        result.add(newInterval);

	        while(i<n)
	        {
	            result.add(intervals[i]);
	            i++;
	        }
	         

	        return result.toArray(new int[result.size()][]);
	    
	}
	
	public int[][] insert2(int[][] intervals, int[] newInterval)
	{
		/*
		 * 🗣️ How To Explain in Interview

Start like this:

"Since the intervals are already sorted and non-overlapping, I don’t need to sort again.
I will divide the problem into 3 parts."

		 */
		
		/*
		 * 1️⃣ Add all intervals that come before newInterval

Condition:

interval.end < newInterval.start


Say:

"These intervals cannot overlap, so I directly add them to result."
		 */
		List<int []> result = new ArrayList<>();
		int i=0;
		int n= intervals.length;
		
		while(i<n && intervals[i][1]<newInterval[0])
		{
			result.add(intervals[i]);
			i++;
		}
		
		/*
		 * 
		 * 2️⃣ Merge overlapping intervals

          Condition:

         interval.start <= newInterval.end
         "If they overlap, I update newInterval start and end by taking min start and max end."
		 */
		
		while(i<n && intervals[i][0]<=newInterval[1])
		{
			newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
			newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
		}
		/*
		 * 3️⃣ Add remaining intervals

Say:

"After merging, I add the final newInterval, and then add the remaining intervals."
		 */
		
		result.add(newInterval);
		
		while(i<n)
		{
			result.add(intervals[i]);
			i++;
		}
		
		return result.toArray(new int [result.size()][]);
		
	}
	
	/*
	 * ✅ Time Complexity

We traverse once:

O(n)

(No sorting needed)

✅ Space Complexity

Worst case:

O(n)

For storing result.

🎤 Strong Interview Lines

Say this:

"Since the input intervals are already sorted and non-overlapping, I can process them in one pass without sorting. I categorize intervals into three groups — before, overlapping, and after — which makes the logic clean and efficient."
	 */
}
