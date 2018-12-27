package CCI;

public class GameOfLife {
	static int[][] newGame = new int[3][3];
	public static void main(String s[]) {
		int[][] game = {
				{0,0,0},
				{1,1,1},
				{0,0,0}
		};
		GameOfLife gameOfLive = new GameOfLife();
		
		gameOfLive.gameOfLife(game);
		gameOfLive.print(newGame);
	}

	private  void gameOfLife(int[][] game) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<game.length; i++) {
			for(int j=0; j<game[0].length; j++) {
				deadOrAlive(i, j, game, game[i][j]);
			}
		}
	}
	
	
	private  void print(int[][] game) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<game.length; i++) {
			for(int j=0; j<game[0].length; j++) {
				System.out.println( game[i][j]);
			}
		}
	}
	
	public void deadOrAlive(int row, int col, int[][] game, int value) {
		int row2 =row+1;
		int col2= col+1;
		int row1 =0, col1=0;
		if(row-1 >0)
			row1=row-1;
		
		if(col-1>0)
			col1 = col-1;
		if(row2 >= 3)
			row2= 2;
		if(col2 >= 3)
			col2 =2;
		int count =0;
		System.out.println("row1 "+row1+" row2 "+ row2+" col1 "+ col1+" col2 "+col2);
		for(int i=row1; i<= row2; i++) {
			for(int j=col1; j<= col2; j++) {
				if(game[i][j] == 1)
					count++;
			}
		}
		
		if(value==1) {
			count =count-1;
			if(count ==2 || count==3)
				newGame[row][col] =1;
			else
				newGame[row][col] =0;
		}
		
		if(value ==0) {
			if(count == 3)
				newGame[row][col] = 1;
			else
				newGame[row][col] = 0;
		}
	}
	
	
}
