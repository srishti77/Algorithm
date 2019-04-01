package CCI.google;

public class ShiftedElement {
	public static void main(String s[]) {
		int array[] = { 1, 3, 0, 5 };
		ShiftedElement shiftedEle = new ShiftedElement();
		System.out.println(shiftedEle.search(array, 0));
	}

	public int search(int[] nums, int target) {
		int len = nums.length;
		if(len ==0)
            return -1;
		if (len == 1) {
			if (nums[0] == target)
				return 0;
			else
				return -1;
		}
		if (len == 2) {
			if (nums[0] == target)
				return 0;
			if (nums[1] == target)
				return 1;
			else
				return -1;
		}
		int mid = len / 2;
		int low = 0, high = nums.length;
		return findTarget(nums, target, mid, low, high - 1);

	}

	private int findTarget(int[] nums, int target, int mid, int low, int high) {
		// TODO Auto-generated method stub
		// low and high is same
		if (low == high) {
			if (target == nums[low]) {
				return low;
			} else {
				return -1;
			}
		}

		// if key is low
		if (target == nums[low]) {
			return low;
		}
		// if key == mid
		if (target == nums[mid]) {
			return mid;
		}
		// if key = high
		if (target == nums[high]) {
			return high;
		}

		// if both mid-1 && mid+1 < mid
		// if key > low && key< mid search left
		// else if mid+1 < key< hugh search right
		// eles return -1
		if (mid != 0 && nums[mid - 1] < nums[mid] && nums[mid] < nums[mid + 1]) {

			if (target >= nums[low] && target <= nums[mid]) {
				int newMid = (mid + low) / 2;
				return findTarget(nums, target, newMid, low, mid);
			} else if (nums[mid + 1] <= target && target <= nums[high]) {
				int newMid = (mid + 1 + high) / 2;
				return findTarget(nums, target, newMid, mid, high);
			} else {
				return -1;
			}

		}

		// if both mid-1 && mid+1 > mid
		// if key > low && key< mid-1 search left
		// else if mid < key< hugh search right
		// else return -1

		else if (mid != 0 && nums[mid - 1] > nums[mid] && nums[mid] > nums[mid + 1]) {

			if (target >= nums[low] && target <= nums[mid - 1]) {
				int newMid = (mid + low) / 2;
				return findTarget(nums, target, newMid, low, mid);
			} else if (nums[mid] <= target && target <= nums[high]) {
				int newMid = (mid + 1 + high) / 2;
				return findTarget(nums, target, newMid, mid, high);
			} else {
				return -1;
			}

		}

		// if mid ==low if mid> mid-1 mid < mid +1
		// proper order

		// if low<key< mid
		// search in the left

		// else if(mid<key< high
		// search right

		else {
			if (nums[low] <= target && target <= nums[mid]) {
				int newMid = (mid + low) / 2;
				return findTarget(nums, target, newMid, low, mid);
			}

			else if (nums[mid + 1] <= target && target <= nums[high]) {
				int newMid = (mid + 1 + high) / 2;
				return findTarget(nums, target, newMid, mid + 1, high);
			}
			// if key >low and key >mid
			// search left;

			else if (target >= nums[low] && target >= nums[mid]) {
				int newMid = (mid + low) / 2;
				return findTarget(nums, target, newMid, low, mid);
			}

			// if key <mid and key < high
			// search right
			else if (target <= nums[mid + 1] && target <= nums[high]) {
				int newMid = (mid + 1 + high) / 2;
				return findTarget(nums, target, newMid, mid + 1, high);
			} else {
				return -1;
			}

		}
	}
}
