package Retun_NEW_ARRAYLIST;

import java.util.*;

public class DataStore {
    
    // Internal mutable list (could be changed inside the class)
    private List<Integer> cache = new LinkedList<>();

    // Add some data to cache
    public void addData(int val) {
        cache.add(val);
    }

    // Safe getter - returns a copy
    public List<Integer> getData() {
        return new ArrayList<>(cache); // returning a safe copy
    }

    // Main method to test
    public static void main(String[] args) {
        DataStore store = new DataStore();
        store.addData(10);
        store.addData(20);
        store.addData(30);

        // Getting a copy
        List<Integer> list = store.getData();

        // Modifying the returned list
        list.clear(); // this will not affect internal cache

        // Print original data from store
        System.out.println("Internal cache still safe: " + store.getData()); // [10, 20, 30]
        System.out.println("External list was cleared: " + list);           // []
    }
}
/*
 * 🧠 Key Point:
store.getData() returns a copy, so modifying list doesn’t affect store.cache.

If we had returned cache directly, list.clear() would clear internal data. ❌
 */
