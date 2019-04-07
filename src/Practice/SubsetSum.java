package Practice;

import java.util.ArrayList;

public class SubsetSum {

	public static void main(String s[]) {

		int[] num = { 5, 10, 12, 13, 15, 18 };
		SubsetSum subset = new SubsetSum();

		subset.findSubSets(num, 0, 0, new boolean[num.length], 30, new ArrayList());

	}

	public int findSubSets(int num[], int j, int sum, boolean used[], int target, ArrayList<Integer> list) {

		if (sum > target) {
			return 0;
		}
		if (sum == target) {
			System.out.println("List: " + list);
			return 0;
		}

		for (int i = j; i < num.length; i++) {

			list.add(num[i]);
			findSubSets(num, i + 1, sum + num[i], used, target, list);
			list.remove(list.size() - 1);

		}
		return 0;
	}

}
