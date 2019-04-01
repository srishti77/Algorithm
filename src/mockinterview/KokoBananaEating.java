package mockinterview;

public class KokoBananaEating {
	
	public static void main(String s[]) {
		
		KokoBananaEating kokoBanana = new KokoBananaEating();
		int[] piles = {30,11,23,4,20};
		int H = 6;
		
		System.out.println(kokoBanana.minEatingSpeed(piles, H));
	}
	
	public int minEatingSpeed(int[] piles, int H) {
		int low =1;
		int high = 1_000_000_000;
		
		while(low < high) {
			int mid = (low+high)/2;
			
			if(!possible(piles, H, mid)) {
				low = mid+1;
				
			}
			else {
				high= mid;
			}
			
		}
		return low;
	}

	private boolean possible(int[] piles, int h, int mid) {
		// TODO Auto-generated method stub
		
		int time =0;
		for(int p: piles) {
			time +=(p-1)/mid +1;
		}
		return time <= h;
	}
}
