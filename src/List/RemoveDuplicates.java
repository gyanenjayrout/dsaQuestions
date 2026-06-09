package List;
import java.util.*;
import java.util.stream.Collectors;
public class RemoveDuplicates {
	
	 public static void main(String[] args) {
	        List<Integer> list = new ArrayList<>();
	        list.add(1);
	        list.add(2);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(4);
	        list.add(5);
	        
	        Set<Integer> set  = new HashSet<>(list);
	        
//	        System.out.println(set);
	        
	        list =  new ArrayList<>(set);
	        /*Using a Set (Approach 1):

    Time Complexity: Adding elements to a HashSet is O(n)
    O(n) in average time complexity due to hashing.
    Space Complexity: O(n)O(n) for storing the elements in the set.
    Properties: Sets do not preserve the order of insertion (except LinkedHashSet which does). 
    So if maintaining the original order is essential, use LinkedHashSet rather than HashSet.
    Best Use Case: Efficient and simple when working with a moderate-sized list and order doesn’t matter,
     or when you specifically want to avoid duplicates without sorting or altering the order.*/
	        System.out.println(list);
	        
	 List<Integer> l1 = list
		        		.stream()
		        		.distinct()
		        		.collect(Collectors.toList());
	 
	 /*Using Java Streams with distinct() (Approach 2):

    Time Complexity: Similar to the Set approach, Java Streams also use hashing internally 
    for the distinct() method, resulting in O(n)O(n) average time complexity.
    Space Complexity: Also O(n)O(n).
    Properties: Preserves the order of the list, so the output list retains the first occurrence of each element in the original order.
    Best Use Case: Concise syntax, ideal for scenarios where you want to remove duplicates and keep the order. This method 
    is more readable but relies on Java 8+.
    */
	        
	        System.out.println(l1);
	        
	        List<Integer> uniqueList = removeDuplicates(list);

	        System.out.println("List after removing duplicates: " + uniqueList);
	 }

	private static List<Integer> removeDuplicates(List<Integer> list) {
		// TODO Auto-generated method stub
		
		if(list==null|| list.size()<2)
		{
			return list;
		}
		
		// Sort the list to use the two-pointer technique
		/*Time and Space Complexity

    Time Complexity: O(nlog⁡n)O(nlogn) for sorting, and O(n)O(n) for the two-pointer pass, making it approximately O(nlog⁡n)
    O(nlogn).
    Space Complexity: O(1)O(1) additional space (in-place modification), aside from the input list.*/
        Collections.sort(list);
		int j=0;
		
		for(int i=1;i<list.size();i++)
		{
			if(!list.get(i).equals(list.get(j)))
			{
				j++;
				
				list.set(j, list.get(i));
			}
		}
		return list.subList(0, j+1);
	}
	 
	 

}
