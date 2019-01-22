package CCI;

import java.util.Arrays;

public class PredictWinner {
	public static void main(String s[]) {
		int array[] = {1,5,2};
		PredictWinner win = new PredictWinner();
		System.out.println(win.PredictTheWinner(array));
	}
	
		public boolean PredictTheWinner(int[] nums) {
	        
			return minimax(nums, 0, nums.length-1, true) >= 0;
	    }
	    
	    private int minimax(int[] nums, int s, int e, boolean maximizingPlayer){
	        //System.out.println(s+ " "+e +" "+ maximizingPlayer);
	        if (s == e) {
	        	return maximizingPlayer?nums[s]:-nums[s];

	        }
	            
	        if (maximizingPlayer){
	            int max = java.lang.Math.max(
	            minimax(nums, s+1, e, false) + nums[s], 
	            minimax(nums, s, e-1, false) + nums[e]
	            ); 
	            System.out.println("Max: "+s+" - "+e+" - "+max);
	            return max;
	        }
	        else{
	            int min =  java.lang.Math.min(
	            minimax(nums, s+1, e, true) - nums[s], 
	            minimax(nums, s, e-1, true) - nums[e]
	            );
	            System.out.println("Min: "+s+" - "+e+" - "+min);
	            return min;
	        }
	    }
	
}
