package CCI;

import java.util.ArrayList;
import java.util.Collections;

public class SearchRange {
	
	public static void main(String s[]) {
		SearchRange search = new SearchRange();
		int nums[] = {2,2};
		int target = 2;
		int[] num = (search.searchRange(nums, target));
		for(int i=0; i< num.length; i++)
			System.out.println(num[i]);
	}
	  public int[] searchRange(int[] nums, int target) {
	         ArrayList<Integer> list = new  ArrayList<Integer>();
	        int[] number = {-1,-1};
	           
	        if(nums.length == 0)
	             return number;
	        if(nums.length<=2) {
	        for(int i =0; i<nums.length ; i++){
	        	
	            if(nums[i] == target){
	            	if(number[0] == -1)
	            		number[0] =i;
	                number[1] = i;                
	            }
	          	                
	        }
	        return number;
	  }
	       list = searchTargetRange(nums, target, 0, nums.length, list);
	        
	        if(list.size() ==0)
	        {
	            return number;
	        }
	        
	        number[0] = Collections.min(list);
	        number[1] = Collections.max(list);
	        
	        return number;
	    }
	    
	    public ArrayList<Integer> searchTargetRange(int[] nums, int target, int left, int right, ArrayList<Integer> list){
	        
	    	
	    	if(left > right)
	             return list;
	    	else if(right == left) {
	    		if( left< nums.length) {
	    		 if(nums[left] == target){
		            	list.add(0);  
	    		 }
	    		 return list;
	    	}
	    		return list;
	    	}
	        
	        int mid = (right+left)/2;
	        System.out.println(left +" "+ right);
	        
	        if(nums[mid] < target)
	            return searchTargetRange(nums, target, mid+1, right, list);
	        else if(nums[mid] > target)
	            return searchTargetRange(nums, target, left, mid-1, list);
	        else{
	            list.add(mid);
	             searchTargetRange(nums, target, left, mid-1, list);
	             searchTargetRange(nums, target, mid+1, right, list);
	            return list;
	        }
	        
	        
	    }
}
