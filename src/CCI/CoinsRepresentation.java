package CCI;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CoinsRepresentation {
	Set<String> set = new HashSet<String>();
	
	
	Map<Integer,Integer> amountDict = new HashMap<Integer,Integer>();
	
	public static void main(String s[]) {
		
		int array[] = {1,2,5};
		CoinsRepresentation coins = new CoinsRepresentation();
		int n =5;
		int[] dp = new int[n+1];
		dp[0] =1;
		
		System.out.println(coins.coinChange(array,n));
	}

    public int coinChange(int[] coins, int amount) {
        if(amount==0)
            return 0;
        if(amountDict.containsKey(amount))
            return amountDict.get(amount);
        int n = amount+1;
        for(int coin : coins) {
            int curr = 0;
            if (amount >= coin) {
                int next = coinChange(coins, amount-coin);
               
                if(next >= 0)
                    curr = 1+next;
                
                System.out.println("current and next: "+coin+" curr and next "+curr + " "+ next);
            }
            if(curr > 0)
                n = Math.min(n,curr);
        }
        int finalCount = (n==amount+1) ? -1 : n;
        amountDict.put(amount,finalCount);
        return finalCount;
    }
	
}
