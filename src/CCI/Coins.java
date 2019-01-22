package CCI;

public class Coins {
	
	public static void main(String s[]) {
		Coins coin = new Coins();
		
		System.out.println(coin.makeChange(5));
		
	}
	
	int makeChange(int n) {
		
		int denoms[] = {5};
		int[][] map = new int[n+1][denoms.length];	
		return makeChange(n, denoms, 0, map);
		
	}

	private int makeChange(int amount, int[] denoms, int index, int[][] map) {
		// TODO Auto-generated method stub
		
		 if(amount == 0) {		
			return 1;
		 }
		 
		 if(index >= denoms.length)
				return 0;
		 
		if(map[amount][index] >0) {
			return map[amount][index];
		}
		
		 int denomAmount = denoms[index];
		 int ways = 0;
		 
		 for(int i=0; i* denomAmount <= amount; i++) {
			 int amountRemaining = amount - i*denomAmount;
			 ways += makeChange( amountRemaining, denoms, index +1, map);
		 }
		 
		 map[amount][index] = ways;
		
		return ways;
	}
}
