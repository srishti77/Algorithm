package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Factorial {
	int target;
	List<List<Integer>> list = new ArrayList<List<Integer>>();
	public static void main(String s[]) {
		
		Factorial fact = new Factorial();
		fact.getFactors(12, 1,12, new ArrayList<>());
		fact.print();
	}

	public void print() {
		System.out.println(list.size());
		for(List<Integer> tempList: list) {
			System.out.println(tempList);
		}
	}
	public void getFactors(int n, int prod,  int target, List<Integer> myList) {
		if(n > target)
			return;
		
		if(prod == target) {
			//Collections.so
			List<Integer> newTemp = new ArrayList<Integer>(myList);
			Collections.sort(newTemp);
			if(!list.contains(newTemp))
				list.add(newTemp);
			return;
		}
		
		for(int i=2; i<=target/2+1; i++) {
			
			if(n%i ==0) {
				n = n/i;
				myList.add(i);
				prod = prod*i;
				getFactors(n, prod,target, myList);
				//System.out.println(myList+ " "+n+" "+prod);
				int val =myList.remove(myList.size()-1);
				prod =prod/val;
				n= n*val;
			}
		}
	}

}
