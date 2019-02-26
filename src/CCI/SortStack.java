package CCI;

public class SortStack {

	StackImpl stack1 = new StackImpl();
	StackImpl stack2 = new StackImpl();

	public static void main(String s[]) {

		SortStack sortStack = new SortStack();
		sortStack.push(30);
		sortStack.push(40);
		sortStack.push(10);
		sortStack.push(15);

		sortStack.print();
		sortStack.pop();
		sortStack.push(12);
		System.out.println("Again.....");
		sortStack.print();
	}

	public void print() {
		/*StackImpl newTop = stack1;
		System.out.println();
		while (newTop.top != null) {
			System.out.println(newTop.top.data);
			newTop.top = newTop.top.next;
		}*/
		stack1.print();
	}

	private void pop() {
		System.out.println("Popped element: "+stack1.pop());
	}

	private void push(int i) {
		// TODO Auto-generated method stub

		if (stack1.top == null) {
			stack1.push(i);
		} else {
			// compare with the current top if the new value is big then pop until the
			// current stack's top is bigger push the element and refill the current stack;

			while (stack1.top != null && stack1.top.data < i) {
				int data = stack1.pop();
				if (data != 0)
					stack2.push(data);
			}
			stack1.push(i);

			while (stack2.top != null && !stack2.isEmpty()) {
				int data = stack2.pop();
				if (data != 0)
					stack1.push(data);
			}
		}

	}

}

class StackImpl {
	Stack top = null;

	public void push(int element) {

		if (top == null) {
			top = new Stack(element);
		} else {
			Stack newTop = new Stack(element);
			newTop.next = top;
			top = newTop;
		}
	}
	
	public void print() {
		Stack newTop = top;
		while(newTop != null) {
			System.out.println(newTop.data);
			newTop = newTop.next;
		}
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (top == null)
			return true;

		return false;
	}

	public int pop() {
		if (top != null) {
			int data = top.data;
			top = top.next;
			return data;
		}
		return 0;

	}
}

class Stack {
	int data;
	Stack next;

	Stack(int data) {
		this.data = data;
	}

}
