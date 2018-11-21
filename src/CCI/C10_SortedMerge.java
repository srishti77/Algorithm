package CCI;

import java.util.Scanner;

public class C10_SortedMerge {
	int[] array1 = new int[10];
	int[] array2= {3,6,7,10,12};
	

	public static void main(String s[]) {
		C10_SortedMerge merge=new C10_SortedMerge()		;
		merge.array1[0]= 2;
		merge.array1[1]= 5;
		merge.array1[2]= 8;
		merge.array1[3]=9;
		merge.array1[4]= 13;
		
		
		merge.array1= merge.mergeSortedArray();
		
		for(int i=0; i<merge.array1.length; i++)
			System.out.print(merge.array1[i]+" ");
		
	}

	private int[] mergeSortedArray() {
		// TODO Auto-generated method stub
		int  j=4, k=9;
		int i=4;
		while(j>=0 && i>=0) {
			if(array1[i] >array2[j]) {
				array1[k] = array1[i];
				i--;
				k--;
			}
			else if(array1[i] < array2[j]) {
				array1[k] = array2[j];
				j--;
				k--;
			}
			else {
				array1[k] = array1[i];
				i--;
				j--;
				k--;
				
			}
		}
		
		return array1;
	}
}
