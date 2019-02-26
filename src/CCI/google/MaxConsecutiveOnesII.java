package CCI.google;

/*
 * 1,0,1,1,0
 * 
 * output= 4
 * flip the 0 at index =1
 */
public class MaxConsecutiveOnesII {

	MaxConsecutiveOnes ones = new MaxConsecutiveOnes();

	public static void main(String s[]) {
		int nums[] = { 1, 0, 1, 1, 0 };
		MaxConsecutiveOnesII ones2= new MaxConsecutiveOnesII();
		System.out.println(ones2.flipElement(nums));
	}

	public int flipElement(int[] nums) {
		int maxElement = findMaxConsecutiveOnes(nums, -1);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				maxElement = Math.max(maxElement, findMaxConsecutiveOnes(nums, i));
			}
		}
		return maxElement;
	}

	public int findMaxConsecutiveOnes(int[] nums, int index) {
		int maxConsecutiveOnes = 0;
		int consecutive = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 0 && i != index) {
				maxConsecutiveOnes = Math.max(maxConsecutiveOnes, consecutive);
				consecutive = 0;
			} else {
				consecutive++;
			}
		}

		maxConsecutiveOnes = Math.max(maxConsecutiveOnes, consecutive);
		return maxConsecutiveOnes;
	}
}
