package CCI;

import CCI.C3_GenericStack.MyStack;

public class C3_StackOfPlates {
	
	SetOfStack topStack=null;
	
	//setof stacks which consist of several stack
	//it must has push and pop operation
	//stack also has push and pop operation
	
	//set of plates
	class SetOfStack{
		C3_GenericStack stack;
		SetOfStack next;
		
		SetOfStack(C3_GenericStack stack){
			this.stack=stack;
		}
		
	}
	
	
	public void pushIntoStack(int data2) {
		// TODO Auto-generated method stub
		
	}
	public void push(int data) {
		SetOfStack node= topStack;
		
		//no stacks, create a stack and add it to the set of stacks
		if(topStack==null) {
			C3_GenericStack stack= new C3_GenericStack();
			topStack= new SetOfStack(insertIntoStack(data,stack));
		}
		else {
			//if the current top stack in set of stack is full
			if(node.stack.lengthCount() >5) {
				C3_GenericStack stack= new C3_GenericStack();
				topStack= new SetOfStack(insertIntoStack(data,stack));
				topStack.next=node;
				
			}
			else {
				node.stack.push(data);
				}
			}
	}
	
	public C3_GenericStack insertIntoStack(int data, C3_GenericStack stack) {
		stack.push(data);
		//topStack= new SetOfStack(stack);
		return stack;
	}
	
	public void pop() {
		SetOfStack node= topStack;
		if(node!=null) {
			C3_GenericStack topElement= node.stack;
			MyStack top= topElement.top;
			top=top.next;
			
			if(top==null) {
				topStack=topStack.next;
				System.out.println("null here--"+ topStack.stack.data);
			}
		}
	}
	public void print() {
		SetOfStack node= topStack;
		while(node!=null) {
			C3_GenericStack topElement= node.stack;
			MyStack top= topElement.top;
			while(top!=null) {
				System.out.println(top.data);
				top=top.next;
			}
			node=node.next;
		}
	}
	
	public static void main(String s[]) {
		C3_StackOfPlates stackP= new C3_StackOfPlates();
		
		//1st stack
		stackP.push(2);
		stackP.push(9);
		stackP.push(3);
		stackP.push(10);
		stackP.push(5);
		
		//2nd stack
		stackP.push(11);
		stackP.push(1);
		
		//Print
		stackP.print();
		
		System.out.println("Delete 1");
		//remove one element
		stackP.pop();
		stackP.print();
		
		System.out.println("Delete 11");
		//remove one more element
		stackP.pop();
		stackP.print();
		
	}
}
