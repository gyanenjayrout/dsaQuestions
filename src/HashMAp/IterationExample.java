package HashMAp;
import java.util.*;
public class IterationExample {
	
	public static void main(String[] args) {
		 Map<String, Integer> map = new HashMap<>();
	        map.put("apple",  
	 10);
	        map.put("banana", 20);
	        map.put("orange", 30);
	        
	        for(Map.Entry<String, Integer>entry  : map.entrySet())
	        {
	        	String key = entry.getKey();
	            Integer value = entry.getValue();
	            System.out.println("Key: " + key + ", Value: " + value);  
	        }

	}

}
