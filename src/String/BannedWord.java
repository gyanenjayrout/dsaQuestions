package String;
import java.util.*;
public class BannedWord {
	public static void main(String[] args) {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String [] banned = {"hit"};
		
		String mostCommonWord = mostCommonWord(paragraph,banned);
		
		System.out.println(mostCommonWord);
		
		/*
		 * 
		 * Given a string `paragraph` and a list of `banned` words, return the most frequent word that 
		 * is not in the banned list. The words should be case-insensitive and the answer should be in lowercase.
		 * \\W regex pattern matches any non-word character 
		 */
		
	}
	
	public static String mostCommonWord(String paragraph, String[] banned) {
		String words []  = paragraph.toLowerCase().split("\\W+");
		//split() → O(N)
//		Time Complexity = O(N)
		//HashSet banned words → O(B)
//		HashMap word frequency → O(W)
//
//		Final
//
//		Space Complexity = O(W)
		//**: The `\\W+` splits the string by any non-word characters such as spaces, commas, and exclamation marks. 
		Map<String , Integer> wrdcount =  new HashMap<>();
		
		
		Set<String > bannaedSet =  new HashSet<>(Arrays.asList(banned));
		
		int maxcount  =0;
		String cmmword = "";
		for(String word : words)
		{
			if( !bannaedSet.contains(word))
			{
				int count  = wrdcount.getOrDefault(word, 0)+1;
				
				wrdcount.put(word, count);
				
				if(count> maxcount)
				{
					maxcount = count;
					cmmword = word;
				}
			}
		}
		
		
		return cmmword;
		
		
		
	}
	/*
	public static String mostCommonWord(String paragraph, String[] banned) {
		
		
		String [] words = paragraph.toLowerCase().replaceAll("[^a-zA-Z ]", " ").split("\\s+");
		
		Set<String > bannedset   =  new HashSet<>(Arrays.asList(banned));
		
		HashMap<String, Integer> wrdcont = new HashMap<>();
		
		for(String word: words)
		{
			if(!bannedset.contains(word))
			{
				wrdcont.put(word, wrdcont.getOrDefault(word, 0)+1);
			}
		}
		
		int maxcount = 0;
		String cmmonword = "";
		
		for(Map.Entry<String, Integer> entry :  wrdcont.entrySet())
		{
			if(entry.getValue()>maxcount)
			{
				maxcount = entry.getValue();
				cmmonword = entry.getKey();
			}
		}
		return cmmonword;
	}
	
	
	
	public String mostCommonWord(String paragraph, String[] banned) {

    Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
    Map<String, Integer> map = new HashMap<>();

    StringBuilder word = new StringBuilder();
    String result = "";
    int max = 0;

    paragraph = paragraph.toLowerCase();

    for (int i = 0; i < paragraph.length(); i++) {

        char c = paragraph.charAt(i);

        if (Character.isLetter(c)) {
            word.append(c);
        } 
        else if (word.length() > 0) {

            String w = word.toString();

            if (!bannedSet.contains(w)) {

                int count = map.getOrDefault(w, 0) + 1;
                map.put(w, count);

                if (count > max) {
                    max = count;
                    result = w;
                }
            }

            word.setLength(0);
        }
    }

    // handle last word
    if (word.length() > 0) {

        String w = word.toString();

        if (!bannedSet.contains(w)) {

            int count = map.getOrDefault(w, 0) + 1;

            if (count > max) {
                result = w;
            }
        }
    }

    return result;
}

	
	
	
	
	
	
	
	
	
	Very good question 👍
This line is **EXTREMELY common in interviews**, especially in **LeetCode: “Most Common Word”**.

```java
String words[] = paragraph.toLowerCase().split("\\W+");
```

Let’s break **WHY `\\W+` is used here**, **not `\\s+`**, in **simple English**.

---

## 1️⃣ Problem with using `\\s+`

If you split only by spaces:

```java
paragraph.toLowerCase().split("\\s+");
```

### Input

```
"Bob hit a ball, the hit BALL flew far after it was hit."
```

### Output

```
["bob", "hit", "a", "ball,", "the", "hit", "ball", "flew", "far", "after", "it", "was", "hit."]
```

❌ Words like:

```
"ball," , "hit."
```

still contain punctuation
→ `"ball"` ≠ `"ball,"`

That breaks counting logic.

---

## 2️⃣ Why `\\W+` works perfectly here

### What `\\W+` means

* `\\W` → anything **NOT** letter or digit
* `+` → one or more

So it removes:
✔ spaces
✔ commas
✔ periods
✔ punctuation

---

### What happens internally

```java
paragraph.toLowerCase()
```

```
"bob hit a ball, the hit ball flew far after it was hit."
```

```java
.split("\\W+")
```

Splits on:

```
space, comma, period
```

### Final Output

```
["bob", "hit", "a", "ball", "the", "hit", "ball", "flew", "far", "after", "it", "was", "hit"]
```

✅ Clean words
✅ No punctuation
✅ Easy to compare with `banned[]`

---

## 3️⃣ Why this is IMPORTANT for banned words

```java
String[] banned = {"hit"};
```

Now:

* `"hit"` matches exactly
* `"hit."` ❌ would NOT match
* `"hit,"` ❌ would NOT match

So `\\W+` is **mandatory** here.

---

## 🎤 Interview explanation (say this)

> We use `\\W+` to split the paragraph by any non-alphanumeric characters like spaces and punctuation, so we get clean words without commas or periods. This helps in accurate word counting.

---

## 🔥 One-line rule (memorize this)

* **Use `\\s+`** → when only spaces matter
* **Use `\\W+`** → when punctuation must be ignored

---

## ⚠️ Extra interviewer twist

If paragraph has **Unicode letters**, better regex:

```java
split("[^a-zA-Z]+")
```

---

If you want, next I can:

* Explain this **with a diagram**
* Show **why LeetCode test cases fail without `\\W+`**
* Give **TC/SC** for this problem

	*/

}
