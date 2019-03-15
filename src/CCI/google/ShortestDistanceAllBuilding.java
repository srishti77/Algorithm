package CCI.google;

import java.util.HashMap;
import java.util.Map;
/*
 * Normal
 */
public class ShortestDistanceAllBuilding {

	public static void main(String s[]) {

		ShortestDistanceAllBuilding shortestDist = new ShortestDistanceAllBuilding();
		int[][] grid = { { 1, 0, 2, 0, 1 }, { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 } };
		System.out.println(shortestDist.shortestDistance(grid));
	}

	public int shortestDistance(int[][] grid) {

		int maxValue = Integer.MAX_VALUE;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if(grid[i][j] == 0) {
					Map<String, Boolean> visited = new HashMap<String, Boolean>();
					visited.put(i+""+j, true);
					Map<String, Integer> map = calculateMinmumDistance(grid, i, j, new HashMap<String, Integer>(),visited, 1);
					maxValue = totalCost(map);
					
				}
				
			}
		}
		return maxValue;
	}
	
	public int totalCost(Map<String, Integer> map) {
		int sum =0;
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			System.out.println(entry.getValue());
			 sum += entry.getValue();
		}
		return sum;
	}

	public Map<String, Integer> calculateMinmumDistance(int[][] grid, int i, int j, Map<String, Integer> map, Map<String, Boolean> visited, int sum ) {

		String key = i + "" + j;
		System.out.println("sum: "+key);
		if (grid[i][j] == 1) {
			visited.put(key, true);
			int val = map.getOrDefault(key, 0);
			if(val == 0)
				map.put(key, sum);
			else
				map.put(key, sum);
		}

		// move Up
		int index = i - 1;
		key = index+""+j;
		if (index >= 0 && j< grid[0].length && !visited.getOrDefault(key, false) && grid[index][j] != 2 ) {
			visited.put(key, true);
			calculateMinmumDistance(grid, index, j, map, visited, sum++);

		}
		
		// move down
		index = i + 1;
		key = index+""+j;
		if (index < grid.length && j< grid[0].length && !visited.getOrDefault(key, false) &&  grid[index][j] != 2) {
			visited.put(key, true);
			calculateMinmumDistance(grid, index, j, map, visited, sum++);
		}
			

		// move right
		index = j + 1;
		key = i+""+index;
		if (index < grid[0].length && i < grid.length  && !visited.getOrDefault(key, false) && grid[i][index] != 2) {
			visited.put(key, true);
			calculateMinmumDistance(grid, i, index, map, visited, sum++);
		}
			

		// move left
		index = j - 1;
		key = i+""+index;
		if (index >= 0 && i < grid.length  && !visited.getOrDefault(key, false) && grid[i][index] != 2) {
			visited.put(key, true);
			calculateMinmumDistance(grid, i, index, map, visited, sum++);
		}
		//	calculateMinmumDistance(grid, i, index, map);

		return map;
	}
}
