package CCI;

public class ClimbStairs {
	
	 int memo[];
	    public int climbStairs(int n) {
	        memo = new int[n+1];
	        return climbStairs(memo, n);
	    }
	    
	     public int climbStairs(int memo[], int n) {
	    	   if(memo[n] !=  0)
		           return memo[n];
	    	   
	        if(n==2 || n ==1) {
	        	memo[n] = n;
	        	 return n;
	        }
	           
	    
	        else
	            memo[n] = climbStairs(n-1) + climbStairs(n-2);
	         
	         return memo[n];
	    }
	    
	    
	     public static void main(String s[]) {
	    	 ClimbStairs stairs = new ClimbStairs();
	    	 System.out.println(stairs.climbStairs(4));
	     }
}
