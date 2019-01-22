package CCI;

import java.util.HashSet;
import java.util.Set;

public class CoinChangeMin {
	Set<String> set = new HashSet<String>();
	public static void main(String s[]) {
		
		CoinChangeMin minCoin = new CoinChangeMin();
		int array[] = {1,2,5};
		int amount = 5;
		//System.out.println(minCoin.combinationCoin(array, amount));
		System.out.println();
	}
	
	
	public int combinationCoin(int[] array, int num, int index) {
		
		if(num ==0) {
			return 1;
		}
		int res =0;
		int demAmt = array[index];
		/*for(int i=0; i*< array.length; i++) {
			
			if(num >= array[i]) {
				
				res += combinationCoin(array, num-array[i]);
			}
				
		}*/
		//set.add(newNumbers);
		return res;
	}
}
