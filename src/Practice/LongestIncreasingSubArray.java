package Practice;

public class LongestIncreasingSubArray {

	static int[] d, L;
	public static void main(String s[]) {

		LongestIncreasingSubArray lis = new LongestIncreasingSubArray();
		int[] array = { 1, 11, 2, 10, 4, 5, 2, 1 };
		int len = array.length;
		d = new int[len];
		L = new int[len];
		lis.findLongestSubArray(array);
		lis.findLongestDecreasingSubArray(array);
		lis.findBitonic(len);
	}

	public void findBitonic(int len) {
		int maxTotal =0;
		for(int i=0; i< len; i++) {
			maxTotal = Math.max(d[i] +L[i]-1, maxTotal);
			
		}
		System.out.println("Bitonic: "+ maxTotal);
	}
	public void findLongestSubArray(int array[]) {

		int len = array.length;
		int maxTotal = 0;
		L[0] = 1;

		for (int i = 1; i < len; i++) {
			int maxValue = 0;
			for (int j = 0; j < i; j++) {
				if (array[i] > array[j]) {
					maxValue = Math.max(maxValue, L[j]);
				}
			}

			L[i] = maxValue + 1;
			maxTotal = Math.max(maxTotal, L[i]);
		}

		System.out.println("Total Max: " + maxTotal);
	}

	public void findLongestDecreasingSubArray(int array[]) {

		int len = array.length;
		
		int maxTotal = 0;
		d[len - 1] = 1;

		for (int i = len - 2; i >= 0; i--) {
			int maxValue = 0;
			for (int j = i + 1; j < len; j++) {
				if (array[i] > array[j]) {
					maxValue = Math.max(maxValue, d[j]);
				}
			}
			d[i] = maxValue + 1;
			maxTotal = Math.max(maxTotal, d[i]);
		}
		System.out.println("Decreasing order: " + maxTotal);
	}
}
