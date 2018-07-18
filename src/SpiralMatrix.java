import java.util.*;
public class SpiralMatrix {
	static int array[][] = new int[590][590];
	int min =0;
	static int count =0;
	static ArrayList list = new ArrayList();
public static void main(String args[]) {
	
	int value = 0;
	int size = 348100;
	int startRow = (int) Math.sqrt(348100)/2;
	int startCol = (int) Math.sqrt(348100)/2;
	System.out.println("Start row" +startRow +" "+startCol );
	int row=1,col=1;
	int array[][] = new int[590][590];
	array[startRow][startCol] = value;
	int newCol = 0, newRow =0;
	int i,j;
	SpiralMatrix spiral = new SpiralMatrix();
	while(value< 348100) {
		array[295][295] = 1;
		
		// 1st row
		for( i= 0; i<= col && startCol+i<590 ; i++ ) {
			//System.out.println("1st row: "+startRow + "  "+ (startCol+i));
				
			array[startRow][startCol+i] = spiral.findSum(startRow, startCol+i, array);
			//System.out.println("Sum "+startRow+" "+(startCol+i)+" --" +array[startRow][startCol+i]);
			
		
			++value;
			newCol = startCol+i;
		}
		col++;
		
		//1st col
		for( j = 1; j<= row&& row<590 ; j++) {
			//System.out.println("1st column: "+(startRow - j)+" "+newCol);
			array[startRow - j][newCol]= spiral.findSum(startRow - j, newCol, array);
			//System.out.println("Sum: "+ (startRow - j)+"-"+newCol+"-- "+array[startRow - j][newCol]);
			++value;
			newRow =startRow - j;
		}
		row++;
		
		
		//2nd row
		for( i = 1; i<= col && col<590 ; i++) {
			//System.out.println("2nd col: "+ newRow + " "+(newCol-i));
			array[newRow][newCol-i] = spiral.findSum(newRow, newCol-i, array);
			//System.out.println("Sum :"+newRow+" "+(newCol-i)+"--" +array[newRow][newCol-i] );
			++value;
			
		}
		newCol =newCol-i+1;
		col++;
	
		
		for( j = 1; j<= row && newRow+j<590; j++) {
			//System.out.println("2nd row: "+(newRow+j )+" "+newCol);
			array[newRow+j][newCol] = spiral.findSum(newRow+j, newCol, array);
			
			//System.out.println("Sum:"+ (newRow+j)+" "+ newCol +"--"+array[newRow+j][newCol]);
			++value;
			startRow= newRow+j;
		}
		startCol = newCol+1;
		row++;
	
		
	}
	
	spiral.findMin();
	
	}

  static int findSum (int index1, int index2, int[][] array) {
		
		int sum =0;
		
		for(int p = index1-1; p<= index1+1 && p<590 && p>=0; p++  )
		{
			for(int q = index2-1; q<= index2+1 && q< 590 && q>=0; q++ ) {
				
				sum = sum + array[p][q];
				//System.out.print(p + "-"+ q + "  ");
				
				
			}
		}
		
		if(index1 == 0 && index2  == 0) {
			for(int p = index1; p<= index1+1 && p<590 && p>=0; p++  )
			{
				for(int q = index2; q<= index2+1 && q< 590 && q>=0; q++ ) {
					
					sum = sum + array[p][q];
					//System.out.print(p + "-"+ q + "  ");
					
					
				}
			}
			
			
		}
		else if(index1  == 0) {
			for(int p = index1; p<= index1+1 && p<590 && p>=0; p++  )
			{
				for(int q = index2-1; q<= index2+1 && q< 590 && q>=0; q++ ) {
					
					sum = sum + array[p][q];
					//System.out.print(p + "-"+ q + "  ");
					
					
				}
			}
			
			
			
		}
		else if(index2 == 0) {
			for(int p = index1-1; p<= index1+1 && p<590 && p>=0; p++  )
			{
				for(int q = index2; q<= index2+1 && q< 590 && q>=0; q++ ) {
					
					sum = sum + array[p][q];
					//System.out.print(p + "-"+ q + "  ");
					
					
				}
			}
			
		}
		
		
		if(sum > 347991) {
			count++;
			list.add(sum);
			System.out.println("!st "+count+" "+sum);
			
		}
			
		return sum ;
	}
  
  void findMin() {
	  min = (int)list.get(0);
	  System.out.println("Min"+ min);
	  for(int o =0; o<list.size();o++) {
		  if(min > (int) list.get(o))
			  min = (int) list.get(o);
	  }
	  
	  System.out.println("Minimum value is "+ min);
  }
}
