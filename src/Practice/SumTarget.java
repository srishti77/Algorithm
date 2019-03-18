package Practice;

public class SumTarget {

	public static void main(String s[]) {

		SumTarget sumTarget = new SumTarget();
		
		int[] array = {2, 7, 11, 15};
		
		int target = 9;
		
		int number[] = sumTarget.twoSum(array, target);
		sumTarget.print(number);
	}
	
	public void print(int number[]) {
		
		for(int i=0; i< number.length; i++) {
			System.out.println(number[i]);
		}
	}

	public int[] twoSum(int[] nums, int target) {

		int sum = 0;
		int index[] = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; i < nums.length; i++) {
				if (nums[i] + nums[j] == target) {
					index[0] = i;
					index[1] = j;				
				}
			}
		}
		
		return index;
	}
}
