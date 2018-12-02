package CCI;

public class InterleavingString {
	
	public static void main(String s[]) {
		char s1[] = {'a', 'a','b','c','c'};
		char[] s2= {'d','b','b','c','a'};	
		char main[]= {'a','a','d','b','b','b','a','c','c','c'};
		
		InterleavingString inter = new InterleavingString();
		System.out.println(inter.checkInterveaning(s1, s2, main));
 	}
	
	public boolean checkInterveaning(char[] c1, char[] c2, char[] c3) {
		
		boolean flag=true;
		int j=0,k=0;
		for(int i=0; i< c3.length; i++) {
			if(j< c1.length && c1[j]==c3[i]) {
				if(k < c2.length && c2[k]== c3[i]) {
					if(k < j)
						k++;
					else
						j++;
				}
				else			
					j++;
				
			}
			
			else if(k < c2.length && c2[k]==c3[i]) {
				k++;
				
			}
			else {
				flag=false;
			}
		}
		return flag;
	}
}
