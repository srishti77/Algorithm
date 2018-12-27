package CCI;

public class DivideTwoInt {
	
	public static void main(String s[]) {
		
		System.out.println(divide(-2147483648, -12));
		
	}
	 public static int divide(int dividend, int divisor) {
	      
	        long dividend_l = dividend;
	        long divisor_l = divisor;
	        
	        long currentQuotientBase = 1;
	    
	        long quotent =0;
	       
	        boolean negativ = false;
	        if(dividend_l <0 && divisor_l <0){
	        	dividend_l = dividend_l * (-1);
	            divisor_l = divisor_l * (-1);
	        }
	        else if(dividend_l <0){
	            negativ = true;
	            dividend_l = dividend_l * (-1);
	        }
	        
	         else if(divisor <0){
	            negativ = true;
	            divisor_l = divisor_l * (-1);
	        }
	       
	        
	         long currentDiv = divisor_l;
	        
	        
	         
	        while(divisor_l <= dividend_l){
	        	
	            if(currentDiv <= dividend_l){
	            	dividend_l -=currentDiv;
	                quotent += currentQuotientBase;
	                
	                currentQuotientBase *=2;
	                currentDiv *=2;
	                
	            }
	            else{
	                 currentQuotientBase /=2;
	                currentDiv /=2;
	                
	            }
	        }
	     
	        if(negativ) {
	        	quotent = quotent*(-1);
	        	
	        	if(quotent > Integer.MAX_VALUE)
	        		return Integer.MAX_VALUE;
	        	else if(quotent < Integer.MIN_VALUE)
	        		return Integer.MIN_VALUE;
	        	else
	        		return (int)quotent;
	        }
	           
	         else {
		        	
		        	if(quotent > Integer.MAX_VALUE)
		        		return Integer.MAX_VALUE;
		        	else if(quotent < Integer.MIN_VALUE)
		        		return Integer.MIN_VALUE;
		        	else
		        		return (int)quotent;
	         }
	           
	        
	    }
	}