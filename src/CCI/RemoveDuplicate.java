package CCI;

public class RemoveDuplicate {
	public static void main(String s[]) {
		RemoveDuplicate remove =new RemoveDuplicate();
		int[] nums = {1};
		
		int newNum[] = remove.removeDuplicates(nums);
		
		for(int i=0; i<newNum.length; i++) {
			System.out.println(newNum[i]);
		}
			
		
	}
    public int[] removeDuplicates(int[] nums) {
        
        int count =nums.length;
        boolean repeat = false, firstTime = false;
        int index = -1;
     
        for(int i=1; i<count; i++){
           
        	if(nums[i] == nums[i-1]){
                if(repeat){
                    if(!firstTime){
                         index = i-1; 
                        firstTime = true;
                    }      
                }
                else{
                    repeat = true;
                }
            }
           
        	else{
                if(index !=-1 && index != i-1){
                	
                	System.out.println("Here");
                	count= count-(i-index-1);
                    nums = swapAllPrevNumbers(index,i, nums); 
                    i = index+1;
                    index=-1;
                }
                firstTime = false;
                repeat = false;
            } 
        
        	
        }
        if(index !=-1)
    		count = index+1;
        System.out.println("Count "+count);
        return nums;
    }
    
    
    public int[] swapAllPrevNumbers(int index,int start, int[] nums){
        for(int i=start; i< nums.length; i++){
            nums[index+1] = nums[i];
             index++;
        }
        return nums;
    }
}
