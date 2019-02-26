package CCI.google;
/*
 * Input: [0,1,0],
[0,0,1],
[1,1,1],
[0,0,0]

output:

[0,0,0],
  [1,0,1],
  [0,1,1],
  [0,1,0]
  
  convert 0 to 1 -11
  convert 1 to 0 = 10
  convert 1 to 1 = 11
  
  
  Any live cell with fewer than two live neighbors dies, as if caused by under-population.
Any live cell with two or three live neighbors lives on to the next generation.
Any live cell with more than three live neighbors dies, as if by over-population..
Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 */

public class GameOfLife {

	public static void main(String s[]) {
		
		GameOfLife game = new GameOfLife();
		int[][] board = {
				{0, 1, 0},
				{0, 0, 1},
				
				{1, 1, 1},
				{0, 0, 0}
				
		};
		
		game.gameOfLife(board);
	}

	public void gameOfLife(int[][] board) {
		int row = board.length;
		int col = board[0].length;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				int neighbours = countNeighbours(i, j, board);
				if (board[i][j] == 0 && neighbours == 3)
					board[i][j] = -11;

				else if (board[i][j] == 1 && (neighbours < 2 || neighbours > 3))
					board[i][j] = 10;

				else if (board[i][j] == 1 && (neighbours == 2 || neighbours == 3))
					board[i][j] = 11;

			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				if (board[i][j] == 10)
					board[i][j] = 0;
				else if (board[i][j] == -11)
					board[i][j] = 1;

				else if (board[i][j] == 11)
					board[i][j] = 1;

				System.out.println(board[i][j]);
			}
		}

	}

	public int countNeighbours(int row, int col, int[][] board) {
		int row1 = board.length;
		int col1 = board[0].length;

		int count = 0;

		// up
		if (row - 1 >= 0 && col >= 0 && board[row - 1][col] > 0) {
			count++;
		}
		// left
		if (col - 1 >= 0 && board[row][col - 1] > 0) {
			count++;
		}

		// right
		if (((col + 1) < col1) && board[row][col + 1] > 0) {
			count++;
		}

		// left up
		if (row - 1 >= 0 && ((col - 1) >= 0) && board[row - 1][col - 1] > 0) {
			count++;
		}

		// right up
		if (row - 1 >= 0 && ((col + 1) < col1) && board[row - 1][col + 1] > 0) {
			count++;
		}

		// bottom left
		System.out.println(row +" "+ col);
		if (row + 1 < row1 && ((col - 1) >= 0) && board[row + 1][col - 1] > 0) {
			count++;
		}

		// bottom right
		if (row + 1 < row1 && ((col + 1) < col1) && board[row + 1][col + 1] > 0) {
			count++;
		}

		// below
		if (row + 1 < row1 && board[row + 1][col] > 0) {
			count++;
		}
		return count;
	}

}
