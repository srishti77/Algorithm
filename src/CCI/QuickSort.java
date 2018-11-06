package CCI;

public class QuickSort {

	public static void main(String s[]) {
		
		int array[]= {2,6,7,5,3,4};
		QuickSort quick= new QuickSort();
		quick.quicksort(array, 0, array.length-1);
		
		for(int i=0; i<array.length;i++)
			System.out.println(array[i]);
	}
	
	public void quicksort(int array[], int low, int high) {
		if(low < high) {
		int part= partition(array, low, high);
		quicksort(array, low, part-1);
		quicksort(array, part, high);
		}
	}

	private int partition(int[] array, int low, int high) {
		// TODO Auto-generated method stub
		
		int i=low-1;
		
		int pivot= array[high];
		for(int j=low; j< high; j++) {
			
			if(array[j]<= pivot) {
				i++;
				if(i != j) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}		
	
		}
		
		if((i+1)!= high) {
			
			int temp= array[i+1];
			array[i+1]= array[high];
			array[high]= temp;
			
		}
		
		return i+1;
	}
}
