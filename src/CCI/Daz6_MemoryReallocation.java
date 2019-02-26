import java.util.ArrayList;

public class Daz6_MemoryReallocation {

	static String getString = "";
	static int count = 0;
	public static void main(String args[]) {
		
		Daz6_MemoryReallocation memRel = new Daz6_MemoryReallocation();
		int[] arrayInput = {5	,1	,10	,0,	1,	7,	13,	14,	3,	12,	8,	10,	7,	12,	0,	6};
		ArrayList<String> SeenBefore = new ArrayList<String>();
		
		
		int max = arrayInput[0];
		int indexOfMax = 0;
		while(!SeenBefore.contains(getString)) {
			
			if(getString != null)
				SeenBefore.add(getString);
			for(int i = 0 ; i< arrayInput.length;i++) {
				if(max < arrayInput[i]) {
					max = arrayInput[i];
					indexOfMax = i;
				}
				
			}
			System.out.println("MAx is"+ max);
			arrayInput[indexOfMax] = 0;
			for(int i = indexOfMax +1 ; max> 0; max--) {
				if(i< arrayInput.length) {
					arrayInput[i] = arrayInput[i] +1;
					i++;
				}
				
				else {
					i =0;
					arrayInput[i] = arrayInput[i] + 1; 
					i++;
				}
					
			}
			
			System.out.println(memRel.getString(arrayInput));
			getString = memRel.getString(arrayInput);
			count++;
			System.out.println("Total count"+count);
			
		}
		
		System.out.println("No of cycles: " +(SeenBefore.size()-SeenBefore.indexOf(getString)));
		
		
		
	}
	
	public String getString(int array[]) {
		String get_conc = "";
		for(int i = 0; i<array.length;i++) {
			get_conc = get_conc + array[i]+ " ";
		}
		
		return get_conc;
		
	}
}
