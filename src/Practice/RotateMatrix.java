package Practice;

public class RotateMatrix {
	public static void main(String s[]) {

		int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		RotateMatrix rotateMat = new RotateMatrix();
		rotateMat.rotateMatrix(matrix.length, matrix);
	}

	public void rotateMatrix(int N, int mat[][]) {

		for (int x = 0; x < N / 2; x++) {

			for (int y = x; y < N - x - 1; y++) {

				int temp = mat[x][y];
				mat[x][y] = mat[y][N-1-x];
				mat[y][N-1-x] = mat[N - 1 - x][ N-1-y];
				mat[N - 1 - x][ N-1-y] = mat[N-1-y][x];

				mat[N-1-y][x] = temp;

			}

		}

		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.println(mat[i][j]);
			}
		}
	}
}
