package CCI;

public class RotatedSortedArray {
	public static void main(String s[]) {

		int nums[] = { 1, 3, 5 };
		RotatedSortedArray arr = new RotatedSortedArray();

		System.out.println(arr.search(nums, 2));
	}

	public int search(int[] nums, int target) {

		
		return searchTarget(nums, target, 0, nums.length - 1);
	}

	public int searchTarget(int[] nums, int target, int left, int right) {
		if (right-left <= 2) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == target)
					return i;
			}
			return -1;
		}
		if (left > right)
			return -1;

		int mid = (right + left) / 2;
		System.out.println("Mid"+mid);
		if (nums[mid] == target) {

			return mid;
		}

		else if (nums[mid] < nums[mid - 1] && nums[mid] < nums[mid + 1]) {
			if (target >= nums[left])
				return searchTarget(nums, target, left, mid - 1);
			else
				return searchTarget(nums, target, mid + 1, right);
		} else if (nums[mid] > target && nums[left] <= target) {

			return searchTarget(nums, target, left, mid - 1);
		} else {
			return searchTarget(nums, target, mid + 1, right);
		}

	}
}
