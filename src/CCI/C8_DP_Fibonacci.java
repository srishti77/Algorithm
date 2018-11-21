package CCI;

import java.util.Scanner;

public class C8_DP_Fibonacci {
	
	public static void main(String s[]) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number range");
		int num= scan.nextInt();
		C8_DP_Fibonacci fib= new C8_DP_Fibonacci();
		System.out.println("fibonacci "+fib.fibo(num));
	}
	
	public int fibo(int n) {
		return fibonacci(n, new int[n+1]);
	}
	
	public int fibonacci(int i, int[] memo) {
		if(i == 0) return 0;
		if(i == 1) return 1;
		
		if(memo[i]==0)
			memo[i]= fibonacci(i-1, memo)+fibonacci(i-2,memo);
		
		return memo[i];
	}
}
