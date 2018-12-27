package CCI;

import java.util.ArrayList;

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
		Integer currentValue = 0;
		BST root = null;
		
		CountBST bst = new CountBST();
		System.out.println(bst.countUniqueBST(array, root, currentValue));
		
		System.out.println(bst.count);
		
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
	
	
}
