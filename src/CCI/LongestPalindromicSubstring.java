package CCI;

public class LongestPalindromicSubstring {
	public static void main(String s[]) {
		String string1 = "qabbaxyzp";
		
		String string2 = "xyzabbapi";
		
		longestPalindromicSubstring(string1, string2);
	}

	private static void longestPalindromicSubstring(String string1, String string2) {
		// TODO Auto-generated method stub
		int m = string1.length(), n = string2.length();
		int[][] l = new int[m+1][n+1];
		String[][] s = new String[m+1][n+1];
		int result =0;
		String pali="";
		String maxPali="";
		for( int i=0; i<=m; i++) {
			
			for(int j=0; j<=n; j++) {
				
				if(i==0 || j==0)
					s[i][j] = "";
				
				else if(string1.charAt(i-1) == string2.charAt(j-1)) {
									
					s[i][j] = s[i-1][j-1] + string1.charAt(i-1);
					
					if(isPalindrome(s[i][j]) && s[i][j].length() > maxPali.length()) {
						maxPali = s[i][j];
					}
					
				}
				else {
					s[i][j] ="";
					pali ="";
				}	
			}
			
		}
		System.out.println("Result "+result);
		System.out.println(maxPali);

		
	}

	private static boolean isPalindrome(String pali) {
		// TODO Auto-generated method stub
		
		if(pali.length() ==0 || pali.length() ==1)
			return true;
		else if(pali.charAt(0) == pali.charAt(pali.length()-1))
			return isPalindrome(pali.substring(1, pali.length()-1));
		
		return false;
	}
}
