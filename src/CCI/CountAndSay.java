package CCI;

public class CountAndSay {
	
	public static void main(String s[]) {
		System.out.println(countValue(10));
	}
	
	public static String countValue(int number) {
		
		String prev =  count(1, "1");
		
		for(int i=2; i<= number; i++) {
			System.out.println(prev);
			prev = count(i,prev);
		}

		return prev;
	}

	private static String count(int number, String string) {
		// TODO Auto-generated method stub
	
		if(number == 1)
			return "1";
		
		char first = string.charAt(0);
		String ch = "";
		int count=1;
		int j=1;
		for( j=1; j< string.length(); j++ ) {
			
			if(string.charAt(j) ==  first)
				count++;
			else {
				ch = ch+count+""+string.charAt(j-1) ;
				count=1;
				first = string.charAt(j);
			}
		}
		
		
		return ch+count+string.charAt(j-1);
	}
}
