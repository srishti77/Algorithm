package CCI;

public class Queue<T> {
	
	Element front=null;
	Element rear=null;
	
	class Element{
		T data;
		Element next;
			
		Element(T data) {
			this.data = data;
		}
	
	}
	
	public void insert(T data) {
		Element head = front;
		
		if(head==null) {
			front = new Element(data);
			rear=front;
		}
		else {
			
			rear.next= new Element(data);
			rear=rear.next;
		}
	}
	
	public T delete() {
		
		T deletedElement=null;
		
		if(front!=null) {
			deletedElement=front.data;
			System.out.println("deleted element is "+deletedElement);
			front=front.next;
		}
		
		return deletedElement;
			
	}
	
	public boolean isEmpty() {
		return front==null;
	}
	
	public static void main(String s[]) {
		Queue queue= new Queue();
		
		queue.insert(4);
		queue.insert(1);
		queue.insert(5);
		
		/*queue.delete();
		queue.delete();
		*/
		queue.print();
		
		
	}
	
	public void print() {
		while(front!= null) {
			System.out.println(front.data);
			front = front.next;
		}
			
	}
	
}
