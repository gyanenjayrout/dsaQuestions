package Backtracking;

import java.util.*;

public class N_Queen {

	    // Function to save the current board configuration
	    public void saveBoard(char[][] board, List<List<String>> allBoards) {
	        List<String> newBoard = new ArrayList<>();
	        for (int i = 0; i < board.length; i++) {
	            String row = "";
	            for (int j = 0; j < board.length; j++) {
	                if (board[i][j] == 'Q') {
	                    row += 'Q';
	                } else {
	                    row += '.';
	                }
	            }
	            newBoard.add(row);
	        }
	        allBoards.add(newBoard);
	    }

	    // Function to check if it's safe to place a queen at board[row][col]
	    public boolean isSafe(int row, int col, char[][] board) {
	        // Check the same row
	        for (int j = 0; j < col; j++) {
	            if (board[row][j] == 'Q') {
	                return false;
	            }
	        }

	        // Check upper-left diagonal
	        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
	            if (board[i][j] == 'Q') {
	                return false;
	            }
	        }

	        // Check lower-left diagonal
	        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
	            if (board[i][j] == 'Q') {
	                return false;
	            }
	        }

	        return true;
	    }

	    // Helper function to solve the N-Queens problem
	    public void helper(char[][] board, List<List<String>> allBoards, int col) {
	        // Base case: If all queens are placed
	        if (col == board.length) {
	            saveBoard(board, allBoards);
	            return;
	        }

	        for (int row = 0; row < board.length; row++) {
	            if (isSafe(row, col, board)) {
	                board[row][col] = 'Q'; // Place queen
	                helper(board, allBoards, col + 1); // Recur for the next column
	                board[row][col] = '.'; // Backtrack
	            }
	        }
	    }

	    // Main function to solve the N-Queens problem
	    public List<List<String>> solveNQueens(int n) {
	        List<List<String>> allBoards = new ArrayList<>();
	        char[][] board = new char[n][n]; // we are gonna make 2d char array to make the board

	        // Initialize the board with '.'
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                board[i][j] = '.';
	            }
	        }

	        helper(board, allBoards, 0);
	        return allBoards;
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	    	N_Queen solution = new N_Queen();
	        List<List<String>> result = solution.solveNQueens(4);
	        for (List<String> board : result) {
	            for (String row : board) {
	                System.out.println(row);
	            }
	            System.out.println();
	        }
	    }
	


}
