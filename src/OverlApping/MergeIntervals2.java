package OverlApping;
import java.util.*;
public class MergeIntervals2 {
	
	public static void main(String[] args) {
		
		List<int[]> input = new ArrayList<>();
		
		input.add(new int[]{1, 3});
        input.add(new int[]{2, 6});
        input.add(new int[]{8, 10});
        input.add(new int[]{15, 18});
        
        List<int[]> output = merge(input);
        List<int[]> output2 = merge2(input);
        
        for(int [] interval :output)
        {
        	System.out.println(Arrays.toString(interval));
        }
		
		
	}

	private static List<int[]> merge2(List<int[]> intervals) {
		// TODO Auto-generated method stub
		
		if(intervals.size()==1) return intervals;
		
		intervals.sort((a,b)->a[0]-b[0]);
		
		List<int [] > result = new ArrayList<>();
		
		int [] current = intervals.get(0);
		
		for(int i=1;i<intervals.size();i++)
		{
			int [] next  = intervals.get(i);
			
			if(next[0]<= current[1])
			{
				current[1] = Math.max(current[1], next[1]);
				
			}
			else
			{
				result.add(current);
				current = next;
			}
		}
		
		result.add(current);
		
		
		
		return result;
	}

	private static List<int[]> merge(List<int[]> intervals) {
		// TODO Auto-generated method stub
		if(intervals.size()<=1) return intervals;
		
		intervals.sort((a,b)->a[0]-b[0]);
		
		List<int[]> result = new ArrayList<>();
		int []current = intervals.get(0);
		
		for(int i=1;i<intervals.size();i++)
		{
			int [] next = intervals.get(i);
			
			if(current[1]>=next[0])
			{
				current[1] = Math.max(current[1], next[1]);
				
			}else
			{
				result.add(current);
				current = next;
			}
		}
		
		result.add(current);
		
		return result;
	}

}
