package CCI;

import java.util.ArrayList;
import java.util.List;

public class MinCostClimbingStairs {
	
	static int minValue=0;
	static int[] memo;
	List<Integer> list = new ArrayList<>();
	public static void main(String s[]) {
		
		MinCostClimbingStairs climb = new MinCostClimbingStairs();
		int cost[] = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		memo = new int[cost.length+1];
		System.out.println(climb.minCostClimbingStairs(cost));
		
	}
	public int minCostClimbingStairs(int[] cost) {
		
		   
        int n = cost.length;
        
        if(n == 0) return 0;
        
        int memo[] = new int[cost.length+1];
        
        memo[0] = cost[0];
        memo[1] = cost[1];
        
        for(int i=2; i< n; i++){
            memo[i] = Math.min(memo[i-1], memo[i-2]) + cost[i];
        }
        
        return Math.min(memo[n-2], memo[n-1]);
		
		
		
    }
}
