package mockinterview;

public class NoOfIsland_DFS {
	public static void main(String s[]) {

		char[][] matrix = { { '1', '1', '0', '0', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' } };

		NoOfIsland_DFS isLands = new NoOfIsland_DFS();
		System.out.println(isLands.numIslands(matrix));
	}

	public int numIslands(char[][] grid) {
		int m = grid.length;

		if (m == 0)
			return 0;
		int n = grid[0].length;
		int count=0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == '1') {
					count++;
					dfs(grid, i, j);

				}
			}
		}
		return count;
	}

	private void dfs(char[][] grid, int i, int j) {
		// TODO Auto-generated method stub
		if (i >= grid.length || i < 0 || j >= grid[0].length || j < 0  || grid[i][j] == '0')
			return;
		
		
			grid[i][j] = '0';
		
		dfs(grid, i-1, j);
		dfs(grid, i+1, j);
		dfs(grid, i, j-1);
		dfs(grid, i, j+1);
	}
}
