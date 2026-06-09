package Interview;

import java.util.Arrays;
/*
 * If the start time of the current meeting is less than the end time of the previous meeting → Overlap (Return false)
Otherwise, no overlap (Return true after checking all intervals).
 */
public class MeetingScheduler {
	public static void main(String[] args) {
		 int[][] meetings1 = {{0, 30}, {5, 10}, {15, 20}};
	        System.out.println("Can attend all meetings? " + canAttendMeetings(meetings1)); // false

	        int[][] meetings2 = {{1, 5}, {6, 10}, {11, 15}};
	        System.out.println("Can attend all meetings? " + canAttendMeetings(meetings2)); // true
	}

	private static boolean canAttendMeetings(int[][] intervals) {
		// TODO Auto-generated method stub
		
		Arrays.sort(intervals, (a,b)->a[0]-b[0]);
		
		for(int i=1;i<intervals.length;i++)
		{
			if(intervals[i][0]<intervals[i-1][1])
			{
				return false;
			}
		}
		return true;
	}

	
}
/*We use Arrays.sort() with a custom comparator (a, b) -> a[0] - b[0] to sort based on the start time of meetings.

Iterating through intervals:
We check each interval and compare its end time with the next interval's start time.

Overlap Check:
If intervals[i][0] < intervals[i - 1][1], the person cannot attend both meetings.
Time Complexity:

    Sorting takes O(n * log(n))
    Looping through intervals takes O(n)
    Total: O(n * log(n))

Space Complexity:

    O(1) (We use only a few variables for comparison, no extra space).
    
    ✅ Edge Cases to Consider:

    No Meetings:
    Input: []
    Output: true (No meetings mean no conflicts).

    One Meeting:
    Input: [[5, 10]]
    Output: true (Only one meeting, so no overlap).

    Overlapping Meetings:
    Input: [[1, 3], [2, 4]]
    Output: false (Meetings overlap).

    Non-Overlapping Meetings:
    Input: [[1, 2], [3, 4]]
    Output: true.
    
    ✅ Step 2: Loop Execution

[[0, 30], [5, 10], [15, 20]]

The loop starts from i = 1:
Index (i)	intervals[i][0]	        intervals[i - 1][1]	                  Condition (intervals[i][0] < intervals[i - 1][1])
1	              5	                           30	                          ✅ True (Overlap found, returns false)

    Since 5 < 30, there is an overlap.
    The function returns false and exits.
    
    [[1, 5], [6, 10], [11, 15]]
    
    
        Loop Execution:

Index (i)	intervals[i][0]	                 intervals[i - 1][1]	 Condition (intervals[i][0] < intervals[i - 1][1])
1	               6	                                  5	                                   ❌ False (No overlap)
2	                11	                                 10	                                  ❌ False (No overlap)

Since there is no overlap, the loop completes.

    Returns true.
 * 
 */
