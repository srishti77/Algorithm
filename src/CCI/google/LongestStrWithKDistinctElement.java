package CCI.google;

import java.util.Arrays;

public class LongestStrWithKDistinctElement {
	int chars[] = new int[26];
	public static void main(String s[]) {
		
		LongestStrWithKDistinctElement distinctEle = new LongestStrWithKDistinctElement();
		distinctEle.kUniqueElement("aabbcc", 2);
		
	}
	
	public String kUniqueElement(String s, int k) {
		
		
		int len = s.length();
		int uniqueNumbers=0;
		
		for(int i=0; i<len; i++) {
			
			if(chars[s.charAt(i) - 'a'] ==0)
				uniqueNumbers++;
			
			chars[s.charAt(i) - 'a']++;
		}
		
		if(uniqueNumbers <= k)
			return s;
		
		int curStart=0, curEnd= 0;
		Arrays.fill(chars, 0);
		
		int maxWindowStart =0, maxWindowEnd=0, maxWindowSize =1;
		
		chars[s.charAt(0) - 'a']++;
		for(int i=1; i<len; i++) {
			
			chars[s.charAt(i) - 'a']++;
			curEnd++;
			
			while(!validArray(chars, k)) {
				chars[s.charAt(curStart)-'a']--;
				curStart++;
				
			}
			
			
			if((curEnd-curStart +1) >  maxWindowSize) {
				maxWindowSize  = curEnd-curStart +1;
				maxWindowStart = curStart;
			}

		}
		String substring =  s.substring(maxWindowStart, maxWindowSize);
		
		System.out.println("Max substring is: "+ substring +" with length "+ maxWindowSize);
		return substring;
		
	}

	private boolean validArray(int[] chars2, int k) {
		// TODO Auto-generated method stub
		int count =0;
		for(int i=0; i<chars.length; i++) {
			if(chars[i] >0)
				count++;
		}
		return count <= k;
	}
}
