package CCI;
public class KnotHash {

	public static void main(String args[]) {
		
		int array[] = {0,1,2,3,4};
		int lengthArray[] = {
				3,4,1,5
		};
		
		int currentP = 0;
		int skip=0;
		
		
		for(int j = 0; j<lengthArray.length; j++) {
			int arraySize = lengthArray[j];
			int newArray[] = new int[arraySize];
			int backupCP = currentP;
			for(int i = 0 ; i<lengthArray[j]; i++) {
				
				if(currentP < array.length) {
					
					newArray[i] = array[currentP];
				}
			
				else {
					currentP = 0;
					newArray[i] = array[currentP];
				}
				currentP++;
				
			}
			
			
			System.out.println(arraySize +"-----------------");
			printData(newArray);
			System.out.println("Reverse String----------");
			newArray = reverse(newArray);
			
			
			for(int i = 0 ; i<lengthArray[j]; i++) {
				
				if(backupCP < array.length) {
					
					array[backupCP] = newArray[i];
				}
			
				else {
					backupCP = 0;
					array[backupCP] = newArray[i] ;
				}
				backupCP++;
				
			}
			
			
			printData(array);
			
		
			
			currentP = arraySize + skip;
			
			System.out.println("Current --"+currentP);
			if(currentP > array.length-1)
				currentP = currentP - array.length;
			skip++;
			
			
		}
		
		
		
		
		
	}
	static void printData(int array[]) {
		
		for(int i = 0;i < array.length;i++) {
			System.out.println(array[i]);
		}
	}
	
	static int[] reverse(int arrayToReverse[]) {
		
		for(int k = 0 ; k< arrayToReverse.length/2; k++) {
			int temp = arrayToReverse[k];
			arrayToReverse[k] = arrayToReverse[arrayToReverse.length-k-1];
			 arrayToReverse[arrayToReverse.length-k-1] = temp;
		}
		
		printData(arrayToReverse);
		return arrayToReverse;
	}
	
	void generateInput(int input[]) {
		
		for(int i = 0; i< 256; i++) {
			
			
			
		}
	}
	
}
