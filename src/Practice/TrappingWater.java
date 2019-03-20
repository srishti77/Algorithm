package Practice;

public class TrappingWater {
	
	public static void main(String s[]) {
		
		TrappingWater water = new TrappingWater();
		int [] array= {0,1,0,2,1,0,1,3,2,1,2,1};
		water.trappingWater(array);
		
	}
	
	public void trappingWater(int[] array) {
		
		int left[] = new int[array.length];
		int right[] = new int[array.length];
		
		int n = array.length;
		left[0] = array[0];
		for(int i=1; i< n; i++ ) {
			left[i] = Math.max(left[i-1], array[i]);
		}
		
		right[n-1] = array[n-1];
		
		for(int i= n-2; i>=0; i--)
			right[i] = Math.max(right[i+1], array[i]);
		int water =0;
		for(int i =0; i< n; i++) {
			water += Math.min(left[i], right[i])- array[i];
		}
		
		System.out.println("Water :"+water);
	}
}
