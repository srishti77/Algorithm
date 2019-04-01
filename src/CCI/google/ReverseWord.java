package CCI.google;

public class ReverseWord {
	public static void main(String s[]) {
		ReverseWord wordR = new ReverseWord();
		System.out.println(wordR.reverseWords("Let's take LeetCode contest"));
	}

	public String reverseWords(String s) {

		StringBuilder newStr = new StringBuilder(s);
		int startIndex = 0, endIndex = 0;

		for (int i = 0; i < s.length(); i++) {
			if (!(s.charAt(i) + "").equals(" ")) {
				endIndex++;
			}

			// swap the words from start Index to end Index
			else {

				for (int j = 0; j < ((endIndex  - startIndex) / 2); j++) {
					int tempIndex = j + startIndex;
					char temp = s.charAt(tempIndex);
					int index = endIndex - 1 - j;
					newStr.setCharAt(tempIndex, s.charAt(index));
					newStr.setCharAt(index, temp);
				}
				startIndex = i + 1;
				endIndex = i + 1;
			}
		}
		if (startIndex < endIndex && endIndex == s.length()) {
			for (int j = 0; j < ((endIndex - startIndex) / 2); j++) {
				int tempIndex = j + startIndex;
				char temp = s.charAt(tempIndex);
				int index = endIndex - 1 - j;
				newStr.setCharAt(tempIndex, s.charAt(index));
				newStr.setCharAt(index, temp);
			}
		}
		return newStr.toString().trim();
	}
}
