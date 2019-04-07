package Practice;

import java.util.ArrayList;
import java.util.List;

public class PalindromePatition {
	private List<List<String>> ans;
	private char[] chars;

	private List<List<String>> partition(String s) {
		this.ans = new ArrayList<>();
		this.chars = s.toCharArray();
		backtrack(0, new ArrayList<>());
		return ans;
	}

	private void backtrack(int i, ArrayList prefix) {

		if (i == chars.length) {
			ans.add(new ArrayList<String>(prefix));
			return;
		}
		
		StringBuilder builder = new StringBuilder();
		for (int j = i; j < chars.length; j++) {
			builder.append(chars[j]);
			System.out.println("Builder: "+builder+" "+ isPalidrome(builder));
			if (isPalidrome(builder)) {
				
				prefix.add(builder.toString());
				System.out.println(prefix);
				backtrack(j + 1, prefix);
				prefix.remove(prefix.size() - 1);
			}
		}

	}

	private boolean isPalidrome(StringBuilder builder) {
		// TODO Auto-generated method stub

		int start = 0;
		int end = builder.length() - 1;

		while (start < end) {
			if(builder.charAt(start++) != builder.charAt(end--)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String s[]) {
		PalindromePatition partition = new PalindromePatition();
		String str = "aab";
		partition.partition(str);
		partition.printElem();
	}

	public void printElem() {
		for(List<String> list : ans) {
			System.out.println("List: "+list);
		}
	}
}
