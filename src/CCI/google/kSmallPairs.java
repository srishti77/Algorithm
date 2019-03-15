package CCI.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class kSmallPairs {

	public static void main(String s[]) {

		kSmallPairs kSmall = new kSmallPairs();
		int[] nums1 = { 1, 7, 11 };
		int[] nums2 = { 2, 4, 6 };
		
		List<int[]> list =  kSmall.kSmallestPairs(nums1, nums2, 3);
		kSmall.print(list);
		
	}
	
	public void print(List<int []> list) {
		
		for(int[] array: list) {
			
			System.out.println(array[0]+ " "+ array[1]);
		}
	}

	public List<int[]> kSmallestPairs(int[] num1, int[] num2, int k) {
		Queue<int[]> queue = new PriorityQueue<>(k, (a, b) -> (b[0] + b[1] - a[0] - a[1]));

		for (int n1 : num1) {
			for (int n2 : num2) {

				int[] a = new int[] { n1, n2 };
				int sum = n1 + n2;
				if (queue.size() >= k) {
					int[] max = queue.peek();

					if (max[0] + max[1] > sum) {
						queue.poll();
						queue.offer(a);
					}
				} else {
					queue.offer(a);
				}

			}
		}

		List<int[]> list = new ArrayList();
		while (!queue.isEmpty()) {
			list.add(queue.poll());
		}

		Collections.reverse(list);
		return list;

	}

}
