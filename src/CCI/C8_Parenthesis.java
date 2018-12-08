package CCI;

import java.util.HashSet;

public class C8_Parenthesis {
	public static void main(String args[]) {
		
		HashSet<String> set= new HashSet<String>();
		
		C8_Parenthesis paren = new C8_Parenthesis();
		set=paren.buildPrenthesis(4);
		
		System.out.println(set);
	}
	
	public HashSet<String> buildPrenthesis(int count) {
		
		HashSet<String> set = new HashSet<String>();
		if(count ==0) {
			set.add("");
			return set;
		}
		
		HashSet<String> hashSet = buildPrenthesis(count-1);
		//System.out.println(hashSet);
		for(String element: hashSet) {
			set.addAll(addParenthesis(element));
		}
		
		return set;
		
	}

	private HashSet<String> addParenthesis(String element) {
		// TODO Auto-generated method stub
		//add in the beginning+
		HashSet<String> str= new HashSet<String>();
		if(element.isEmpty()) {
			str.add("()");
		}
		else {
		str.add("()"+element);
		str.add("("+element+")");
		str.add(element+"()");
		}
		return str;
	}
}
