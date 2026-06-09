package OverlApping;

/*
 * int[][] → use intervals[i][0]
List<Interval> → use intervals.get(i).start
 */
import java.util.*;
class Interval {
    int start;
    int end;

    Interval(int s, int e) {
        this.start = s;
        this.end = e;
    }
    /*
     * It's more object-oriented.

Each Interval object has clear meaning: .start, .end

Better for real-world or interview-friendly design (OOP).
     */
}
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
	        
	        
	        
	        
	        List<Interval> meetings = new ArrayList<>();
	        meetings.add(new Interval(0, 30));
	        meetings.add(new Interval(5, 10));
	        meetings.add(new Interval(15, 20));

	       
	        boolean result = MeetingScheduler.canAttendMeetings(meetings);
	        System.out.println("Can attend all meetings: " + result);
	}

	private static boolean canAttendMeetings(int[][] meetings1) {
		// TODO Auto-generated method stub
		
		Arrays.sort(meetings1,(Comparator.comparingInt(a->a[0])));
		
		for(int i=1;i<meetings1.length;i++)
		{
			if(meetings1[i][0]<meetings1[i-1][1])
			{
				return false;
			}
		}
		return true;
	
	}
public static boolean canAttendMeetings(List<Interval> intervals) {
	/*
	 * "Since intervals are objects, I sort them based on the start time. Then I iterate from the 
	 * second interval and compare it with the previous one. 
	 * If the current meeting starts before the previous meeting ends, it means they overlap,
	 *  so I return false."
	 */
        
        intervals.sort(Comparator.comparingInt(a->a.start));
        
        for(int i=1;i<intervals.size();i++)
        {
        	Interval current = intervals.get(i);
        	Interval previous = intervals.get(i-1);
        	
        	if(current.start<previous.end)
        	{
        		return false;
        	}
        }

        return true;
    }
}
