package CCI;

public class C4_StringCompress {

	String word="aaabbcddfeeee";
	StringBuilder compressedString= new StringBuilder();
	public static void main(String s[]) {
		C4_StringCompress comp= new C4_StringCompress();
		comp.compress();
	}
	
	public void compress() {
		int i=0, count=1;
		char previousChar=word.charAt(i);
		compressedString.append(word.charAt(i));
		i++;
		while(i< word.length()) {
			if(word.charAt(i)!=previousChar) {
				compressedString.append(count);
				compressedString.append(word.charAt(i));
				count=1;
				previousChar=word.charAt(i);
				
			}
			else {
				count++;
			}
			i++;
		}
		compressedString.append(count);
		if(compressedString.length() < word.length())
			System.out.println(compressedString);
		else
			System.out.println(word);
		
	}
}
