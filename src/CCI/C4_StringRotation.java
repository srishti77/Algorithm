package CCI;

public class C4_StringRotation {

	String word1= "watererbottle";
	String word2="ererbottlewat";
	
	public static void main(String s[]) {
		C4_StringRotation rot= new C4_StringRotation();
		rot.isSubstring();
	}
	
	public void isSubstring() {
		
		int i=0;
		int j=0;
		int start=0;
		boolean rot=false;
		while(i<word1.length()) {
			if(word1.charAt(i)!= word2.charAt(j)) {
				if(j==0)
					i++;
				else
					j=0;
			}
			else {
				if(j==0)
					start=i;
				i++;
				j++;
			}
		}
		
		if(word2.length()-j!=start) {
			rot=false;
			System.out.println("Not rotable");
		}
		
		else {
		for(int p=0; p<start;p++)
		{
			if(word1.charAt(p) == word2.charAt(j)) {
				j++;
				rot=true;
			}
			else {
				System.out.println("Not rotate");
				rot=false;
				break;
			}
		}
		}
		
		if(rot)
			System.out.println("Rotatable");
	}
}
