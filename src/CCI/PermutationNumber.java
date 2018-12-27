package CCI;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationNumber {
	
	
	public static void main(String s[]) {
		
		int number[] = {1,2,3,4};		
		PermutationNumber num = new PermutationNumber();
		num.getPermutation(number);
	}
	
	public void getPermutation(int[] number) {
		
		Set<List<Integer>> list = new HashSet<List<Integer>>();	
		permute(new ArrayList<Integer>(), number, list);	
		System.out.println(list);
		
	}
	
	private static void print(List<ArrayList<Integer>> list2) {
		
		for(ArrayList<Integer> array: list2)
			System.out.println(array);
	}
	
	private void permute(List<Integer> arrayList, int[] number, Set<List<Integer>> list) {
		
		if(number.length == 1 && !arrayList.isEmpty()) {
			
			//arrayList.add(number[0]);
			list.add(arrayList);
			arrayList.clear();
			return;		
		}
		
		for(int i=0; i< number.length; i++) {
			
			arrayList.add(number[i]);			
			int[] newNumber = makeArray(number,i);			
			permute(arrayList, newNumber, list);
	
		}		
	}
		

	public int[] makeArray(int[] numberArray , int index) {
		// TODO Auto-generated method stub
		
		int[] newNumber = new int[numberArray.length-1];
		int j=0, i=0;
		while(j< numberArray.length-1 && i < numberArray.length) {
			if(index != i) {
				newNumber[j] = numberArray[i];
				j++;
			}
			i++;
		}
		return newNumber;		
	}	
	

}
