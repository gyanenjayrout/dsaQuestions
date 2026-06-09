package Recurssion;

public class TowerOfHanaoi {
	public static void towerOfHanoi(int n, String src, String helper, String dest) {
		if(n==1)
		{
			System.out.println("Transfer disk" +    n +" from  " + src +" to " +  dest );
			return;
		}
		
		towerOfHanoi(n-1, src, dest, helper); // move n-1 disks to helper using 3 steps
		System.out.println("Transfer disk" +    n +" from  " + src +" to " +  dest ); // move last disk to dest
		 
		towerOfHanoi(n-1, helper, src, dest); // den move n-1 disk from helper to dest using helper as src and src as helper
	}
	
	public static void main(String[] args) {
		int n=3;
		towerOfHanoi(n , "S", "H", "D");
		
	}
}
/*
T(n) = T(n-1) + T(n-1) + 1

T(n) = 2T(n-1) + 1

Where:

T(n) = time for n disks
T(n-1) = time for n-1 disks
1 = constant work (the print statement)

T(n) = 2ⁿ - 1

and Big-O:

O(2ⁿ)

Space Complexity : O(n)
*/