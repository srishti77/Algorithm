package CCI;

public class C8_Coins_Optimized {
	
	public static void main(String arg[]) {
		
		int denoms[]= {25,10,5,2};
		
		int ways= makeChange(30, denoms, 0);
		System.out.println(ways);
	}

	private static int makeChange(int amount, int[] denoms, int index) {
		
		if(index >= denoms.length-1) return 1;
		int ways=0;
		int denomsAmt= denoms[index];
		
		for(int i=0; i*denomsAmt <= amount; i++) {	
			
			int remainingAmt= amount-(i*denomsAmt);
			System.out.println(i*denomsAmt);
			ways+= makeChange(remainingAmt, denoms, index+1);
			
		}		
		return ways;	
	}
}
