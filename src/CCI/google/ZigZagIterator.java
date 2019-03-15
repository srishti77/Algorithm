package CCI.google;

import java.util.ArrayList;
import java.util.List;

public class ZigZagIterator {
	
	List<Integer> mainList = new ArrayList<>();
	int currentIndex =0;
	public static void main(String s[]) {
		List<Integer> v1 = new ArrayList();
		v1.add(1);
		v1.add(2);
		
		List<Integer> v2 = new ArrayList();
		v2.add(3);
		v2.add(4);
		v2.add(5);
		v2.add(6);
		
		
		ZigZagIterator zigzagIterator = new ZigZagIterator(v1, v2);
		System.out.println(zigzagIterator.next());
		System.out.println(zigzagIterator.next());
		System.out.println(zigzagIterator.next());
		System.out.println(zigzagIterator.next());
		System.out.println(zigzagIterator.next());
		System.out.println(zigzagIterator.next());
		System.out.println(zigzagIterator.next());
	}

	public ZigZagIterator(List<Integer> v1, List<Integer> v2) {
	        int i=0;
	        int j=0;
	        
	        while(i < v1.size() && j < v2.size()) {
	        	mainList.add(v1.get(i));
	        	i++;
	        	mainList.add(v2.get(j));
	        	j++;
	        }
	        
	        while(i<v1.size()) {
	        	mainList.add(v1.get(i));
	        	i++;
	        }
	        while(j < v2.size()) {
	        	mainList.add(v2.get(j));
	        	j++;
	        }
	        System.out.println("Size: "+mainList.size()+ " "+ i +" "+ j);
	      
	    }

	public int next() {
		currentIndex++;
		if(currentIndex > mainList.size()) {
			return -1;
		}
		return mainList.get(currentIndex-1);
	}

	public boolean hasNext() {
		
		return currentIndex<mainList.size();
	}
}
