package mockinterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

class Pair {
	double value;
	int[] array = new int[2];

	Pair(double value, int[] array) {
		this.value = value;
		this.array = array;
	}
}

public class KClosestPoint {

	public static void main(String s[]) {
		int[][] points = { { 1, 3 }, { -2, 2 } };
		int k = 1;
		KClosestPoint kClose = new KClosestPoint();
		kClose.kClosest(points, 1);

	}

	public int[][] kClosest(int[][] points, int K) {

		ArrayList<Pair> list = new ArrayList<>();

		for (int[] point : points) {
			double diff = Math.abs((point[0] * point[0]) + (point[1] * point[1]));
			double value = Math.sqrt(diff);

			list.add(new Pair(value, point));
		}

		Collections.sort(list, new Comparator<Pair>() {
			@Override
			public int compare(Pair o1, Pair o2) {
				if(o1.value < o2.value) return -1;
				if(o1.value > o2.value) return 1;
				return 0;
			}
		});
		int[][] element = new int[list.size()][2];
		int i = 0;
		for (Pair pair : list) {
			if (K > 0) {
				element[i] = pair.array;
				i++;
				K--;
			} else {
				break;
			}

		}

		for(Pair l : list) {
			System.out.println(l.value+" "+l.array[0]+ " "+ l.array[1]);
		}
		return element;

	}
}
