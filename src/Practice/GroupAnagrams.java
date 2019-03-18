package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GroupAnagrams {
	public static void main(String s[]) {
		String[]  words = {"eat", "tea", "tan", "ate", "nat", "bat"};
		GroupAnagrams ana = new GroupAnagrams();
		ana.groupAnagrams(words);
		ana.print(ana.groupAnagrams(words));
	}
	
	public void print( List<List<String>> list) {
		
		for(List l : list) {
			System.out.println(l);
		}
	}
	  public  List<List<String>> groupAnagrams(String[] strs) {
	  
		  HashMap<Integer, List<Integer>> map = new HashMap<>();
		  List<List<String>> list = new ArrayList();
		  for(int i=0; i<strs.length; i++) {
			  
			 char[] tempArray = strs[i].toCharArray();
			 
			 Arrays.sort(tempArray);
			 
			 int hashcode = (new String(tempArray)).hashCode();
			 if(map.containsKey(hashcode)) {
				 map.get(hashcode).add(i);
			 }
			 else {
				 List<Integer> l = new ArrayList<>();
				 l.add(i);
				 map.put(hashcode, l);
			 }
			  
		  }
		  
		  for(Entry<Integer, List<Integer>> entry : map.entrySet()) {
			  List<String> strList = new ArrayList();
			  for(int i : entry.getValue()) {
				 strList.add(strs[i]);
			  }
			  list.add(strList);
		  }
		  
		  return list;
	  }
}
