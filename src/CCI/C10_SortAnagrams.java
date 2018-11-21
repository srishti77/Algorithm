package CCI;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class C10_SortAnagrams {
	
	public static void main(String s[]) {
		String[] array = {"cat", "dog", "act", "god","tac"};
		
		sortAnagrams(array);
	}
	
	public static void sortAnagrams(String[] array) {
		HashMap<Integer, ArrayList<String>> map= new HashMap<Integer, ArrayList<String>>();
		for(int i=0; i< array.length; i++) {
			char[] words= array[i].toCharArray();
			
			Arrays.sort(words);
			String sortedWord = new String(words);
			int hashCode = sortedWord.hashCode();
			
			if(!map.containsKey(hashCode)) {
				ArrayList<String> list= new ArrayList<String>();
				list.add(array[i]);
				map.put(hashCode, list);
			}
			
			else if(map.containsKey(hashCode)) {
				map.get(hashCode).add(array[i]);
				
			}
		}
		
		
		for(int i: map.keySet()) {
			ArrayList<String> list = map.get(i);
			if(list.size()>1)
				System.out.println(list);
		}
	}
}
