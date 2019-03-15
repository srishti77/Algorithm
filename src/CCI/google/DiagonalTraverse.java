package CCI.google;

public class DiagonalTraverse {

	public static void main(String s[]) {

		int matrix[][] = { { 1, 2, 3, 4}, { 5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		DiagonalTraverse diagonal = new DiagonalTraverse();
		int newMat[] = diagonal.traverse(matrix);
		diagonal.print(newMat);
	}

	public void print(int[] matrix) {
		
		for( int i=0; i< matrix.length; i++) {
			System.out.println(matrix[i]);
		}
		
	}
	public int[] traverse(int[][] matrix) {

		// go up

		int row = matrix.length;
		int col = matrix[0].length;

		int i = 0, j = 0, k = 0;
		int res[] = new int[row * col];
		boolean down = false;
		while (i < row && j < col && k < res.length) {

			res[k] = matrix[i][j];
			//System.out.println(i+" "+j+);
			k++;
			// go up
			if (down) {
				if (i == row - 1) {
					j++;
					down = false;
				} else if (j == 0) {
					i++;
					down = false;
				} else {
					i++;
					j--;
				}
			} else {

			
				
				if (j == col - 1) {
					i++;
					down = true;
				}
				else if (i == 0) {
					j++;
					down = true;
				}

				else {
					i--;
					j++;

				}
			}

		}
		return res;

	}
}
