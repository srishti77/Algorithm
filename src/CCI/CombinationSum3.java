package CCI;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
	
	List<List<Integer>> listOfList = new ArrayList<List<Integer>>();
	
	public static void main(String s[]) {
		CombinationSum3 combo = new CombinationSum3();
		combo.findCombination(new ArrayList<Integer>(), 9, 3);
		System.out.println(combo.listOfList.size());
	}
	
	public void findCombination(List<Integer> list, int target, int k) {
		
		if(target ==0 && list.size() == k) {
			System.out.println(list);
			if(list.size() >0)
				listOfList.add(new ArrayList<Integer>(list));
			//list.clear();
			return;
			
		}
		
		if(list.size() == k) {
			return;
			
		}
		int start =1;
		if(list.size() >0)
			start = list.get(list.size() -1)+1;
		for(int i=start; i<10; i++) {
			list.add(i);
			findCombination(list, target-i, k);
			if(list.size() >0)
				list.remove(list.size()-1);
		}
		
	}
}
