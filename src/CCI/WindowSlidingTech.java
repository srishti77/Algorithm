package CCI;

public class WindowSlidingTech {
	
	public static void main(String s[]) {
		int array[] = {5,2,-1,0,3};
		findMaxSum(array, 3);
	}
	
	public static void findMaxSum(int array[], int k) {
		
		int maxSum = 0, currentSum=0;
		
		for(int i=0; i<k;i++) {
			currentSum = array[i]+currentSum;
			maxSum= currentSum;
		}
		
		for(int j=0; j< array.length-k; j++) {
			
			currentSum= currentSum -array[j]+ array[k+j];
			maxSum = Math.max(currentSum, maxSum);
		}
		
		System.out.println("Max sum is"+maxSum);
	}
	
}
