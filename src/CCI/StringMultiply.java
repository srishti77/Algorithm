package CCI;

public class StringMultiply {
	public static void main(String s[]) {
		
		String num1="123";
		String num2 = "456";
		int len1 = num1.length();
        int len2 = num2.length();
        int[] mult = new int[len1+len2];
        
        for(int i=0; i< len1; i++){
            for(int j=0; j< len2; j++){
                mult[i+j] += (num1.charAt(len1-1-i)-'0') * (num2.charAt(len2-1-j)-'0');
                System.out.println("mult[i][j]"+" -i- "+(i+j)+" -j- "+mult[i+j]);
            }
        }
        
        String st=""; int carry=0;
        for(int i=0; i<mult.length; i++){
            st = ((mult[i] +carry)%10)+st;
            
            carry = (mult[i] +carry)/10;
        }
        
       
        st=carry+st;
        
        st.replaceFirst("^0+(?!$)", "");
        System.out.println(st);
        
        System.out.println(-12%-2);
	}
}
