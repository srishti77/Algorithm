package CCI;

import java.util.ArrayList;

public class MinHeap {
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String s[]) {
		
		MinHeap minHeap = new MinHeap();
		minHeap.insert(10);
		minHeap.insert(5);
		minHeap.insert(20);
		minHeap.insert(15);
		minHeap.insert(1);
		minHeap.insert(3);
		minHeap.print();
		
		minHeap.delete();
		
		minHeap.print();
		
	}

	private void print() {
		for(int i=0; i< list.size(); i++)
			System.out.println(list.get(i));
	}
	private void insert(int i) {
		list.add(i);
		adjust(list.size()-1);
	}
	private void adjust(int n) {
		// TODO Auto-generated method stub
		
		if(n > 0) {
			int child =  list.get(n);
			int parent = list.get((n-1)/2);
			if(child < parent)
			{
				int temp = child;
				list.set(n, parent);
				list.set((n-1)/2, temp);
				adjust((n-1)/2);
			}		
			
		}
		
	}
	
	private void delete() {
		
		if(list.isEmpty()) {
			System.out.println("Heap is empty");
			return;
		}
			
		//System.out.println(list.get(0));
		list.set(0, list.get(list.size()-1));
		list.remove(list.size()-1);
		
		adjustAfterDelete(0);
	}

	private void adjustAfterDelete(int index) {
		// TODO Auto-generated method stub
		int lastIndex = list.size()-1;
		if(index >= lastIndex)
			return;
		
		int parent = list.get(index);
		
		if(index+2 <= lastIndex)
		{
			int right = index+2;
			int minIndex = index+1;
			if(list.get(minIndex) > list.get(right))
				minIndex = right;
			swap(index, minIndex);
			adjustAfterDelete(minIndex);
		}
		else if(parent > list.get(index +1)) {
			swap(index, index+1);
			adjustAfterDelete(index+1);
		}
		
		
	}

	private void swap(int index, int i) {
		// TODO Auto-generated method stub
		int temp = list.get(index);
		list.set(index, list.get(i));
		list.set(i, temp);
		
	}
	
	
	
	
}
