package CCI;

public class MaxLenRepeatedSubarray {
	public static void main(String s[]) {
		int a[] = {1,2,3,2,1};
		int b[] = {3,2,1,4,7};
		int count =0;
		int maxValue =0;
		for(int i=0; i<a.length; i++) {
			
			for(int j=0; j<b.length; j++) {
				
				if(a[i] == b[j]) {
					count++;
					int k=i+1, p=j+1;
					while(k<a.length && p<b.length) {
						
						if(a[k] == b[p]) {
							k++; 
							p++; count++;
						}
						else {
							break;
						}
									
					}
					maxValue = Math.max(count, maxValue);
					count =0;
			}
		}
		
	}
		System.out.println("Max value: "+maxValue);
}
}
