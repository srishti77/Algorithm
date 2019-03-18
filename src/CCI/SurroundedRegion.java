package CCI;
public class SurroundedRegion {

	public static void main(String s[]) {

		char board[][] = 
			{{'O','X','X','O','X'},{'X','O','O','X', 'O'},{'X','O','X','O','X'},{'O','X','O','O','O'},{'X','X','O','X','O'}}; 

		label: for (int i = 1; i < board.length - 1; i++) {
			for (int j = 1; j < board[0].length-1; j++) {
				if (board[i][j] == 'O') {

					boolean flag = false;
					int k = i, p = j;
					
					while (k < board.length-1) {
						if (board[k][j] == 'X') {
							flag = true;
							break;
						}
						else {
							flag = false;
						}
						k++;
					}
					if(!flag)
					{
						break label;
					}
						
					k = i;
					while (k >= 0) {
						if (board[k][j] == 'X') {
							flag = true;
							break;
						}
						else {
							flag = false;
						}
						k--;
					}
					if(!flag)
					{
						break label;
					}
					System.out.println("Flag:"+flag);

					while (p < board[0].length) {
						if (board[i][p] == 'X') {
							flag = true;
							break;
						}
						else {
							flag = false;
						}
						p++;
					}
					System.out.println("Flag:"+flag);
					if(!flag)
					{
						break label;
					}
					p = j;
					while (p >= 0) {
						if (board[i][p] == 'X') {
							flag = true;
							break;
						}
						else {
							flag=false;
						}
						p--;
					}
				
					System.out.println("Flag:"+flag);
					
					if(flag)
						board[i][j] = 'X';

				}

			}			
		}
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j< board[0].length; j++) {
				System.out.println(board[i][j]);

			}
		}
		
	}
}
