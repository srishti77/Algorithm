package CCI;

import java.util.ArrayList;
import java.util.List;

public class KNumbersAddsToN {
	
	public static List<List<Integer>> listOfList = new ArrayList<List<Integer>>();
	
	public static void main(String s[]) {
		
		KNumbersAddsToN ktoN = new KNumbersAddsToN();
		ktoN.possibleCombination(1, 3, 7, new ArrayList());
		
		//System.out.println("Size:"+ ktoN.listOfList.size());
		//ktoN.
	}

	public void print(List<List<Integer>> listOfList) {
		for(List<Integer> list: listOfList) {
			System.out.println(list);
		}
	}
	private void possibleCombination(int start, int k, int sum, List<Integer> list ) {
		// TODO Auto-generated method stub
		
		if(sum ==0 && list.size() == k) {
			//System.out.println("Here");
			listOfList.add(new ArrayList<Integer>(list));
			return;
		}
		if(start > 9) return;	
		for(int i=start; i<10; i++) {
			list.add(i);
			//int sumNew = sum -i;
			possibleCombination(i+1, k, sum-i, list);
			System.out.println(list);
			list.remove(list.size()-1);
		}
	}

}

