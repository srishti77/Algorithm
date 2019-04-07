package mockinterview;

public class ShipWithinDays {
	public static void main(String s[]) {

		int weights[] = {1,2,3,4,5,6,7,8,9,10}, D = 5;
		
		ShipWithinDays ship = new ShipWithinDays();
		
		System.out.println(ship.shipWithinDays(weights, D));
	}

	public int shipWithinDays(int[] weights, int D) {

		int left = 0, right = 0;

		for (int w : weights) {
			left = Math.max(left, w);
			right += w;
		}
		
		while (left < right) {

			int mid = (left + right) / 2, need = 1, cur = 0;
			for(int w: weights) {
				if(cur +w > mid) {
					need +=1;
					cur =0;
				}
				cur += w;
				
			}
			
			if(need > D) left = mid+1;
			else
				right = mid;
		}
		return left;
	}
}
