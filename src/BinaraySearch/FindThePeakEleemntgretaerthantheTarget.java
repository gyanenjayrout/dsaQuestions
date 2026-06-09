package BinaraySearch;

public class FindThePeakEleemntgretaerthantheTarget {
	public static void main(String[] args) {
           int arr[]= {1,3,4,6,9};
		
		int target = 5;
		
		int result = findthesmallestgretaerthantaregt(arr, target);
		
		System.out.println(result);
	}

	private static int findthesmallestgretaerthantaregt(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		int start = 0;
		int end = arr.length-1;
		int result =-1;
		while(start<=end)
		{
			int mid  = start+(end-start)/2;
			
			if(target<arr[mid])
			{
				result =arr[mid];
			   end = mid-1;
			}else
			{
				start = mid+1;
			}
			
		}
		
		return result;
	}

}
/*When start < end Would Fail

If we used start < end instead of start <= end, the loop would terminate one step earlier, potentially missing valid elements.
Counterexample:

Array: {1, 2, 4, 6, 8}, Target: 5

    On the last iteration, start = end = 3. With start < end, the loop would exit prematurely, missing the check for arr[3].

Why start <= end is Safe

The loop condition ensures:

    We don't skip any potential candidates.
    The algorithm doesn't fall into an infinite loop, as start or end always converges with each iteration.*/