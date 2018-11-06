package CCI;

public class C4_CheckPermutation {

	String word="aabght";
	String wordToSearch = "bghta";
	public static void main(String s[]) {
		
		C4_CheckPermutation permute= new C4_CheckPermutation();
		permute.findPermutation();
	}
	
	public void findPermutation() {
		if(word.length()== wordToSearch.length()) {
			for(int i=0; i< wordToSearch.length(); i++) {
				int index= word.indexOf(wordToSearch.charAt(i));
				if( index != -1)
					word= word.replaceFirst(wordToSearch.charAt(i)+"", "");
					
			}
			
			if(word.length() ==0)
				System.out.println("Is permutation");
			else
				System.out.println(word.length());
			
		}
	}
}
