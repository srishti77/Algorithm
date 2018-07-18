import java.util.Arrays;

public class KthLargest {

	public static void main(String args[]) {
		
		int[] array= {9,3,2,4,8}; 
		int k=3;
				
		/*for(int i=0; i<array.length;i++) {
			for(int j=i+1; j< array.length;j++) {
				
				if(array[i] < array[j]) {
					int temp= array[i];
					array[i]= array[j];
					array[j]= temp;
				}
			}
		}*/
		
		
		 for (int i = 1; i < array.length; i++)
	        {
	            int x = array[i];
	 
	            // Find location to insert using binary search
	            int j = Math.abs(Arrays.binarySearch(array, 0, i, x) + 1);
	 
	            //Shifting array to one location right
	            System.arraycopy(array, j, array, j+1, i-j);
	 
	            //Placing element at its correct location
	            array[j] = x;
	        }
		
		 for(int p=0;p<array.length;p++)
			 System.out.println(array[p]);
		
		
	}
	
	
}
