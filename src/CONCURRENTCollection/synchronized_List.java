package CONCURRENTCollection;

import java.util.*;
/*
 * Even though Collections.synchronizedList() makes individual 
 * operations thread-safe (like .add(), .get()), it does not make compound actions like iteration thread-safe.
 */
public class synchronized_List {
	
	public static void main(String[] args) {
		List<Integer> list = Collections.synchronizedList(new ArrayList<>());

		Thread writer = new Thread(() -> {
		    for (int i = 0; i < 5; i++) {
		        list.add(i);
		        try { Thread.sleep(10); } catch (Exception e) {}
		    }
		});

		Thread reader = new Thread(() -> {
		    for (Integer num : list) { // Unsafe iteration
		        System.out.println("Read: " + num);
		        try { Thread.sleep(15); } catch (Exception e) {} //Exception in thread "Thread-1" java.util.ConcurrentModificationException
		        
		    }
		    
		    
		    /*
		     * 
		     * synchronized (list) {
    for (Integer num : list) {
        System.out.println("Read: " + num);
    }
}
		     */
		});

		writer.start();
		reader.start();

	}

}
