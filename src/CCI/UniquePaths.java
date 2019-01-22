package CCI;

public class UniquePaths {
	public static void main(String s[]) {
		
		UniquePaths path = new UniquePaths();
		int[][] obstacleGrid = {{1,0}};
		System.out.println(path.uniquePathsWithObstacles(obstacleGrid));
		
	}
	
	 public int uniquePathsWithObstacles(int[][] obstacleGrid) {
	      
	        int row = obstacleGrid.length ;
	        int col = obstacleGrid[0].length;
	        
	        if(row ==1 && col == 1 ){
	            if(obstacleGrid[row-1][col-1] == 0)
	                return 1;
	            else
	                return 0;
	        }
	        
	        if(obstacleGrid[0][0] == 1)
	        	return 0;
	            
	        for(int i=0; i<row; i++){
	            if(obstacleGrid[i][0] == 1){
	                 while(i < row)
	                {
	                     obstacleGrid[i][0] = 0;
	                     i++;
	            }
	                
	                break;
	            }
	            else
	               obstacleGrid[i][0] = 1; 
	        }
	        
	         for(int i=1; i<col; i++){
	            if(obstacleGrid[0][i] == 1)
	            {
	                while(i < col)
	                {
	                    obstacleGrid[0][i] =0;
	                    i++;
	                }
	                  break;
	            }
	              
	            else
	               obstacleGrid[0][i] = 1; 
	        }
	        
	        for(int i=1; i< row; i++ ){
	            for(int j =1; j<col;j++ ){
	                if(obstacleGrid[i][j] == 1)
	                    obstacleGrid[i][j]= 0;
	                else
	                    obstacleGrid[i][j]=  obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
	            }
	        }
	        
	        return obstacleGrid[row-1][col-1];
	        
	    }
}
