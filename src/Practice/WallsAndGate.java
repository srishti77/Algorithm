package Practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WallsAndGate {

	List<int[]> directions = Arrays.asList(new int[] { 1, 0 }, new int[] { -1, 0 }, new int[] { 0, 1 },
			new int[] { 0, -1 });

	public static void main(String s[]) {
		
		WallsAndGate walls = new WallsAndGate();
		int max = Integer.MAX_VALUE;
		int[][] matrix = {{max, -1, 0, max},
				{max, max, max, -1},
				{max, -1, max, -1},
				{0, -1, max, max}};
		
		walls.wallsAndGates(matrix);
	}

	public void wallsAndGates(int[][] rooms) {

		int m = rooms.length;
		int n = rooms[0].length;
		Queue<int[]> q = new LinkedList<>();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				
				if (rooms[i][j] == 0) {
					q.add(new int[] {i, j});
				}
			}
		}
		
		while(!q.isEmpty()) {
			int[] point = q.poll();
	        int row = point[0];
	        int col = point[1];
	        for (int[] direction : directions) {
	            int r = row + direction[0];
	            int c = col + direction[1];
	            if (r < 0 || c < 0 || r >= m || c >= n || rooms[r][c] != Integer.MAX_VALUE) {
	                continue;
	            }
	            rooms[r][c] = rooms[row][col] + 1;
	            q.add(new int[] { r, c });
	        }

		}
		
		for(int i=0; i<m; i++) {
			for(int j=0; j< n; j++) {
				System.out.println(rooms[i][j]);
			}
		}
	}
}
