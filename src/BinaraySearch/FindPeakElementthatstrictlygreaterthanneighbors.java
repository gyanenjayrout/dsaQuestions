package BinaraySearch;
//its unsorted
public class FindPeakElementthatstrictlygreaterthanneighbors {
	
	public static void main(String[] args) {
		int  arr[] = {1,2,3,1};
		
		int res  =FindThePickElement(arr);
		System.out.println(res);
		
	}
	
	
	
	private static int FindThePickElement(int[] arr) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = arr.length-1;
		
		while(start<end)
		{
			int mid  = start+(end-start)/2;
			
			if(arr[mid]<arr[mid+1])
			{
				start = mid+1;
			}
			else
			{
				end = mid;
			}
			
			//ermination:
//
//		    When start == end, the loop exits.
//		    At this point, both start and end point to the peak element.
//
//		Return:
//
//		    Return start (or equivalently end, as they are equal).
		}
		return start;
	}
/*
	private static int FindThePickElement(int[] arr) {
		// TODO Auto-generated method stub
		
		int n = arr.length;
		if(n==0)
		{
			return -1;
		}
		
		if(arr[0]>arr[1])
		{
			return 0;
		}
		
		if(arr[n-1]>arr[n-2])
		{
			return n-1;
		}
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
			{
				return i;
			}
		}
		return -1;
	}
	*/

	

}
