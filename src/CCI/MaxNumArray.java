package CCI;

public class MaxNumArray {
	
	 public int maxSubArray(int[] nums) {
		 
		 if(nums.length ==0)
	         return 0;
	     int prevValue = nums[0];
	     int value= prevValue;
	     for(int i=1; i<nums.length; i++){
	      if(nums[i] < prevValue + nums[i])
	    	 prevValue =  prevValue + nums[i];     
	     
	     else {
	    	prevValue = nums[i]; 
	     }
	      value = Math.max(prevValue, value);
	     }
	     return value;
	 }
	 
	 public static void main(String s[]) {
		 
		 int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		 MaxNumArray maxNum = new MaxNumArray();			 
		 System.out.println(maxNum.maxSubArray(nums));
		 
	 }
}
