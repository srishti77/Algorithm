package CCI.google;

public class TicTacToe {

	char[][] grid;

	public static void main(String s[]) {
		
		TicTacToe toe = new TicTacToe(3);
		toe.move(0, 0, 1);
		
		toe.move(0, 2, 2);
		
		toe.move(2, 2, 1);
		
		toe.move(1, 1, 2); 
		
		toe.move(2, 0, 1);
		
		toe.move(1, 0, 2);
		
		toe.move(2, 1, 1);
	}
	public TicTacToe(int n) {
		grid = new char[n][n];
	}

	public int move(int row, int col, int player) {
		if (player == 1)
			grid[row][col] = 'X';
		else if (player == 2)
			grid[row][col] = '0';

		checkIFGameOver(grid, row, col, grid[row][col], 0);
		return 0;
	}

	private void checkIFGameOver(char[][] grid2, int row, int col, char c,  int n) {
		// TODO Auto-generated method stub
		int len = grid.length;
		if(row >= len || row <0 || col >= len || col <0)
			return;
		
		
		else {
			
			if(grid2[row][col] == c) {
				n++;
				if(n == grid.length) {
					System.out.println("Winner: "+ c+ " "+n+" "+grid2[row][col]);
					return; 
				}
				else {
					//up
					checkIFGameOver(grid2, row-1, col, c, n);
					
					//down
					checkIFGameOver(grid2, row+1, col, c, n);
					
					//left
					checkIFGameOver(grid2, row, col-1, c, n);
					
					//right
					checkIFGameOver(grid2, row, col+1, c, n);
					
					//right-dia
					checkIFGameOver(grid2, row-1, col+1, c, n);
					
					//left-dia
					checkIFGameOver(grid2, row-1, col-1, c, n);
					
					
					//left-dia
					checkIFGameOver(grid2, row+1, col-1, c, n);
					
					//right-dia
					checkIFGameOver(grid2, row+1, col+1, c, n);
				}
			}
			else {
				return;
			}
		}	
		
	}
}
