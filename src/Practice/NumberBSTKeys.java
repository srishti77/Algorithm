package Practice;

public class NumberBSTKeys {
	static int dp[];
	public static void main(String s[]) {
		int n = 5;
		 dp = new int[(2*n)+1];
		
		dp[1] = 1;
		dp[2] = 2;
		NumberBSTKeys numb = new NumberBSTKeys();
		
		System.out.println(numb.compute(n));
	}
	
	public int factorial(int n) {
		if(n ==1 || n == 2)
			return dp[n];
		
		if(dp[n] != 0) return dp[n];
		
		int result = n* factorial(n-1);
		dp[n] = result;
		return result;
				
	}
	
	public int compute(int n) {
		int maxValue =  factorial(2*n)/((n+1)* factorial(n) );
		return maxValue;
	}
	
}
