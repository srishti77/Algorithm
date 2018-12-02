package CCI;

public class DinstinctSubsequence {
	public static void main(String args[]) {
		
		char s[]= {'r','a','b','b','b','b','i','t'};
		char t[]= {'r','a','b','b','i','t'};
		
		DinstinctSubsequence dis = new DinstinctSubsequence();
		
		for(int j=0; j<s.length-t.length; j++) {
			char c[] = dis.formCharArray(s, j, j+1, (t.length));	
			dis.distincSeq(s, t, c, j,j+1);		
		}
	}
	
	public void distincSeq(char[] s, char[] t, char[] checkSeq, int start, int i) {
	
		if(i +1 >t.length)
			return;		
		
		else if(checkCharArray(t,checkSeq)) {
			System.out.println(start+" "+(s.length-start-1));
		}
		
		char[] check = formCharArray(s, start, i+start+1, (t.length));
		distincSeq(s, t, check, start,i+1);
		
	}
	
	public char[] formCharArray(char s[], int firstStartIndex, int firstEndIndex, int lastIndex){
		
		char arry[]= new char[lastIndex];
		int k=0;
		for(int i=firstStartIndex; i<firstEndIndex; i++,k++)
			arry[k]= s[i];
		for(int j=0;  j<lastIndex-(firstEndIndex-firstStartIndex); j++) {
			arry[arry.length-1-j]= s[s.length-1-j];
		}
		
		return arry;		
	}
	
	public boolean checkCharArray(char p[], char t[]){
		for(int i=0; i< p.length; i++) {
			if(p[i]!=t[i]) {
				return false;
			}
		}
		return true;
	}
}
