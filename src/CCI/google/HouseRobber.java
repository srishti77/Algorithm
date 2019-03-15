package CCI.google;

public class HouseRobber {
	int totalSum = 0;

	public static void main(String s[]) {

		HouseRobber house = new HouseRobber();

		int[] nums = { 1, 3, 1, 3, 100 };

		System.out.println(house.rob(nums));

	}

	public int rob(int[] nums) {
		int len = nums.length;

		for (int i = 0; i < len; i++) {
			boolean visited[] = new boolean[len];
			visited[i] = true;
			totalSum = Math.max(totalSum, robHouses(nums, i , visited, 0));
		}

		return totalSum;
	}

	private int robHouses(int[] nums, int i, boolean[] visited, int sum) {
		int len = nums.length - 1;
		System.out.println("RobHouses");
		if (i == len && !visited[0]) {

			sum += nums[i];
			visited[i] = true;

			return sum;

		} else if (i == len && visited[0] || i >= len + 1) {
			System.out.println("here");
			return sum;
		}
		visited[i] = true;
		return robHouses(nums, i + 2, visited, sum + nums[i]);
	}
}
