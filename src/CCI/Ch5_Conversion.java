package CCI;

import java.util.Scanner;

public class Ch5_Conversion {
	
	public static void main(String s[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number 1?");
		
		int num1= scan.nextInt();
		System.out.println("Enter the number 2"
				+ "?");
		int num2= scan.nextInt();
		
		int num = num1^num2;
		int count=0;
		while(num > 0) {
			if((num&1 )==1) {
				count++;
			}
			
			num >>>=1;
		}
		
		System.out.println("Count "+ count);
				
	}
}
