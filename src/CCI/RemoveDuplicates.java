package CCI;

public class RemoveDuplicates {
	public static void main(String args[]) {
		int nums[]= {0,0,1,1,1,2,2,3,3,4};	
		System.out.println(removeDuplicates(nums));
	}
	
	  public static int removeDuplicates(int[] nums) {
	        if(nums.length ==0)
	            return 0;
	        int availIndex = 0;
	        int prev = nums[0];
	        int count =0;
	        for(int i=1; i< nums.length; i++){
	            
	            if(prev != nums[i]){
	                availIndex++;
	              
	                nums[availIndex] = nums[i];
	                prev = nums[i];
	               
	            }
	            else {
	            	  count++;
	            }
	            
	        }
	        return nums.length-count;
	    }
}
