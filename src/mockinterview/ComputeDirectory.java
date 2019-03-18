package mockinterview;

import java.util.ArrayList;
import java.util.List;

public class ComputeDirectory {
	public static void main(String s[]) {

		String directory ="dir\nfile.txt";
		directory = directory.replace("\t", "1").replaceAll("\n", "-");
		System.out.println(directory);
		ComputeDirectory direc = new ComputeDirectory();
		
		System.out.println(direc.lengthLongestPath(directory));
	}

	public int lengthLongestPath(String input) {
		int totalLength =0;
	
		
	   List<String> list = new ArrayList();
	   //int depth =0;
	       
	       String[] words = input.split("-");
	       if(words.length == 1) {
	    	   if(words[0].contains("."))
	    		   return words[0].length();
	    	   else
	    		   return 0;
	       }
	       list.add(words[0]);
	       
	       for(int i=1; i< words.length; i++ ) {
	    	   int currentDepth =0;
	    	   for(int j=0; j< words[i].length(); j++) {
	    		   words[i] = words[i].replace(" ", "");
	    		   if(words[i].charAt(0) == '1') {
	    			   currentDepth++;
	    			  
	    			   words[i] = words[i].substring(1);
	    		   }
	    		   
	    		   else
	    			   break;
	    	   }
	    	  
	    	   if(currentDepth > list.size()-1) {
	    		   list.add(words[i]);
	    	   }
	    	   
	    	   else {
	    		  // 
	    		   while(!(currentDepth > list.size()-1) && currentDepth != 0 && !list.isEmpty()) {
	    			  
	    			   String last = list.get(list.size()-1);
	    			   System.out.println(list+ " "+ last+" "+  currentDepth);
	    			   if(last.contains(".")) {
	    				   totalLength = Math.max(totalLength, computeSum(list)); 
	    			   }
	    			  list.remove(list.size()-1);
	    			 
	    		   }
	    		   list.add(words[i]);
	    		   //depth++;
	    	   } 
	       }
	       if(list.get(list.size()-1).contains(".")) {
	    	   System.out.println(list);
			   totalLength = Math.max(totalLength, computeSum(list)); 
		   }
	     
	       return totalLength;
	 }

	private int computeSum(List<String> list) {
		// TODO Auto-generated method stub
		int length =0;
		for(int i=0; i< list.size(); i++) {
			
			length += list.get(i).length();
			length++;
			
		}
		return length-1;
	}
}
