package CCI;

import java.util.HashMap;

public class RomanInteger {
	static HashMap<Integer, HashMap<Integer, String>> hashMap = new HashMap<Integer, HashMap<Integer, String>>();
	
	public static void main(String s[]) {
		int number = 3;
		HashMap<Integer, String> hash1= new HashMap<Integer, String>();
		hash1.put(1, "I");
		hash1.put(4, "IV");
		hash1.put(5, "V");
		hash1.put(9, "IX");
		
		hashMap.put(1, hash1);
		
		HashMap<Integer, String> hash2= new HashMap<Integer, String>();
		hash2.put(1, "x");	
		hash2.put(4, "XL");
		hash2.put(5, "L");
		hash2.put(9, "XC");
		
		hashMap.put(2, hash2);
		
		HashMap<Integer, String> hash3= new HashMap<Integer, String>();
		hash3.put(1, "C");
		hash3.put(4, "CD");
		
		
		hash3.put(5, "D");
		hash3.put(9, "CM");
		
		hashMap.put(3, hash3);
		
		HashMap<Integer, String> hash4 = new HashMap<Integer, String>();
		hash4.put(1, "M");
		
		hashMap.put(4, hash4);
		
		System.out.println(convertRomain(number));
	}

	private static String convertRomain(int number) {
		String value = "";
	
			for(int i=0; number > 0; i++) {
				int r = number%10;
				number = number/10;
				value = generateRoman(r,i+1)+value;
			}
			return value;
		
	}

	private static String generateRoman(int num, int i) {
		// TODO Auto-generated method stub
		
		if(num == 0)
			return "";
		
		String value="";
		value = hashMap.get(i).get(num);
			if(value == null) {
				value="";
				if(num < 4) {
					for(int j=1; j<= num;j++) {
						value=value+ hashMap.get(i).get(1);
					}
				
				}
				
				else if(num >5) {
					value= hashMap.get(i).get(5);
					for(int j=6; j<= num;j++) {
						value=value+ hashMap.get(i).get(1);
					}
				}
				
			}
			
			
				return value;
	
	}
}
