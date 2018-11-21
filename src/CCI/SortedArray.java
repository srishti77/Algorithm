package CCI;

public class SortedArray {
	
	public static void main(String s[]) {
		int[] array = {15,16,19,20,21, 1, 3, 6, 7,8,9,10,11,12};
		int last= array.length-1;
		System.out.println(findRotateArray(array,0, last, array[last]));
	}
	
	public static int findRotateArray(int[] array, int left, int right, int finalEle) {
		
		if(left < right) {
			int mid= (left+right)/2;
			
			if(array[mid] > array[mid-1] && array[mid] > array[mid+1]) {
				System.out.println("First"+array[mid]);
				return mid+1;
				
			}
			
			else if(array[mid] < finalEle) {
				System.out.println("second "+array[mid]);
				return findRotateArray(array, left, mid-1, finalEle);
			}
			
			else if(array[mid] > finalEle) {
				System.out.println("third "+array[mid]);
				return findRotateArray(array, mid+1, right, finalEle);
			}
				
		}
		
		return -1;
	}
}
