package TwoPointerApproach;

import java.util.*;

public class PartitionLabels {
	
	
	public static void main(String[] args) {
		String s = "ababcbacadefbegdehijhklij";
		
		List<Integer> partitionLabels = partitionLabels( s);
		
		System.out.println(partitionLabels);
		
	}
	 public static List<Integer> partitionLabels(String s) 
	 {
		 
		 List<Integer> partitions = new ArrayList<>();
	        int start = 0;
	        
	        while(start<s.length())
	        {
	        	int end = s.lastIndexOf(s.charAt(start));
	        	
	        	
	        	for(int i=start;i<end;i++)
	        	{
	        		end = Math.max(end, s.lastIndexOf(s.charAt(i)));
	        		System.out.println(end);
	        	}
	        	
	        	partitions.add(end - start + 1);
	        	
	        	start  =end+1;
	        }
	        
	        return partitions;
	        /*
	         * “I process the string partition by partition.
For each partition, I start with the last occurrence of the first character as my initial boundary.
Then I scan all characters within this boundary and keep extending it if any character appears later.
Once my index reaches the boundary, I know all characters are contained, so I close the partition.”
	         */
	 }
	 

	private static List<Integer> partitionLabelss(String s) {
		// TODO Auto-generated method stub
		
		int []lastIndex = new int [26];
		
		for(int i=0;i<s.length();i++)
		{
		    lastIndex[s.charAt(i)-'a']=i;	
		}
		
		
		 // Step 2: Traverse the string to determine partitions
        List<Integer> partitionSizes = new ArrayList<>();
        
        int start =0;
        int end =0;
        for(int i=0;i<s.length();i++)
        {
        	end =Math.max(end, lastIndex[s.charAt(i)-'a']);
        	if(i==end)
        	{
        		partitionSizes.add(end-start+1);
        		start =i+1;
        	}
        }
		return partitionSizes;
		


}
}

/*Initialize an empty list partitions to store the lengths of each partition.​

Set start to 0, representing the beginning of the current partition.​

Iterate through the string while start is less than the length of the string:​

    Determine the end index by finding the last occurrence of the character at the start index.​

    For each index i from start to end, update end to the maximum of its current value and the last occurrence of the character at index i. This ensures that all occurrences of characters within the current partition are accounted for.​

    Calculate the length of the current partition as end - start + 1 and add it to the partitions list.​

    Update start to end + 1 to begin the next partition.​

Return the partitions list containing the lengths of each partition.
 * 
 */
