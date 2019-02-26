package CCI.google;

import java.util.ArrayList;



public class SpiralMatrix {
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String s[]) {
		
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		SpiralMatrix matrixObj = new SpiralMatrix();
		matrixObj.printMatrix(matrix);
		System.out.println(matrixObj.list);
	}
	
	public void printMatrix(int[][] matrix) {
		
		int row = matrix.length;
		int col = matrix[0].length;
		
		for(int i=0; i<row-i; i++) {
			
			int j;
			for(j=i; j<col-i && i<row-i; j++) {
				list.add(matrix[i][j]);
			}
			
			for(int k=i+1; k<row-i && (col-i-1) >=i; k++)
				list.add(matrix[k][col-i-1]);
		
			for(j = col-i-2; j>=i && (row-i-1) >=i; j-- )
				list.add(matrix[row-i-1][j]);
			
			for(int k = row-i-2; k>i && (col-i-1) >=0; k-- )
				list.add(matrix[k][i]);
			
		}
		
	}
	
	
}
