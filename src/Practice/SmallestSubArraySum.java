package Practice;

public class SmallestSubArraySum {
	public static void main(String s[]) {
		int[] array  = {1, 4, 45, 6, 10, 19};
		
		SmallestSubArraySum subArr = new SmallestSubArraySum();
		
		subArr.findLengthSubArray(array, 51);
	}

	public void findLengthSubArray(int[] array, int k) {
		int len = array.length;
		int currentSum = 0;
		int startIndex = 0, endIndex = 0, lengtOfArray = len + 1;

		while (endIndex < array.length && startIndex <= endIndex) {
			if (currentSum >= k) {
				lengtOfArray = Math.min(lengtOfArray, endIndex - startIndex+1);
				currentSum -= array[startIndex];
				startIndex++;
			}
		
			if(currentSum < k) {
				currentSum += array[endIndex];
				endIndex++;
			}
			
			
		}
		System.out.println("Length"+ lengtOfArray);
	}
}
