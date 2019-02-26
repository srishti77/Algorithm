package CCI;

import java.util.ArrayList;
import java.util.List;

public class ValidTriangle {
	
	List<List<Integer>> listOfList = new ArrayList<List<Integer>>();
	int count =0;
	public static void main(String s[]) {
		
		ValidTriangle triangle = new ValidTriangle();
		int nums[] = {2,2,3,4};
		int index = 0;
		triangle.findValidTriangle(new ArrayList<Integer>(), nums, 0);
	}
	
	public void findValidTriangle(List<Integer> list, int nums[], int index) {
		
		if(nums.length ==0)
			return;
		
		int size = list.size();
		if(size == 3) {
			
			
			if(checkValidity(list.get(0), list.get(1), list.get(2))) {
				System.out.println(list);
				count++;
				//listOfList.add(new ArrayList<Integer>(list));
			}
			
			return;	
			
		}
		
		int start =0;
		if(list.size() >0)
			start = index;
		
		for(int i= start; i< nums.length; i++ ) {
			
			list.add(nums[i]);
			findValidTriangle(list,nums, i+1);
			list.remove(list.size()-1);
			
		}
		
	}
	
	public boolean checkValidity(int a, int b, int c) {
		if(((a+b)>c) && ((b+c) >a) && ((a+c)>b) )
			return true;
		return false;
	}
	
}
