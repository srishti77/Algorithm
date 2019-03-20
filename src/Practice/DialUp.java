package Practice;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class DialUp {

	static HashMap<Integer, char[]> map = new HashMap<>();

	public static void main(String s[]) {

		
		map.put(2, new char[] { 'a', 'b', 'c' });
		
		  map.put(3, new char[] { 'd', 'e', 'f' });
		  map.put(4, new char[] { 'g', 'h', 'i' }); 
		  map.put(5, new char[] { 'j', 'k', 'l' }); map.put(6, new char[] {'m', 'n', 'o' });
		  
		  map.put(7, new char[] { 'p', 'q', 'r', 's' }); 
		  map.put(8, new char[] { 't',  'u', 'v' });
		  map.put(9, new char[] { 'w', 'x', 'y', 'z' });
		 

		DialUp dial = new DialUp();
		System.out.println("Dial: " + dial.letterCombinations("23"));

	}

	public List<String> letterCombinations(String digits) {
	        
		  char array[] = digits.toCharArray();  
		  List<char[]> list = new ArrayList<char[]>();
		  
		  for(int i=0; i< array.length; i++) {
			  int value = Integer.parseInt(array[i]+"");
			  list.add(map.get(value));	  
		  }
		  
		  List<String> finalList = new ArrayList();
		  
		  for(int i=0; i<list.size(); i++) {
			 char[] currentChar =list.get(i);
			 
			 List<String> tempList = new ArrayList<>();
			  if(finalList.isEmpty()) {
				   for(int p=0; p< currentChar.length; p++){
					 finalList.add(currentChar[p]+"");
				 }
			  }
			  else {
					  for(int j =0; j<finalList.size(); j++) {
						  for(int p=0; p< currentChar.length; p++){ 
							  tempList.add(finalList.get(j)+currentChar[p]);
						  }
					  }
				  
					  finalList.clear();
					  finalList.addAll(tempList);
			  }
			  
		  }
		  
		  return finalList;
		  
		  
	    }
}
