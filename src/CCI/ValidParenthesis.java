package CCI;

import java.util.Stack;

public class ValidParenthesis {
	
	public static void main(String s[]) {
		String input = "}";
		System.out.println(validateParen(input));
	}
	
	public static boolean validateParen(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		if(s.isEmpty())
			return true;
		for(int i=0; i<s.length(); i++){
            char current = s.charAt(i);
            if(current == '(' || current == '{' || current == '['){
                stack.push(current);
            }
            else{
            	if(stack.isEmpty())
            		return false;
            	Character top = stack.pop();
            	System.out.println(top);
                if( top =='('  && current != ')'){
                    return false;
                }
                else if( top =='{'  && current != '}'){
                    return false;
                }
                else if(top =='['  && current != ']')
                	return false;
                   
            }
        }
	
		return stack.isEmpty();
	}
}
