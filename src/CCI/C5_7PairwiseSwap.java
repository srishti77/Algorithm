package CCI;

public class C5_7PairwiseSwap {
	
	public static void main(String s[]) {
		
		C5_7PairwiseSwap swap = new C5_7PairwiseSwap();
		System.out.println(swap.swapOddEvenBits(10));
		
	}
	
	public int swapOddEvenBits(int X) {
		
		return (((X & 0xaaaaaaaa) >>> 1) | ( (X & 0x55555555) << 1));
	}
}
