package CCI;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Power {
	public static void main(String s[]) {
		
		Power power = new Power();
		//System.out.println(power.myPow(
			//	1.00001, 1000, 1));
	}
	
	
	/*public BigDecimal myPow(double x, int n, double d) {
		  final int precision = 20;
	        MathContext mc = new MathContext(precision, RoundingMode.HALF_UP);
	        
        if(n == 0)
        	return d;
        else if(n > 0) {
        	 BigDecimal bd = new BigDecimal(x);
             BigDecimal b = new BigDecimal(d);
             d = bd.multiply(myPow(x, n-1, d));
             //* myPow(x, n-1,d);
		}
		
        else if(n< 0)
			d= 1/x*myPow(x, n+1,d);
		
        return d;
		
    }*/
}
