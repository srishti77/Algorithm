
public class SumOfTwoNumbers {

	public static void main(String s[]) {
		
		SumOfTwoNumbers sumOfTwoNumbers = new SumOfTwoNumbers();
		int numbers[]= {2, 7, 11, 15};
		int[] indexs= sumOfTwoNumbers.twoSum(numbers, 22);
		
		for(int p=0; p< indexs.length; p++) {
			System.out.println(indexs[p]);
		}
		
	}
	 public int[] twoSum(int[] nums, int target) {
	        int index= -1;
	        int indexValue[] = new int[2];
	        int currentTarget;
	        for(int i=0;i< nums.length;i++){
	            currentTarget = target -nums[i];
	            index = findNextValue(currentTarget, i, nums);
	            if(index != -1){
	            	indexValue[0] = i;
	            	indexValue[1] = index;
	            	System.out.println(i+" "+index);
	            	break;
	            }
	        }
	        
			return indexValue;
	    }
	    
	    int findNextValue(int currentTarget, int currentIndex, int[] nums ){
	        int index=-1;
	        for(int i=currentIndex+1; i<nums.length; i++){
	            if(currentTarget == nums[i]){
	                index= i;
	                break;
	            }
	        }
	        return index;
	        
	    }
}

   
