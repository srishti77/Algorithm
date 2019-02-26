package CCI;

public class Ch10_MergeSort {

	public static int[] array = { 6, 3, 2, 10, 5, 1, 14 };

	public static void main(String s[]) {
		Ch10_MergeSort merge = new Ch10_MergeSort();
		merge.mergeSort(array, 0, array.length - 1);
		merge.print();
	}

	public void merge(int[] array, int low, int mid, int high) {
		int[] left = new int[mid - low + 1];
		int[] right = new int[high - mid];

		for (int i = 0; i < left.length; i++) {

			left[i] = array[low + i];

		}
		for (int i = 0; i < right.length; i++) {

			right[i] = array[mid + 1 + i];

		}
		int i = 0, j = 0, k = low;

		while (i < left.length && j < right.length) {

			if (left[i] <= right[j]) {
				array[k] = left[i];
				i++;
			}

			else {
				array[k] = right[j];
				j++;
			}
			k++;
		}
		while (j < right.length) {
			array[k] = right[j];
			j++;
			k++;

		}

		while (i < left.length) {
			array[k] = left[i];
			i++;
			k++;

		}

	}

	public void mergeSort(int arr[], int low, int high) {

		if (low < high) {
			System.out.println("low= " + low + " high= " + high);
			int mid = (low + high) / 2;
			mergeSort(array, low, mid);
			mergeSort(array, mid + 1, high);
			merge(array, low, mid, high);
		}

	}

	public void print() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
