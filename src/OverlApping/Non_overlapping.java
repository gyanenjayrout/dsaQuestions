package OverlApping;

import java.util.Arrays;
import java.util.Comparator;

public class Non_overlapping {
	 public int eraseOverlapIntervals(int[][] intervals) {
		 Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));
		 
		 int count =0;
		 
		 int current [] = intervals[0];
		 
		 
		 for(int i=1;i<intervals.length;i++)
		 {
			 int [] next = intervals[i];
			 
			 if(next[0]<current[1])
			 {
				 count++;
				 current[1] = Math.min(current[1], next[1]);
			 }else
			 {
				 current = next;
			 }
		 }
		 
		 return count;
	 }

}
