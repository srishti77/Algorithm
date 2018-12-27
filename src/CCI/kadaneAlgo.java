package CCI;

public class kadaneAlgo {
	public static void main(String s[]) {
		int num[] = {1,3,2,1,-1};
		
		
		kadaneAlgo kadane = new kadaneAlgo();
		kadane.maxSumOfSubArray(num);
 	}
	
	public void maxSumOfSubArray(int[] num){
		
		int sum[] = new int[num.length];
		sum[0] = num[0];
		int startIndex =0, lastIndex=0;
		int maxValue=num[0];
		for(int i=1; i<num.length; i++) {
			
			if(num[i] > sum[i-1]+num[i]) {
				startIndex=i;
				lastIndex =i;
				sum[i] = num[i];
			}
			else {
				
				sum[i] = sum[i-1]+num[i];
			}
			
			if(maxValue <sum[i]) {
				lastIndex = i;
				maxValue = sum[i];
			}
			
		}
		
		
		System.out.println(maxValue+ " start "+startIndex+" last "+ lastIndex);
		
	}
	
	
}
