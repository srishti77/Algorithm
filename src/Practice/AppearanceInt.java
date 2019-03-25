package Practice;

import java.util.List;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.HashMap;

public class AppearanceInt {
	public static void main(String s[]) {
		
		AppearanceInt appearance = new AppearanceInt();
		int nums[] = {3,2,3};
		
		System.out.println(appearance.majorityElement(nums));
		
	}
	
	 public List<Integer> majorityElement(int[] nums) {
		 List<Integer> list = new ArrayList<Integer>();
	       HashMap<Integer, Integer> map = new HashMap();
	        int num = (int) nums.length/3;
	        System.out.println(num);
	        for(int i=0; i< nums.length; i++){
	            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
	        }
	        
	        for(Entry<Integer, Integer> values: map.entrySet()) {
	        	int ele = values.getValue();
	        	if(ele > num)
	        		list.add(values.getKey());
	        }
	        
	        return list;
	    }
}
