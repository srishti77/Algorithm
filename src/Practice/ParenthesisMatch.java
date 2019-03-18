package Practice;

import java.util.Stack;

public class ParenthesisMatch {
	
	public static void main(String s[]) {
		
		ParenthesisMatch paren = new ParenthesisMatch();
		
		String str = "([)]";
		
		System.out.println(paren.isValid(str));
	}
	
	 public boolean isValid(String s) {
	     Stack<Character> stack = new Stack<>();   
	     
	     for(int i=0; i< s.length(); i++) {
	    	 char current = s.charAt(i);
	    	 if(current == '(' || current == '{' || current == '[' ) {
	    		 stack.push(current);
	    	 }
	    	 else {
	    		 if(!stack.isEmpty()) {
	    			 char poppedSymbol = stack.pop();
		    		 if(current == ')') {
		    			 if(poppedSymbol != '(')
		    				 return false;
		    		 }
		    		 else  if(current == '}') {
		    			 if(poppedSymbol != '{') 
		    				 return false;
		    		 }
		    		 else  if(current == ']') {
		    			 if(poppedSymbol != '[') 
		    				 return false;
		    		 }
	    		 }
	    		 else {
	    			 return false;
	    		 }
	    		 
	    	 }
	     }
	     
	     if(stack.isEmpty())
	     return true;
	     else
	    	 return false;
	    }
}
