package BinaraySearch;

/*
 * 
 * We can't choose capacity less than the heaviest item.
In this case, the max package weight is 10. So any capacity < 10 is invalid.
That’s why binary search starts from max(weights).

Here, the heaviest package = 10.

Now imagine if you try a capacity like:

capacity = 9
👉 You can’t even load the last package 10 — it’s too heavy.

This means:

No matter how many days you have,

You must choose a capacity ≥ 10
👉 So 10 is the minimum valid starting point.


 *     Let's say:

        n = weights.length

        W = sum(weights)

        M = max(weights)

So the loop runs from M to W → Total of (W - M + 1) iterations
Each iteration calls calculateDays() which is O(n)

👉 TC = O((W - M + 1) * n) → Not efficient when W is large
 */
class Capacity_ShipPackages_Within_D_Days {
    public int shipWithinDays(int[] weights, int days) {

       int n = weights.length;
       int low = Integer.MIN_VALUE;  // min should be max of weights
       int high = 0;

       for (int num : weights) {
           low = Math.max(low, num);  // ✅ min is the heaviest single weight
           high += num;
       }
         


        for(int i=low;i<=high;i++)
        {
            int totalday = calculateDays(weights, i);
            if(totalday<=days)
            {
                return i;
            }
        }
       return -1; 
    }
 public static int calculateDays(int [] weights, int cap)
 {
    int days =1;
    int load =0;

  for(int i=0;i<weights.length;i++)
  {
    if(load+weights[i]>cap)
    {
        days=  days+1;
        load = weights[i];
    }else
    {
        load = load+weights[i];
    }
  }

  return days;
 }

}
/*
 * class Solution {
    public int shipWithinDays(int[] weights, int days) {

      int low = 0, high = 0;
      for(int weight  :weights)
      {
        low = Math.max(low, weight );
        high= high+weight ;
      }
        
      int mincapacity = high;

        while(low<=high)
        {
            int mid = low+(high-low)/2;

              int requiredDays = calculateDays(weights, mid);

            if(requiredDays<=days)
            {
                mincapacity = mid;
                high= mid-1;
            }else{
                low =  mid+1;
            }
        }

        return mincapacity;
    }
 public static int calculateDays(int [] weights, int cap)
 {
    int days =1;
    int load =0;

  for(int i=0;i<weights.length;i++)
  {
    if(load+weights[i]>cap)
    {
        days=  days+1;
        load = weights[i];
    }else
    {
        load = load+weights[i];
    }
  }

  return days;
 }

}🚀 2. Optimized Binary Search Approach

Here, we do Binary Search between M and W.
⏱️ Time Complexity:

    Binary Search takes O(log(W - M + 1))

    Each check (calculateDays) is O(n)

👉 TC = O(n * log(W - M)) → Much faster!
 */
