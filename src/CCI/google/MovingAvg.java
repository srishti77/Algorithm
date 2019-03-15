package CCI.google;

import java.util.ArrayList;

public class MovingAvg {

	ArrayList<Integer> list = new ArrayList<Integer>();
	int windowSize;
	int pointer;
	public static void main(String s[]) {
		MovingAvg m = new MovingAvg(3);
		System.out.println(m.next(1));
		System.out.println(m.next(10));
		System.out.println(m.next(3));
		System.out.println(m.next(5));
	}

	public MovingAvg(int size) {
		windowSize = size;
		pointer =0;
	}

	public double next(int val) {
		int sum = 0;
		
		list.add(val);
		int len = list.size()-pointer;
		if(len > windowSize) {
			
			pointer++;
			len--;
		}
			
		for(int i=pointer; i< list.size(); i++) {
			sum = sum + list.get(i);
		}
		
		return (double)(sum)/(len);
	}
}
