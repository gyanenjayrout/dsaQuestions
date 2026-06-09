package PRactice3;

public class SecondLargest {
	public static void main(String[] args) {
		int arr[]  = {3,6,2,4,5};
		int res = findoutSecondLargest(arr);
		
		System.out.println(res);
				
		
			
				
	}
	
static int findoutSecondLargest(int[]arr)
{
	
	int largest  = arr[0];
	int smallest = -1;
	
	
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]>largest)
		{
			smallest = largest;
			largest  = arr[i];
		}
		else if(arr[i]<largest && arr[i]>smallest)
		{
			smallest = arr[i];
		}
	}
	return smallest;
	
}
}
