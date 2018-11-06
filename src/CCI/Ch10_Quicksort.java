package CCI;

public class Ch10_Quicksort {
	
	static int array[]= {6,3,2,10,5};
	
	public static void main(String s[]) {
		Ch10_Quicksort quick= new Ch10_Quicksort();
		
		quick.quickSort(array, 0, array.length-1);
		for(int i=0; i< array.length; i++)
			System.out.println(array[i]);
	}
	
	public void quickSort( int array[], int low, int high) {
		
		if(low< high) {
			int pi= partition(array, low, high);
			System.out.println(pi);
			quickSort(array, low, pi-1);
			quickSort(array, pi+1, high);
		}
		
	}
	public int partition(int array[], int low, int high) {
		int i = low-1;
		int pivot= array[high];
		for(int j=low; j< high; j++) {
				
			if(array[j] <= pivot) {
				i++;
				if(i !=j) {
				int temp= array[j];
				array[j]= array[i];
				array[i]= temp;
				}
			}			
		}
		
		//swap
		if((i+1)!=high) {
		int temp= array[i+1];
		array[i+1]= array[high];
		array[high] = temp;
		}
		
		return i+1;
	}
	
}
