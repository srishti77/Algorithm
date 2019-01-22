package CCI;

public class OnesAndZeros {
	static Queue queue = new Queue();
	public static void main(String s[]) {
		int array[] = {1,2,3,4};
		OnesAndZeros onesAndZeros = new OnesAndZeros();
		for(int j=0; j< array.length; j++)
			createPairs(array, "", j);
	}

	private static void createPairs(int[] array, String currentElement, int i) {
		// TODO Auto-generated method stub
		//System.out.println(i);
		queue.insert(array[i]);
		while(!queue.isEmpty() && i<array.length) {
			//queue.insert(array[k]+"");
			String current = queue.delete().toString();
			int len = current.length();
			for(int j=Integer.parseInt(current.charAt(len-1)+""); j<array.length; j++) {
				queue.insert(current + array[j]);
			}
		}
		boolean[] flag = {false, true, false, true};
		System.out.println(format(flag));
		//queue.print();
	}
	
	 public static int format(boolean[] used){
	        int num = 0;
	        for(boolean b: used){
	            num <<= 1;
	            if(b) num |= 1;
	        }
	        return num;
	    }
}
