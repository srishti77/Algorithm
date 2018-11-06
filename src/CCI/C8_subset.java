package CCI;

import java.util.ArrayList;

public class C8_subset {
	
	static ArrayList<String> array= new ArrayList<String>();
	
	static int[] setS= {1,2,3,4,5};
	public static void main(String s[] ) {
		
		subset(0);
		//adding empty string if(number==0)
		array.add("");
		for(int i=0; i< array.size(); i++) {
			System.out.println(array.get(i));
		}
		System.out.println("Size of subsets"+array.size());
	}
	public static void subset(int number) {
		
		
		
		int size= array.size();
		array.add(setS[number]+"");
		for(int i=0; i< size; i++) {
			array.add(array.get(i)+","+ setS[number]);
		}
		
		if(number+1< setS.length)
			subset(number+1);
	}
}
