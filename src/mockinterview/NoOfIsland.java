package mockinterview;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NoOfIsland {

	Queue<int[]> queue = new LinkedList<>();

	List<int[]> direction = Arrays.asList(new int[] { 1, 0 }, new int[] { -1, 0 }, new int[] { 0, 1 },
			new int[] { 0, -1 });

	public static void main(String s[]) {

		NoOfIsland noOfIsland = new NoOfIsland();
		char[][] matrix = { { '1', '1', '0', '0', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' } };

		System.out.println(noOfIsland.numIslands(matrix));
	}

	public int numIslands(char[][] grid) {
		int count = 0;
		int m = grid.length, n = grid[0].length;
	
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				if (grid[i][j] == '1') {

					grid[i][j] = '0';
					queue.add(new int[] { i, j });
					count++;

					while (!queue.isEmpty()) {
						
						int point[] = queue.remove();
						int p0= point[0], p1 = point[1];
						grid[p0][p1] = '0';
						
						for (int dir[] : direction) {
							int x = p0 + dir[0];
							int y = p1 + dir[1];

							if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == '1') {
								queue.add(new int[] { x, y });
							}
						}
					}

				}

			}
		}
		return count;
	}
}
