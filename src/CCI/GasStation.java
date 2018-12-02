package CCI;

public class GasStation {
	public static void main(String s[]) {
		int gas[] = {3,4,2,1};
		int cost[] = {4,3,2,1};
		
		findRoute(gas, cost);
	}
	
	
	public static void  findRoute(int gas[], int cost[]) {
		int remainingCost=0;
		int previousMissing =0;
		for(int i=0; i< gas.length;i++) {
			
			int k = gas.length;
			int j=i;
			int currentValue=0;
			while(j<k) {			
				currentValue =gas[j] + remainingCost - cost[j];
				if(currentValue >=0) {
					remainingCost = currentValue;
					j++;
					
				}
				else {
					previousMissing = Math.abs(currentValue) +previousMissing;
					System.out.println("False"+i);
					break;
				}
			}
			
			if((remainingCost-previousMissing) >=0) {
				System.out.println("Starting: "+i);
				break;
			}
			
			
		}
	}
}
