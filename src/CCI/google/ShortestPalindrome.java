package CCI.google;

public class ShortestPalindrome {

	public static void main(String s[]) {
		ShortestPalindrome shortestPali = new ShortestPalindrome();
		String str = "abcd";
		System.out.println(shortestPali.shortestPalindrome(str));
	}

	 public String shortestPalindrome(String s) {    
	        int length = s.length();
	        int number = shortestPal( s);
	        System.out.println(number);
	        String newStr = s;
	        for(int i=number-1; i >=0; i-- ){
	        	newStr= s.charAt(length-1-i)+ newStr;
	        }
			return newStr;
	    }
	    public int shortestPal(String s) {
	    		int length = s.length();
			for(int i=length-1; i>=0; i--) {
				if(isPalindrome(s, 0, i))
					return (length-i-1);
			}
			
			return length;
		}

		private boolean isPalindrome(String s, int i, int i2) {
			// TODO Auto-generated method stub
			while(i<i2) {
				
				if(s.charAt(i) != s.charAt(i2))
					return false;
				i++;
				i2--;
				
			}
			return true;
		}
}
