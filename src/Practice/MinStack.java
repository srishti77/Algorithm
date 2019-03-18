package Practice;

import java.util.LinkedList;

public class MinStack {

	    /** initialize your data structure here. */
	    int val;
	    int minVal;
	    LinkedList<MinStack> list = new LinkedList<MinStack>();
	    
	    MinStack(){
	    	
	    }
	    public MinStack(int val, int minVal) {
	       this.val = val; 
	       this.minVal = minVal;
	    }
	    
	    public void push(int x) {
	    	int minValue = x;
	    	if(!list.isEmpty()) {
	    		minValue = Math.min(list.get(list.size()-1).minVal, minValue);
	    	}
	    	MinStack minS = new MinStack(x, minValue);
	    	list.add(minS);
	    	
	     
	    }
	    
	    public void pop() {
	       if(!list.isEmpty()) {
	    	   list.remove(list.size()-1);
	       }
	    }
	    
	    public int top() {
	    	  if(!list.isEmpty()) {
		    	  return list.get(list.size()-1).val;
		       }
	    	  else {
	    		  return 0;
	    	  }
	    }
	    
	    public int getMin() {
	    	  if(!list.isEmpty()) {
		    	  return list.get(list.size()-1).minVal;
		       }
	    	  else {
	    		  return 0;
	    	  }
	    }
}
