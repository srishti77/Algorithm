package Practice;

public class CheckStrobogrammatic {
	
	public static void main(String s[]) {
		
		String str = "609";
		
		CheckStrobogrammatic ch = new CheckStrobogrammatic();
		System.out.println(ch.isStob(str));
	
	}
	
	public boolean isStob(String str) {
		int len = str.length();
		for(int i=0; i<len/2; i++) {
			char first = str.charAt(i);
			char second = str.charAt(len-1-i);
			if((first == '8' && second == '8') || (first == '0' && second == '0') ||
					(first == '6' && second == '9') || (first == '9' && second == '6')
					||(first == '6' && second == '6') || (first == '9' && second == '9') ) {
				
				continue;
			}
		
			else {
				return false;
			}
				
		}
		return true;
	}
}
