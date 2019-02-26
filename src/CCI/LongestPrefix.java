package CCI;

public class LongestPrefix {

	public static void main(String args[]) {
		String[] strs = {"aaaabcd", "aaaaaaaaaabs"};
		System.out.println(longestCommonPrefix(strs));
		
		}
	 public static String longestCommonPrefix(String[] strs) {
		 if(strs.length < 1)
			 return "";
	        int lengthOfFirstString = strs[0].length();
	        String prefix="";
	        
	        outerloop:
	        for(int i=0; i<lengthOfFirstString; i++ ){
	            char charToMatch = strs[0].charAt(i);
	            boolean isSame=true;
	            
	            for(int j=1; j< strs.length;j++){
	                if(i < strs[j].length() && strs[j].charAt(i)==charToMatch){
	                    isSame = true;
	                }
	                else {
	                	isSame = false;
	                    break outerloop;
	                }
	            }
	            if(isSame)
	                prefix=prefix+charToMatch;
	        }
	        return prefix;
	    }

}
