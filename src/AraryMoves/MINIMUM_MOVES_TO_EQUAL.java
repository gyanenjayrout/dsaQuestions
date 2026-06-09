package AraryMoves;

public class MINIMUM_MOVES_TO_EQUAL {
	  public static int minMoves(int[] nums) {
	        int sum = 0;
	        int minElement = Integer.MAX_VALUE;

	        // Calculate the sum and find the minimum element
	        for (int num : nums) {
	            sum += num;
	            minElement = Math.min(minElement, num);
	        }

	        // Calculate the number of moves
	        return sum - (minElement * nums.length);
	    }

	    public static void main(String[] args) {
	        int[] nums1 = {1, 2, 3};
	        System.out.println("Minimum Moves: " + minMoves(nums1)); // Output: 3

	        int[] nums2 = {1, 1, 1};
	        System.out.println("Minimum Moves: " + minMoves(nums2)); // Output: 0
	    }

}

/*
 * 
 * How to Explain the Formula in an Interview:

    Understand the Goal:
        The goal is to make all elements in the array equal using the smallest number of moves.
        In each move, you can increment n - 1 elements by 1,
         which is equivalent to decrementing 1 element by 1 if we shift the perspective.

    Key Insight:
        To make all elements equal, the simplest strategy is to bring all elements down to the minimum value in the array. 
        This is because every move decreases the distance between the numbers and the minimum value.

    How the Formula Works:
        The total number of moves is the sum of differences between each element and the minimum element:
        
        moves=(nums[0]−min)+(nums[1]−min)+…...................................................
      
        Mathematically, this is the same as:
        
        moves=sum of elements−(minElement×n)
      
            sum gives the total of all elements.
            minElement * n represents what the total sum would be if all elements were equal to the minimum value.

    Why This Works:
        The formula captures the exact number of steps needed to reduce each element to the minimum, which matches the problem's requirement to increment n - 1 elements in each move.
        It’s not a predefined "rule" but a mathematical simplification of the problem's logic.

    Walkthrough Example:
        For nums = [1, 2, 3]:
            sum = 1 + 2 + 3 = 6
            minElement = 1
            Moves required:
                Bring 2 to 1 → 1 move.
				Bring 3 to 1 → 2 moves.
				Total = 1 + 2 = 3.
            Formula:
            moves=sum−(minElement×n)=6−(1×3)=3
            

How to Present This During an Interview:

    Start with the problem’s key constraints.
    Highlight the equivalence of "incrementing n - 1 elements" and "decrementing 1 element."
    Mention that the formula is a mathematical simplification of summing all differences.
    Use examples to validate the formula.

This way, you show both a deep understanding of the problem and the reasoning behind the formula.
You said:
In each move, you can increment n - 1 elements by 1
 */
