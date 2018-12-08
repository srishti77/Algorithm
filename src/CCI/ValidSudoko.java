package CCI;

import java.util.HashSet;

public class ValidSudoko {
	public static void main(String s[]) {
		char[][] board=   {
				{'8','3','.','.','7','.','.','.','.'},
				{'6','.','.','1','9','5','.','.','.'},
				{'.','9','4','.','.','.','.','6','.'},
				{'2','.','.','.','6','.','.','.','3'},
				{'4','.','.','8','.','3','.','.','1'},
				{'7','.','.','.','2','.','.','.','6'},
				{'.','6','.','.','.','.','2','8','.'},
				{'.','.','.','4','1','9','.','.','5'},
				{'.','.','.','.','8','.','.','7','9'}};
		
		System.out.println(testRowWise(board));
		System.out.println(testColWise(board));
		System.out.println(insidethematrix(board));
		System.out.println(isValidSuduko(board));
		
		
		
		
	}
	
	public static boolean isValidSuduko(char[][] board) {
		
		if(!testRowWise(board))
			return false;
		else if(!testColWise(board))
			return false;
		else if(!insidethematrix(board))
			return false;
		else
			return true;
	}

	private static boolean insidethematrix(char[][] board) {
		// TODO Auto-generated method stub
		for(int i=0; i<3; i++) {
			for(int j=0; j<3;j++) {
				if(!testInTheBox(board, i*3, j*3)) {
					return false;
				}
					
			}
		}
		
		return true;
	}

	private static boolean testInTheBox(char[][] board, int row, int col) {
		// TODO Auto-generated method stub
		HashSet<Character> set = new HashSet<Character>();
		for(int i=row; i<row+3; i++) {
			for(int j=col; j<col+3; j++) {
				if(board[i][j] != '.') {
					if(set.contains(board[i][j]))
						return false;
					else
						set.add(board[i][j]);
				}
				
			}
		}
		
		return true;
	}

	private static boolean testRowWise(char[][] board) {
		// TODO Auto-generated method stub
		for(int k=0; k<9; k++) {
			
		HashSet<Character> set = new HashSet<Character>();
			for(int i=0; i<9; i++) {
				if(board[k][i] !='.') {
					if(set.contains(board[k][i]))
						return false;
					else
						set.add(board[k][i]);
				}
			}
		}
		
		return true;
		
	}
	
	private static boolean testColWise(char[][] board) {
		// TODO Auto-generated method stub
		for(int k=0; k<9; k++) {
			
		HashSet<Character> set = new HashSet<Character>();
			for(int i=0; i<9; i++) {
				if(board[i][k] !='.') {
					if(set.contains(board[i][k]))
						return false;
					else
						set.add(board[i][k]);
				}
			}
		}
		
		return true;
		
	}
	
	
}
