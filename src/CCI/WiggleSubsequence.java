package CCI;

public class WiggleSubsequence {

	public static void main(String s[]) {

		WiggleSubsequence wiggle = new WiggleSubsequence();
		int nums[] = {1,1,7,4,9,2,5};
		System.out.println(wiggle.wiggleMaxLength(nums));

	}

	public int wiggleMaxLength(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		if (nums.length <= 2) {
			return 1;
		}
		boolean positive = false;
		int count = 1;
		int firstDiff =1;
		for (int i = 1; i < nums.length; i++) {

			if( firstDiff == 1) {
				int diff = nums[i-1] -nums[i];
				if (diff > 0) {
					positive = true;
					count++;
                    firstDiff =0;
				} else if (diff < 0)  {
					positive = false;
					count++;
                    firstDiff =0;
				}
				
			} else if (positive) {
				int diff = nums[i - 1] - nums[i];
				if (diff < 0) {
					count++;
					positive = false;
				}

			} else if (!positive) {
				int diff = nums[i - 1] - nums[i];
				if (diff > 0) {
					count++;
					positive = true;
				}

			}
		}
		return count;
	}
}
