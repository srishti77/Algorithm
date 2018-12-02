package CCI;

import java.util.HashMap;

public class RomainToInt {
	static HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
	
	public static void main(String s[]) {
		String value = "IV";
		hashMap.put( "I", 1);
		hashMap.put("IV", 4);
		hashMap.put("V", 5);
		hashMap.put("IX", 9);
		hashMap.put("X", 10);
		hashMap.put("XL", 40);
		hashMap.put("L", 50);
		hashMap.put("XC", 90);
		
		hashMap.put( "C", 100);
		hashMap.put("CD", 400);		
		hashMap.put("D", 500);
		hashMap.put("CM", 900);
		hashMap.put("M", 1000);
		System.out.println(convertRomainToInt(value));
	}

	private static int convertRomainToInt(String value) {
		// TODO Auto-generated method stub
		
		int num=0;
		
		if(value.length()<2) {
			return hashMap.get(value);
		}
		
		if(value.length() >2) {
			int i=0;
			for( i=0; i<value.length()-1; i++) {
				//System.out.println(i);
				
				Integer getElement = hashMap.get(value.charAt(i)+""+value.charAt(i+1)+"");
				if(getElement == null) {
					num = num + hashMap.get(value.charAt(i)+"");
				}
				else {
					num = num+ getElement;
					i++;
				}
			}
			
			if(i < value.length()) {
				//System.out.println(i+" i");
				num = num +  hashMap.get(value.charAt(i)+"");
			}
		}
		return num;
	}
}
