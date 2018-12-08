package CCI;

public class RotateImage {
	public static void main(String args[]) {
		int[][] matrix = {{5,1,9,11},
						{2,4,8,10},
						{13,3,6,7},
						{15,14,12,16},
						
		};
		
		rotateImage(matrix);
	}

	private static void rotateImage(int[][] mat) {
		// TODO Auto-generated method stub
		int N = mat.length;
		for (int x = 0; x < N / 2; x++) 
        { 
            // Consider elements in group of 4 in  
            // current square 
            for (int y = x; y < N-x-1; y++) 
            { 
                // store current cell in temp variable 
                int temp = mat[x][y]; 
       
                // move values from right to top 
                mat[x][y] = mat[N-1-y][x]; 
       
                // move values from bottom to right 
                mat[N-1-y][x] = mat[N-1-x][N-1-y]; 
       
                // move values from left to bottom 
                mat[N-1-x][N-1-y] = mat[y][N-1-x]; 
       
                // assign temp to left 
                mat[y][N-1-x] = temp; 
            } 
        } 
		print(mat);
	}
	
	private static void print(int[][] matrix) {
		// TODO Auto-generated method stub
		int n= matrix.length;
		for(int i=0; i< n; i++) {
			for(int j=0; j<n; j++) {
				System.out.println(matrix[i][j]);
			}
		}
	}


}
