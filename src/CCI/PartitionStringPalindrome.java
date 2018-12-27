package CCI;

public class PartitionStringPalindrome {
	static int count =-1;
	public static void main(String args[]) {
		
		PartitionStringPalindrome part = new PartitionStringPalindrome();
		part.findPalindrome("aabcaa", 0);
		System.out.println(count);
	}
	
	public void findPalindrome(String word,int start) {
		
		if(start >= word.length())
			return;
		else {
			String wordToCheck = word.substring(start);
			System.out.println(wordToCheck);
			int i=0;
			
			while(!checkPalindrome(wordToCheck)) { 
				i++;
				wordToCheck = word.substring(start, word.length()-i);
			}
			if(i<=word.length())
				count++;
			findPalindrome(word, word.length()-i);
			
		}		
	}

	private boolean checkPalindrome(String array) {
		
		if(array.length() == 1||array.length() ==0)
			return true;
		else
		{
			if(array.charAt(0) == array.charAt(array.length()-1)) {
				return checkPalindrome(array.substring(1, array.length()-1));
			}
		}
		return false;
	}
}
