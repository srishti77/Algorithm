package CCI;

public class CakeTheif {
		
	//start by assuming what will happen if we have just 1 capacity, then go to 2 capacity then.... M
	public static void main(String s[]) {
		
		int[] W = {6,3,4,2};
		int[] V = {30,14,16,9};
		
		int M=10;
		
		int optimalValue= unboundedKnapsack(W,V,M);
		System.out.println("Optimal value is:"+ optimalValue);
		
		}

	private static int unboundedKnapsack(int[] W, int[] V, int m) {
		// TODO Auto-generated method stub
		
		int wLen = W.length;
		int[] k= new int[m+1];
		k[0] = 0;
		
		int best=0;
		
		for(int w=1; w<=m; w++) {
			for(int i=0; i< wLen;i++) {
				if(w >= W[i]) {
					best= Math.max(k[w-W[i]] + V[i], best);
				}
			}
			k[w] = best;
		}
		
		return k[m];
	
	}
	
}
