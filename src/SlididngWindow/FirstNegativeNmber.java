package SlididngWindow;
import java.util.*;
public class FirstNegativeNmber {

	
	    static List<Integer> firstNegInt(int arr[], int k) {

	        List<Integer> result = new ArrayList<>();
	        Queue<Integer> negative = new LinkedList<>();

	        int start = 0;

	        for (int end = 0; end < arr.length; end++) {

	            // add negative numbers to queue
	            if (arr[end] < 0) {
	                negative.add(arr[end]);
	            }

	            // when window size hits k
	            if (end - start + 1 == k) {

	                if (negative.isEmpty()) {
	                    result.add(0);
	                } else {
	                    result.add(negative.peek());
	                }

	                // remove element going out of window
	                if (!negative.isEmpty() && arr[start] == negative.peek()) {
	                    negative.poll();
	                }

	                start++;
	            }
	        }

	        return result;
	    }
	}

