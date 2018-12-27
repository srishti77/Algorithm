package CCI;

public class Palindrome {
	

		public static void main(String s[]){
			Palindrome pali = new Palindrome();
			StringBuilder str = new StringBuilder("abba");
			
			str.setCharAt(1,'o');
			System.out.println(str);
			System.out.println("Is Palindrome "+pali.checkPalindrome(str));
	}


	public boolean checkPalindrome(StringBuilder s){
	if(s.length() ==1 || s.length() ==0)
		return true;
	if(s.charAt(0) != s.charAt(s.length()-1)){
		return false;
	}
	s.deleteCharAt(0);
	s.deleteCharAt(s.length()-1);
	return checkPalindrome(s);
	}


}
