package CONCURRENTCollection;

import java.util.*;


/*
 * 
 * ✅ Best Options If You Want to Modify While Iterating:
Case	Use
Want safe read-only iteration	Collections.synchronizedList + synchronized(list)
Want to modify while iterating	Use CopyOnWriteArrayList
Need concurrent modification and no snapshot overhead	Use ConcurrentLinkedQueue, ConcurrentHashMap, etc.

📌 Summary

So to your question:

    "Then why synchronized(list)?"

Answer:
To ensure one thread at a time is iterating or accessing the list. It prevents race conditions, not ConcurrentModificationException.
 */
public class CopyonArrayList {
    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        list.add(1);
        list.add(2);
        list.add(3);

        // Synchronize explicitly for for-each loop
        synchronized (list) {
            for (Integer num : list) {
                System.out.println(num);
                list.add(5);  // ❌ Still throws exception            }
        }

        System.out.println("After for-each loop: " + list);

        // Synchronize explicitly for Iterator
        synchronized (list) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
                list.add(7);  //❌ Still throws exception            
            }
        }

        System.out.println("After iterator loop: " + list);
    }
}
}

