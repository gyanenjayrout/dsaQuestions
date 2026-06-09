package Wissen_technology;

public class LeaderEleemnt {

	public static void main(String[] args) {
		  int[] arr = {16, 17, 4, 5, 2, 3};
		  
		  
		  int n= arr.length;
		  
		  
		  int maxelement = arr[n-1];
		  
		  System.out.println(maxelement);
		  
		  for(int i=n-2;i>=0;i--)
		  {
			  if(arr[i]>maxelement)
			  {
				  maxelement=  arr[i];
				  
				  System.out.println(maxelement);
			  }
		  }
				  
	}
}
