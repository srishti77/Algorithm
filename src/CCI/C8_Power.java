package CCI;

public class C8_Power {
	
	 float value=1;
	
	public static void main(String s[]) {
		
		C8_Power power= new C8_Power();
		
		System.out.println(power.getXPowerY(5,-3));
		
	}
	
	public float getXPowerY(int x, int y) {
		System.out.println(x+" "+y);
		if(y==0) return 1;
		else if(y==1) return x;
		
		else if(y>1){
		value= value*x*getXPowerY(x, y-1);
		return value;
		}
		
		else {
			value= value/x*getXPowerY(x, y+1);
			return value;
		}
		
	}
}
