package List;

import java.util.*;

public class RemoveDuplicatesReturnORDER {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
		
        List<Integer> result = removeDuplicates(nums);
        
        System.out.println(result);
		
		
	}

	private static List<Integer> removeDuplicates(List<Integer> nums) {
		// TODO Auto-generated method stub
		
		Set<Integer> set =  new LinkedHashSet<>(nums);
		
		
		return new ArrayList<>(set);
	}

}
