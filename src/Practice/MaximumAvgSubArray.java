package Practice;

public class MaximumAvgSubArray {

	public static void main(String s[]) {

		MaximumAvgSubArray maxAvg = new MaximumAvgSubArray();
		int[] array = {1, 12, -5, -6, 50, 3 };
		System.out.println(maxAvg.findMaxAvgSubArray(array));
	}

	public float findMaxAvgSubArray(int array[]) {

		int len = array.length;
		int arrayLen[] = new int[len];
		float arrayAvg[] = new float[len];
		
		arrayLen[0] = 1;
		arrayAvg[0] = array[0];
		float maxTotal =0;
		for (int i = 1; i < len; i++) {
			float maxValue = array[i];
			arrayLen[i] = 1;
			arrayAvg[i] = array[i];
			for(int j=0; j< i; j++ ) {
				
				float value = (arrayAvg[j] * arrayLen[j] + array[j])/(arrayLen[j] +1);
				if( maxValue < value ) {
					maxValue = value;
					arrayLen[i] = arrayLen[j] +1;
					arrayAvg[i] = value;
				}
			}
			
			maxTotal = Math.max(maxTotal, maxValue);
			
		}
		
		return maxTotal;
				

	}

}
