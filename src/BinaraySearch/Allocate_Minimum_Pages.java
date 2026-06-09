package BinaraySearch;
/*
 * Distribute books in order (contiguous) to students, so that the maximum pages assigned to any student is minimized.
 * means : Among all valid ways to assign books, pick the one where the heaviest-loaded student gets the least pages possible.
 * 
 * Because 90 (last book) is bigger than 60 → it must be included as one full chunk
→ So min possible value for low is max(books)

🧠 Interview Answer:
I start binary search with low = max(books) because no student can take less than the heaviest book.
If I set low < max, some books can’t be assigned at all — breaking the rule.

⚠️ If you wrongly set low = 1 or low = 50:
Suppose mid = 60

Now you try to allocate books such that:

No student gets more than 60 pages.

Try splitting:

First student → gets 12, 34 → total = 46

Next book is 67 → can't assign (exceeds 60)

So:
👉 Invalid allocation

Because 90 (last book) is bigger than 60 → it must be included as one full chunk
→ So min possible value for low is max(books)


 */
public class Allocate_Minimum_Pages {
public static void main(String[] args) {
	int arr[] = {12, 34, 67, 90};
	int k = 2;
	
	int findPages = findPages(arr, k);
	System.out.println(findPages);
	
}
public static int findPages(int[] arr, int k) {
    // code here
	
	int minpage = Integer.MIN_VALUE;
	
	int maxpage= 0;
	
	for(int page:arr)
	{
		minpage= Math.max(minpage, page);
		
		maxpage = maxpage+page;
	}
	//TC = O((max - min + 1) * n)
	
	//⏱ TC = O(n * log(max - min + 1))
	
	if(arr.length<k) return -1;
	 int ans =0;
	while(minpage<=maxpage)
	{
		int mid = minpage+(maxpage-minpage)/2;
		
		   int students = findthestdentsrequired(arr, mid);
		  
		   if(students<=k)
			   //Because if allocation is possible in fewer students,
//			   we can always split partitions to make exactly k.

		   {
			   ans = mid;
			   maxpage=mid-1;
			   
		   }else
		   {
			   minpage= mid+1;
		   }
	}
	return ans;
}
private static int findthestdentsrequired(int[] arr, int pages) {
	// TODO Auto-generated method stub
	
	int page =0;
	int student =1;
	
	for(int i=0;i<arr.length;i++)
	{
		if(page+arr[i]>pages)
		{
			student =student+1;
			page = arr[i];
		}else
		{
			page = page+arr[i];
		}
	}
	return student;
}
}
