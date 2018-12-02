package CCI;

public class ImplementStrString {
	
	public static void main(String[] str) {
		System.out.println(strStr("hello", "ll"));
	}
	
	 public static int strStr(String haystack, String needle) {
	        if(needle.isEmpty())
	            return 0;
	            
	        int p = -1;
	        int haystackLen = haystack.length();
	        int needleLen =  needle.length();
	        for(int i=0; i<haystackLen; i++){
	            int k=i;
	            int j =0;
	            while(j < needleLen && i< haystackLen && haystack.charAt(k) == needle.charAt(j)){
	            
	                j++;
	                k++;
	            }
	          
	            if(j == needleLen)
	                return i;
	        }
	        return p;
	    }
}
