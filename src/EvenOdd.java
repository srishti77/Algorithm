
public class EvenOdd {

	public static void main(String args[]) {
		
		int[] array= {1,0,1,0,0,1,1};
		
		for(int i=0; i<array.length-1;i++) {
			
			if(array[i]%2!=0) {
				//System.out.println("Value "+array[i]);
				int temp= array[i];
				System.arraycopy(array, i+1, array, i, array.length-i-1);
				array[array.length-1]=temp;
				
			}
			
		}
		
	}
}
