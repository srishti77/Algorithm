package CCI;
public class ReverseInteger {

	public static void main(String args []) {
		
		int i= -123;
		int n= i;
		while(n != 0) {
			i= n%10;
			n = n/10;
		
			System.out.println(i);
		}
		
	}
}
