package CCI;

public class C5_4NextNumber {
	
	public static void main(String s[]) {
		
		C5_4NextNumber numb = new C5_4NextNumber();
		System.out.println(numb.getPreviousNumber(13948));
		System.out.println(numb.getNextNumber(13948));
	}
	
	public int getNextNumber(int n) {
		int c0=0, c1=0;
		int c=n;

		while(((c &1)==0) && (c!=0)) {
			c0++;
			c>>=1;
		}
		
		while((c & 1) == 1) {
			c1++;
			c>>=1;
		}
		
		if(c0+c1 == 31 || c0+c1==0)
			return -1;
		
		int p = c0+c1;
		
		n |= (1 << p); // sets the pth bit to 1
		n &= ~((1 << p)-1); // clears all the bit right tp p to 0
		
		n |= ((1<<(c1-1))-1);// adds c1-1 1s to the right
		
		return n;
		
		
	}
	
	public int getPreviousNumber(int n) {
		int c0=0, c1=0;
		int c=n;

		while(((c &1)==0) && (c!=0)) {
			c0++;
			c>>=1;
		}
		
		while((c & 1) == 1) {
			c1++;
			c>>=1;
		}
		
		if(c0+c1 == 31 || c0+c1==0)
			return -1;
		
		int p = c0+c1;
		System.out.println(c1+ " --- "+c0);
		n &= ((~0) << (p+1)); // sets the pth bit to 1
	//	n &= ~((1 << p)-1); // clears all the bit right tp p to 0
		int mask = (1<<(c1+1))-1;
		n |= mask << (c0-1);// adds c1-1 1s to the right*/
		
		return n;
		
		
	}
}
