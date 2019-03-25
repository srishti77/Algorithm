package Practice;

public class MinDistance {
	public static void main(String s[]) {
		MinDistance minDist = new MinDistance();
		int[][] matrix = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
		minDist.printElement(minDist.updateMatrix(matrix));
	}

	public void printElement(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.println(matrix[i][j]);
			}
		}
	}

	public int[][] updateMatrix(int[][] matrix) {

		int row = matrix.length;
		int col = matrix[0].length;

		int[][] temp = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				if (matrix[i][j] == 0) {
					temp[i][j] = 0;
				} else {
					if (i > 0) {
						if (temp[i][j] != 0)
							temp[i][j] = Math.min(temp[i][j], temp[i - 1][j] + 1);
						else
							temp[i][j] = temp[i - 1][j] + 1;
					}
					if (j > 0) {
						if (temp[i][j] != 0)
							temp[i][j] = Math.min(temp[i][j], temp[i][j - 1] + 1);
						else
							temp[i][j] = temp[i][j - 1] + 1;
					}
				}
			}
		}

		for (int i = row - 1; i >= 0; i--) {
			for (int j = col - 1; j >= 0; j--) {

				if (matrix[i][j] == 0) {
					temp[i][j] = 0;
				} else {
					if (i < row - 1) {
						if (temp[i][j] != 0)
							temp[i][j] = Math.min(temp[i][j], temp[i + 1][j] + 1);
						else
							temp[i][j] = temp[i + 1][j] + 1;
					}
					if (j < col - 1) {
						if (temp[i][j] != 0)
							temp[i][j] = Math.min(temp[i][j], temp[i][j + 1] + 1);
						else
							temp[i][j] = temp[i][j + 1] + 1;
					}
				}
			}
		}

		return temp;
	}
}
