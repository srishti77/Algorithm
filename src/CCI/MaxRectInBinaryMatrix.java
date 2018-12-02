package CCI;

public class MaxRectInBinaryMatrix {
	
	public static void main(String s[]) {
		int array[][]= {{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};
		
		MaxRectInBinaryMatrix maxRect = new MaxRectInBinaryMatrix();
		maxRect.findRect(array);
	}
	
	public void findRect(int array[][]) {
		int axu[][] = new int[array.length][array[0].length];
		int row= array.length;
		int col = array[0].length;
		for(int i=0; i<row; i++) {
			axu[i][0] = array[i][0];
		}
		
		for(int j=0; j<col; j++) {
			axu[0][j] = array[0][j];
		}
		
		for(int i=1; i<row; i++) {		
			for(int j=1; j< col; j++) {
				if(array[i][j] ==1){
					axu[i][j] = min(array[i-1][j-1], array[i-1][j], array[i][j-1])+1;			
					System.out.println(axu[i][j]);
				}
					
				else
					axu[i][j] =0;
			}
		}
		
		maxElementInAux(axu);
		
	}
	
	private void maxElementInAux(int[][] axu) {
		// TODO Auto-generated method stub
		int row= axu.length;
		int col = axu[0].length;
		int maxElement=0;
		int max_row=-1;
		int max_col=-1;
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++) {
				if(axu[i][j] > maxElement) {
					maxElement = axu[i][j];
					max_row=i;
					max_col=j;
				}
			}
		}
		System.out.println("MaxElement "+maxElement+" max_row "+ max_row +" max_col "+max_col );
		for(int i=max_row; i>max_row-maxElement; i--) {
			for(int j= max_col; j>max_col-maxElement; j--) {
				System.out.println(i+" "+j);
			}
		}
		
	}

	public int min(int a, int b, int c) {
		System.out.println(a+" - "+b+" - "+c);
		if(a <=b && b<=c )
			return a;
		else if( b<=a && a<=c)
			return b;
		else
			return c;
	}
}
