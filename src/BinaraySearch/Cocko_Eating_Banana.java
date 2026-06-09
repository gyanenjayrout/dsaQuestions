package BinaraySearch;

import java.util.Arrays;

/*Here, Koko can choose how many bananas per hour (k).

Each pile doesn’t have to be finished in one hour.

She can take multiple hours to eat a big pile.

So we can try any eating speed ≥ 1.

In Koko Bananas, speed can be as low as 1 — so low = 1 is valid.
 * 
 * Koko can choose how many bananas to eat per hour. Each hour, she picks a pile and eats that amount. 
 * If the pile has fewer bananas than her chosen speed, she eats all of them and doesn't eat any more for that hour.
 * retun the minimum k (bananans)?
 */
public class Cocko_Eating_Banana {
	
	public static void main(String[] args) {
		int [] piles = {3,6,7,11};
		int h = 8;
		int minEatingSpeed = minEatingSpeed(piles, h);
		
		int minEatingspee = minEatingSpeed_opritmal(piles, h);
		
		System.out.println(minEatingSpeed);
		System.out.println(minEatingspee);
				
	}
	
private static int minEatingSpeed_opritmal(int[] piles, int h) {
		// TODO Auto-generated method stub
	
	int high = Arrays.stream(piles).max().getAsInt();
	
	int low=  1;
	int ans = 0;
	while(low<=high)
	{
		int mid =  low+(high-low)/2;
		
		int timeToEatBananas = timeToEatBananas(piles, mid);
		
		if(timeToEatBananas<=h)
		{
			ans = mid;// try smaller k
			high = mid-1;
		}else
		{
			low = mid+1;
		}
	}
		return ans;// O(n × log(maxPile))
	}

public static int minEatingSpeed(int[] piles, int h) {
	
/*	
	int largest = Integer.MIN_VALUE;
    for (int pile : piles) {
        if (pile > largest) {
            largest = pile;
        }
    }
	When we calculate time complexity, we focus on the dominant term — the part that grows fastest as input grows.
	
	Because n × log(max) grows much faster than just n, the smaller term O(n) becomes insignificant for large inputs.
	"The initial O(n) is absorbed into the total"
	*/
	int largest = Arrays.stream(piles).max().getAsInt();
	
 // The minimum possible eating speed (Koko can eat at least 1 banana per hour) 
	
	
    for (int k = 1; k <= largest; k++) {
        int requiredTime = timeToEatBananas(piles, k);
        if (requiredTime <= h) {
            return k;
        }
    }

    return -1; // if no valid speed found
    }

private static int timeToEatBananas(int[] piles, int k) {
	// TODO Auto-generated method stub
	
	int totalHours = 0;
    for (int pile : piles) {
        totalHours += Math.ceil((double) pile / k);
    }
    return totalHours;
	
	
}

}
/*
 * 
 * if you start from the minimum value in the piles (like 3 in your case), you're assuming that Koko can eat at least 
 * that number of bananas per hour from the very beginning. However, Koko might need a lower speed to finish the bananas 
 * within the time limit.

Starting from 3 assumes that she has to eat at least 3 bananas per hour, which may not always be necessary or optimal for 
completing the task within the given time h. The lower bound of 1 ensures that Koko is allowed to start with the smallest
 possible speed and that the search is valid
 for all possible speeds, even if they are smaller than the minimum value in the piles.
 */
