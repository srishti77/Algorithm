package CCI;

import java.util.HashMap;

public class NthUglyNumber {
	public static void main(String s[]) {
		NthUglyNumber numb = new NthUglyNumber();
		System.out.println(numb.nthUglyNumber(477));
	}
	
	 public int nthUglyNumber(int n) {
	        
	        HashMap<Integer,Boolean> list = new HashMap<Integer,Boolean>();
	       
	        if(n == 1){
	             return 1;
	        }
	        list.put(0,true);
	        list.put(1,true);   
	        int i=2;
	        
	        while(n-1> 0){
	            
	            if(i%2 == 0){
	              
	                boolean result = list.get(i/2);
	                list.put(i, result);
	                if(result)
	                    n--;
	             

	            }
	            
	             else if(i%3 == 0){
	                boolean result = list.get(i/3);
	                list.put(i, result);
	                if(result)
	                    n--;
	                            

	            }
	            
	             else if(i%5 == 0){
	                boolean result = list.get(i/5);
	                list.put(i, result);
	                if(result)
	                    n--;
	                     

	            }
	            else{
	                 list.put(i, false);
	            }
	            i++;
	            
	            
	        }
	        System.out.println("List count"+list.size());
	        return i-1;
	        
	    }
}
