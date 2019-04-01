package CCI.google;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class NonRepeatingChar {
	
	LinkedHashMap<Character, Integer> list = new LinkedHashMap<>();
	public static void main(String s[]) {

		NonRepeatingChar non = new NonRepeatingChar();
		System.out.println(non.firstUniqChar("aadadaad"));
	}

	public int firstUniqChar(String s) {
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(list.containsKey(s.charAt(i))) {
				list.put(ch, list.get(ch)+1);
			}
			else {
				list.put(s.charAt(i),1);
			}
		}
		if(list.isEmpty())
			return -1;
		
		for(java.util.Map.Entry<Character, Integer> entry : list.entrySet()) {
			if(entry.getValue() == 1) {
				return s.indexOf(entry.getKey());
			}
		}
		return -1;
	}
}
