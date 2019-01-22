package CCI;

public class LargestRectangle {

	public static void main(String s[]) {
		int matrix[][] = {{0,0,1,1,1},
				{1,0,1,1,1},
				{0,1,1,1,1},
				{1,0,1,1,1}};
		int row = matrix.length;
		int col = matrix[0].length;

		int dp[][] = new int[row+1][col+1];
		int max =0;
		for(int i=1; i<row+1; i++ ) {
			for(int j=1; j<col+1;j++) {
				if(matrix[i-1][j-1] != 0) {
					if(Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) == 0){
						dp[i][j] =  Math.max(dp[i-1][j], dp[i][j-1]) +1; 
					
						max = Math.max(max, dp[i][j]);
						
					}
					else {
						int adjacent = Math.max(dp[i-1][j], dp[i][j-1]);
						if(adjacent >2)
							dp[i][j] = adjacent/2 + adjacent;
						else
							dp[i][j] = adjacent + adjacent;
						max = Math.max(max, dp[i][j]);
					}
					System.out.println("Max: "+max);

				}
			}
		}
		System.out.println(max);
		
		
	}
}
