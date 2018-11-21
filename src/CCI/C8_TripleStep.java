package CCI;

import java.util.Scanner;

public class C8_TripleStep {
	
	/*
	 * if n=1 then we can take only 1 step
	 * n=2 then we can take 1,1, or 2 = 2ways
	 * n=3 then we can take 111 or 2 1 or 1 2 or 3 = 4 ways
	 * n=4 then 1111 22 112 121 211 31 13 = 7 ways
	 * n=5 11111 1112 1121 1211 2111 32 23
	 * 
	 * n=4 3+2+1
	 */
	public static void main(String s[]) {
		Scanner scan= new Scanner(System.in);
		

		System.out.println(new C8_TripleStep().triple(4));
		
	}
	
	public int triple(int num) {
		if (num ==1 || num == 2) return num;
		if (num ==3)
			return num+1;
		return triple(num-1)+ triple(num-2) +triple(num-3);
	}
	
}
