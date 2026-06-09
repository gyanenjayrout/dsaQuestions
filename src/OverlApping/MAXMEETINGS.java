package OverlApping;

import java.util.*;

 class MAXMEETINGS {
	
	 static class Meeting 
	{
		int start;
		int end;
		int i;
		
		public Meeting(int start, int end ,int i) {
			// TODO Auto-generated constructor stub
			
			this.start = start;
			this.end = end;
			this.i = i;
		}
	}
	
	public static List<Integer> maxMeetings(int start[], int end[]) {
		
		int n= start.length;
		
		Meeting [] meetings = new Meeting [n];
		 
		 for(int i=0;i<n;i++)
		 {
			 meetings[i] = new Meeting(start[i], end[i], i);
		 }
		 
		 List<Integer> result = new ArrayList<>();
		 Arrays.sort(meetings,(a,b)-> Integer.compare(a.end, b.end));
		 
		 int count =1;
		 int lastend = meetings[0].end;
		 
		 result.add(meetings[0].i);
		 
		 for(int i=1;i<n;i++)
		 {
			 if(meetings[i].start>lastend)
			 {
				 count++;
				 
				 result.add(meetings[i].i);
				 lastend = meetings[i].end;
			 }
			 
		 }
		 
		 return result;
	}
	
	public static void main(String[] args) {
		int start[] = {1, 3, 0, 5, 8, 5};
		int end[] =  {2, 4, 6, 7, 9, 9};
		
		  List<Integer> maxMeetings = maxMeetings(start, end);
		
		System.out.println(maxMeetings);
	}
	
	/*
	 * I created a Meeting class to bind start and end, sorted by end time, and used greedy to pick non-overlapping meetings. I also tracked original indices to return them.
	 */
	 

}
