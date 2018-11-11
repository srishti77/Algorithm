package CCI;

public class GreedyAlgo {
	
	public static void main(String s[]) {
		int W[]= {6,5,3};
		int V[]= {30,25,20};
		int capacity=20;
		
		GreedyAlgo alg= new GreedyAlgo();
		int optimalValue= findOptimal(W,V,capacity);
		System.out.println("Optimal Value"+ optimalValue);
 	}

	private static int findOptimal(int[] W, int[] V, int capacity) {
		// TODO Auto-generated method stub
		int cap= capacity+1;
		int k[] = new int[cap];
		String[] dig = new String[cap];
		k[0]=0;
		int best=0;
		String currentValue="";
		for(int w=1; w<cap; w++ ) {
			
			for(int i=0; i< W.length; i++) {
				if(w>=W[i]) {
					int val= k[w-W[i]] + V[i];
				
					if(val >best) {
						best= val;
						currentValue= dig[w-W[i]] + W[i];
					}
						
					
				}
			}
			dig[w] = currentValue;
			k[w] = best;
			
		}
		System.out.println("combo "+dig[capacity]);
		
		return k[capacity];
	}
}
