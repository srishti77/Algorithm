package CCI;
public class RepeatedStringMatch {
	
	public static void main(String s[]) {
		
		String A= "a";
		String B= "aa";
		RepeatedStringMatch strMatch = new RepeatedStringMatch();
		System.out.println("String match: "+strMatch.repeatedStringMatch(A, B));
	}
	  public int repeatedStringMatch(String A, String B) {
		  
		  
	        
	        int value = (int) Math.ceil((double)B.length()/(double)A.length());
	        String S= "";
	        System.out.println(value);
	        for(int i=0; i<value; i++) {
	        	S+=A;
	        }
	       
	        if(S.contains(B)) {
	        	return value;
	        }
	        	
	        else if((A+S).contains(B)) {
	        	return value+1;
	        }
	        
	        
	      /*  int count =0;
	        
	        while(!A.contains(B)){	
	            count++;
	            A=A+oldA;
	        }*/
	        
	        else {
	        	return -1;
	        }
	    }
}
