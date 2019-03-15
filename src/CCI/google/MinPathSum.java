package CCI.google;

public class MinPathSum {
	
	
	public static void main(String s[]) {
		
		MinPathSum minPath = new MinPathSum();
		int[][] grid = {
				{1, 3, 1},
				{1, 5, 1},
				{4, 2, 1}
		};
		System.out.println(minPath.minPathSum(grid));	
	}
	
	public int minPathSum(int[][] grid) {
		
		if(grid.length == 0)
			return 0;
		
		return findMinPathSum(grid, 0, 0, 0);
	}
	
	
	public int findMinPathSum(int[][] grid, int i, int j, int sum) {
		int row = grid.length, col =  grid[0].length;
		if(i >= row || j >= col) 
			return Integer.MAX_VALUE;
		else if(i == row-1 && j== col-1)
			return sum+ grid[i][j];
		
		return Math.min(findMinPathSum(grid, i+1, j, sum+ grid[i][j]),  findMinPathSum(grid, i, j+1, sum+ grid[i][j]));
	}
	
}
