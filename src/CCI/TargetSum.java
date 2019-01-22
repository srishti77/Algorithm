package CCI;

public class TargetSum {
	
	public static void main(String s[]) {
		int array[] = {1,1,1,1,1};
		
		TargetSum targetSum = new TargetSum();
		 System.out.println( targetSum.helper3(array, 3));
		//System.out.println(targetSum.findTargetSumWays(array, 3));
	}

	 public int findTargetSumWays(int[] nums, int S) {
	     System.out.println("called");
		 if(sum(nums) ==S) {
			 return 1;
	     }
		
		int sum =0;
		 for(int i=0; i<nums.length; i++) {
			 
			 int num1[] = nums;
			 num1[i] = -num1[i];	 
			 sum += findTargetSumWays(nums, S) + findTargetSumWays(num1, S);
		 }
		
		 return sum;
	 }
	 
	 
	  int helper3 (int[] nums, int target){
	        if (nums.length == 0) return 0;
	        int sum = 0;
	        for (int i : nums) sum += i;
	        if (sum < Math.abs(target)) return 0;
	        
	        int[][] mem = new int [2 * sum + 1][nums.length+1];
	        mem[sum][0] = 1; // can add up to 0 by selecting no element 
	        System.out.println("Indexes:" +(2*sum+1) +" "+ (nums.length +1));
	        for (int j = 1 ; j < mem[0].length; j++){
	            int n = nums[j-1];
	            for (int i = 1 ; i < mem.length; i++){    
	                int opt1 = i - n;
	                int opt2 = i + n;
	                if (opt1 >=0 && opt1 < mem.length) {
	                	mem[i][j] += mem[opt1][j-1];
	                	System.out.println("opt1: "+" i: "+i+" j: "+j+" "+mem[i][j]);
	                }
	                if (opt2 >=0 && opt2 < mem.length) {
	                	mem[i][j] += mem[opt2][j-1];
	                	System.out.println("opt2: "+" i: "+i+" j: "+j+" "+mem[i][j]);
	                }
	            }
	        }
	        return mem[target + sum][nums.length];
	    }

	private int sum(int[] nums) {
		// TODO Auto-generated method stub
		int sum =0;
		for(int i=0; i< nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
}
