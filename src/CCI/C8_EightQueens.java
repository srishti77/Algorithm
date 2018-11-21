package CCI;

import java.util.ArrayList;

public class C8_EightQueens {
	
	public static void main(String args[]) {
		
		C8_EightQueens eight = new C8_EightQueens();
		ArrayList<Integer[]> results = new ArrayList<Integer[]>();
		Integer[] placeInteger = new Integer[8];
		for(Integer[] i: eight.placeQueens(0, placeInteger, results)) {
			for(Integer integer: i)
				System.out.print(integer);
			System.out.println();
		}
	}
	
	ArrayList<Integer[]> placeQueens(int row, Integer[] columns, ArrayList<Integer[]> results) {
		if(row ==8)
		{
			results.add(columns.clone());
			
		}
		else {
			
			for( int col=0; col<8; col++) {
				if(check(columns,row, col)) {
					columns[row] = col;
					placeQueens(row+1, columns, results);
				}
			}
		}
		return results;
		
	}

	private boolean check(Integer[] columns, int row, int col) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<row; i++) {
			int column2= columns[i];
			
			if(col == column2)
				return false;
			
			int rowDistance = row-i;
			
			if(rowDistance== Math.abs(col-columns[i]))
				return false;
		}
		
		return true;
	}
}
