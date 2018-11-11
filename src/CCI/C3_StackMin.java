package CCI;

public class C3_StackMin {
	C3_Stack top = null;
	int minValue;
	class C3_Stack{
		int data; 
		C3_Stack next;
		int minValue;
		C3_Stack(int data){
			this.data=data;
		}
	}
	
	public void insert(int data) {
		C3_Stack node= top;
		
		if(top==null) {
			top= new C3_Stack(data);
			top.minValue = data;
		}
		else {
			top=new C3_Stack(data);
			top.next = node;
			
			if(node.minValue > data)
				top.minValue = data;
			else
				top.minValue=node.minValue;
		}
		
	}
	
	public void delete() throws Exception {
		
		if(top!=null) {
			top=top.next;
		}
	}
	
	public void minVal() {
		System.out.println(top.minValue);
	}
	
	public void print() {
		C3_Stack node= top;
		while(node!=null) {
			System.out.println(node.data+ " "+ node.minValue);	
			node=node.next;
		}
	}
	public static void main(String s[]) {
		C3_StackMin stack= new C3_StackMin();
		stack.insert(2);
		stack.insert(1);
		stack.insert(9);
		
		
		stack.print();
		System.out.println("Min value");
		stack.minVal();
		
	}
	
}
