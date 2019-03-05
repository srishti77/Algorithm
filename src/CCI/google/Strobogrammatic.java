package CCI.google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strobogrammatic {
	public static void main(String s[]) {
		
		Strobogrammatic strobo = new Strobogrammatic();
		System.out.println(strobo.findStrobogrammatic(3));
		
	}
	
	public List<String> findStrobogrammatic(int n){
		return helper(n,n);
	}

	private List helper(int n, int m) {
		// TODO Auto-generated method stub
		
		if(n ==0) return new ArrayList<String>(Arrays.asList(""));
		if(n == 1) return new ArrayList<String>(Arrays.asList("0", "1", "8"));
		
		
		List<String> list = helper(n-2, m);
		List<String> result = new ArrayList<String>();
		
		for(int i=0; i<list.size(); i++) {
			String s= list.get(i);
			
			if(n != m) result.add("0"+ s+ "0");
			
			result.add("1"+s+"1");
			result.add("6"+s+"9");
			result.add("8"+s+"8");
			result.add("9"+ s+"6");
		}
		return result;
	}
	
	
}
