
public class SinglyLinkedList {
	
	SLNode head=null;
	public static void main(String args[]) {
		
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.insert(10);
		singlyLinkedList.insert(40);
		singlyLinkedList.insert(35);
		
		singlyLinkedList.insert(30);
		singlyLinkedList.insert(55);
		singlyLinkedList.insert(20);
		
		singlyLinkedList.print();
		
		singlyLinkedList.delete(30);
		
		singlyLinkedList.print();
		
	}

	private void insert(int i) {
		// TODO Auto-generated method stub
		SLNode newNode= head;
		if(newNode == null) {
			newNode= new SLNode(i);
			head = newNode;
			System.out.println("Here");
		}
		else {
			while(newNode.next != null){
				
				newNode=newNode.next;
			}
			newNode.next=new SLNode(i);
		}
	}
	
	private void delete(int i) {
		// TODO Auto-generated method stub
		SLNode newNode= head;
			
		while(newNode.next != null && newNode.next.data!= i){
				System.out.println("dete iter");
			newNode=newNode.next;
		}	
		if(newNode!=null)
			newNode.next=newNode.next.next;
		System.out.println("New:"+newNode.data);
		
	}
	
	private void print() {
		SLNode newNode= head;
		System.out.println("hello");
		while(newNode!=null) {
			System.out.println(newNode.data);
			newNode= newNode.next;
		}
	}
}

class SLNode{
	int data;
	SLNode next;
	
	SLNode(int data){
		this.data= data;
	}
}