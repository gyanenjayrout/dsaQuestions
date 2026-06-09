package SlididngWindow;

public class LongestRepeatingChracterReplacement {

 public static void main(String[] args) {
	 String s = "ABAB";
	 int k = 2;
	 
	 int longest = characterReplacement(s, k);
}
 
 public static  int characterReplacementOPTIMAL(String s, int k) {
	 
	 int left =0;
	 int maxLength =0;
	 int maxfreq =0;
	 int freq [] = new int [26];
	 
	 
	 for(int right=0;right<s.length();right++)
	 {
		 
		 char ch= s.charAt(right);
		 freq[s.charAt(ch)-'A']++;
		 
		 maxfreq = Math.max(maxfreq, freq[ch-'A']);
		 
		 while((right-left+1)- maxfreq>k)
		 {
			 freq[s.charAt(left)-'A']--;
			 left++;
		 }
		 
		 maxLength = Math.max(maxfreq, right-left+1);
		 
	 }
	return maxLength;
	 
 }

private static int characterReplacement(String s, int k) {
	// TODO Auto-generated method stub
	int Longest = 0;
	
	for(int i=0;i<s.length();i++)
	{
		int freq [] = new int [26]; // why reset for every i
		// new string point means new string subset
		int maxfreq =0;
		
		for(int j =i;j<s.length();j++)
		{
			char ch = s.charAt(j);
			
			freq[ch-'A']++;
			
		maxfreq = Math.max(maxfreq, freq[ch-'A']);
		
		int length = j-i+1;
		
		if(length- maxfreq <=k) //valid sbstring 
		{
			Longest = Math.max(length, Longest);
		}
		}
	}
	
	return Longest;
}

}
