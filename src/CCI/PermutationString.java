package CCI;

import java.util.ArrayList;
import java.util.HashSet;

public class PermutationString {
	public static void main(String s[]) {
		String str = "1234";
		HashSet<String> hash = new  HashSet<String>();
		getPermutation("", str, hash);
		System.out.println(hash);
	}

	private static void getPermutation(String permutationValue, String str, HashSet<String> arrayList) {
		// TODO Auto-generated method stub
		
		if(str.isEmpty())
		{
			System.out.println(permutationValue);
			arrayList.add(permutationValue);
		}
		
		
		for(int i=0; i< str.length(); i++) {
			
			getPermutation(permutationValue+str.charAt(i), str.substring(0, i)
					+str.substring(i+1), arrayList);
		}
	}
}
