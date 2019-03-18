package CCI;
public class BitManipulation_Insert1 {
	public static void main(String s[]) {
		method2();
		
	}
	
	public static void method2() {
		
		System.out.println(updateBits(1024, 19, 2,6));
		
		
	}
	
	public static void method1()
	{
		int j=3, k=0, m=3, num=16, n=1;
		
		num = num >> n;
		for(int i=n; i<=j; i++) {
			int value = (i << k);
			k++;
			int new_value= m & value;
			num =(update(num, new_value, true));
		}
		
		
		System.out.println(num << n);
	}
	
	public static int update(int num, int i, boolean bitIs1) {
	
		int value = bitIs1 ? 1: 0;	
		int mask = ~(1 << i);
		
		return ((num & mask) | (value << i));
			
	}
	
	public static int updateBits(int n, int m, int i, int j) {
		
		int all1= ~0;
		
		int left = all1 << (j+1);
		
		int right = (1 << i)-1; //all1
		
		int mask = left | right;
		
		int n_cleared = n & mask;
		
		int m_shifted = m << i;
		
		return n_cleared | m_shifted;
			
	}
	
	
	
}
