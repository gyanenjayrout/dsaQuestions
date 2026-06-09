package PRactice3;

public class CHeckIfSorted {
	public static void main(String[] args) {
//		int arr[]  = {3,6,2,4,5};
		int arr[] = {2,3,5,6,7};
		
		boolean res = checksortd(arr);
		
		System.out.println(res);
						
				
	}
	
	static boolean checksortd(int[]arr)
	{
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>=arr[i-1])
			{
				
			}else
			{
				return false;
			}
		}
		
		return true;
		
	}

}
