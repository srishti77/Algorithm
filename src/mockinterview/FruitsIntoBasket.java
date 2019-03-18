package mockinterview;

import java.util.HashMap;

import org.w3c.dom.css.Counter;

public class FruitsIntoBasket {
	public static void main(String s[]) {
		
		FruitsIntoBasket fruits = new FruitsIntoBasket();
		
		int[] trees = { 3,3,3,1,2,1,1,2,3,3,4};
		System.out.println(fruits.totalFruits(trees));
		
	}
	
	public int totalFruits(int[] tree) {
		
		int ans =0, i=0;
		
		Counter count = new Counter();
		for(int j=0; j< tree.length; j++) {
			
			count.add(tree[j], 1);
			
			while(count.size() >=3) {
				
				count.add(tree[i], -1);
				if(count.get(tree[i]) == 0) {
					
					count.remove(tree[i]);
				}
				i++;
			}
			System.out.println(i+" "+ j);
			ans = Math.max(ans, j-i +1);
		}
		return ans;	
	}
	
	class Counter extends HashMap<Integer, Integer>{
		
		public int get(int k) {
			return containsKey(k) ? super.get(k) :0;
		}
		
		public void add(int k, int v) {
			put(k, get(k)+v);
		}
	}
	
	
}
