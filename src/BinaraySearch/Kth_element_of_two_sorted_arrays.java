package BinaraySearch;

public class Kth_element_of_two_sorted_arrays {

	public static void main(String[] args) {
        int[] a = {2, 3, 6, 7, 9};
        int[] b = {1, 4, 8, 10};
        int k = 5;
        
        System.out.println(kthElement(a, b, k));
    }

	private static int kthElement(int[] a, int[] b, int k) {
		// TODO Auto-generated method stub
		
		int n1 = a.length;
		int n2= b.length;
		if(n1>n2) return kthElement(b, a, k);
		
		int low= Math.max(0, k-n2);
		int high = Math.min(k, n1);
		
		
		while(low<=high)
		{
			int cut1 = (low+high)/2;
			int cut2 =  k-cut1;
			
			int l1 = (cut1==0) ? Integer.MIN_VALUE:a[cut1-1];
			int l2 = (cut2==0) ? Integer.MIN_VALUE:b[cut2-1];
			int r1 = (cut1 == n1) ? Integer.MAX_VALUE : a[cut1];
			int r2 = (cut2 == n2) ? Integer.MAX_VALUE : b[cut2];
			
			
			
			if(l1<=r2 && l2<=r1)
			{
				return Math.max(l1,l2);
			}
			else if(l1 > r2) high = cut1 -1;
			else low = cut1+1;
			
			
		}
		return 0;
	}
	
}
/*
📌 Why low = Math.max(0, k - m)?
We must take at least k - m elements from arr1, because if we take more than m from arr2, there won't be enough to get k total.

So:

If arr2 has very few elements, we must take more from arr1.

Prevents cut2 = k - cut1 from becoming negative.

📌 Why high = Math.min(k, n)?
We can take at most k elements, but no more than n from arr1 (because it has only n elements).


*/