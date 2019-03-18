package Practice;

public class MinStackTest {
	
	public static void main(String s[]) {
		MinStack minStack = new MinStack();
				
		minStack.push(9);	
		minStack.push(2);
		minStack.push(1);
		
		//System.out.println(minStack.getMin());
		minStack.pop();
	
		
		System.out.println(minStack.top());
	}
}
