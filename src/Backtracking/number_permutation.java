package Backtracking;
import java.util.*;
public class number_permutation
{
public static void main(String[] args) {
	int num [] = {1,2,3};
	
	List<List<Integer>> permutute = permutute(num);
	
	System.out.println(permutute);
	
	
}

private static List<List<Integer>> permutute(int[] num) {
	// TODO Auto-generated method stub
	
	List<List<Integer>>  result = new ArrayList<>();
	
     backtrack(num, new ArrayList<>(), result);
     
     return result;
	
}

private static void backtrack(int[] nums,  List<Integer> current, List<List<Integer>> result) {
	// TODO Auto-generated method stub
	
	  if(current.size()==nums.length)
	  {
		 result.add(new ArrayList<>(current));
		 return ;
	  }
	for(int num: nums)
	{
		if(current.contains(num))
		{
			continue;
		}
		
		current.add(num);
		backtrack(nums, current, result);
		
		current.remove(current.size()-1);
		
	}
	
}
}
/*
 * Step-by-Step Backtracking:

    Initial Call:
    Start with current = [].

    Choose 1:
    current = [1] → Recur: backtrack(nums, [1], result).

    Choose 2:
    current = [1, 2] → Recur: backtrack(nums, [1, 2], result).

    Choose 3:
    current = [1, 2, 3] → Base Case: Add [1, 2, 3] to result.

    Backtrack:
        Remove 3 (undo last choice):
        current = [1, 2].

    Try Other Options:
    No more options for this path, so backtrack further:
        Remove 2:
        current = [1].

    Choose 3:
    current = [1, 3] → Recur: backtrack(nums, [1, 3], result).

    Choose 2:
    current = [1, 3, 2] → Base Case: Add [1, 3, 2] to result.

    Backtrack:
        Remove 2:
        current = [1, 3].

    Backtrack Further:
        Remove 3:
        current = [1].

    Backtrack Again:
        Remove 1:
        current = [].

Why is Backtracking Important?

The backtracking step (current.remove(current.size() - 1)) ensures that:

    We revert to a previous state and undo the last choice.
    This allows us to explore other possibilities without creating duplicate permutations.
    It systematically ensures every possible permutation is explored.

How to Explain in an Interview:

    High-Level Idea:
    Backtracking is like exploring a decision tree:
        Each recursive call makes a decision (choosing a number to include in the permutation).
        When all possibilities for the current choice are exhausted, we undo that decision (backtrack) to try other paths.

    Code Explanation:
        The remove() step ensures that we undo the addition of a number in the current list so the next recursive calls can explore other unused numbers.

    Analogy:
    Imagine exploring a maze:
        Each "choose" step is like walking into a room.
        Each "explore" step is moving further into the maze.
        When you hit a dead end (base case), you walk back (backtrack) to try other unexplored paths.

By doing this, we systematically explore all possible permutations!
*/
