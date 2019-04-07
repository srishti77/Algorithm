package Practice;

import java.util.Arrays;

public class RelativeSorting {
	public static void main(String s[]) {

		RelativeSorting relativeSorting = new RelativeSorting();
		int[] A1 = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
		int A2[] = { 2, 1, 8, 3 };
		A1 =relativeSorting.sortAccordingly(A1, A2);

		for(int i=0; i<A1.length; i++) {
			System.out.println(A1[i]);
		}
	}

	int first(int arr[], int low, int high, int x) {

		if (low <= high) {
			int mid = (low + high) / 2;

			if ((mid == 0 || arr[mid - 1] < x) && arr[mid] == x) {
				return mid;
			} else if (arr[mid] > x) {
				return first(arr, low, mid - 1, x);
			} else {
				return first(arr, mid + 1, high, x);
			}
		}

		return -1;
	}

	int[] sortAccordingly(int A1[], int A2[]) {
		int m = A1.length;
		int n = A2.length;

		int[] temp = new int[m], visited = new int[m];

		for (int i = 0; i < m; i++) {
			visited[i] = 0;
			temp[i] = A1[i];
		}

		Arrays.sort(temp);
		int ind = 0;

		for (int i = 0; i < n; i++) {

			int f = first(temp, 0, m - 1, A2[i]);

			if (f == -1)
				continue;

			for (int j = f; (j < m && temp[j] == A2[i]); j++) {
				A1[ind++] = temp[j];
				visited[j] = 1;
			}
		}

		for (int p = 0; p < m; p++) {
			if (visited[p] == 0) {
				A1[ind++] = temp[p];
				visited[p] = 1;
			}
		}

		return A1;
	}

}
