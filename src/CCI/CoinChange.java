package CCI;

public class CoinChange {
	public static void main(String s[]) {
		
		int coins[] = {1,2,5};
		int amount = 5;
		
		CoinChange coin = new CoinChange();
		System.out.println(coin.change(amount, coins));
	}
	
	  public int change(int amount, int[] coins) {
	        int[] dp = new int[amount + 1];
	        dp[0] = 1;        
	        for (int j = 0; j < coins.length; j++) {
	        	int res=0;
	            for (int i = 1; i <= amount; i++) {
	                if (i - coins[j] >= 0) {
	                	
	                    res += dp[i - coins[j]];
	               }
	            }
	            if(dp[j] != 0)
	            	dp[j] = Math.min(dp[j], res);
	            else
	            	dp[j] = res;
	            
	        }
	        return dp[amount];
	    }
	    
}
