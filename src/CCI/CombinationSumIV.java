package CCI;

public class CombinationSumIV {
	
	public static void main(String s[]) {
		int[] array = {1,2,3};
		int dp[] = new int[4];
		CombinationSumIV sum = new CombinationSumIV();
		System.out.println(sum.combinationSum(dp, array,4));
	}
	public int combinationSum(int[] dp, int[] array, int target) {
		if(target == 0)
			return 1;
		
		if(dp[target] !=0) {
			return dp[target];
		}
			
		
		int res=0;
		for(int i=0; i<array.length; i++) {
			if(target >= array[i])
			{
				res += combinationSum(dp,array, target-array[i]);
				
			}
		}
		dp[target]= res;

		return dp[target];
		
		
	}
}
