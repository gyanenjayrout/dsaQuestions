package practice2;

import java.util.*;

public class partitionLabels {
	
public static void main(String[] args) {
	String  s = "ababcbacadefegdehijhklij";
	List<Integer> partitionLabels = partitionLabels(s);
	
	System.out.println(partitionLabels);
	
}

private static List<Integer> partitionLabels(String s) {
	// TODO Auto-generated method stub
	
	ArrayList<Integer> arrayList = new ArrayList<>();
	
	int lastOccrance [] = new int[26];
	
	  for(int i=0;i<s.length();i++)
	  {
		  lastOccrance[s.charAt(i)-'a'] =i;
		  
	  }
	  
	  int start =0;
	  int end = 0;
	  
	  for(int i=0;i<s.length();i++)
	  {
		  end = Math.max(end, lastOccrance[s.charAt(i)-'a']);
		  
		  if(i==end)
		  {
			  arrayList.add(end-start+1);
			  
			  start =i+1;
		  }
	  }
	
	return arrayList;
}
}


