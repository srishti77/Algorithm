package CCI.google;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;

public class AddBoldTagInString {
	public static void main(String s[]) {

	}

	public String addBoldTag(String s, String[] dict) {
		ArrayList<String> set = new ArrayList();

		for (int i = 0; i < dict.length; i++)
			set.add(dict[i]);

		int currentIndex = 0;

		String newString = s;

		for (int i = 0; i < dict.length; i++) {
			ArrayList<Integer> position = findAllPositionOf(s, dict[i]);
			for (int p = 0; p < position.size(); p++) {
				// [ "aaa", "aab", "bc"]
				int k = position.get(p);
				int startOfplus = 0, endOfNeg = 0, j = 0;
				while (j <= k) {

					if (newString.charAt(i) == '+') {
						//startOfplus =
						
						
					}
				}

			}
		}
		return "";
	}

	public ArrayList<Integer> findAllPositionOf(String mainStr, String str) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < mainStr.length() - str.length() + 1; i++) {
			boolean subStr = true;
			for (int j = 0; j < str.length(); j++) {
				if (mainStr.charAt(i + j) != str.charAt(j)) {
					subStr = false;
					break;
				}

			}
			if (subStr) {
				list.add(i);
			}
		}
		return list;
	}

}
