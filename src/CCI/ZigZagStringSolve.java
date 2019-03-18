package CCI;
public class ZigZagStringSolve {

	public static void main(String args[]) {
		String s = "A";
		char[] ch1= s.toCharArray();
		int nums=4;
		int diff= nums-2+nums;
		char[] ch2= new char[s.length()];
		int k=0;
		
		for(int i=0; i<nums && diff>0; i++) {
			int j=0;
			
			while(j+i< s.length() && diff>0) {
				System.out.println((j+i));
				ch2[k]= ch1[j+i];
				k++;
				if(i!=0 && i!=nums-1 && j+diff-i<s.length()) {
					ch2[k] = ch1[j+diff-i];
					System.out.println(j+diff-i);
					k++;
				}
					
				j=j+diff;
			}
			
		}
		
		System.out.println(new String(ch2));
		
	}
}
