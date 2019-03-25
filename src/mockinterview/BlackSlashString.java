package mockinterview;

public class BlackSlashString {
	public static void main(String s[]) {

		BlackSlashString sb = new BlackSlashString();
		System.out.println(sb.backspaceCompare("a##c", "#a#c"));
		
	}

	public boolean backspaceCompare(String S, String T) {
		
		return removeBlackSpace(S).equals(removeBlackSpace(T));

	}

	public String removeBlackSpace(String S) {
		String s1 = "";
		int i= S.length()-1;
		while (i >=0) {
			if (S.charAt(i) != '#') {
				s1 = S.charAt(i) + s1;
				i--;
			} else {
				int count = 1;
				i--;
				while (count > 0 && i >= 0) {
					if (S.charAt(i) == '#') {
						count++;
						
					}

					else {
						count--;
					}
					i--;
					
				}
			}
		}
	
		return s1;

	}
}
