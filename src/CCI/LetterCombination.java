package CCI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombination {
	
	public static void main(String s[]) {
		HashMap<Character, String> map = new HashMap<Character, String>();
		
		map.put('2', "abc");
		map.put('3', "def");
		
		map.put('4', "ghi");
		map.put('5', "jkl");
		
		map.put('6', "mno");
		map.put('7', "pqrs");
		
		map.put('8', "tuv");
		map.put('9', "wxyz");
		
		System.out.println(letterCombinations("23", map));
		
		
	}
	
	 public static List<String> letterCombinations(String digits, HashMap<Character, String> map) {
	     
		 List<String>  list = new ArrayList<String>();
		 String first =  map.get(digits.charAt(0));
	
		 for(int i=0; i<first.length(); i++) {
			 list.add(first.charAt(i)+"");
		 }
		 
		 for( int i=1; i<digits.length(); i++) {
			 List<String>  sublist = new ArrayList<String>();
			 
			 sublist.addAll(list);
			 list.clear();
			 String numberString = map.get(digits.charAt(i));
		
			 for(int j=0; j<numberString.length(); j++) {
				 for(int k=0; k< sublist.size(); k++) {
					 list.add(sublist.get(k)+ numberString.charAt(j));
					 
				 }
			 }
			
		 }
		 
		 return list;
		 
		 
	  }
}
