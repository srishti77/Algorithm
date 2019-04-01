package mockinterview;

import java.util.Stack;

public class MostStoneRemoved {

	public static void main(String s[]) {

		MostStoneRemoved stone = new MostStoneRemoved();
		int stones[][] = { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 2 }, { 2, 1 }, { 2, 2 } };
		stone.removeStones(stones);
	}

	public int removeStones(int[][] stones) {
		int N = stones.length;

		int[][] graph = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j] [1]) {
					graph[i][++graph[i][0]] = j;
					graph[j][++graph[j][0]] = i;

					System.out.println(i + " " + j + " " + graph[i][j]);
				}
			}
		}

		int ans = 0;

		boolean seen[] = new boolean[N];

		for (int i = 0; i < N; ++i) {
			if (!seen[i]) {
				Stack<Integer> stack = new Stack<>();
				stack.push(i);
				seen[i] = true;
				ans--;

				while (!stack.isEmpty()) {
					int node = stack.pop();
					ans++;
					for (int k = 1; k <= graph[node][0]; k++) {
						int nei = graph[node][k];
						if (!seen[nei]) {
							stack.push(nei);
							seen[nei] = true;
						}
					}
				}

			}
		}
		return ans;
	}
}
