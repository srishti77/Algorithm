package CCI;

/*
 * Can also be solved using the boolean array where if the element is already found we set it to true.
 * In line 20 use the condition !boolean[index] complexity = 0(n2)
 */
public class C4_CheckPermutation {

	String word="aabght";
	String wordToSearch = "bghtaa";
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
		else {
			System.out.println("not permutation");
		}
	}
}
