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
		
		int[] numbers = {2,5,2,1,2};
		int target = 5;
		Arrays.sort(numbers);
		CombinationSum sum = new CombinationSum();
		List l =new ArrayList<Integer>();
		combinationSum(numbers, target, l, 0);
		 
	    //System.out.println(convert(sets));
	}
	
	public static List<List<Integer>> convert(Set<List<Integer>> sets) {
		
		return new ArrayList<List<Integer>>(sets);
		
	}
	public static void combinationSum(int[] array, int target, List<Integer> stack, int i ){
		
		if(target ==0) {
			List<Integer> stack1 = new ArrayList<Integer>();
			stack1.addAll(stack);
			sets.add(stack1);
			System.out.println(stack1);
			return;
		}
		if(target < 0)
			return;
		
		while(i< array.length && target-array[i] >= 0) {			
			stack.add(array[i]);
			combinationSum(array, target-array[i], stack, i+1);			
			i++;
			stack.remove(stack.size()-1);			
		}
			
	}
}
