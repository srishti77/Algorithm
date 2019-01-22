package CCI;

public class PerfectSquares {
	
	public static void main(String s[]) {
		
		PerfectSquares perfectSquares = new PerfectSquares();
		
		System.out.println(perfectSquares.perfectSquareForNumber(12));
		
	}
	
	public int perfectSquareForNumber(int n) {
		int count =0;
		
		while(n >3) {
			int value = (int) Math.sqrt(n);
			n = n- value*value;
			count++;
		}
		if(n <=3) {
			count = count+n;
		}
		return count;
	}
}
