package mockinterview;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
	public static void main(String s[]) {
		MissingRanges range = new MissingRanges();
		int nums[] = {-2147483648,2147483647};
		System.out.println(range.findMissingRanges(nums, -2147483648, 2147483647));
	}

	public List<String> findMissingRanges(int[] nums, int lower, int upper) {
		List<String> list = new ArrayList<>();
		int len = nums.length;
		if (nums[0] > lower) {
			if (lower == (nums[0] - 1))
				list.add(lower + "");
			else
				list.add(lower + "->" + (nums[0] - 1));
		} 
		
		for(int i=1; i<len; i++) {
			String pp = String.valueOf(nums[i] - nums[i-1]);
			System.out.println(pp);
			int diff =0;
			if(diff ==2) {
				list.add((nums[i]-1)+"");
			}
			else if(diff >2) {
				list.add((nums[i-1]+1)+"->"+(nums[i]-1));
			}
		}
		System.out.println("upper"+ upper+" "+ nums[len-1]);
		if(upper -nums[len-1] == 1) {
			list.add(upper+"");
		}
		else if((upper -nums[len-1]) > 1) {
			list.add((nums[len-1]+1)+"->"+upper);
		}
		return list;

	}
}
