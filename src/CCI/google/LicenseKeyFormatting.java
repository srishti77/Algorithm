package CCI.google;

/*
 *  S = "5F3Z-2e-9-w", K = 4
	output: "5F3Z-2E9W"
 */
public class LicenseKeyFormatting {

	public static void main(String s[]) {
		
		
		LicenseKeyFormatting keyFormat = new LicenseKeyFormatting();
		String S= "5F3Z-2e-9-w";
		System.out.println(keyFormat.licenseKeyFormatting(S, 4));
		
	}

	public String licenseKeyFormatting(String S, int K) {
        String newString ="";
		 int OriginalK = K;
		 for(int i=S.length()-1; i>=0; i--) {
			 if(S.charAt(i)!= '-') {
				 
				 newString = (S.charAt(i)+"").toUpperCase() +newString;
				 K--;
				 
				 if(K ==0 && i!=0)
				 {
					 newString = "-"+newString;
					 K= OriginalK;
				 }
			 } 
		 }
        if(!newString.isEmpty() && newString.charAt(0) == '-') {
			 newString=newString.replaceFirst("-", "");
		 }
		 return newString;
	}
}
