package Practice;

public class FriendCircle {
	public static void main(String s[]) {
		FriendCircle friend = new FriendCircle();
		int[][] matrix = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
		System.out.println(friend.findFriends(matrix));
	}

	public int findFriends(int[][] matrix) {
		int[] visited = new int[matrix.length];
		int count = 0;

		for (int i = 0; i < matrix.length; i++) {
			if (visited[i] == 0) {
				dfs(matrix, visited, i);
				count++;
			}
		}
		return count;
	}

	private void dfs(int[][] matrix, int[] visited, int i) {
		// TODO Auto-generated method stub
		for (int j = 0; j < matrix[0].length; j++) {

			if (matrix[i][j] == 1 && visited[j] == 1) {
				visited[j] = 1;
				dfs(matrix, visited, j);
			}
		}
	}
}
