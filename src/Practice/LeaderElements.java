package Practice;

import java.util.List;
import java.util.ArrayList;

public class LeaderElements {

	public static void main(String s[]) {

		int array[] = { 16, 17, 4, 3, 5, 2 };
		LeaderElements leaderEle = new LeaderElements();
		
		System.out.println(leaderEle.getLeaders(array));
	}

	public List<Integer> getLeaders(int array[]) {

		List<Integer> list = new ArrayList<Integer>();
		int len = array.length;
		list.add(array[len-1]);
		
		for (int i = len - 2; i >= 0; i--) {
			
			if(array[i] > list.get(list.size()-1)) {
				list.add(array[i]);
			}
			
			
		}
		return list;
	}
}
