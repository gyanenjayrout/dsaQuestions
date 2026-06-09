package OverlApping;
/*
 * Minimum number of meeting rooms required.

🧠 Core Idea

We need to find:

👉 Maximum number of overlapping meetings at any time.

That number = number of rooms needed.
 */
import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII  {
	public static void main(String[] args) {
        int[][] intervals = {
            {0, 30},
            {5, 10},
            {15, 20}
        };

        int result = minMeetingRooms(intervals);
        int result2 = minMeetingRooms2(intervals);
        System.out.println("Minimum number of meeting rooms: " + result);
        System.out.println("Minimum number of meeting rooms: " + result2);
    }
	/*
	 * I sort start and end times separately. If a meeting starts before the earliest meeting ends, I increment room count. Otherwise, 
	 * 
	 * I move the end pointer to indicate one room is freed."
	 * 
	 * 🔥 Optimized Approach (Two Pointers)

Separate start times and end times

Sort both arrays

Use two pointers

Idea:

If next meeting starts before earliest end → need new room
Else → free one room
"This is essentially finding the maximum number of concurrent meetings, which is a classic sweep line problem."
	 */

	private static int minMeetingRooms2(int[][] intervals) {
		// TODO Auto-generated method stub
		 int n = intervals.length;
		int start [] = new int [n];
		int end [] = new int [n];
		
		for(int i=0;i<intervals.length;i++)
		{
			start [i] = intervals[i][0];
			end [i] = intervals[i][1];
		}
		
		Arrays.sort(start);
		Arrays.sort(end);
		
		int room =0;
		int endptr=  0;
		
		for(int i=0;i<n;i++)
		{
			if(start[i]<end[endptr])
			{
				room++;
			}else
			{
				endptr++;
			}
		}
		
		
		return room;
	}
	
	/*
	 * Loop through intervals → O(n)

Step 2: Sort start array → O(n log n)
Step 3: Sort end array → O(n log n)
Step 4: One loop traversal → O(n)

"Separating start and end arrays takes O(n). Sorting both arrays takes O(n log n). Then I traverse once in O(n). So overall time complexity is O(n log n). Space complexity is O(n) for storing the two arrays."
	 */

	private static int minMeetingRooms(int[][] intervals) {
		// TODO Auto-generated method stub
		
	   if(intervals.length==0) return 0;
	   
	   Arrays.sort(intervals , (a,b)->Integer.compare(a[0], b[0]));
	   
	   PriorityQueue<Integer> minheap = new PriorityQueue<>();
	   
	   minheap.add(intervals[0][1]);
	   
	   for(int i=1;i<intervals.length;i++)
	   {
		   if(intervals[i][0]>=minheap.peek())
		   {
			   minheap.poll();
		   }
		   
		   minheap.offer(intervals[i][0]);
	   }
		return minheap.size();
	}
}

/*
 * ✅ WHY Min-Heap?
You need to track end times of ongoing meetings.

"The heap keeps track of the earliest ending meeting. 
If the current meeting starts after the earliest one ends, I can reuse that room."

A Min-Heap helps you always know the earliest meeting to end.

If the current meeting starts after or at the same time as the earliest end time → reuse that room.

Else → need a new room.

🧠 KEY IDEA:
Push end times into a min-heap, and remove them when a meeting room gets free.
Sorting → O(n log n)
Heap operations → O(n log n)

Final:

Time Complexity = O(n log n)
Space Complexity = O(n)


 */









