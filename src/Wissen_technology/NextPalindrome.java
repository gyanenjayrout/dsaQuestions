package Wissen_technology;

//•	Next Palindrome Number: Given a number, find the next smallest palindrome greater than it.
public class NextPalindrome {
	
	
	public static void main(String[] args) {
        System.out.println(nextPalindrome("123"));   // 131
        System.out.println(nextPalindrome("999"));   // 1001
        System.out.println(nextPalindrome("808"));   // 818
        System.out.println(nextPalindrome("1221"));  // 1331
        
        System.out.println(nextPalindrome("1201")); // 1221 ----> the first mirror doing step 1
        /*
         * Original: "1201"
Mirror: "1221" → ✅ greater than "1201" → done! 🎯

Why? Because left half was "12" and right half "01"
After mirroring → "12" mirrored to "21" → "1221" > "1201"
         */
        
        System.out.println(nextPalindrome("1294"));     // 1331  ------>second  mirro soing step 3
        /*
         * First mirror: → "1221" → Not greater than "1294" ❌
So we increment middle → "13__"
Then second mirror → "1331" ✅
         */
    }

	public static String nextPalindrome(String num) {
        int n = num.length();
        char[] chars = num.toCharArray();

        // Step 1: Mirror the left half to the right
        for (int i = 0; i < n / 2; i++) {
            chars[n - 1 - i] = chars[i];
        }

        String mirrored = new String(chars);
        if (mirrored.compareTo(num) > 0) {
            return mirrored;
        }
        /*
         * 
         * if (new String(chars).compareTo(num) >= 0) {
    return new String(chars); // Accept if same or greater
}Let’s take 12321

    If you want the next palindrome (strict) → Output: "12421"

    If you want the closed palindrome → Output: "12321" (since it’s already a palindrome)
         */
        
        

        // Step 2: Increment the middle (handle odd/even separately)
        int mid = (n - 1) / 2;
        while (mid >= 0 && chars[mid] == '9') {
            chars[mid] = chars[n - 1 - mid] = '0';
            mid--;
        }

        if (mid >= 0) {
            chars[mid]++;
            chars[n - 1 - mid] = chars[mid];
        } else {
            // All 9s (e.g. 999 → 1001)
            char[] result = new char[n + 1];
            result[0] = result[n] = '1';
            for (int i = 1; i < n; i++) {
                result[i] = '0';
            }
            return new String(result);
        }

        // Step 3: Mirror again after increment
        for (int i = 0; i < n / 2; i++) {
            chars[n - 1 - i] = chars[i];
        }

        return new String(chars);
    }
	
}
/*
public class NextPalindrome {

    public static void main(String[] args) {
        int num = 123;
        System.out.println("Next Palindrome: " + findNextPalindrome(num));
    }

    public static int findNextPalindrome(int num) {
        num++;  // Start looking for palindrome after the given number

        while (!isPalindrome(num)) {
            num++;
        }

        return num;
    }

    private static boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }
}

*/