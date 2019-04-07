package Practice;

import java.util.ArrayList;
import java.util.List;

public class Combination {
	int totalElement = 2;
	List<List<Integer>> mainList = new ArrayList();

	public static void main(String s[]) {
		Combination com = new Combination();
		com.combineElement(4, 1, 0, new boolean[4 + 1], new ArrayList());
	}

	public void combineElement(int n, int j, int k, boolean[] used, List<Integer> list) {

		if (k == totalElement) {
			mainList.add(new ArrayList<Integer>(list));
			return;
		}

		for (int i = j; i <= n; i++) {
			list.add(i);
			combineElement(n, i + 1, list.size(), used, list);
			list.remove(list.size() - 1);

		}

	}
}
