package mockinterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class BannedWord {

	HashMap<String, Integer> map = new HashMap();

	public static void main(String s[]) {
		
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit"};
		BannedWord bannedWord = new BannedWord();
		
		System.out.println(bannedWord.mostCommonWord(paragraph, banned));
	}

	public String mostCommonWord(String paragraph, String[] banned) {
		String words[] = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
		int value = Integer.MIN_VALUE;
		String mostCommon = "";
		List<String> bannedList = Arrays.asList(banned);
		
		for (String word : words) {
			String w = word.toLowerCase();
			if (!bannedList.contains(w)) {
				int value1 = map.getOrDefault(w,0);
				map.put(w, value1+1);
				if(value < (value1+1)) {
					value = value1+1;
					mostCommon = w;
				}
			}
		}
		
		return mostCommon;
	}

}
