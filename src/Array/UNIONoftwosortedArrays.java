package Array;
import java.util.*;
public class UNIONoftwosortedArrays {
	
	
	public static void main(String[] args) {
		int arr1[] = {1,1,2,3,4,5};
		
		int arr2[]= {2,3,4,5,6,};
		
		int []res =UnionOfTWoArray(arr1, arr2);
		System.out.println(Arrays.toString(res));
	}

	private static int[] UnionOfTWoArray(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
//		Set<Integer> set = new TreeSet<>();
//		
//		for(int nums:arr1)
//		{
//			set.add(nums);
//		}
//		for(int nums:arr2)
//		{
//			set.add(nums);
//		}
//		int []res=  new int[set.size()];
//		int i=0;
//		for(int num:set)
//		{
//			res[i++]= num;
//		}
//		tc = O(n1 log n + n2 log n)+ O(n1+n2)
		// sc =O(n1+n2)
//		
//		return res;
		
		
		int m= arr1.length;
		int n =arr2.length;
		
		int i=0,j=0, k=0;
		
		List<Integer> list = new ArrayList<>();
		
		while(i<m && j<n)
		{
			if(arr1[i]<arr2[j])
			{
			if(list.isEmpty() || list.get(list.size()-1) !=arr1[i])
				list.add(arr1[i]);
			i++;
			
			}
			else  if(arr2[j]<arr1[i])
			{
			if(list.isEmpty() || list.get(list.size()-1)!=arr2[i])
				list.add(arr2[i]);
				j++;
			}
			
			else
			{
				if(list.isEmpty() || list.get(list.size()-1)!=arr2[i])
				{
					list.add(arr2[i]);
				}
				i++;
				j++;
			}
		}
		
		
		while(i<m)
		{
			if(list.isEmpty() || list.get(list.size()-1) !=arr1[i])
				list.add(arr1[i]);
			i++;
			
			
		}
		while(j<n)
		{
			if(list.isEmpty() || list.get(list.size()-1)!=arr2[i])
				list.add(arr2[i]);
				j++;
			}
		
		
		return list.stream().mapToInt(num->num).toArray();//  .mapToInt(num -> num) is used to convert the Integer stream into an int stream (IntStream).
		
		//int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
	}
	/*
	 * 1️⃣ Understanding set.stream()

    set is a Set<Integer>, which means it contains Integer objects.
    set.stream() creates a Stream<Integer>, meaning each element in the stream is of type Integer.

2️⃣ Understanding .mapToInt(num -> num)

    .mapToInt(num -> num) is used to convert the Integer stream into an int stream (IntStream).
    num -> num is a lambda expression where:
        The input (num) is an Integer.
        The output (num) is the same value but converted into an int.

Why do we need mapToInt(num -> num)?

    Streams in Java work with objects (Integer), but .toArray() expects an int[] (primitive array).
    mapToInt(num -> num) converts Integer objects into primitive int values.
    This avoids auto-boxing/unboxing overhead and ensures better performance.

3️⃣ .toArray()

    Converts the IntStream into an int[] array.


	 */

}
