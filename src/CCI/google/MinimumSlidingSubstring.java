package CCI.google;

import java.util.HashMap;
import java.util.Map;

public class MinimumSlidingSubstring {

	public static void main(String s[]) {

		String str = "ADOBECODEBANC";
		String t = "ABC";
		MinimumSlidingSubstring subStr = new MinimumSlidingSubstring();
		System.out.println(subStr.minWindow(str, t));
	}

	public String minWindow(String s, String t) {
		int left = 0, right = 0, len = s.length();
		Map<Character, Integer> dictT = new HashMap();

		for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			dictT.put(c, dictT.getOrDefault(c, 0) + 1);
		}
		int required = dictT.size();

		Map<Character, Integer> window = new HashMap();
		int formed = 0;
		int ans[] = { -1, 0, 0 };

		int r = 0, l = 0;

		while (r < s.length()) {

			char c = s.charAt(r);
			int count = window.getOrDefault(c, 0);
			window.put(c, count+1);

			if (dictT.containsKey(c) && dictT.get(c).intValue() == window.get(c).intValue()) {
				formed++;
			}

			while (l <= r && formed == required) {
				c = s.charAt(l);
				System.out.println(ans[0]+ "  "+ l+" "+r);
				if (ans[0] == -1 || r - l + 1 < ans[0]) {
					ans[0] = r - l + 1;
					ans[1] = l;
					ans[2] = r;
				}
				window.put(c, window.get(c) - 1);
				if (dictT.containsKey(c) && window.get(c).intValue() < dictT.get(c).intValue())
					formed--;
				l++;
			}
			
			r++;
		}
		return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);

	}

}
