package CCI;

public class MinJumps {
	public static void main(String s[]) {
		int array[] = {2,1,1,2,4};
		findMinJumps(array);
	}
	
	public static void findMinJumps(int array[]) {
		int begin =1;
		int end= array[0];
		int times =1;
		
		while(end < array.length-1) {
			int max=0;
			
			for(int i=begin; i<=end; i++) {
				if(max < i+array[i]) {
					max= i+array[i];
				}
			}
			
			begin = end+1;
			end = max;
			times++;
		}
		
		System.out.println("Times "+times);
	}
}
