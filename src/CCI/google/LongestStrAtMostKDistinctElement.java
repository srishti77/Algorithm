package CCI.google;

import java.util.HashSet;
import java.util.Set;

public class LongestStrAtMostKDistinctElement {
	
	int length =0;
	public static void main(String s[]) {
		
		LongestStrAtMostKDistinctElement ele = new LongestStrAtMostKDistinctElement();
		ele.lengthOfLongestSubstringKDistinct("a@b$5!a8alskj234jasdf*()@$&%&#FJAvjjdaurNNMa8ASDF-0321jf?>{}L:fh", 10);
		System.out.println(ele.length);
		
	}
	
	  public void lengthOfLongestSubstringKDistinct(String s, int k) {
		  if(s.isEmpty())
			  return ;
		  if(numberOfUniqueCharacters(s,k)) {
			  length = Math.max(length,s.length());
			 // return true;
		  }
		 
		  int size= s.length();
		   lengthOfLongestSubstringKDistinct(s.substring(1, size), k);
		   lengthOfLongestSubstringKDistinct(s.substring(0, size-1), k);	
	  }
	  
	  public boolean numberOfUniqueCharacters(String s, int limit) {
		  System.out.println("Here");
		  Set<String> set = new HashSet<String>();
		  for(int i=0; i<s.length(); i++) {
			  set.add(s.charAt(i)+"");
			  if(set.size() > limit)
			  {
				  return false;
			  }
		  }
		  return true;
	  }
}
