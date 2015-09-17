package kiran.java.logicalproblems;

public class EightQueenProblem {

	public static boolean isSafe(int[][] board, int row, int column) {

		int i, j;

		// Check this column on upper side
		for (i = row - 1; i >= 0; i--) {
			if (board[i][column] == 1) {
				System.out.println("// Check this column on upper side");
				return false;
			}
		}

		// Check this column on lower side
		for (i = row + 1; i < 8; i++) {
			if (board[i][column] == 1) {
				System.out.println("Check this column on lower side");
				return false;
			}
		}

		// Check this row on left side
		for (i = 0; i < column; i++) {
			if (board[row][i] == 1) {
				System.out.println("//Check this row on left side");
				return false;
			}
		}

		// Check this row on right side
		for (i = column + 1; i < 8; i++) {
			if (board[row][i] == 1) {
				System.out.println("//Check this row on right side");
				return false;
			}
		}

		// Check upper diagonal on left side
		for (i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1) {
				System.out.println("//Check upper diagonal on left side");
				return false;
			}
		}

		// Check upper diagonal on right side
		for (i = row - 1, j = column + 1; i >= 0 && j < 8; i--, j++) {
			if (board[i][j] == 1) {
				System.out.println("//Check upper diagonal on right side");
				return false;
			}
		}

		/* Check lower diagonal on left side */
		for (i = row + 1, j = column - 1; j >= 0 && i < 8; i++, j--) {
			if (board[i][j] == 1) {
				System.out.println("/* Check lower diagonal on left side */");
				return false;
			}
		}

		/* Check lower diagonal on right side */
		for (i = row + 1, j = column + 1; j < 8 && i < 8; i++, j++) {
			if (board[i][j] == 1) {
				System.out.println(" /* Check lower diagonal on right side */");
				return false;
			}
		}

		return true;
	}

	
	public static void main(String[] args) {

//		int[] inputArray = { 3, 7, 2, 8, 5, 1, 4, 6 };
		int[] inputArray = { 1, 3, 5, 7, 2, 4, 6, 8 };
		int[][] board = new int[8][8];
		boolean eightQueen = true;

		for (int i = 0; i < 8; i++) {
			board[inputArray[i] - 1][i] = 1;
		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(board[i][j] + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (board[i][j] == 1) {
					if (EightQueenProblem.isSafe(board, i, j) == false) {
						eightQueen = false;
						break;
					}
				}
			}
		}

		if (eightQueen) {
			System.out.println("TRUE");
		} else {
			System.out.println("FLASE");
		}
	}
}
