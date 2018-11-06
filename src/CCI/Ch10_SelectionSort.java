package CCI;

public class Ch10_SelectionSort {
	static int array[]= {6,3,2, 10,5};
	
	public static void main(String arr[]) {
		Ch10_SelectionSort selection = new Ch10_SelectionSort();		
		selection.selectionSort(array);
		selection.print();
	}
	
	public void selectionSort(int array[]) {
		
		for(int i=0; i < array.length-1; i++) {
			int min_idx=i;
			
			for(int j=i+1; j<array.length; j++) {
				
				if(array[j] < array[min_idx]) {				
					min_idx= j;	
					
					if(min_idx != i) {
						int temp= array[i];
						array[i]= array[min_idx];
						array[min_idx]= temp;
					}						
				}
			
			}
		}				
	}
	
	public void print() {
		for(int i=0; i< array.length; i++) {
			System.out.println(array[i]);
		}
	}	
}
