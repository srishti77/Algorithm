import java.util.ArrayList;

public class SortArray {

	ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String args[]) {
		
		int[] A= {1,2,3,4};

		int[] B		= {2,4,5,6};
		SortArray sortA=new SortArray();
		sortA.merge(A,B);
		
	}
	
	public int[] merge(int[] array1, int[] array2) {
		
		int j=0;
		int i=0;
		while( i<array1.length && j< array2.length ) {
		
				
				if(array1[i]< array2[j]){
					list.add(array1[i]);
					i++;
					
				}
				
				else if(array1[i]== array2[j]){
					list.add(array1[i]);
					i++;
					j++;
					
				}

				else if(array1[i]> array2[j]){
					list.add(array2[j]);
					j++;
				}
				
				
			}
		if(i< array1.length) {
			while(i< array1.length) {
				list.add(array1[i]);
				i++;
			}
		}
		
		if(j< array2.length) {
			while(j< array2.length) {
				list.add(array2[j]);
				j++;
			}
		}
		
		
		for(int p=0; p<list.size();p++)
			System.out.println(list.get(p));
		
		int[] array = new int[list.size()];
		for(int p=0;p<list.size();p++) {
			array[p] = list.get(p);
		}
		
		return array;
	}
	
	
		
}
