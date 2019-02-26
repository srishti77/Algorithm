package CCI;

import java.util.ArrayList;
import java.util.List;

public class CountBST {
	int ways;
	int count=0;
	
	public void insert(int value) {
		
	}
	
	class BST{
		int value;
		BST left;
		BST right;
		
	}
	
	public static void main(String s[]) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		Integer currentValue = 0;
		BST root = null;
		
		CountBST bst = new CountBST();
		
		System.out.println("My array: "+bst.countBSTs(array));
		
	}

	private  int countUniqueBST(ArrayList<Integer> array, BST root, Integer currentValue) {
		
		if(array.isEmpty()) {
			count++;
			return 1;
		}
			
		
		for(int i=0; i< array.size(); i++) {
			currentValue = array.get(i);
			ArrayList<Integer> newArray = new ArrayList<Integer>();
			newArray.addAll(array);
			newArray.remove(i);			
			countUniqueBST(newArray, root, currentValue);
			
		}
		return ways;
		
	}
	int way=0;
	public int countBSTs(List<Integer> array) {
		int size = array.size();

		if(size == 0 || size == 1 || size == 2) {
			System.out.println(size);
			return size;
		
		}
			if(size ==3)
				return 5;
		
		for(int i=0; i< size; i++) {
			
			List<Integer> left = new ArrayList<Integer>();
			List<Integer> right = new ArrayList<Integer>();
			
			for(int j=0; j<size; j++) {
				
				if(i != j) {
					
					if(array.get(i) < array.get(j)) {
						right.add(array.get(j));
					}
					else if(array.get(i) > array.get(j)) {
						left.add(array.get(j));
					}
					
				}
			}
			System.out.println("Left Size:"+ left.size() +" -Right Size- "+ right.size());
			int countLeft = countBSTs(left);
			int countRight = countBSTs(right);
			
			if(countLeft !=0 && countRight !=0) {
				//System.out.println(countLeft * countRight);
				way += countLeft * countRight;
			}
			
			else if(countLeft !=0 && countRight ==0  ) {
				//System.out.println(countLeft);
				way += countLeft;
			}
				
			
			else if( countLeft ==0 && countRight !=0 ) {
				//System.out.println(countRight);
				way += countRight;
			}
				
			
		}
		
		return way;
		
	}
	
	
}
