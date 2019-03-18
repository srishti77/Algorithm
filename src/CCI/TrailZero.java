package CCI;
import java.math.BigInteger;

public class TrailZero {


	public static void main(String args[]) {
		TrailZero trail= new TrailZero();
		
		System.out.println(trail.trailingZeros(105));
	}
	
	    public long trailingZeros(long n) {
	        // write your code here, try to do it without arithmetic operators.
	        BigInteger fact = new BigInteger(1+"");
	        long count =0;
	        BigInteger divide= new BigInteger(10+"");
	        for(long i=n; i>1;i--){
	            fact= fact.multiply(new BigInteger(i+""));
	           
	        }
	      
	        while(fact.compareTo(BigInteger.valueOf(0)) >0 &&
	        		fact.remainder(new BigInteger(divide+"")).equals(BigInteger.ZERO)){
	        
	        	
	        
	        	count++;
	            divide=divide.multiply(BigInteger.valueOf(10));
	        }
	        
	        return count;
	    }
	
}
