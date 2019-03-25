package Practice;

import java.util.Arrays;

public class ReorderInPeek {
	public static void main(String s[]) {
		
		ReorderInPeek reOrder = new ReorderInPeek();
		
		int[] nums = {3,5,2,1,6,4};
		
		reOrder.wiggleSort(nums);
	}
	  public void wiggleSort(int[] nums) {
	      
		  Arrays.sort(nums);
		  int len = nums.length;
		 for(int i=1; i<len; i+=2) {
			  shift(nums, i);
		 }
		
		 for(int i=0; i<len; i++ ) {
			  System.out.println(nums[i]);
		  }
	  }
	private void shift(int nums[], int i) {
		// TODO Auto-generated method stub
		int len = nums.length;
		int last = nums[len-1];
		int curr;
		
		for(int p = i; p< len; p++) {
			curr = nums[p];
			nums[p] = last;
			last = curr;
		}
		
		
	}
}
