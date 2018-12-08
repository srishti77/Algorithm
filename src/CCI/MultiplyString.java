package CCI;

public class MultiplyString {
	public static void main(String s[]) {
		MultiplyString  mul = new MultiplyString();
		mul.multiply("123", "456");
	}
	
	public void multiply(String s1, String s2){
		int sum=0, carry=0;
		
			
			for(int j=s1.length()-1; j>=0; j--) {
				String s ="";
				int k=s1.length()-1-j;
				while(k>0) {
					s=s+"0";
					k--;
				}
				carry =0;
				for(int i=s2.length()-1; i>=0; i--) {
				System.out.println(s1.charAt(i)+" "+s2.charAt(j));
				sum = Integer.parseInt(s1.charAt(i)+"")*Integer.parseInt(s2.charAt(j)+"");
				s= ((sum%10)+carry)+s;
				carry = sum/10;
			}
				
			
			System.out.println(s);
		}
	}
}
