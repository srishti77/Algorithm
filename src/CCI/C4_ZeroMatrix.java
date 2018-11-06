package CCI;

import java.util.ArrayList;

public class C4_ZeroMatrix {

	int  input[][] = {{1,3,6},{1,4,5},{2,5,0}};
	ArrayList<ArrayList<Integer>> arrayList= new ArrayList<ArrayList<Integer>>();
	public static void main(String s[]) {
		C4_ZeroMatrix zero = new C4_ZeroMatrix();
		zero.findZero();
		zero.updateMatrix();
		zero.print();
	}
	
	public void findZero() {
		for(int i=0; i<input.length; i++) {
			for(int j=0; j<input[0].length; j++) {
				if(input[i][j]==0)
				{
					ArrayList<Integer> inputArray = new ArrayList<Integer>();
					inputArray.add(i);
					inputArray.add(j);
					
					arrayList.add(inputArray);
				}
			}
		}
	}
	
	public void updateMatrix() {
		int i,j;
		for(int k=0; k<arrayList.size(); k++) {
			
			i= arrayList.get(k).get(0);
			j= arrayList.get(k).get(1);
			
			for(int p=0; p< input.length;p++)
				input[p][j]=0;
			for(int p=0; p< input[0].length;p++)
				input[i][p]=0;
		}
	}
	
	public void print() {
		for(int i=0; i<input.length; i++) {
			for(int j=0; j<input[0].length; j++) {
				System.out.println(input[i][j]);
			}
		}
	}
}
