
public class PriorityQueue {

	public static void main(String args[]) {
		
		int array[] = {35,26,34,15,24,33,4,12,1,23,21,2,5};
		
		PriorityQueue priority = new PriorityQueue();
		
		array = priority.delete(array);
		
		for(int j = 0; j< array.length; j++)
			System.out.println(array[j]);
		
		
	}
	
	public int[] delete(int array[]) {
		int size = array.length;
		array[0] = array[size-1];
		array[size-1] = 0;
		int small;
		for(int i =0; (2*i+1) <size;) {
			if((2*i+2) < size) {
				small = biggest((2*i+1), (2*i+2), array);
			}
			else
			small = 2*i+1;
			
			if(array[i] < array[small]) {
				int temp = array[i];
				array[i] = array[small];
				array[small] = temp;
				i= small;
			}
			
			else
				break;
			
		}
		return array;
	}
	
	public int biggest(int a1, int a2, int[] array) {
		
		if(array[a1] > array[a2])
			return a1;
		else
			return a2;
	}
	
	
}
