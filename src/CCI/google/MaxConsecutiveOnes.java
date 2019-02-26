package CCI.google;

public class MaxConsecutiveOnes {
	
	public static void main(String s[]) {
		
		int nums[] = {1,1,0,1,1,1};
		
		MaxConsecutiveOnes maxConsec =new MaxConsecutiveOnes();
		
		System.out.println(maxConsec.findMaxConsecutiveOnes(nums));
	}

	public int findMaxConsecutiveOnes(int[] nums) {
		int maxConsecutiveOnes = 0;
		int consecutive = 0;
		
		for( int i=0; i< nums.length; i++) {
			
			if(nums[i] == 0) {
				maxConsecutiveOnes = Math.max(maxConsecutiveOnes, consecutive);
				consecutive =0;
			}
			else {
				consecutive++;
			}
		}
		
		
		maxConsecutiveOnes = Math.max(maxConsecutiveOnes, consecutive);
		return maxConsecutiveOnes;
	}
}
