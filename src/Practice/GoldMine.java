package Practice;

public class GoldMine {
	int maxValue = 0;
	static int[][] memo;

	public static void main(String s[]) {

		GoldMine goldMine = new GoldMine();
		int matrix[][] = { { 1, 3, 1, 5 }, { 2, 2, 4, 1 }, { 5, 0, 2, 3 }, { 0, 6, 1, 2 } };
		int row = matrix.length;
		int col = matrix[0].length;

		memo = new int[row][col];

		System.out.println(goldMine.getMaxGold(matrix, 2, 0, 0));
		goldMine.getMaxGoldDp(matrix, 2, 0);
	}

	public int getMaxGold(int matrix[][], int i, int j, int value) {

		if (i >= matrix.length || i < 0 || j >= matrix[0].length || j < 0) {
			return 0;
		}

		if (j == matrix[0].length - 1) {
			maxValue = Math.max(maxValue, value + matrix[i][j]);
		}

		getMaxGold(matrix, i - 1, j + 1, value + matrix[i][j]);
		getMaxGold(matrix, i, j + 1, value + matrix[i][j]);
		getMaxGold(matrix, i + 1, j + 1, value + matrix[i][j]);

		return maxValue;
	}

	public void getMaxGoldDp(int[][] matrix, int m, int n) {

		int col = matrix[0].length;
		int row = matrix.length;
		int memo[][] = new int[row][col];
	//	memo[m][0] = matrix[m][0];
		int maxtotal = 0;

		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < m; j++) {

				int right = (i == n - 1) ? 0 : memo[j][i + 1];

				int rightUp = (j == 0 || i == n - 1) ? 0 : memo[j - 1][i + 1];

				int right_down = (j == m - 1 || i == n - 1) ? 0 : memo[j + 1][i + 1];

				memo[j][i] = matrix[j][i] + Math.max(right, Math.max(rightUp, right_down));
			}
		}

		int res = memo[0][0];

		for (int i = 1; i < m; i++)
			res = Math.max(res, memo[i][0]);
		System.out.println("Here "+res);
	}

}
