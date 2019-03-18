package CCI;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LongestSubstring {

	public static void main(String args[]) {
		String s= "abcabcbb";
		int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        System.out.println(ans);
        Iterator iterate = set.iterator();
        
        while(iterate.hasNext()) {
        	System.out.println(iterate.next());
        }
    }
}
