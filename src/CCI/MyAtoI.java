
public class MyAtoI {
	
	public static void main(String args[]) {
		
		String a = "+-2";
		
		a= a.trim().replace("+", "");
		
		char[] a1 = a.toCharArray();
		String s="";
		for(int i=0; i<a1.length; i++) {
			
			if(a1[i] == '+')
				continue;
			if(Character.isDigit(a1[i]) || a1[i]=='-') {
				
				s=s+a1[i];
				
			}
			
			else {
				break;
			}
			
		}
		
		if(!s.isEmpty()) {
			try {
			if(Long.parseLong(s) >2147483647)
				System.out.println(Integer.MAX_VALUE);
		
			else if( Long.parseLong(s)  <-2147483648)
				System.out.println(Integer.MIN_VALUE);
			
			else
				System.out.println(s);
			}
			catch(Exception e) {
				System.out.println(0);
			}
		}
		
		else {
			System.out.println(0);
		}
		
	}
}
