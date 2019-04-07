package Practice;

public class StringPermuation {
	static String word = "Srishti";
	static int visited[] = new int[word.length()];
	public static void main(String s[]) {
		
		
		permute("", word.length());
	}
	
	static public void permute(String str, int n) {
		
		if(str.length() == n) {
			System.out.println(str);
			return;
		}
		
		for(int i=0; i< n; i++) {
			if(visited[i] == 0) {
				visited[i] = 1;
				str += word.charAt(i);
				permute(str, n);
				visited[i] = 0;
				str = str.substring(0, str.length()-1);	
			}
			
		}
	}
}
