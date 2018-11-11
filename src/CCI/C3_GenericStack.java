package CCI;

import java.util.EmptyStackException;

public class C3_GenericStack<T> {

	static class MyStack<T>{
		public  T data;
		public MyStack<T> next;
		
		public MyStack(T data){
			this.data= data;
		}
	}
	
	public MyStack<T> top;
	public String data;
	
	public T pop() {
		if(top==null) throw new EmptyStackException();
		T item= top.data;
		top=top.next;
		return item;
	}
	
	public int lengthCount() {
		int count=0;
		MyStack<T> node=top;
		while(node!=null) {
			count++;
			node=node.next;
		}
		return count;
	}
	
	public void push(T data) {
		MyStack<T> t= new MyStack<T>(data);
		t.next=top;
		top=t;
	}
	
	public T peek() {
		if(top==null) throw new EmptyStackException();
		return top.data;
	}
	
	public boolean isEmpty() {
		return top==null;
	}
	
	public static void main(String s[]) {
		C3_GenericStack<String> stack= new C3_GenericStack<String>();
		stack.push("hello");
		stack.push("hi");
		System.out.println(stack.pop());
	}
	
}
