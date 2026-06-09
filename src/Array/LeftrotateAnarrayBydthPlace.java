package Array;

import java.util.Arrays;

public class LeftrotateAnarrayBydthPlace {
	public static void main(String[] args) {
		int arr[]  = {3,2,4,5, 6 , 7,8};
		int d = 3;
		int []res = RotateByDthplace(arr,d);
	
		System.out.println(Arrays.toString(arr));
					
	}
	
	static int[] RotateByDthplace(int arr[], int k)
	{
		int n = arr.length;
		 k = k%n;
//		int[] temp = new int[k];
//		
//		for(int i=0;i<k;i++)
//		{
//			temp[i] =arr[i];
//		}
//		
//		for(int i=k;i<n;i++)
//		{
//			arr[i-k] =arr[i];
//		}
//		
//		int j=0;
//		for(int i=n-k;i<n;i++)
//		{
//			arr[i] = temp[j++];
//		}
//		
//		
//		return arr; O(d)+O(n-d)+O(d)
		
		reverse(arr, 0, k-1);
		
		reverse(arr, k, n-1);
		
		reverse(arr, 0, n-1);
		return arr;
		
	}
	
	static void reverse(int []arr, int start, int end)
	{
		while(start<end)
		{
			int temp=  arr[start];
			
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
	}
}
/*
 * 
 * 
 * 
 * 
 * 
 * Perfect 👍
Here’s a **clear 30-second spoken answer** you can say confidently in an interview 👇

---

### 🎤 **30-Second Interview Explanation**

> “`k = k % n` is used to handle cases where the rotation count is greater than the array size.
> If we rotate an array of size `n` exactly `n` times, it becomes the same array again.
> So any extra rotations are unnecessary.
> By taking `k % n`, we reduce `k` to the minimum effective rotations, which avoids redundant work and also prevents index issues.”

---

### 🧠 If interviewer asks: *“Give an example”*

> “For example, if the array size is 5 and `k` is 7, rotating 7 times is the same as rotating 2 times because `7 % 5 = 2`.”

---

### ⚡ One-liner (quick answer)

> “Modulo converts large rotations into effective rotations within array bounds.”

---

### 🔄 Left vs Right Rotation (optional add-on)

* **Left rotation:**
  `k = k % n`
* **Right rotation:**
  `k = k % n`
  then rotate `n - k` times to the left

---

If you want, next I can:

* Help you **explain the full rotation logic step-by-step**
* Give **interviewer follow-up questions**
* Improve your **spoken English delivery** for such answers

Just tell me 👍

 * 
 * 
 * 
 * In an interview, explain **`k = k % n`** like this—simple and clear 👇

---

### How to explain `k = k % n`

> **Purpose:**
> To handle cases where the rotation count `k` is **greater than the array length**.

---

### Explanation (interview-friendly)

* The array has length **`n`**
* Rotating an array **`n` times** gives the **same array**
* So any rotation more than `n` is **repeating work**

That’s why we reduce `k` using modulo:

```java
k = k % n;
```

This converts a **large rotation** into an **effective minimum rotation**.

---

### Example (very important for interview)

#### Example 1

```java
arr = [1, 2, 3, 4, 5]
n = 5
k = 7
```

* Rotating 5 times → array becomes same
* Remaining rotations = `7 - 5 = 2`

So:

```java
k = 7 % 5 = 2
```

➡️ Rotate only **2 times**, not 7.

---

### Edge case it handles

If:

```java
k == n
```

Then:

```java
k = n % n = 0
```

➡️ No rotation needed
➡️ Prevents unnecessary operations

---

### One-line interview answer ⭐

> “`k = k % n` ensures that we don’t rotate the array more times than required, because rotating an array `n` times gives the same result. It optimizes the solution and handles large values of `k` safely.”

---

### Bonus (if interviewer asks more)

* Prevents **index out of bounds**
* Improves **time efficiency**
* Makes logic **robust for large inputs**

If you want, I can help you frame a **30-second spoken answer** or explain this with **right rotation vs left rotation** too 👍

 */
