package CCI.google;

import java.util.List;
import java.util.ArrayList;

public class NextGreater {

	public static void main(String s[]) {

		int[] num1 = { 2, 4 };
		int[] num2 = { 1, 2, 3, 4 };

		NextGreater next = new NextGreater();
		int[] arrayOfInt = next.nextGreaterElement(num1, num2);
		next.print(arrayOfInt);
		
	}

	public void print(int res[]) {

		for (int i = 0; i < res.length; i++)
			System.out.println(res[i]);
	}

	public int[] nextGreaterElement(int[] nums1, int[] nums2) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < nums1.length; i++) {
			list.add(findNextGreat(nums1[i], nums2));
		}

		int array[] = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}

		return array;
	}

	public int findNextGreat(int num, int nums2[]) {

		boolean found = false;

		int i = 0;
		for (i = 0; i < nums2.length; i++) {
			if (nums2[i] == num) {
				found = true;
				continue;
			}

			if (found) {
				if (nums2[i] > num)
					break;
			}
		}
		if (i >= nums2.length)
			return -1;
		return nums2[i];
	}

}
