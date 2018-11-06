package CCI;

import java.util.EmptyStackException;

public class C3_GenericStack<T> {

	private static class MyStack<T>{
		private  T data;
		private MyStack<T> next;
		
		public MyStack(T data){
			this.data= data;
		}
	}
	
	private MyStack<T> top;
	
	public T pop() {
		if(top==null) throw new EmptyStackException();
		T item= top.data;
		top=top.next;
		return item;
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
