package CCI;

public class RotateMatrix {
	int[][] matrix2= new int[4][3];
	public static void main(String s[]) {
		
		RotateMatrix rotate= new RotateMatrix();
		int matrix1[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		rotate.rotateMatrix(matrix1);
				
		rotate.print();
	}
	public void rotateMatrix(int[][] matrix1) {
		for(int i=0; i<matrix1.length; i++) {
			int k=0;
			for(int j=matrix1[0].length-1; j>=0; j-- ) {
						
					//System.out.println(i+" "+j+" "+k);
					matrix2[k][i]= matrix1[i][j];
					k++;
			}
		}
	}
	
	public void print() {
		for(int i=0; i< matrix2.length;i++) {
			for(int j=0; j< matrix2[0].length; j++)
				System.out.print(matrix2[i][j]+" ");
		}
	}
}
