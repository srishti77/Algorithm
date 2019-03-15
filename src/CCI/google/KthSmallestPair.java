package CCI.google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KthSmallestPair {

	public static void main(String s[]) {

		KthSmallestPair smallestPair = new KthSmallestPair();
		int[] nums = {2,2,0,1,1,0,0,1,2,0}; 
		
		System.out.println(smallestPair.smallestDistancePair(nums, 1));
	}

	public int smallestDistancePair(int[] nums, int k) {

		 Arrays.sort(nums);
	        int[] arr = new int[nums[nums.length-1] + 1];
	        System.out.println("Size of array: "+arr.length);
	        for(int i=0; i<nums.length; i++){
	            for(int j=i+1; j<nums.length;j++){
	                arr[Math.abs(nums[i] - nums[j])]++;
	            }
	        }

	        int count = 0;
	        for(int i=0; i<arr.length; i++){
	            count += arr[i];
	            if(count >= k) {
	                return i;
	            }
	        }
	        return 0;
	}

}
