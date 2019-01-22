package CCI;

public class ReverseLinkedList_2 {
	
	LinkedList2 head = null, rhead;
	public static void main(String s[]) {
		
		LinkedList2 item1 = new LinkedList2(1);
		LinkedList2 item2 = new LinkedList2(2);
		LinkedList2 item3 = new LinkedList2(3);
		LinkedList2 item4 = new LinkedList2(4);
		LinkedList2 item5 = new LinkedList2(5);
		LinkedList2 item6 = new LinkedList2(6);
		
		item1.next = item2;
		item2.next = item3;
		item3.next = item4;
		item4.next = item5;
		item5.next = item6;
		
		ReverseLinkedList_2 reverse = new ReverseLinkedList_2();
		reverse.head = item1;
		
		reverse.reverseBetween(reverse.head, 1,2);		
	}
	
	public LinkedList2 reverseBetween(LinkedList2 head, int m, int n) {

		LinkedList2 headNew = null;     
		LinkedList2 start = null;
		//headNew.next = head.next;
		int i=1;
		
		while(i<m-1) {
			System.out.println("Before");
			if(start == null) {
				headNew = head;

				start = headNew;
			}
		start.next = head.next;
		start = start.next;
		head = head.next;
		i++;
		}
	
	LinkedList2 current ;
	if(start == null) {
		current = head;
	}
	else {
		current = start.next;
	}
	LinkedList2 prev = start, next = null;
	while(current!= null && i<=n) {
		System.out.println("After");
		next = current.next;
		current.next = prev;
		prev = current;
		current = next;
		i++;
	}
	if(headNew == null) {
		headNew = prev;
	}
	if(start!=null && start.next != null) {
		start.next.next = next;
		start.next =prev;
	}
	
	print(headNew);
	return headNew;
	
	}
	
	public void print(LinkedList2 node) {
		
		while(node != null) {
			System.out.println(node.data);
			node= node.next;
		}
	}
}
	
class LinkedList2{
	int data;
	LinkedList2 next;
	
	LinkedList2(int data){
		this.data = data;
	}
}
