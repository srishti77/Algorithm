package CCI;

import java.util.ArrayList;
import java.util.List;

public class PancakeSort {
	List<Integer> list = new ArrayList<Integer>();
	public static void main(String s[]) {
		PancakeSort sort = new PancakeSort();
		int array[] = {3,2,4,1};
		array = sort.sortPancake(array);
		System.out.println(sort.list);
		sort.printElement(array);
	}
	
	public void printElement(int[] array) {
		for(int i=0; i< array.length; i++)
			System.out.println(array[i]);
	}
	public int[] sortPancake(int[]  array) {
		
		int currSize = array.length-1;
		
		while(currSize >0) {
			
			int maxElementIndex = findMaxIndex(array, currSize);
			
			if(maxElementIndex !=0) {
				list.add(maxElementIndex+1);
				array = flipElement(array, maxElementIndex);
			}
				
			array = flipElement(array, currSize);
			list.add(currSize+1);
			currSize--;
		}
		return array;
	}

	private int findMaxIndex(int[] array, int currSize) {
		// TODO Auto-generated method stub
		int maxElementIndex =0;
		for(int i=0; i<=currSize; i++) {
			if(array[maxElementIndex] <array[i])
				maxElementIndex = i;
		}
		return maxElementIndex;
	}
	
	public int[] flipElement(int array[], int index) {
		int k=0;
		int p=index;
		for(int i=0; i<= index/2; i++) {
			int temp = array[k];
			array[k] = array[p];
			array[p] = temp;
			k++;
			p--;
					
		}
		return array;	
	}
	
}
