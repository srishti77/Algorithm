package CCI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class CombinationSum {
	
	static Set<List<Integer>> sets = new HashSet<List<Integer>>();
	public static void main(String s[]) {
		
		int[] numbers = {2,3,6,7};
		int target = 7;
		Arrays.sort(numbers);
		CombinationSum sum = new CombinationSum();
		Stack l =new Stack<Integer>();
		combinationSum(numbers, target, l, 0);
		 
	    System.out.println(convert(sets));
	}
	
	public static List<List<Integer>> convert(Set<List<Integer>> sets2) {
		
		List<List<Integer>> listOfList = new ArrayList<List<Integer>>();
		for(List<Integer> st: sets2) {
			List<Integer>  list = new ArrayList<Integer>(st);
			listOfList.add(list);
			
		}
		
		return listOfList;
		
		
	}
	public static void combinationSum(int[] array, int target, Stack stack, int i ){
		
		if(target ==0) {
			List newStack = new ArrayList(stack);
			sets.add(newStack);
			return;
		}
		if(target < 0)
			return;
		
		while(i< array.length && target-array[i] >= 0) {	
			
			stack.push(array[i]);
			combinationSum(array, target-array[i], stack, i);			
			i++;
			stack.remove(stack.size()-1);			
		}
			
	}
}
