package CCI;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationNumbers {
	
	List<List<Integer>> list = new ArrayList<List<Integer>>();
	
	public static void main(String s[]) {
		
		int nums[] = {1,1,2};
		PermutationNumbers per = new PermutationNumbers();
		System.out.println(per.permute(nums));
		
		
	}
	
	  public List<List<Integer>> permute(int[] nums) {
	       
	        List<Integer> number = new ArrayList<Integer>();
	        for(int i=0; i< nums.length; i++){
	            number.add(nums[i]);
	        }
	        
	        Set<List<Integer>> set = new HashSet<List<Integer>>();
	        List<Integer> newList = new ArrayList<Integer>();
	        findPermutation(newList , number, set);
	        
	        List<List<Integer>> list = new ArrayList<List<Integer>>();
	        for(List<Integer> st: set) {
	        	list.add(st);
	        }
	        return list;
	        
	    }
	  
	
	    public void findPermutation(List<Integer> newList, List<Integer> number, Set<List<Integer>> list) {
			
			if(number.size() == 0){
				list.add(newList);	
			}
			
			for(int i=0; i<number.size(); i++) {						
				List<Integer> currentList = new ArrayList<Integer>();
				currentList.addAll(newList);
				currentList.add(number.get(i));			
				findPermutation(currentList, makeList(number, i), list);		
			}
			
		}

		private List<Integer> makeList(List<Integer> number, int i) {
			List<Integer> list = new ArrayList<Integer>();
			
			for(int j=0; j<number.size(); j++) {
				if(i!=j)
					list.add(number.get(j));
			}	
			return list;
		}
}
