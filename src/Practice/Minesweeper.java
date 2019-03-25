package Practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Minesweeper {
	List<int[]> directions = Arrays.asList(new int[] { 1, 0 }, new int[] { -1, 0 }, new int[] { 0, 1 },
			new int[] { 0, -1 },

			new int[] { -1, 1 }, new int[] { -1, -1 }, new int[] { 1, -1 }, new int[] { 1, 1 });
	boolean[][] visited;

	public static void main(String s[]) {

		Minesweeper minesweeper = new Minesweeper();

		char p[][] = { { 'B', '1', 'E', '1', 'B' }, { 'B', '1', 'M', '1', 'B' }, { 'B', '1', '1', '1', 'B' },
				{ 'B', 'B', 'B', 'B', 'B' } };

		char matrix[][] = minesweeper.updateBoard(p, new int[] { 1, 2 });
		minesweeper.printElement(matrix);
	}

	public void printElement(char[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				System.out.println(matrix[i][j]);

			}
		}
	}

	public char[][] updateBoard(char[][] board, int[] click) {

		int m = board.length;
		int n = board[0].length;
		visited = new boolean[m][n];

		char[][] temp = new char[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				temp[i][j] = board[i][j];
			}
		}

		Queue<int[]> queue = new LinkedList();
		queue.add(click);

		while (!queue.isEmpty()) {

			int point[] = queue.remove();
			
			if (board[point[0]][point[1]] == 'M') {
				System.out.println("Points: "+ point[0]+" "+ point[1]);
				temp[point[0]][point[1]] = 'X';
				break;
			}

			if (!visited[point[0]][point[1]]) {
				visited[point[0]][point[1]] = true;
				int countMines = 0;
				for (int[] dir : directions) {

					int s = dir[0] + point[0];
					int p = dir[1] + point[1];

					if (s < 0 || p < 0 || s >= m || p >= n) {
						continue;
					}

					if (board[s][p] == 'B' || board[s][p] == 'M') {
						countMines++;
					}
				}

				if (countMines == 0) {
					temp[point[0]][point[1]] = 'B';
					for (int[] dir : directions) {
						int s = dir[0] + point[0];
						int p = dir[1] + point[1];

						if (s < 0 || p < 0 || s >= m || p >= n) {
							continue;
						}

						queue.add(new int[] { s, p });
					}
				} else {
					char b = (char) (countMines+'0');
					temp[point[0]][point[1]] = b;
				}

			}
		}

		return temp;
	}
}
