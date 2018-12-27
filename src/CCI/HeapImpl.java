package CCI;

import java.util.ArrayList;

public class HeapImpl {
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	public static void main(String s[]) {
		HeapImpl impl = new HeapImpl();
		impl.insert(15);
		impl.insert(5);
		impl.insert(20);
		
		System.out.println(impl.arrayList);
		impl.delete();
		System.out.println();
		System.out.println(impl.arrayList);
	}
	
	public void delete() {
		if(arrayList.isEmpty()) {
			System.out.println("cannot delete");
			
		}
		else {
			
			int k=0;
			int hold = arrayList.get(k);
			arrayList.set(k, arrayList.get(arrayList.size()-1));
			arrayList.remove(arrayList.size()-1);
			int leftIndex = 2*k +1;
			
			while(leftIndex < arrayList.size()-1) {
				
				int rightIndex = leftIndex +1, max =leftIndex;
				
				if(rightIndex < arrayList.size()) {
					if(arrayList.get(leftIndex) < arrayList.get(rightIndex)) {
						max = rightIndex;
					
					}
				}
				
				if(arrayList.get(k) < arrayList.get(max)) {
					int temp = arrayList.get(k);
					arrayList.set(k, arrayList.get(max));
					arrayList.set(max, temp);
					k= max;
					
					
				}
				else {
					break;
				}
			
			}
			
			System.out.println(hold);
		}
	}
	
	public void insert(int value) {
		if(arrayList.isEmpty())
			arrayList.add(value);
		else {
			arrayList.add(value);
			shiftUp();
		}
	}
	
	public void shiftUp() {
		
		int last = (arrayList.size()-1);
		
		while(last != 0) {
			int indexParent = (last-1)/2;
			if(arrayList.get(indexParent) < arrayList.get(last)) {
				int temp = arrayList.get(last);
				arrayList.set(last, arrayList.get(indexParent));
				arrayList.set(indexParent, temp);
			}
			
			last = indexParent;
		}
	
	}
}
