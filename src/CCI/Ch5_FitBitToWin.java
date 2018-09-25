package CCI;

import java.util.ArrayList;

public class Ch5_FitBitToWin {
	
	public static void main(String s[]) {
		
		ArrayList<Integer> seq = new ArrayList<Integer>();
		int n=1775;
		int searchingFor=0;
		int counter=0;
		
		for(int i=0; i< 11; i++) {
			
			if((n & 1) != searchingFor) {
				
				seq.add(counter);
				searchingFor = n&1;
				counter =0;
			}
			counter++;
			n >>>= 1;
		}
		
		seq.add(counter);
		
		for(int i=0; i< seq.size(); i++) {
			System.out.println(seq.get(i));
		}
	}
	
}
