package mockinterview;

import java.util.Arrays;

public class LongestConsecutive {
	int[][] M ;
	public static void main(String s[]) {
		LongestConsecutive longest = new LongestConsecutive();

		int[][] M = { { 0, 1, 0, 1, 1 }, { 1, 1, 0, 0, 1 }, { 0, 0, 0, 1, 0 }, { 1, 0, 1, 1, 1 }, { 1, 0, 0, 0, 1 } };
		System.out.println(longest.longestLine(M));
	}

	public int longestLine(int[][] M) {
		
		if (M.length == 0)
			return 0;
		int ver = calculateVertical(M);
		int hor = calculateHorizontal(M);
		int diag =  calculateDiagonal(M);
		int antiDia = calculateAntiDiagonal(M);
		return Math.max(Math.max(diag, Math.max(ver, hor)), antiDia);
	}

	public int calculateHorizontal(int[][] P) {
		int row = P.length;
		int col = P[0].length;
		M = new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				M[i][j] = P[i][j];
			}
		}
		int maxValue = M[0][0];

		for (int i = 0; i < M.length; i++) {
			for (int j = 1; j < M[0].length; j++) {
				if (M[i][j] == 1) {

					M[i][j] = M[i][j] + M[i][j - 1];

					maxValue = Math.max(maxValue, M[i][j]);
				}

			}

		}

		// System.out.println("Max Hori." + maxValue);
		return maxValue;
	}

	public int calculateVertical(int[][] P) {
		int row = P.length;
		int col = P[0].length;
		M = new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				M[i][j] = P[i][j];
			}
		}
		
		int maxValue = M[0][0];
		for (int i = 1; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				if (M[i][j] == 1) {
					M[i][j] = M[i][j] + M[i - 1][j];
					maxValue = Math.max(maxValue, M[i][j]);
				}

			}
		}
		// System.out.println("Max Verticl." + maxValue);
		return maxValue;
	}

	public int calculateDiagonal(int[][] P) {
		int row = P.length;
		int col = P[0].length;
		M = new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				M[i][j] = P[i][j];
			}
		}
		
		int maxValue = M[0][0];

		for (int i = 1; i < M.length; i++) {
			for (int j = 1; j < M[0].length; j++) {
				if (M[i][j] == 1) {
					M[i][j] = M[i - 1][j - 1] + M[i][j];
					maxValue = Math.max(maxValue, M[i][j]);
				}

			}
		}
		// System.out.println("Max Diagonal." + maxValue);
		return maxValue;
	}

	public int calculateAntiDiagonal(int[][] P) {
		int row = P.length;
		int col = P[0].length;
		M = new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				M[i][j] = P[i][j];
			}
		}
		int maxValue = M[0][0];
		int m = M.length;
		
		for (int i = 0; i < M.length; i++) {
			System.out.print("row: "  +" "+M[0][i]);
		}
		
		System.out.println();
		for (int i = 1; i < M.length; i++) {
			for (int j = M[0].length - 2; j >= 0; j--) {
				System.out.println(M[i][j]);
				if (M[i][j] == 1) {
					M[i][j] = M[i - 1][j + 1] + M[i][j];
					System.out.println("i " + i + " j " + j + " " + M[i][j] + " prev: " + M[i - 1][j + 1]);
					maxValue = Math.max(maxValue, M[i][j]);
				}

			}
		}

		System.out.println("Max AniDi." + maxValue);
		return maxValue;
	}
}
