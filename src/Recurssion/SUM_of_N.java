package Recurssion;

public class SUM_of_N {
public static void main(String[] args) {
	int n= 5;
	
	int sum = sumof(n);
	System.out.println(sum);
}


private static int  sumof(int n) {
	// TODO Auto-generated method stub
	int sum =0;
	
	if(n==1)  return 1;
	
	
	
	sum = n +sumof(n-1);
	
	
	
	return sum;
}
}
