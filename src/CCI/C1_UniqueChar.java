package CCI;

public class C1_UniqueChar {
	boolean[] isFound = new boolean[256];
	
	public static void main(String s[]) {
		
		char[] word= {'H', 'e', 'l', 'l','o'};
		C1_UniqueChar unique= new C1_UniqueChar();
		System.out.println(unique.findUnique(word));
		
	}
	
	public boolean findUnique(char[] word) {
		boolean allUnique=true;
		for(int i=0; i< word.length;i++) {
			int index=word[i];
			if(isFound[index]==true)
				return !allUnique;
			else
				isFound[index]=true;
		
		}
		
		return allUnique;
	}
}
