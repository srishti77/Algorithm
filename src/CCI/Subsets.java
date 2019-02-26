package CCI;

import java.util.Arrays;
import java.util.*;
public class Subsets {
	
	Set<Set<String>> sets = new HashSet<Set<String>>();
	
	public static void main(String s[]) {
		
		int[] array = {1,2,3};
		Subsets subSet = new Subsets();
		
		subSet.findSubset(array, new HashSet<String>());
		
		Iterator iterate = subSet.sets.iterator();
		System.out.println("Size "+subSet.sets.size());
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
	}

	private void findSubset(int[] array, Set<String> set) {
		// TODO Auto-generated method stub
		if(array.length == 0) {
			
			return;
		}
		
		for(int i=0; i< array.length; i++) {
			if(array[i] !=0) {
				Set<String> set1 = new HashSet<>();
				set1.addAll(set);
				set1.add(array[i]+"");
				sets.add(set1);
				//System.out.println("String: "+( str));
				int[] newArray = new int[array.length-1];
				if(i==0) {
					System.arraycopy(array, i+1, newArray, 0, array.length-i-1);
				}
				else if(i == array.length -1) {
					
					System.arraycopy(array, 0, newArray, 0, i-1);		
				}
					
				else {
					
					System.out.println("i "+i);
					System.arraycopy(array, 0, newArray, 0, i-1);
					System.arraycopy(array, i+1, newArray , i,array.length-i-1);
				}
				findSubset(newArray, set1);
			}
			
		}
	}
}
