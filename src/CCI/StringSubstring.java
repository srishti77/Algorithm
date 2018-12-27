package CCI;

import java.util.HashSet;
import java.util.Set;

public class StringSubstring {
	static Set<String> set = new HashSet<String>();
	public static void main(String s[]) {
		set.add("");
		subString("", "abc");
		
		System.out.println(set);
	}
	
	public static void subString(String current, String original) {
		
		if(original.isEmpty())
			return;
		
		for(int i=0; i<original.length(); i++) {
			
			String newCurrent = current+original.charAt(i);
			set.add(newCurrent);
			
			subString(newCurrent, original.substring(0,i)+original.substring(i+1));
		}
		
	}
	
	
}
