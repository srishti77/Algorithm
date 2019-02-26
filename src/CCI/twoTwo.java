
public class twoTwo {

	public static void main(String s[]) {
		
		int[] nums = {1, 3, 4};
		boolean teo=true;
		for(int i =0; i< nums.length;i++) {
			if(nums[i]==2) {
				if(i>0 && i<nums.length-1 && (nums[i-1] ==2 || nums[i+1] ==2)) {
					teo=true;
				}
				
				else if(i==0 && i==nums.length-1)
				{
					teo=false;
				}
				else if(i==0 && i<nums.length-1 && nums[i+1] ==2 )
				{
					teo=true;
				}
				
				else if(i== nums.length-1 && nums[i-1]==2)
				{
					teo =true;
				}
				else {
					teo=false;
				}
			}
		}
		
		System.out.println("Result "+ teo);
		
		
		
	
	}
}
