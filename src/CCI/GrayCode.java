package CCI;

import java.util.ArrayList;

public class GrayCode {
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String args[]) {
		
		GrayCode code = new GrayCode();
		int n=2;
		code.findCombination(n);
		
	}
	
	void findCombination(int n) {
		int currentValue = 000;
		list.add(currentValue);
		int i=0;
		while(i <  n) {
			int value = currentValue ^ (1 <<i);
			if(list.contains(value))
				i++;
			else
			{
				list.add(value);
				currentValue = value;
				i=0;
			}
			
			
		}
		System.out.println(list);
		
	}
	
}
