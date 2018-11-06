package CCI;

public class C4_urlify {
	
	public static void main(String a[]) {
		C4_urlify url= new C4_urlify();
		url.urlify("Mr John Smith", 14);
	}
	
	public void urlify(String word, int length) {
		StringBuilder build= new StringBuilder();
		for(int i=0; i<length; i++) {
			char currentChar= word.charAt(i);
			if(currentChar ==' ') {
				build.append("%20");
			}
			else {
				build.append(currentChar);
			}
		}
		System.out.println(build);
	}
}
