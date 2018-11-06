package CCI;

public class Ch10_MergeSortedArray {
	
	//traverse through A , find the place when element of B is smaller than the element of A, if so shift the array A element from given location by one
	//add the element in the location
	//
	static int arrayA[] = new int[10];
	static int arrayB[]= {20,30,40};
	public static void main(String s[]) {
		
		arrayA[0]=10;
		arrayA[1]=25;
		arrayA[2]=27;
		arrayA[3]=31;
		arrayA[4]=35;
		arrayA[5]=43;
		
		Ch10_MergeSortedArray merge= new Ch10_MergeSortedArray();
		
		merge.mergeArrays();
		
		for(int i=0; i<10;i++)
			System.out.println(arrayA[i]);
	}
	public void shift(int startingIndex, int prevValue) {
		// free the next element
		//add element 
		//next element becomes prev element in next Iteration
		int temp;
		for(int i=startingIndex; arrayA[i]!=0;i++) {
			temp= arrayA[i];
			arrayA[i] = prevValue;
			prevValue= temp;
		}
	}
	
	public void mergeArrays() {
		int j=0;
		for(int i=0; i<arrayA.length; i++) {
			if(i>= arrayB.length)
				break;
			else {
				if(arrayA[i] > arrayB[j]) {
					shift(i+1, arrayA[i]);
					arrayA[i]= arrayB[j];
					j++;
				}
			}
		}
	}
}
