package mockinterview;

import java.util.ArrayList;

public class MovingAvg {

	/** Initialize your data structure here. */
	public static void main(String s[]) {
		MovingAvg movingAvg = new MovingAvg(3);
		System.out.println(movingAvg.next(1));
		System.out.println(movingAvg.next(10));
		System.out.println(movingAvg.next(3));
		System.out.println(movingAvg.next(5));
	}
	ArrayList<Integer> list = new ArrayList<>();
	int size ;
	    public MovingAvg(int size) {
	        this.size = size;
	    }

	public double next(int val) {
		
		int list_size = list.size();
	
		if( list_size == size) {
			list.remove(0);
			list.add(val);
			return avg(list_size);
		}
		else {
			list.add(val);
			++list_size;
			return avg(list_size);
			
		}
		
	}

	public double avg(int list_size) {
		double sum =0.0;
		
		for(int i=0; i<list_size; i++) {
			sum += list.get(i);
		}
		return sum/list_size;
	}
}
