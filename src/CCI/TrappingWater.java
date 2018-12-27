package CCI;

public class TrappingWater {
	public static void main(String s[]) {
		int input[] = {1,0,2,1,0,1,3,2,1,2,1};
		TrappingWater trap = new TrappingWater();
		trap.findTrappedArea(input);
	}

	private void findTrappedArea(int[] input) {
		// TODO Auto-generated method stub
		int size = input.length;
		int left[] = new int[size];
		int right[] = new int[size];
		left[0] = input[0];
		int sum=0;
		right[right.length-1] = input[size-1];
		
		for(int i=1; i< input.length; i++) {
			left[i] =Math.max(left[i-1], input[i]);
		}
		
		for(int i=size-2; i>=0; i--) {
			right[i] =Math.max(right[i+1], input[i]);
		}
		
		for(int i=0; i<size; i++)
			sum = sum + Math.min(left[i], right[i])-input[i];
		
		System.out.println(sum);		
		
	}
	
	
	
}
