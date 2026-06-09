package practcie;

import java.util.stream.Collectors;

public class RemoveDuplicatefromstring {
	
	public static void main(String[] args) {
		String s = "hello";
		
		StringBuilder stringBuilder = new StringBuilder("");
		
		int arr[]  = new int[26];
//		
//		for(int i= 0;i<s.length();i++)
//		{
//			int index = s.charAt(i)-'a';
//			
//			arr[index]++;
//			
//			if(arr[index]==1)
//			{
//				stringBuilder.append(s.charAt(i));
//			}
//		}
//		
//		System.out.println(stringBuilder.toString());
		
		
//		
//		for(char c: s.toCharArray())
//		{
//			arr[c-'a' ]++;
//			
//			if(arr[c-'a'] ==1)
//			{
//				stringBuilder.append(c);
//			}
//		}
//		System.out.println(stringBuilder.toString());
		
		
		
		String syr =  s.chars().distinct().mapToObj(c-> String.valueOf((char)c)).collect(Collectors.joining());
		
		System.out.println(syr.toString());
		
//		return str.chars()
//	              .distinct()
//	              .mapToObj(c -> String.valueOf((char) c))
//	              .collect(Collectors.joining());
}

}

/*i = 0 (Character 'h'):

index = s.charAt(0) - 'a' = 'h' - 'a' = 7
arr[7] is 0, so increment it to 1.
Since arr[7] == 1, add 'h' to sb.
sb becomes "h".
*/