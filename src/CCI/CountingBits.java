package CCI;

public class CountingBits {
	
	public static void main(String s[]) {
		
		
		int num =4;
		int bits[] = new int[num+1];
		int count;
		bits[0] =0;
		
		for(int i=1; i<num+1; i++) {
			count=0;
			int n=i;
			
			while(n>0) {
				if(bits[n] !=0) {
					System.out.println("Here");
					count +=bits[n];
					break;
				}
					
				else {
					count += n & 1;
					n = n >>1;
				}		
			}
			bits[i] = count;
		}
		
		for(int i=0; i<num+1; i++) {
			System.out.println(bits[i]);
		}		
	}
}
