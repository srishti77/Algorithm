package mockinterview;

import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.w3c.dom.ls.LSInput;

class listElement implements Comparable<listElement> {
	int start;
	int end;

	public listElement(int start, int end) {
		// TODO Auto-generated constructor stub

		this.start = start;
		this.end = end;

	}

	public int compareTo(listElement o) {
		// TODO Auto-generated method stub
		if (start == o.start)
			return 0;
		else if (start > o.start)
			return 1;
		else
			return -1;
	}

}

public class BlockString {
	List<listElement> list = new ArrayList();

	public static void main(String s[]) {

	
		String str = "abcxyz123";

		String[] dict = { "abc","123" };

		BlockString string = new BlockString();
		System.out.println(string.addBoldTag(str, dict));
	}

	public String addBoldTag(String s, String[] dict) {

		for (int i = 0; i < dict.length; i++) {
			
			int index = s.indexOf(dict[i]);
			if (index != -1) {
				list.add(new listElement(index, index + dict[i].length())); // {index, index+dict[i].length()});
			}
		}

		Collections.sort(list);
		
		
		int i = 1;
		List<listElement> temp = new ArrayList();
		if (!list.isEmpty()) {
			int currentStart = list.get(0).start;
			int currentEnd = list.get(0).end;

			while (i < list.size()) {
				if (currentEnd >= list.get(i).start) {
					currentEnd = Math.max(currentEnd, list.get(i).end);
					i++;
				} else {
					temp.add(new listElement(currentStart, currentEnd));

					currentStart = list.get(i).start;
					currentEnd = list.get(i).end;
					i++;
				}
			}

			temp.add(new listElement(currentStart, currentEnd));

		}
		StringBuilder str = new StringBuilder();
		int j = 0, p = 0;

		while (j < s.length() && p < temp.size()) {
			
			if (j == temp.get(p).start) {
				str.append("<b>");

			} else if (j == temp.get(p).end) {
				str.append("</b>");
				p++;
			}

			str.append(s.charAt(j) + "");

			j++;
		}
		
		if(p < s.length() && temp.get(p).end == j) {
			str.append("</b>");
		}

		return new String(str);
	}
}