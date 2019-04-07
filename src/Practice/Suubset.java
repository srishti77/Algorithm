package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Suubset {
	Set<List<Integer>> set = new HashSet();

	public static void main(String s[]) {
		Suubset subset = new Suubset();
		int nums[] = { 4, 4, 4, 1, 4 };
		Arrays.sort(nums);
		subset.subsetWithDups(nums, 0, new ArrayList<Integer>());
		subset.print();
	}

	public void print() {
		for (List<Integer> list : set) {
			System.out.println(list);
		}
	}

	public void subsetWithDups(int nums[], int j, List<Integer> list) {

		if (j > nums.length) {
			return;
		}

		set.add(new ArrayList(list));

		for (int i = j; i < nums.length; i++) {
			list.add(nums[i]);
			subsetWithDups(nums, i + 1, list);
			// System.out.println(liused[i] = false;
			list.remove(list.size() - 1);

		}

		// return set;

	}
}
