package DynamicProgramming;

public class climbStairs {
	public int climbStairss(int n) {
        if(n==1) return n;
        if(n==2) return n;

        int prev2 = 1;
        int prev1 = 2;


        for(int i=3;i<=n;i++)
        {
            int current = prev2 + prev1;
            prev1 =prev2;
            prev1 = current;
        }

    return prev1;
    }

}

/*
 * 
- ⏱ Time: `O(n)` | 🗂 Space: **`O(1)`** ✅

---

## 🧠 Key Insight to Remember
```
                  climbStairs(5)
                 /              \
        climbStairs(4)      climbStairs(3)
         /        \            /        \
   cs(3)          cs(2)    cs(2)        cs(1)
   /    \
cs(2)  cs(1)

→ cs(3) computed TWICE, cs(2) THREE times → memoize!
 */
