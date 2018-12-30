package CCI;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String s[]) {
		
		int matrix[][] = {{1,11,3}, {2,12,5}, {8,9,7}, {15,16,17}};
		
		SpiralMatrix spiralMatrix = new SpiralMatrix();
		List<Integer> list = new ArrayList<Integer>();
		spiralMatrix.printSpiral(matrix, list);
		
		
	}

	private void printSpiral(int[][] matrix, List<Integer> list) {
		
		// TODO Auto-generated method stub

		int row= matrix.length;
          if(row == 0)
            return;
		int col = matrix[0].length;
      
		for(int i=0; i<col-i && i<row-i; i++) {
			int j;
	
          	for(j=i; j<col-i && i<row; j++) {
				list.add(matrix[i][j]);				
			}
		
			//row
			for(int k =i+1; k<row-i && col-i-1>=0; k++) {
				list.add(matrix[k][col-i-1]);
			}
				
			//column
			int k;
			for(k =col-i-2; k>i && row-i-1>0; k--) {
				list.add(matrix[row-i-1][k]);
			}
			
			//row9
			
			for(int p =row-i-1; p>i && k>=i; p--) {
				list.add(matrix[p][k]);
			}		
		}
       // return list;
		System.out.println(list);
	}
}
