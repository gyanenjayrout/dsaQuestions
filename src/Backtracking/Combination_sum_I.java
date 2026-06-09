package Backtracking;


import java.util.ArrayList;
import java.util.List;

 public class Combination_sum_I {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        helper(candidates, 0, combination, result, target);
        return result;
    }

    private void helper(int[] candidates, int index, List<Integer> combination, List<List<Integer>> result, int target) {
        // Base case: when the target becomes 0, add the combination to the result
        if (target == 0) {
            result.add(new ArrayList<>(combination)); // Add a copy of the combination
            return;
        }

        // If the target becomes negative or index goes out of bounds, stop recursion
        if (target < 0 || index == candidates.length) {
            return;
        }

        // Include the current candidate
        combination.add(candidates[index]);
        helper(candidates, index, combination, result, target - candidates[index]); // Same index to allow reuse
        combination.remove(combination.size() - 1); // Backtrack

        // Exclude the current candidate and move to the next
        helper(candidates, index + 1, combination, result, target);
    
 
}
 }

/*
 * Dry Run:

    Start with an empty combination: [].
    Include 2: [2].
        Include 2 again: [2, 2].
            Include 3: [2, 2, 3] (target becomes 0, valid combination).
        Exclude 3, backtrack to [2, 2].
    Exclude 2, backtrack to [2], and move to 3: [3].
    Include 3, backtrack, and move to 6 or 7.

Time Complexity:

    Worst-Case: O(2^t), where t=targett=target, because each candidate can be included multiple times or skipped.

Space Complexity:

    Stack Depth: O(t), where t=target, due to the depth of the recursion stack.
    Result Storage: O(k×n), where k is the number of valid combinations and nn is the average size of each combination.
 * 
 * =----------------------------------------------------------
 * Explanation of the Code:

    Base Cases:
        Target Reached (target == 0): When the target becomes 0, a valid combination is found. Add the current combination to the result.
        Target Invalid (target < 0 or index == candidates.length): If the target becomes negative or we've processed all candidates, terminate recursion.

    Recursive Steps:
        Include Current Candidate:
            Add the current candidate to the combination list.
            Recur with the same index (index remains the same) because the same candidate can be used multiple times.
        Exclude Current Candidate:
            Remove the last added candidate (backtracking).
            Move to the next candidate by increasing the index.

    Backtracking:
        After exploring one path, undo the last addition to the combination list to explore other possibilities.

    Result:
        Each valid combination is added to the result list as a new copy to prevent modification in future steps.
        ------------------------------------------------------------------
        
        Time Complexity Analysis

The time complexity of the "Combination Sum" problem can be broken into two parts: number of recursive calls and work done at each call.

    Number of Recursive Calls:
        At each index, we make two choices:
            Include the current candidate: Recur with the same index (to reuse the candidate).
            Exclude the current candidate: Recur with the next index.
        In the worst-case scenario, for a target TT, the recursion tree explores every possible way of adding candidates to reach TT. Each level of recursion can be considered as "adding" or "not adding" a candidate.
        The recursion tree could expand up to O(2t)O(2t), where t=targett=target, as the target essentially dictates how deep the recursion tree goes.

    Work Done at Each Recursive Call:
        At each valid solution (base case: target == 0), a copy of the current combination is created and added to the result.
        Copying the combination has a cost proportional to its size. Let nn represent the average size of a combination.
        If there are kk valid combinations in total, then the cost of copying combinations is O(k⋅n)O(k⋅n).

Overall Time Complexity:

    Recursive Calls: O(2 ^t), where tt is the target value.
    Copying Combinations: O(k⋅n)O(k⋅n), where kk is the number of combinations and nn is the average size of a combination.

Total Time Complexity: O(2^t+k⋅n)O(2^t+k⋅n)
Space Complexity Analysis

    Recursive Call Stack:
        The recursion depth is proportional to the target TT, as each call reduces the target by some amount.
        Maximum recursion depth: O(T).

    Combination List:
        The combine list stores temporary combinations during recursion. Its maximum size is the target TT divided by the smallest candidate value.
        Maximum size: O(T).

    Result Storage:
        The result list stores all valid combinations.
        If there are kk combinations, each of size nn, the storage requirement is O(k⋅n)O(k⋅n).

Total Space Complexity: O(T+k⋅n)O(T+k⋅n)
Example for Explanation
Input:

int[] candidates = {2, 3, 6, 7};
 * */
 