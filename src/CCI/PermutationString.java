package CCI;

import java.util.ArrayList;
import java.util.HashSet;

public class PermutationString {
	public static void main(String s[]) {
		String str = "Nepal";
		HashSet<String> hash = new  HashSet<String>();
		getPermutation("", str, hash);
		System.out.println(hash.size());
	}

	private static void getPermutation(String permutationValue, String str, HashSet<String> arrayList) {
		// TODO Auto-generated method stub
		
		if(str.isEmpty())
		{
			arrayList.add(permutationValue);
		}
		
		
		for(int i=0; i< str.length(); i++) {
			
			getPermutation(permutationValue+str.charAt(i), str.substring(0, i)+str.substring(i+1), arrayList);
		}
	}
}
