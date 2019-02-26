package CCI;

public class LPS {
	
	public static void main(String s[]) {
		String str = "bbbba";
		LPS lps = new LPS();
		System.out.println(lps.findLPS(str, 0, str.length()-1));
	}

	private int findLPS(String str, int i, int j) {
		// TODO Auto-generated method stub
		if(i==j && i<5 && j<5)
			return 1;
		
		if(str.charAt(i) ==str.charAt(j) && i+1 ==j) {
			return 2;
		}
		
		if(str.charAt(i) == str.charAt(j)) {
			return findLPS(str, i+1, j-1)+2;
			
		}
		
		return Math.max(findLPS(str, i+1, j), findLPS(str, i, j-1));
		
	}
}
