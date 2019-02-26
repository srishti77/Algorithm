package CCI.google;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * Input : 4,3,2,1
 * Output: 4,3,2,2
 */
public class PlusOne {

	public static void main(String s[]) {

		PlusOne plusOne = new PlusOne();
		int[] digits = {4,3,2,1};
		int[] array = plusOne.plusOne(digits);
		System.out.println("value...."+ (10%10));
		plusOne.printElement(array);
	}

	public void printElement(int[] digits) {
		for (int i = 0; i < digits.length; i++)
			System.out.println(digits[i]);
	}

	public int[] plusOne(int[] digits) {
		
		int carry = 1;
		LinkedList<Integer> list = new LinkedList<Integer>();
		int i = digits.length - 1;
		
		while (i >= 0) {
			
			int value = digits[i] + carry;
			carry=0;
			if (value >= 10) {
				carry = 1;

			}
			
			list.addFirst(value % 10);
			i--;
			System.out.println("value  :"+value);
			if (carry == 0) {
				
				break;
			}			
		}
	
		if (i >= 0) {
			
			for (int j = i; j >= 0; j--)
				list.addFirst(digits[j]);
		}
		
		if(carry !=0) {
			list.addFirst(carry);
		}
		
		int array[] = new int[list.size()];
		
		for (int k = 0; k < list.size(); k++) {
				
			array[k] = list.get(k);
			
		}
		return array;

	}

}
