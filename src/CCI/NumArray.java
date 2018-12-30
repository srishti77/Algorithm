package CCI;

class NumArray {
    
    int memo[];
    
    public NumArray(int[] nums) {
      
        memo = new int[nums.length+1];    
        for(int i=0; i<nums.length; i++)
        	memo[i+1] =memo[i]+nums[i]; 
    }
    
    public int sumRange(int i, int j) {
      return memo[j+1]-memo[i];
    
    }
    
    public static void main(String s[]) {
    	
    	int number[] = {-2, 0, 3, -5, 2, -1};
    	NumArray array = new NumArray(number);
    	System.out.println(" Number is: "+array.sumRange(0, 2)+ " new "+ array.sumRange(2, 5) +" again "+ array.sumRange(0, 5) );
    	
    	
    }
    
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
