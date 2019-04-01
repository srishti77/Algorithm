package mockinterview;

public class MergeSortedArray {
	public static void main(String s[]) {
		int nums1[] = { 1, 2, 3, 0, 0, 0 };
		int nums2[] = { 2, 5, 6 };

		MergeSortedArray sortedArray = new MergeSortedArray();
		sortedArray.merge(nums1, 3, nums2, 3);
	
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int i = 0, j = 0;
		int q=0;
		while (i < (m + n) && j < n && q<m) {
			if (nums1[i] > nums2[j]) {
				shiftValue(nums1, i);
				nums1[i] = nums2[j];
				i++;
				j++;
			} else {
				i++;
				q++;
			}	
		}
		
		while(j<n) {
			nums1[i] = nums2[j];
			i++;
			j++;
			q++;
		}
		
	}

	private void shiftValue(int[] nums1, int i) {
		// TODO Auto-generated method stub
		int prev = nums1[i];
		for (int j = i + 1; j < nums1.length; j++) {
			int temp = nums1[j];
			nums1[j] = prev;
			prev = temp;
		}
	}
}
