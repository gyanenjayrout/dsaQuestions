package Array;

import java.util.*;

public class InterSectionOfTwoArray2 {
public static void main(String[] args) {
	
	 int arr1[] = {1, 1, 2, 3, 4, 5};
     int arr2[] = {2, 3, 4, 5, 6};

     int[] res = intersectionoftwo(arr1, arr2);
     
     System.out.println(Arrays.toString(res));
}

private static int[] intersectionoftwo(int[] arr1, int[] arr2) {
	// TODO Auto-generated method stub
	
	List<Integer> list =  new ArrayList<>();
	int i1=0;
	int i2 =0;
	int m1 = arr1.length;
	int m2 = arr2.length;
	Set<Integer>resultSet  = new HashSet<>();
	Set<Integer> set =  new HashSet<>();
	
	for(int m :arr1)
	{
		set.add(m);
	}
	for(int n: arr2)
	{
		if(set.contains(n))
		{
			resultSet.add(n);
		    
		}
	}
	
	int []result = new int[resultSet.size()];
	
	int i=0;
	
	for( int num: resultSet)
	{
		result[i++] = num;
	}
	
	return result;
	
	
	
	
}
}
