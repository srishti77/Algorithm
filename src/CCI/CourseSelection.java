package CCI;

import java.util.Arrays;
import java.util.LinkedList;

public class CourseSelection {
	public static void main(String s[]) {

		CourseSelection select = new CourseSelection();
		int[][] prerequisites = { { 1, 0 }};
		System.out.println(select.canFinish(2, prerequisites));
	}

	public boolean canFinish(int numCourses, int[][] prerequisites) {

		int[] pCounter = new int[numCourses];
		Arrays.fill(pCounter, 0);
		int length = prerequisites.length;

		for (int i = 0; i < length; i++) {
			pCounter[prerequisites[i][0]]++;
		}

		LinkedList<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i < numCourses; i++) {
			if (pCounter[i] == 0) {
				queue.add(i);
			}
		}

		int courseWithNoPre = queue.size();
		while (!queue.isEmpty()) {
			int top = queue.pop();
			for (int i = 0; i < length; i++) {

				if (top == prerequisites[i][1]) {
					pCounter[prerequisites[i][0]]--;
					if (pCounter[prerequisites[i][0]] == 0) {
						courseWithNoPre++;
						queue.add(prerequisites[i][0]);

					}
				}
			}
		}

		return courseWithNoPre == numCourses;
	}
}
