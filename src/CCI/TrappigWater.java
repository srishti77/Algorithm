package CCI;

import java.util.Stack;

public class TrappigWater {
	public static void main(String args[]) {
		
		int input[] = {1,0,2,1,0,1,3,2,1,2,1};
		TrappigWater trap = new TrappigWater();
		trap.findTrappedArea(input);
	}
	
	public void findTrappedArea(int[] input){
		int max =input[0];
		int n= input.length;
		int area =max;
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<n; i++) {
			if(stack.isEmpty() || input[i]<max) {
				stack.push(input[i]);
			}
			else {
				while(!stack.isEmpty()) {
					area = area+(max-stack.pop());				
				}
				max = input[i];
				stack.push(input[i]);
			}
		}
		
		System.out.println(area);	
		
	}
}
