package CCI;

/*Find the largest x such that P[x]<P[x+1].
(If there is no such x, P is the last permutation.)
Find the largest y such that P[x]<P[y].
Swap P[x] and P[y].
Reverse P[x+1 .. n].
*/

public class NextPermutation {
	public static void main(String s[]) {
		int num[] = {4,2,5,3,1};
		NextPermutation perMutation = new NextPermutation();
		int position = perMutation.findLargestPosition(num);
		
		if(position != -1) {
			
			int y = perMutation.findNearestLargestElement(position, num);
			
				int temp= num[position];
				num[position] = num[y];
				num[y] = temp;
				
		}
		num = perMutation.reverseElement(num, position+1);
		for(int i=0; i< num.length; i++)
			System.out.print(num[i] +" ");
		
	}
	
	private int[] reverseElement(int[] num, int i) {
		// TODO Auto-generated method stub
		int j= num.length-1;
		while(i<j){
			int temp = num[i];
			num[i] = num[j];
			num[j] = temp;
			i++;
			j--;
		}
		return num;
		
	}

	int findLargestPosition(int[] nums) {
		for(int i=nums.length-1; i>=1; i--) {
			if(nums[i] > nums[i-1])
				return i-1;
		}
		return -1;
	}
	
	int findNearestLargestElement(int pos, int[] nums) {
		for(int i=pos+1; i< nums.length; i++) {
			if(nums[pos] >= nums[i])
				return i-1;
		}
		return nums.length-1;
	}
}
