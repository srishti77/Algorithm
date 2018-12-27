package CCI;

import java.math.BigInteger;

public class StringtoInteger {
	
	public static void main(String s[]) {
		
		System.out.println(myAtoi("    +-13+8"));
		
	}

	public static int myAtoi(String str) {
        int ret=0;
        str= str.trim();
		char[] a1 = str.toCharArray();
		String s="";
		for(int i=0; i<a1.length; i++) {
			
			if((a1[i] == '+' || a1[i]=='-') && i==0 && (i+1) < a1.length && Character.isDigit(a1[i+1])) {
				
					s=s+a1[i]+ a1[i+1];
					i++;
					
			}
			else if(Character.isDigit(a1[i]))
				s= s+a1[i];
			else {
				break;
			}
			
		}
		s= s.replace("+", "");
		
		if(!s.isEmpty()) {
            try{
            	BigInteger bd = new BigInteger(s);
            	BigInteger maxInt = new BigInteger(Integer.MAX_VALUE+"");
            	BigInteger minInt = new BigInteger(Integer.MIN_VALUE+"");
            	
           if(bd.compareTo(maxInt) == 1) {
				ret =Integer.MAX_VALUE;
            }
		
			else if(bd.compareTo(minInt) == -1)
				ret = Integer.MIN_VALUE;
			
			else
				ret =Integer.parseInt(s);
            }
			catch(Exception e){
                return 0;
            }		
        }
		
		return ret;

	}
    
}
