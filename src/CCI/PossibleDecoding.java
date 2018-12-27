package CCI;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PossibleDecoding {
	int ways =0;
	static List<String> set = new ArrayList<String>();
	public static void main(String s[]) {
		String number = "1221";
		
		System.out.println(countPossibleDecoding("",number));
		System.out.println(set);
	}

	private static int countPossibleDecoding(String currentNum,String number) {
		
		
		// TODO Auto-generated method stub
		
		if(number.length() == 1 || number.length() == 0) {
			set.add(currentNum);
			return 1;
		}
			
	
		if(Integer.parseInt(number.charAt(0)+""+number.charAt(1)) <=26)
			return countPossibleDecoding(currentNum+"+"+number.charAt(0)+"-", number.substring(1)) + 
					countPossibleDecoding(currentNum+"+"+number.charAt(0)+"-"+number.charAt(1), number.substring(2));
		else
			return countPossibleDecoding(currentNum+"+"+number.charAt(0)+"-", number.substring(1));
		
		
		
	}
}
