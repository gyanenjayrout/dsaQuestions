package Tree;

public class toSumTreeeee {
	  public int toSumTree(Node root) {
	        // add code here.
		  
	        if(root==null) return 0;
	        
	        
	        int oldvalue = root.data;
	        
	        int left = toSumTree(root.left);
	        
	        int right = toSumTree(root.right);
	        
	        root.data = left+right;
	        
	        return oldvalue+root.data; //Node value becomes children sum, but helper returns original subtree sum upward.
	    }
	        
	  
}
/*
1. Get left subtree sum
2. Get right subtree sum
3. Current node = left + right
4. Return original + subtree sum upward

Need values upward?
Use returning helper.
Need only modify?
Void can work.



    10
   /  \
  2    3
  
  
  ## ✅ Yes, I’m sure — but two different things are happening.

You are mixing:

```java
root.data = leftSum + rightSum;
```

with

```java
return root.data + oldValue;
```

These are **not the same purpose**.

---

# ✅ Important Difference

## 1. `root.data = leftSum + rightSum`

This sets the **new node value** in sum tree.

## 2. `return root.data + oldValue`

This returns **total original subtree sum** to parent.

Used only for recursion helper.

---

# Example

```text id="jlwm"
    10
   /  \
  2    3
```

---

# Step 1: Leaf 2

```java id="jlwm2"
leftSum = 0
rightSum = 0

oldValue = 2
root.data = 0
return 0 + 2 = 2
```

So node becomes:

```text id="jlwm3"
0
```

But returns `2` upward.

---

# Step 2: Leaf 3

Returns `3`

Node becomes `0`

---

# Step 3: Root 10

Now receives:

```java id="jlwm4"
leftSum = 2
rightSum = 3
oldValue = 10
```

Set node:

```java id="jlwm5"
root.data = 2 + 3 = 5
```

Then helper returns:

```java id="jlwm6"
return 5 + 10 = 15
```

---

# 🔥 Key Point

## Final Tree Node Value:

```text id="jlwm7"
root = 5
```

## Helper Return Value:

```text id="jlwm8"
15
```

This `15` is **not stored in tree**.
It only helps parent recursion (if parent existed).

---

# Visual

```text id="jlwm9"
Tree after conversion:

    5
   / \
  0   0
```

Helper returned:

```text id="jlwm10"
15
```

---

# ✅ If this root had parent

Parent needs total subtree sum of this tree = 15.

That’s why we return it.

---

# Interview Line

> Node value becomes children sum, but helper returns original subtree sum upward.

---

# 🔥 Memory Trick

```text id="jlwm11"
Stored value ≠ Returned value
```

---

# Want me to rewrite this with variable names like `newValue` and `subtreeSum` to remove confusion forever?

  
*/