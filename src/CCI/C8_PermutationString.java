package CCI;

import java.util.ArrayList;

public class C8_PermutationString {
	
	public static void main(String s[]) {
		
		String word = "Sriht";
		C8_PermutationString str = new C8_PermutationString();
		ArrayList<String> strArray = str.getPerms(word);
		System.out.println(strArray);
	}
	
	public ArrayList<String> getPerms(String str){
		if(str == null)
			return null;
		ArrayList<String> permutation = new ArrayList<String>();
		if(str.length() == 0) {
			permutation.add("");
			return permutation;
		}
		
		char first = str.charAt(0);
		ArrayList<String> words = getPerms(str.substring(1));
		//System.out.println(first+" "+words);
		for(String word: words) {
			for(int i=0; i<=word.length(); i++) {
			
				String s= insertCharAt(word, first, i);
				permutation.add(s);
			}
				
		}
		return permutation;
	}
	
	String insertCharAt(String word, char c, int position) {
		
		String subStr= word.substring(0,position);
		String rem = word.substring(position);
		
		return subStr+c+rem;
		
	}
	
}
