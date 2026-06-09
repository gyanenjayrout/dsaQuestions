package OverlApping;
//N Meeting in One Room | Greedy Algorithms Playlist
import java.util.ArrayList;
import java.util.List;

class Meeting
{
	
	int start;
	int end;
	int index;
	
	public Meeting(int s , int e, int i) {
		// TODO Auto-generated constructor stub
		start = s;
		end = e;
		index =i;
	}
	
}
public class Meeting_III {
	
	public static void main(String[] args) {
		int start[] = {1, 3, 0, 5, 8, 5};
		int end[] =  {2, 4, 6, 7, 9, 9};
		
		List<Integer> maxMeetings = maxMeetings(start, end);
		
		System.out.println(maxMeetings);
	}
			
			
 public static List<Integer> maxMeetings(int start[], int end[]) {
	 
	 List<Meeting> meetings = new ArrayList<>();
	 
	 int n = start.length;
	 
	 for(int i=0;i<start.length;i++)
	 {
		 meetings.add(new Meeting(start[i], end[i], i+1));
	 }
	 
	 meetings.sort((a,b)->Integer.compare(a.end, b.end));
	 
	 List<Integer> result = new ArrayList<>();
	 
	 result.add(meetings.get(0).index);
	 
	 int lastend = meetings.get(0).end;
	 int count=1;
	 
	 for(int i=1;i<n;i++)
	 {
		 if(meetings.get(i).start>lastend)
		 {
			 result.add(meetings.get(i).index);
			 lastend = meetings.get(i).end;
			 count++;
		 }
	 }
	 
	 System.out.println("Maximum four meetings can be held with given start and end timings."   +  count);
	 
				return result;
				  
			  }
}


/*
 * 
 * meetings[0] = new Meeting(1, 2);
meetings[1] = new Meeting(3, 4);
meetings[2] = new Meeting(5, 6);
*
*/
