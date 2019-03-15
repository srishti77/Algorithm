package CCI.google;

import java.util.Arrays;

public class SortedTransformedArray {

	public static void main(String s[]) {

		SortedTransformedArray transformed = new SortedTransformedArray();
		int[] nums = { -4, -2, 2, 4 };
		transformed.print(transformed.sortTransformedArray(nums, -1, 3, 5));

	}

	public void print(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
		int len = nums.length;
		int[] result = new int[len];

		for (int i = 0; i < len; i++) {
			result[i] = (a * nums[i] * nums[i]) + (b * nums[i]) + c;

		}
		Arrays.sort(result);
		// System.out.println(result.length);
		return result;
	}
}
