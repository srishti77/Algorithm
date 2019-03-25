package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Maze {

	Queue<int[]> queue = new LinkedList();
	boolean[][] visited;
	List<int[]> Directions = Arrays.asList(new int[] { 1, 0 }, new int[] { -1, 0 }, new int[] { 0, 1 },
			new int[] { 0, -1 });

	public static void main(String s[]) {

		int matrix[][] = { { 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0 }, { 1, 1, 0, 1, 1 },
				{ 0, 0, 0, 0, 0 } };

		Maze maze = new Maze();
		int[] start = new int[] { 0, 4 };
		int[] destination = new int[] { 4, 4 };

		System.out.println(maze.hasPath(matrix, start, destination));
	}

	public boolean hasPath(int[][] maze, int start[], int destination[]) {

		int m = maze.length, n = maze[0].length;
		visited = new boolean[m][n];

		queue.add(start);
		visited[start[0]][start[1]] = true;
		while (!queue.isEmpty()) {
			int point[] = queue.remove();
			if (point[0] == destination[0] || point[1] == destination[1])
				return true;

			for (int[] dir : Directions) {

				int s = point[0] + dir[0];
				int p = point[1] + dir[1];

				while (s < m && p < n && s >= 0 && p >= 0 && maze[s][p] == 0) {
					s += dir[0];
					p += dir[1];
				}

				if (!visited[s - dir[0]][p - dir[1]]) {
					queue.add(new int[] { s - dir[0], p - dir[1] });
					visited[s - dir[0]][p - dir[1]] = true;
				}

			}
		}
		return false;
	}

	private int[] goLeft(int[][] maze, int start[], int destination[]) {

		int pos[] = new int[2];
		pos[0] = start[0];
		// TODO Auto-generated method stub
		for (int i = start[1]; i >= 0 && maze[pos[0]][i] != 1; i--) {

			pos[1] = i;

		}
		if ((pos[0] == destination[0]) && (pos[1] == destination[1])) {
			System.out.println("Left: Found position");
		}
		return pos;
	}

	private int[] goRight(int[][] maze, int start[], int destination[]) {

		int pos[] = new int[2];
		pos[0] = start[0];
		// TODO Auto-generated method stub
		for (int i = start[1]; i < maze[0].length && maze[pos[0]][i] != 1; i++) {
			pos[1] = i;
		}
		if ((pos[0] == destination[0]) && (pos[1] == destination[1])) {
			System.out.println("Right: Found position");
		}
		return pos;
	}

	private int[] goUp(int[][] maze, int start[], int destination[]) {

		int pos[] = new int[2];
		pos[1] = start[1];
		// TODO Auto-generated method stub
		for (int i = start[0]; i >= 0 && maze[i][pos[1]] != 1; i--) {

			pos[0] = i;
		}

		if ((pos[0] == destination[0]) && (pos[1] == destination[1])) {
			System.out.println("Up: Found position");
		}
		return pos;
	}

	private int[] goDown(int[][] maze, int start[], int destination[]) {

		int pos[] = new int[2];
		pos[1] = start[1];
		// TODO Auto-generated method stub
		for (int i = start[0]; i < maze.length && maze[i][pos[1]] != 1; i++) {

			pos[0] = i;
		}

		if ((pos[0] == destination[0]) && (pos[1] == destination[1])) {
			System.out.println("Down: Found position");
		}
		return pos;
	}
}
