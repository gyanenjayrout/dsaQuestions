package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ITteratorExample {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        Iterator<String> li = list.iterator();
        
        while(li.hasNext())
        {
        	System.out.println(li.next());
        }
        
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);  

            listIterator.set("Orange"); // Replace the current element
        }

        // Backward iteration with ListIterator
        while (listIterator.hasPrevious()) {
            String fruit = listIterator.previous();
            System.out.println(fruit);
        }
	}

}
