package BinaraySearch;
class gameApi
{
	// Simulate the actual number to guess
    private static final int PICK = 5;

    public static int guess(int num) {
        if (num == PICK) return 0;
        else if (num < PICK) return 1;   // My number is higher
        else return -1;                  // My number is lower
    }
}
public class GuessGame extends gameApi {
	public static int guessNumber(int n) {

        int left =1;
        int right =n;

        while(left<=right)
        {
            int mid = left +(right-left)/2;
            int result =  guess(mid);

            if(result ==0) return mid;
            else if (result < 0) right = mid - 1;  // target is lower
             else left = mid + 1;               // target is higher

            
        }
     return -1;
        
    }
	
	
	public static void main(String[] args) {
		System.out.println("the number is "+ guessNumber(10));
	}
}
