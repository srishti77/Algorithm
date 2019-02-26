package CCI;

public class JumpGame {
	
	public static void main(String s[]) {
		int array[] = {2, 0, 0};
		
		JumpGame jump = new JumpGame();
		System.out.println(jump.canReach(array.length, 0, array, false));
		
	}
	
	public boolean canReach(int target, int index, int[] array, boolean flag ) {
		
		if(flag == true)
			return flag;
		
		if(target <= 0 || array.length == 1) {
			return true;
		}		
		
		if(index >= array.length-1) {
			return true;
		}		
		
		
		int value = array[index];
		int i=1;
		for( i=1; i<=value ; i++) {
			System.out.println("Here");
			flag= flag || canReach(target-i, index+i, array,flag );
			
		}
		System.out.println(i);
			return flag;
	}
	
}
