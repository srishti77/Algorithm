package Practice;

public class LongestSubseqAvgK {

	public static void main(String s[]) {

		LongestSubseqAvgK longest = new LongestSubseqAvgK();
		int[] array = { 1, 3, 2, 5, 4 };
		int k = 3;
		System.out.println(longest.findLongestSubSeqAvg(array, k));

	}

	public int findLongestSubSeqAvg(int[] array, int k) {
		int len = array.length;
		int avg[] = new int[len];
		int sum = 0;

		for (int i = 0; i < len; i++) {

			sum += array[i];
			double value = (double) sum / (double) (i + 1);
			avg[i] = (int) (value+1);
			System.out.println(value + " --  "+ avg[i]);
		}
		int i;
		for (i = len - 1; i >= 0; i--) {
			System.out.println("Avg: "+ avg[i]+ " -- "+ k);
			if (avg[i] <= k) {
				break;
			}
		}

		return (i+1);
	}
}
