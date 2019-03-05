package CCI.google;

import java.util.Arrays;

public class FirstUniqueCharacter {

	public static void main(String s[]) {

		String str = "loveleetcode";
		
		FirstUniqueCharacter character = new FirstUniqueCharacter();
		character.firstUniqChar(str);
	}

	public void firstUniqChar(String s) {

		int letters[] = new int[26];
		Arrays.fill(letters, 0);
		for(int i=0; i<s.length(); i++) {
			
			letters[s.charAt(i) - 'a']++;
		}
		char c=' ';
		for(int i=0; i<s.length(); i++) {
			if(letters[s.charAt(i) - 'a'] ==1) {
				
				c = s.charAt(i);
				break;
			}
				 
		}
		
		System.out.println(c);
	}
}
