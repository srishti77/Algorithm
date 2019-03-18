package mockinterview;

public class StringDash {
	public static void main(String s[]) {

		//S = "5F3Z-2e-9-w", K = 4
		StringDash dash = new StringDash();
		
		String code = "2-5g-3-J";
		
		int K = 2;
		
		dash.licenseKeyFormatting(code, K);
	}

	public void licenseKeyFormatting(String S, int K) {
		String sb = new String();
		int len = S.length();
		int saveK =K;
		for(int i=len-1; i>=0; i--) {
			
			if(S.charAt(i) != '-') {
				sb = (S.charAt(i)+"").toUpperCase()+sb;
				K--;
				
			}
			if(K==0) {
				sb = "-"+sb;
				K=saveK;
			}
		}
		if(sb.charAt(0)=='-')
			sb = sb.substring(1);
		
		System.out.println("String is: "+sb);
	}
}
