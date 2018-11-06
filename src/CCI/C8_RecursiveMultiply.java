package CCI;

import java.util.Scanner;
import java.util.concurrent.RecursiveAction;

public class C8_RecursiveMultiply {
	static int value=0;
	
	public static void main(String s[]) {
		C8_RecursiveMultiply recursiveMultiplyObj= new C8_RecursiveMultiply();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers1");
		int num1= scan.nextInt();
		System.out.println("Enter numbers2");
		int num2= scan.nextInt();
		System.out.println(recursiveMultiplyObj.recursiveMultiply(num1, num2));
		
		System.out.println(recursiveMultiplyObj.minProduct(num1, num2));	
	}
	
	public int recursiveMultiply(int multiplyer, int number) {
		
		System.out.println(multiplyer+" "+ number);
		if(multiplyer <= 0) return 0;
		if (multiplyer==1)
			return number; 
		else {	
			
			value= value+number+recursiveMultiply(multiplyer-1, number);
			return value;
		}
	}
	
	//Alternative given in CCI
	int minProduct(int smaller, int bigger) {
		if(smaller > bigger) {
			return minProductHelper(bigger, smaller);
		}
		else
			return minProductHelper(smaller, bigger);
	}
	private int minProductHelper(int smaller, int bigger) {
		// TODO Auto-generated method stub
		
		if(smaller ==0)
			return 0;
		if(smaller==1)
			return bigger;
		
		int dividebyTwo= smaller >> 1;
		int side1= minProduct(dividebyTwo, bigger);
		int side2= side1;
		
		if(smaller%2==1)
			side2= minProductHelper(smaller-dividebyTwo, bigger);
		return side1+side2;
	}
}
