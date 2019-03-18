package CCI;
public class Pseudoko {

	public static void main(String s[]) {
		
		int array[][] =    {{0,3,7,5,1,9,8,0,4},
							{8,0,5, 7,2,0 ,1,3,6},
							{0,2,1, 3,0,8, 5,7,0},
							{3,6,0, 1,9,5, 7,0,2},
							{2,0,4, 6,3,0, 9,5,8},
							{5,7,9, 8,4,2, 0,6,1},
							{7,8,6, 0,5,1, 2,9,3},
							{0,5,3, 2,8,6, 4,0,7},	
							{1,4,2, 9,0,3, 6,8,5}};
		
		Pseudoko pseudoko = new Pseudoko();
		//row one 0
		array= pseudoko.checkEmptySpace(array);
		array=pseudoko.checkZerosInABlock(array);
		
		//split the row code
		int newArr[][]= new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3;j++) {
				newArr= pseudoko.splitMatrix(array, i ,j);
				newArr = pseudoko.checkZerosInABlock(newArr);
				array= pseudoko.mergeMatrix(array, newArr, i, j);
			}
		}
		
		
		//split column wise
		for(int i=0; i<3; i++) {
			for(int j=0; j<3;j++) {
				newArr= pseudoko.splitMatrixColumn(array, i ,j);
				newArr = pseudoko.checkZerosInABlock(newArr);
				
				//array= pseudoko.mergeMatrixColumn(array, newArr, i, j);
			}
		}
		//*/
		//array= pseudoko.checkEmptySpace(array);
		pseudoko.print(array);
		
	}
	
	public int[][] checkEmptySpace(int[][] arr) {
		int countZero =0;
		String numbers = "123456789";
		for(int i=0; i<arr.length;i++) {
			
			for(int j=0; j< arr.length;j++) {
				if(arr[i][j]==0) {
					countZero++;
				}
			}
			
			if(countZero==1) {
				arr[i] = convertTheZero(arr[i]);
				
		
			}		
			countZero =0;
			numbers = "123456789";
		}
		return arr;
		
	}
	
	public int[][] columnCheckEmptySpace(int[][] arr) {
		int countZero =0;
		String numbers = "123456789";
		int columnArray[] = new int[9];
		for(int i=0; i<arr.length;i++) {
			
			for(int j=0; j< arr.length;j++) {
				if(arr[j][i]==0) {
					countZero++;
				}
			}
			
			
			
			if(countZero==1) {
				arr[i] = convertTheZero(arr[i]);
				
		
			}		
			countZero =0;
			numbers = "123456789";
		}
		return arr;
		
	}
	
	public int[] convertTheZero(int arr[]) {
		String numbers = "123456789";
		
		for(int h = 0; h< arr.length;h++) {
			// 1 2 0 3 4 5 6 7 8
			if(numbers.contains(arr[h]+"")) {
			
				int index= numbers.indexOf(arr[h]+"");
				numbers= numbers.substring(0, index)+""+numbers.substring(index+1);
			
				//numbers.charAt(index).replace(arr[i][h]+"", "");
			}	
			
		}
		
		for(int h=0; h<arr.length;h++) {
			
			if(arr[h] == 0) {
				System.out.println(arr[h]);
				if(!numbers.isEmpty() && !numbers.equals("123456789"))
					arr[h]= Integer.parseInt(numbers);
			}
			
		}
		
		String checkSingleRow="";
		
		for(int z=0;z< arr.length;z++) {
			checkSingleRow = checkSingleRow+arr[z];
		}
		
		System.out.println("checkSingleRow"+ checkSingleRow);		
		return arr;
		
	}
	
	
	public int[][] splitMatrix(int arr[][], int x,int y) {
		
		
		int newArray[][] = new int[3][3];
			for(int i=0; i< 3;i++) {
				for(int j=0; j<3;j++) {
					newArray[i][j] = arr[3*x+i][3*y+j];
				}
			}
		
		return newArray;
	}
	

	public int[][] splitMatrixColumn(int arr[][], int x,int y) {
		
		
		int newArray[][] = new int[3][3];
			for(int i=0; i< 3;i++) {
				for(int j=0; j<3;j++) {
					newArray[i][j] = arr[3*y+j][3*x+i];
				}
			}
			
			System.out.println("Print column data");
			for(int i=0; i< 3;i++) {
				for(int j=0; j<3;j++) {
				System.out.println(newArray[i][j]);
			}
			}
		return newArray;
	}
	
	public int[][] mergeMatrix(int arr[][], int newArray[][], int x,int y) {
		
		
	//	int newArray[][] = new int[3][3];
			for(int i=0; i< 3;i++) {
				for(int j=0; j<3;j++) {
					arr[3*x+i][3*y+j] = newArray[i][j];
				}
			}
		
		return arr;
	}
	
	public int[][] mergeMatrixColumn(int arr[][], int newArray[][], int x,int y) {
		
		
	//	int newArray[][] = new int[3][3];
			for(int i=0; i< 3;i++) {
				for(int j=0; j<3;j++) {
					arr[3*y+j][3*x+i] = newArray[i][j];
				}
			}
		
		return arr;
	}
	
	
	public int[][] checkZerosInABlock(int arr[][]) {
		
		int count=countZero(arr);
		//int count=1;
		int arraySingleRow[] = new int[9];
		int k=0;
		
		if(count==1) {
			System.out.println("count--");
			for(int p=0; p< 3;p++) {
				for(int q=0; q<3;q++) {
					arraySingleRow[k]= arr[p][q];
					k++;
				}
			}
			
			
			arraySingleRow = convertTheZero(arraySingleRow);
			int indexarraySingleRow=0;
			for(int p=0; p< 3;p++) {
				
				for(int q=0; q<3;q++) {
					arr[p][q] = arraySingleRow[indexarraySingleRow];
					indexarraySingleRow++;
				}
			}
			
		}
		
		return arr;
	}
	
	public int countZero(int arr[][]) {
		int count=0;
		for(int i=0; i<arr.length;i++) {
			
			for(int j=0; j< arr.length;j++) {
				
				if(arr[i][j]==0) {
					count++;
				}
			}
			
		}
		
		return count;
	}
	
	public void print(int arr[][]) {
		String s="";
		for(int j=0;j<arr.length;j++) {
			for(int g=0;g<arr.length; g++) {
				s=s+arr[j][g];
			}
			System.out.println(s);
			s="";
		}
	}
}
