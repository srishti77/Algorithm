package CCI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	
	// closest
	static int nums[] = {0,5,-1,-2,4,-1,0,-3,4,-5};
	public static void main(String s[]) {
		
	
		Arrays.sort(nums);
		int len = nums.length;
		int target =5;
		int diff = Integer.MAX_VALUE;
		int closestSum =0;
		
		for(int i=0; i<  len-2; i++) {
			int l=i+1;
			int r= len-1;
			
			while(l <r) {
				int sum = nums[i]+nums[l]+ nums[r];
				int gap = Math.abs(sum-target);
				
				if(Math.min(diff, gap) == gap) {
					diff = gap;
					closestSum = sum;
				}
				
				if( gap == 0) {
					closestSum = sum;
					break;
				}
				
				else if(sum >target) {
					r--;
				}
				else
					l++;		
			}
		}
		System.out.println(closestSum);
	}
	
}
