package CCI;
import java.util.ArrayList;

public class SumTarget {
	
	public static void main(String ags[]) {
		
		SumTarget sumTarget = new SumTarget();
		
		
		int numb[] = {5,6,3,2,1};
		int[] total = sumTarget.twoSum(numb, 7);
		for(int u =0; u < total.length; u++) {
			System.out.println(numb[total[u]]);
		
		}
	}

	  public int[] twoSum(int[] nums, int target) {
	        
	        ArrayList arrayList = new ArrayList(); 
	       
	        
	        for( int i = 0; i< nums.length-1; i++){
	            int sum = nums[i];
	            for(int j = i+1; j<nums.length; i++){
	                int currentSum = 0;
	                currentSum= nums[i]+nums[j];
	                sum = sum + nums[j];
	                
	                if(currentSum==target)
	                {
	                    arrayList.add(i);
	                    arrayList.add(j);      
	                    //System.out.println(i);
	                    break;      
	                }
	                
	                if( sum == target){
	                   for(int p=i; p<j; p++){
	                       arrayList.add(p);       
	                 }         
	                break;
	                } 
	            } 
	        }
	        int array[] = new int[arrayList.size()];
	        for(int h=0; h< arrayList.size(); h++){
	             array[h] = (int) arrayList.get(h);
	        }
	          return array;
	 }  
}
