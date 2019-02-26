package CCI;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class C4_PermutationPalindorme {

	HashMap<String, Integer> map= new HashMap<String, Integer>();
	String word= "tactcaapoa";
	public static void main(String s[]) {
		C4_PermutationPalindorme pp= new C4_PermutationPalindorme();
		pp.getCount();
		pp.checkPalindrome();
		pp.display();
	}
	
	public void getCount() {
		int count=1;
		for(int i=0; i<word.length(); i++) {
			
			if(map.get(word.charAt(i)+"")== null) {
			for(int j=i+1; j<word.length(); j++) {
				
				if(word.charAt(i)==(word.charAt(j))) {
					count++;
				}
			}
			map.put(word.charAt(i)+"", count);
			}
			
			
		}
		System.out.println("count:"+count);
	}
	
	public void display() {
		Iterator iterate = map.entrySet().iterator();
		
		while( iterate.hasNext()) {
			Map.Entry pair= (Map.Entry) iterate.next();
			System.out.println(pair.getKey()+" "+ pair.getValue());
		}
	}
	
	public void checkPalindrome() {
		int count= 0;
		Iterator iterate = map.entrySet().iterator();
		
		while( iterate.hasNext()) {
			Map.Entry pair= (Map.Entry) iterate.next();
			
			if((int)(pair.getValue())%2 == 1) {
				if(count <1)
					count++;
				else {
					count++;
					break;
				}
			}
		}
		
		if(count <2)
			System.out.println("true");
		else
			System.out.println("false");
	}
}
