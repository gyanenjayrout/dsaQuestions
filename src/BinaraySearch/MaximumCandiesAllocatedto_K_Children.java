package BinaraySearch;
//Find the maximum candies per child such that at least k children can be served.

/*at least k  -> more thann >= k acceptable
 * 
 * Every child must get the SAME number of candies

A child can take candies from only one pile

A pile can be divided into many parts

Some candies may be left unused — that’s OK
 */
public class MaximumCandiesAllocatedto_K_Children {
	 public int maximumCandies(int[] candies, long k)
	 {
		 int start =1;
		 int end = Integer.MIN_VALUE;
		 int sum =0;
		 for(int candy : candies)
		 {
			 if(candy>end)
			 {
				 end= candy;
			 }
			 
			 sum = sum+candy;
		 }
		 
		 
		 if(sum<k) return 0; // corner case for int[] candies = {2,5} , k=11 , here even if 1 choloate distibte
		 // only 7 students can get not 11
		 
		 int ans =0;
		 
		 while(start<=end)
		 {
			 int mid = start + (end-start)/2;
			 
			 int totalchildern =0;
			 for(int candy : candies)
			 {
				 totalchildern = totalchildern+ (candy/mid);
			 }
			 
			 if(totalchildern>=k)
			 {
				 ans = mid;
				 start = mid+1;
			 }else
			 {
				 end = mid-1;
			 }
		 }
		 
		return ans;
		 
	 }
}
