package Hashing;
import java.util.*;
public class Isomporphic {
	//Use two HashMaps to maintain one-to-one bidirectional mapping between characters.
/*
 * If character set is fixed (ASCII/26 letters), auxiliary space is O(1).
If unrestricted Unicode/general strings, space is O(n).

char ch = 'a';

Internally:

'a' = 97
'b' = 98
'c' = 99
...

So this is valid:

int x = 'a';
System.out.println(x); 
This is called implicit widening conversion:

char → int
 */
	public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();


        for(int i=0;i<s.length();i++)
        {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);


            if(map1.containsKey(ch1) && map1.get(ch1) != ch2) return false;

            if(map2.containsKey(ch2) && map2.get(ch2) != ch1) return false;


            map1.put(ch1, ch2);
            map2.put(ch2, ch1);

        }

        return true;
}
    public boolean isIsomorphicUSingMappingArray(String s, String t) {

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map1[c1] == 0 && map2[c2] == 0) { 
            	//This is called implicit widening conversion: char -> int map1[101] = 97;
                map1[c1] = c2;
                map2[c2] = c1;
            }
            else if (map1[c1] != c2 || map2[c2] != c1) {
                return false;
            }
        }

        return true;
    }
	
	/*
	 * int[] arr = new int[256];

Means array size for ASCII character set.
Since charset is fixed, I replaced HashMap with two arrays for constant-time direct indexing.

Important

This is not really "frequency count" here.
This is mapping array / lookup array, not counting frequency.
	 */
}
