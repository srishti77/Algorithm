package CCI.google;

public class FirstPositive {
	
	public static void main(String s[]) {
		
		int array[] = { 1,2,0 };
		FirstPositive positive = new FirstPositive();
		int size = array.length;
		int shift = positive.segregateArray(array, size);
		System.out.println("Shift "+shift);
		int j=0;
		int array2[] = new int[size-shift];
		for(int i=shift; i< size; i++) {
			array2[j] = array[i];
			j++;
		}
				
		System.out.println(positive.findPositive(array2, array2.length));
		
	}
	
	public int segregateArray(int array[], int size) {
		
		int j=0;
		
		for(int i=0; i<size; i++) {
			
			if(array[i] <= 0) {
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
				
				j++;
			}
		}
		
		return j;
	}
	
	
	public int findPositive(int array[], int size) {
		
		for(int i=0; i<size; i++) {
			
			int x = Math.abs(array[i]);
			
			if(x-1 < size && x-1 >= 0 && array[x-1] >0) {
				array[x-1] = -array[x-1];
			}
		}
		
		
		for( int i=0; i<size; i++) {
			if(array[i] >0) {
				return i+1;
			}
		}
		
		return size+1;
		
	}
}
