package CCI.google;

public class ProductArray {
	int left[], right[];

	public static void main(String s[]) {

		int array[] = { 1, 2, 3, 4 };
		ProductArray prod = new ProductArray();

		int[] out = prod.productExceptSelf(array);
		prod.print(out);
	}

	public void print(int[] output) {
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

	public int[] productExceptSelf(int[] nums) {

		int len = nums.length;
		int output[];
		if (len == 0) {
			return null;
		} else if (len == 1) {
			output = new int[len];
			output[0] = nums[0];
			return output;
		}

		else if (len == 2) {
			output = new int[2];
			output[0] = nums[1];
			output[1] = nums[0];
			return output;
		}
		output = new int[len];
		left = new int[len];
		right = new int[len];
		left[0] = 0;
		left[1] = nums[0];
		right[len - 1] = 0;
		right[len - 2] = nums[len - 1];

		for (int i = 2; i < nums.length; i++) {
			left[i] = left[i - 1] * nums[i - 1];
		}

		for (int i = len - 3; i >= 0; i--) {
			right[i] = right[i + 1] * nums[i + 1];
		}

		output[0] = right[0];
		output[len - 1] = left[len - 1];

		for (int i = 1; i < len - 1; i++) {
			output[i] = left[i] * right[i];
		}
		return output;
	}
}
