package Array;

import java.util.*;

public class InterSectionOFtwoArary {
    public static void main(String[] args) {
        int arr1[] = {1, 1, 2, 3, 4, 5};
        int arr2[] = {2, 3, 4, 5, 6};

        int[] res = intersectionoftwo(arr1, arr2);
        System.out.println(Arrays.toString(res));
    }

    static int[] intersectionoftwo(int[] arr1, int[] arr2) {
//        int i = 0, j = 0;
//        List<Integer> resultList = new ArrayList<>();
//        
//        while (i < arr1.length && j < arr2.length) {
//            if (arr1[i] == arr2[j]) {
//                // Add to resultList if it's not a duplicate
//                if (resultList.isEmpty() || !resultList.get(resultList.size() - 1).equals(arr1[i])) {
//                    resultList.add(arr1[i]);
//                }
//                i++;
//                j++;
//            } else if (arr1[i] < arr2[j]) {
//                i++;
//            } else {
//                j++;
//            }
//        }
//
//        // Convert resultList to array
//        int[] result = new int[resultList.size()];
//        for (int k = 0; k < resultList.size(); k++) {
//            result[k] = resultList.get(k);
//        }
//        
//        return result;
    	
    	
    	Set<Integer> set = new HashSet<>();
    	
    	Set<Integer>resultSet  = new HashSet<>();
    	
    	for(int e:arr1)
    	{
    		set.add(e);
    	}
    	for(int num:arr2)
    	{
    	if(set.contains(num))
    	{
    		resultSet.add(num);
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
