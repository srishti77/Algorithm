package CCI;

import java.util.ArrayList;

public class PartitionEqualSubset {
	
	public static void main(String s[]) {
		
		int input[] = {100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,
		                100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,
		                100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,
		                100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100};
		PartitionEqualSubset subset = new PartitionEqualSubset();
		int value = subset.findSum(input);
		
		System.out.println(subset.isSubsetSum(input, input.length, value/2));
		
	}

	 public boolean isSubsetSum(int set[], 
             int n, int sum) 
	 { 
		 // Base Cases 
		 if (sum == 0) 
			 return true; 
		 
		 if (n == 0 && sum != 0) 
			 return false; 

		 // If last element is greater than  
		 // sum, then ignore it 
		 if (set[n-1] > sum) 
			 	return isSubsetSum(set, n-1, sum); 
		
		 /* else, check if sum can be obtained by any of the following 
		(a) including the last element 
		(b) excluding the last element */
		 
		 return isSubsetSum(set, n-1, sum) ||  isSubsetSum(set, n-1, sum-set[n-1]); 
	 } 

	private int findSum(int[] input) {
		// TODO Auto-generated method stub
		int sum =0;
		for(int i=0; i<input.length; i++)
			sum += input[i];
		return sum;
	}
}
