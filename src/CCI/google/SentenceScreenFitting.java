package CCI.google;

public class SentenceScreenFitting {
	
	public static void main(String s[]) {
		
		SentenceScreenFitting screen = new SentenceScreenFitting();
		String[] sentence = {"hello", "world"};
		System.out.println(screen.wordCounting(sentence, 2, 8));
		
	}
	
	public int wordCounting(String[] sentence, int rows, int cols) {
		
		int count =0;
		int i=0, j=0, k=0;
		
		while(i< rows && j<cols) {
					
			int length = sentence[k].length();
			
			if((cols-j) >= length)
			{
				
				j += length +1;
				k++;
			}
			else {
				i++;
				j=0;
			}
			if(j >= cols) {
				i++;
				j=0;
			}
			
		
			if(j >= cols) {
				i++;
				j=0;
			}
			
			if(k == sentence.length) {
				count++;
				k=0;
			}
			
		}
		return count;
	}
}
