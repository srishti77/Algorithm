package CCI;

public class WordSearch {
	
	public static void main(String s[]) {
		char[][] board = {
				{'A','B'},
				//{'S','F','C','S'},
				{'C','D'}
						
				};
		
		boolean[][] visited = new boolean[board.length][board[0].length];
		WordSearch search = new WordSearch();
		
		String word = "DBAC";
		System.out.println(search.exist(board, word, visited));
	}

	private boolean  exist(char[][] board, String word, boolean[][] visited) {
		// TODO Auto-generated method stub
		int row = board.length;
		int col = board[0].length;
		
		for(int i=0; i<row; i++) {
			for(int j=0; j< col; j++) {
				if(exist(board, word, i,j,visited, 0))
					return true;
			}
		}
		return false;
}

	private boolean exist(char[][] board, String word, int i, int j, boolean[][] visited, int index) {
		// TODO Auto-generated method stub
		if(index == word.length()) return true;
		int row = board.length;
		int col = board[0].length;
		
		if(i > row || i<0 || j>col || j<0 || visited[i][j]  ) return false;
		if( board[i][j] != word.charAt(index)) return false;
		visited[i][j] = true;
		
		boolean top = exist(board, word, i-1, j, visited, index+1);
		boolean left = exist(board, word, i, j-1, visited, index+1);
		boolean bottom = exist(board, word, i+1, j, visited, index+1);
		boolean right = exist(board, word, i, j+1, visited, index+1);
		
		boolean success = top || left || bottom || right;
		if (!success) visited[row][col] = false;
		return success;
	}
}
