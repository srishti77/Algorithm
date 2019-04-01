package mockinterview;

public class LongestPalindromicSubString {
	String pali = "";
	int maxLen = 0;
	int len = 0;
	int startIndex = 0;
	int endIndex = 0;

	public static void main(String s[]) {

		String str = "babad";
		LongestPalindromicSubString pal = new LongestPalindromicSubString();
		System.out.println(pal.longestPalindrome(str));
		System.out.println(pal.pali);
	}

	public int longestPalindrome(String s) {
		int size = s.length();
		
		if (size < 2) {
			return size;
		}
		
		if (s.charAt(0) == s.charAt(size - 1)) {
		
			len = 2 + longestPalindrome(s.substring(1, size - 1));

		} else {
			if(longestPalindrome(s.substring(1)) >  longestPalindrome(s.substring(0, size - 1))) {
				pali = s.substring(1);
			}
			else {
				pali = s.substring(0, size - 1);
			}
			
		}

		//maxLen = Math.max(maxLen, endIndex - startIndex);
		return len;
	}

	public int palindrome(String s) {
		boolean flag = true;
		int len = s.length();
		for (int i = 0; i < len / 2; i++) {
			if (s.charAt(i) != s.charAt(len - 1 - i)) {
				flag = false;
				break;
			}
		}
		if (flag)
			return len;
		return 0;
	}
}
