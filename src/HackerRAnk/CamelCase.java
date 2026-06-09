package HackerRAnk;

public class CamelCase {

	public static void main(String[] args) {
        System.out.println(countWords("saveChangesInTheEditor")); // Output: 5
    }

	private static int countWords(String string) {
		// TODO Auto-generated method stub
		int count =1;
		
		for(char ch: string.toCharArray())
			
			if(Character.isUpperCase(ch))
			{
				count++;
			}
		return count;
	}
}
