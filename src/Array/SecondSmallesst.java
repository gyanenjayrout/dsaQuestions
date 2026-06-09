package Array;

public class SecondSmallesst {
	public static void main(String[] args) {
		int arr[]  = {3,6,2,4,5};
		int res = finsecondsmallest(arr);
		
		System.out.println(res);
						
				
	}
	
	static int finsecondsmallest(int []arr)
	{
		
		int smallest =arr[0];
		int SecSmallest  =Integer.MAX_VALUE;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				SecSmallest = smallest;
				smallest = arr[i];
			}
			
			else if( arr[i]!=smallest &&  arr[i]<SecSmallest)
			{
				SecSmallest = arr[i];
			}
		}
		
		
		
		return SecSmallest;
	}
	
	
}
