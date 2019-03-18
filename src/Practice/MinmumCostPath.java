package Practice;

public class MinmumCostPath {

	static int row = 0, col = 0;
	int maxTotal = Integer.MAX_VALUE;

	// traverse down, left, right
	public static void main(String s[]) {

		int matrix[][] = { { 1, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 } };
		
		row = matrix.length;
		col = matrix[0].length;
		int memo[][] = new int[row][col];
		
		MinmumCostPath minCost = new MinmumCostPath();
		System.out.println(minCost.findMiniCostToDestination(matrix, 0, 0, 0));
		
		minCost.findMinCostPathWithDP(matrix);
	}

	public int findMiniCostToDestination(int[][] matrix, int i, int j, int cost) {

		if (i >= row || i < 0 || j >= col || j < 0) {
			return 0;
		}

		if (i == row - 1 && j == col - 1) {
			maxTotal = Math.min(maxTotal, cost+matrix[i][j]);
		}
		
		findMiniCostToDestination(matrix, i + 1, j, cost + matrix[i][j]);
		findMiniCostToDestination(matrix, i, j + 1, cost + matrix[i][j]);
		findMiniCostToDestination(matrix, i + 1, j + 1, cost + matrix[i][j]);

		return maxTotal;
	}
	
	
	public int findMinCostPathWithDP(int[][] matrix) {
		
		int memo[][] = new int[row][col];
		memo[0][0] = matrix[0][0];
		
		for(int i=1; i<row; i++) {
			memo[i][0] = memo[i-1][0]+ matrix[i][0];
		}
		
		for(int j=1; j<row; j++) {
			memo[0][j] = memo[0][j-1]+ matrix[0][j];
		}
		
		for(int i=1; i<row; i++) {
			for(int j=1; j<col; j++) {
				int value = Math.min(Math.min(memo[i-1][j-1], memo[i-1][j]), memo[i][j-1]);
				memo[i][j] = value  + matrix[i][j];
			}
		}
		
		System.out.println("Min cost: "+ memo[row-1][col-1]);
		return  memo[row-1][col-1];
	}
}
