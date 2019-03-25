package Practice;

import java.util.ArrayList;
import java.util.List;

public class MooreAlgo {

	public static void main(String s[]) {

		MooreAlgo mooreAlgo = new MooreAlgo();
		int[] nums = { 1, 1, 1, 2, 2, 3, 3, 3 };
		
		System.out.println(mooreAlgo.majorityElement(nums));
	}

	public List<Integer> majorityElement(int[] nums) {

		List<Integer> list = new ArrayList<Integer>();
		int n = nums.length / 3;
		int count = 1, majIndex = 0;
		for (int i = 1; i < nums.length; i++) {

			if (nums[i] == nums[majIndex]) {
				count++;
			} else {
				count--;
			}

			if (count > n) {
				list.add(nums[majIndex]);
				majIndex += 1;
				count = 1;
			}

			if (count == 0) {

				majIndex += 1;
				count = 1;
			}
		}

		return list;
	}

}
