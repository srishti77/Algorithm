package CCI;

import java.util.HashMap;
import java.util.Map;

public class CanIWin {
	Map<Integer, Boolean> map;
	boolean[] used;
	
	public static void main(String s[]) {
		CanIWin win = new CanIWin();
		int maxChoosableInt =10;
		int desiredTotal =11;
		
		System.out.println(win.canIWin(maxChoosableInt, desiredTotal));
	}
	
	public boolean canIWin(int maxChoosableInt, int desiredTotal) {
		int sum = (1+maxChoosableInt)* (maxChoosableInt) / 2;
		if(sum < desiredTotal) return false;
		
		if(desiredTotal <= 0) return true;
		map = new HashMap();
		used = new boolean[maxChoosableInt+1];
		return helper(desiredTotal);
	}

	private boolean helper(int desiredTotal) {
		// TODO Auto-generated method stub
		if(desiredTotal <= 0)
			return false;
		int key = format(used);
		
		if(!map.containsKey(key)) {
			for(int i=1; i< used.length; i++) {
				if(!used[i]) {
					used[i] = true;
					if(!helper(desiredTotal-i)) {
						map.put(key, true);
						used[i] = false;
						return true;
					}
					used[i] = false;
				}
			}
			map.put(key, false);
		}
		return map.get(key);
	}
	// transfer boolean[] to an Integer 
    public int format(boolean[] used){
        int num = 0;
        for(boolean b: used){
            num <<= 1;
            if(b) num |= 1;
        }
        return num;
    }
	
}
