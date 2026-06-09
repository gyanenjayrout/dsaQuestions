package OverlApping;

import java.util.*;

public class MergeIntervals {
	
	public static void main(String[] args) {
	     int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
	     
	     int [][]merged =merge(intervals);
	     int[][] merged2 = merged(intervals);
	     
	     for(int [] interval:merged2)
	     {
	    	 System.out.println(Arrays.toString(interval));
	     }
	     
	     
	}

	private static int [][] merged(int[][] intervals) {
		
		
		if(intervals.length==1) return intervals;
		
		Arrays.sort(intervals, (Comparator.comparingInt(a -> a[0])
));
		//Because subtraction can cause integer overflow.
		List<int []> result = new  ArrayList<>();
		int current [] = intervals[0];
		
		for(int i=1;i<intervals.length;i++)
		{
			int next [] = intervals[i];
			
			if(next[0]<=current[1])
			{
				// merge overlapas
				
				 current [1] = Math.max(current[1], next[1]);
			}else
			{
				result.add(current);
				current = next;
			}
		}
		
		result.add(current);
	
		return result.toArray( new int [result.size()][]);
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	

	private static int[][] merge(int[][] intervals) {
	    if (intervals.length <= 1) return intervals;

	    // Step 1: Sort by start time
	    Arrays.sort(intervals, (a, b) -> a[0] - b[0]); //Because subtraction can cause integer overflow.

	    List<int[]> result = new ArrayList<>();
	    int[] current = intervals[0];

	    for (int i = 1; i < intervals.length; i++) {
	        int[] next = intervals[i];

	        if (next[0] <= current[1]) {
	            // Merge: overlapping
	            current[1] = Math.max(current[1], next[1]);
	        } else {
	            // No overlap, push current to result
	            result.add(current);
	            current = next;
	        }
	    }

	    // Add the last interval
	    result.add(current);

	    return result.toArray(new int[result.size()][]);
	}
}

/*
 * 📌 Explanation:
If you have:


int[][] intervals = {
    {1, 3},
    {2, 6},
    {8, 10}
};
Then:

Code	                 What it Means	               Value
intervals[0]	       First row (int[])	          {1, 3}
intervals[0][0]	       First row, 1st col	            1
intervals[0][1]	       First row, 2nd col          	3
 

📌 Explanation:

result is a List<int[]> — for example, after merging intervals.

.toArray(new int[result.size()][]) converts the list into a 2D array (int[][]).
🔍 Why do we need new int[result.size()][]?

This helps Java know what type of array it should create.

    result.size() → number of rows.

    [] → each row is an int[] (like {1, 3}).
    
    
    
    🗣️ How to Explain in Interview (Step by Step)
1️⃣ Start With Approach

"This problem is about merging overlapping intervals.
My approach is:
First, sort the intervals based on starting time.
Then iterate through them and merge whenever there is an overlap."

2️⃣ Why Sorting?

"Sorting helps because once intervals are sorted by start time, overlapping intervals will always appear next to each other.
So we only need to compare the current interval with the previous one."

3️⃣ Explain Logic While Coding

You can say:

"I first check if there is only one interval — if yes, I return it directly."

"Then I sort intervals based on start value using a comparator."

"I create a result list to store merged intervals."

"I keep the first interval as current."

"Then I iterate from the second interval onwards."

Inside loop:

"If next interval's start is less than or equal to current interval's end, that means they overlap."

"So I merge them by updating the end of current interval to max(currentEnd, nextEnd)."

"Otherwise, if they don’t overlap, I add the current interval to result and move current to next."

At end:

"After loop finishes, I add the last interval to result."

🧠 Important Line to Sound Strong

"Because intervals are sorted, we only need to check overlap with the immediate previous interval — not all intervals. That reduces unnecessary comparisons."

This line impresses interviewer 👍

⏱️ Time & Space Complexity
✅ Time Complexity

Sorting takes O(n log n)

Traversing takes O(n)

So total:

Time Complexity = O(n log n)

✅ Space Complexity

We use a result list

In worst case, no intervals overlap

So:

Space Complexity = O(n)

(If interviewer pushes: sorting in Java uses extra space → can say O(log n) due to recursion stack)

🎯 If Interviewer Asks Edge Cases

You can say:

Empty input?

Single interval?

Fully overlapping?

No overlap at all?

🔥 Cleaner Interview Version of Your Code

Just small improvement:

Instead of:

(a,b) -> a[0] - b[0]


Better say:

Comparator.comparingInt(a -> a[0])


Because subtraction can cause integer overflow.

If interviewer asks why?

"Subtracting may overflow if numbers are large, so comparator is safer."

🎤 30-Second Final Summary (Very Important)

Practice saying this:

"So overall, I sort intervals by start time, then iterate and merge overlapping intervals by updating the end boundary. Since sorting dominates, time complexity is O(n log n), and space complexity is O(n) for storing the result."
*/