package CCI;

import java.util.HashSet;
import java.util.Set;

public class PermutationDups {
	Set<String> setOfPermutation = new HashSet();
	
	public static void main(String s[]) {
		
		PermutationDups dups = new PermutationDups();
		dups.printPermutationString("helo", "");
		
		System.out.println(dups.setOfPermutation);
	}
	
	void printPermutationString(String oldString, String newString) {
		
		if(oldString.isEmpty()) {
			setOfPermutation.add(newString);
		}
		
		for(int i=0; i< oldString.length(); i++) {
			String newStr = newString+oldString.charAt(i)+"";
			printPermutationString(oldString.substring(0, i)+oldString.substring(i+1), newStr);				
		}
	}
}
