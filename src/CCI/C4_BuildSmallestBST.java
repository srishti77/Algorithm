package CCI;

import CCI.C4_InorderTraversal.Node;

public class C4_BuildSmallestBST {
	int i=0;
	
	public static void main(String s[]) {
		int array[] = {1,2,3,4,5,6,7};
		C4_BuildSmallestBST smallBST= new C4_BuildSmallestBST();
		
		smallBST.buildTree(array);
	}
	public void buildTree(int[] array) {
		int mid= array.length/2;
		
		if(array.length>=2) {
			int[] left = new int[mid];
			int[] right= new int[array.length-mid-1];
			for(int i=0; i<mid; i++)
				left[i]= array[i];
			int k=0;
			for(int i=mid+1; i<array.length; i++) {
				right[k]= array[i];
				k++;
			}
			System.out.println(array[mid]);
			buildTree(left);		
			buildTree(right);
		}
		else if(array.length==1) {
			System.out.println(array[0]);
			//System.out.println(array[1]);
		}
	}
}
