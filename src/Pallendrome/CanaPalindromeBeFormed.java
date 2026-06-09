package Pallendrome;

public class CanaPalindromeBeFormed {
	boolean canFormPalindrome(String s) {
	    int[] freq = new int[26];

	    for(char c : s.toCharArray())
	        freq[c - 'a']++;

	    int odd = 0;
	    for(int f : freq)
	        if(f % 2 != 0) odd++;

	    return odd <= 1;
	}

}
/*
🧠 Reasoning

In a palindrome, characters mirror each other.

So most characters must appear in pairs (even count).

If the string length is odd, only one character can appear once in the middle.

Therefore:

If more than one character has an odd count → palindrome NOT possible.

If zero or one character has an odd count → palindrome IS possible.


📌 Rule

👉 Count odd-frequency characters
👉 If odd count > 1 → false
👉 Otherwise → true

✅ Examples
Input: Bangalore

Frequencies (odd ones):

B, N, G, L, O, R, E, A (many odds)

👉 More than one odd → False
*/