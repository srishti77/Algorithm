package CCI;

public class Search2D {
	public static void main(String s[]) {
		Search2D search2D = new Search2D();
		int matrix[][] =  {
		                   {1,   3,  5,  7},
		                   {10, 11, 16, 20},
		                   {23, 30, 34, 50}
		                   };
		int target = 9;
		System.out.println(search2D.searchMatrix(matrix, target));
		
	}
	
	public boolean searchMatrix(int[][] matrix, int target) {
		
		
		int col =matrix[0].length;
		int row = matrix.length;
		
        for(int i=0; i< matrix.length; i++) {
        	
        	if(target <matrix[i][0]) {
        		return false;
        	}
        	if(target >=matrix[i][0] && matrix[i][col-1] >= target) {
        	
        		 if(findHere(matrix[i], 0, col-1, target))
        			 return true;
        		 else
        			 return false;  
        		 
        	}
        }
        
        return false;
    }

	private boolean findHere(int[] is, int low, int high, int element) {
		// TODO Auto-generated method stub
		if(low > high )
			return false;
		int mid = (low+high)/2;
		System.out.println("Mid: "+mid+" low "+low+" high "+high);
		if(element == is[mid])
			return true;
		
		if(element <is[mid])
			return findHere(is, low, mid-1, element);
		
		else
			return findHere(is, mid+1, high, element);
	}
}
