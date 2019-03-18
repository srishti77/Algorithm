package CCI;
class a{
	a getType() {
		return this;
	}
}
public class sample {

	public static void main(String ar[]) {
		
		String s="-";
		Integer x=343;
		long L343=343L;
		if(x.equals(L343)) s+=".e1";
		if(x.equals(343)) s+=".e2";
		
		Short s1= (short)((new Short((short)343))/(new Short((short)49)));
		
		if(s1==7) s+="=s";
		if(s1< new Integer(7+1)) 
			s+="fly";
		System.out.println(s);
	
	}
	

}

class B extends sample{
	
}
