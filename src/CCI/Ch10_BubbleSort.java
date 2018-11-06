package CCI;

import java.lang.reflect.Array;

public class Ch10_BubbleSort {
	public static int[] array= {6,3,2, 10,5,1, 14};
	
	public static void main(String s[]) {
		
		Ch10_BubbleSort bubble= new Ch10_BubbleSort();
		bubble.bubbleSort();
		bubble.print();
	}
	
	public void bubbleSort() {
		for(int i=0; i<array.length;i++) {
			for(int j=0; j< array.length-(i+1); j++) {
				
				if(array[j] > array[j+1]) {
					int temp= array[j];
					array[j]= array[j+1];
					array[j+1] = temp;
				}
				
			}
		}			
	}
	
	public void print() {
		for(int i=0; i< array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
