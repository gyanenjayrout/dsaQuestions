package HackerRAnk;

//aabbcc aabbccc aabbc
import java.util.*;

public class Sherlockand_the_Valid_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        System.out.println(isValid(s) ? "YES" : "NO");
    }

    public static boolean isValid(String s) {
        // Step 1: Count character frequencies
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Count frequencies of those frequencies
        Map<Integer, Integer> countFreq = new HashMap<>();
        for (int freq : freqMap.values()) {
            countFreq.put(freq, countFreq.getOrDefault(freq, 0) + 1);
        }

        // Step 3: Check valid conditions
        if (countFreq.size() == 1) {
            return true;  // All frequencies are the same
        }
        if (countFreq.size() > 2) {
            return false; // More than 2 different frequencies
        }

        // Extract the two different frequencies
        List<Integer> keys = new ArrayList<>(countFreq.keySet());
        int freq1 = keys.get(0), freq2 = keys.get(1);

        // Case 1: One frequency appears only once and is exactly 1 (e.g., {a:1, b:2, c:2})
        if ((countFreq.get(freq1) == 1 && freq1 == 1) || (countFreq.get(freq2) == 1 && freq2 == 1)) {
            return true;
        }

        // Case 2: One frequency is exactly 1 more than the other and appears only once
        if ((countFreq.get(freq1) == 1 && freq1 - freq2 == 1) || (countFreq.get(freq2) == 1 && freq2 - freq1 == 1)) {
            return true;
        }

        return false;
    }
}

/*
### **Understanding the Code Snippet**
This part of the code is checking whether a given frequency distribution of characters in a string can be **adjusted by removing at most one character** to make all frequencies the same.

---

## **Breaking It Down**
### **Step 1: Extracting the Two Unique Frequencies**
```java
List<Integer> keys = new ArrayList<>(countFreq.keySet());
int freq1 = keys.get(0), freq2 = keys.get(1);
```
- `countFreq` is a `HashMap<Integer, Integer>` that keeps track of how many times each frequency appears.
- We extract the **two different frequency values** from the map.
- `freq1` and `freq2` store these two different frequencies.

**Example 1**:
If `"aabbccd"` → Frequency Map:
```java
freqMap = {a=2, b=2, c=2, d=1}
countFreq = {2=3, 1=1} // (Frequency 2 appears 3 times, Frequency 1 appears once)
```
`freq1 = 2, freq2 = 1`

**Example 2**:
If `"aabbccc"` → Frequency Map:
```java
freqMap = {a=2, b=2, c=3}
countFreq = {2=2, 3=1} // (Frequency 2 appears 2 times, Frequency 3 appears once)
```
`freq1 = 2, freq2 = 3`

---

### **Step 2: Checking Validity Cases**
Now, we check if the given frequency distribution can be adjusted to become valid.

#### **Case 1: One frequency appears only once and is exactly `1`**
```java
if ((countFreq.get(freq1) == 1 && freq1 == 1) || (countFreq.get(freq2) == 1 && freq2 == 1)) {
    return true;
}
```
This condition means:
- One of the two frequencies occurs **only once**, and that frequency is exactly `1`.
- This means there is just **one character** with a frequency of `1`, and removing it would make all the remaining characters have the same frequency.

🔹 **Example**:
```
Input: "aabbccd"
freqMap = {a=2, b=2, c=2, d=1}
countFreq = {2=3, 1=1} // Frequency 1 appears only once (character 'd')

Removing 'd' → "aabbcc" (All characters have frequency 2)
Output: YES
```

---

#### **Case 2: One frequency is exactly `1` more than the other and appears only once**
```java
if ((countFreq.get(freq1) == 1 && freq1 - freq2 == 1) || (countFreq.get(freq2) == 1 && freq2 - freq1 == 1)) {
    return true;
}
```
This condition means:
- There are two different frequencies.
- One frequency appears **only once** and is exactly **1 more** than the other frequency.
- This means that **one character appears one extra time**, and removing it will balance the frequencies.

🔹 **Example**:
```
Input: "aabbccc"
freqMap = {a=2, b=2, c=3}
countFreq = {2=2, 3=1} // Frequency 3 appears only once

Removing one 'c' → "aabbcc" (All characters have frequency 2)
Output: YES
```

---

### **Step 3: Returning False if None of the Conditions Hold**
```java
return false;
```
If neither of the above conditions is satisfied, it means the string **cannot be converted** into a valid string by removing just one character.

🔹 **Example**:
```
Input: "aaabbbc"
freqMap = {a=3, b=3, c=1}
countFreq = {3=2, 1=1} // More than two distinct frequencies

No single removal will make all frequencies equal.
Output: NO
```

---

## **Final Thoughts**
### **✅ What the Code Checks**
1. **All characters already have the same frequency?** ✅ **Valid**
2. **Only two different frequencies?** ✅ Check further:
   - If one of them appears only once **and** is `1`, it’s removable → ✅ **Valid**
   - If one is `1` more than the other and appears only once, removing one character fixes it → ✅ **Valid**
3. **Otherwise, the string is invalid** ❌

### **Time Complexity**
- Counting character frequencies: **O(n)**
- Counting frequency of frequencies: **O(n)**
- Checking conditions: **O(1)**
- **Overall Complexity**: **O(n)**

This makes the approach optimal for large inputs (up to **10⁵**). 🚀
*/