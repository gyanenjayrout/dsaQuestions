package String;

public class VAlueoF {
	
	public static void main(String[] args) {
		int num = 10;
		String strNum = String.valueOf(num); // Converts int to String, result is "10"

		char letter = 'A';
		String strLetter = String.valueOf(letter); // Converts char to String, result is "A"

		Object obj = new Object();
		String strObj = String.valueOf(obj); // Converts Object to String, calls obj.toString()
		
		String strNumm = "10";
		Integer integerNum = Integer.valueOf(strNumm); // Converts String to Integer, result is Integer with value 10

		int num2 = 10;
		Integer integerNum2 = Integer.valueOf(num2); // Boxes int to Integer, result is Integer with value 10


	}

}
