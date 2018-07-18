
public class SubStrPalindrome {
	
	public static void main(String args[]) {
		
		String word = "aabbabc";
		int k = word.length()-1;
		int max=0;
		String sub="";
		
		for(int i=0; i<word.length()-1; i++) {
			while(i<k) {
				String subWord = word.substring(i,k+1);
				
				if(checkPalindrome(subWord)) {
					//System.out.println(subWord);
					if(max < subWord.length())
					{
						sub = subWord;
						max= subWord.length();
					}
					break;
				}
					
				else {
					k--;
				}
				
			}
			
			k=word.length()-1;
		}
		
		System.out.println(sub);
		
	}

	public static boolean checkPalindrome(String word) {
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
