package CCI;
public class LongestSubStrPalindrome {

	static String str= "ccccccccccccccccccccccccccccccccccccccccccccccc"
			+ "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"
			+ "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"
			+ "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"
			+ "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"
			+ "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"
			+ "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"
			+ "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"
			+ "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"
			+ "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"
			+ "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"
			+ "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"
			+ "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"
			+ "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"
			+ "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"
			+ "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"
			+ "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccc";
	
	public static void main(String arg[]) {
		
		LongestSubStrPalindrome longop= new LongestSubStrPalindrome();
		System.out.println(longop.longestPalindrome(str));
	}
	
	public String longestPalindrome(String str) {
		boolean pali=false;
	        int max=0;
	        String maxSub="";
	        int n =str.length();
	        for(int i=0; i< n; i++) {
				for(int j=i+1; j<n; j++) {
				String word = str.substring(i,j+1);
				System.out.println("word "+word);
				if(checkPalindrome(word)) {
				System.out.println("word "+word);
	            if(max < word.length())
				{
					max= word.length();
					maxSub= word;
					
				}
			}
	        
			}
	    	}
	        
	        if(max==0)
	        	return str.charAt(0)+"";
	        
			
	        return maxSub;
		
	}
	
	public boolean checkPalindrome(String word) {
		boolean pali=false;
		//System.out.println("word---"+word);
		int n= word.length();
		for(int i=0; i<n/2;i++ ) {
			
			if(word.charAt(i)==(word.charAt(n-1-i))) {
				pali=true;
			}
			else {
				pali=false;
				break;
			}
			
		}

		return pali;
	}
	
}
