package TwoPointerApproach;

public class REmoveduplicat_String {
	
	public static void main(String[] args) {
		String str = "abbbccddd";
		String removeDuplicate = removeDuplicate(str);
		
		System.out.println(removeDuplicate);
		System.out.println(removedupliczte(str));
		
	}
	
	private static String removedupliczte(String str) {
		// TODO Auto-generated method stub
		
		if(str.length()==0) return null;
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(str.charAt(0));
		
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i) !=str.charAt(i-1))
			{
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}

	public static String removeDuplicate(String s) {
		

if(s.length() ==0) return null;

 StringBuilder sb = new StringBuilder();
 sb.append(s.charAt(0));
 
 for(int i=1 ;i<s.length();i++)
 {
	if(s.charAt(i)!= s.charAt(i-1))
	{
		sb.append(i);
	}
 }
 return sb.toString();
 
	
	}

}
