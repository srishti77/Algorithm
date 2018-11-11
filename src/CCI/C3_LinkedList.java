package CCI;

public class C3_LinkedList {
	
	public static void main(String s[]) {
		
		C2_RemoveDups removeDups= new C2_RemoveDups();
		removeDups.insertNode(10);
		removeDups.insertNode(20);
		removeDups.insertNode(30);
		removeDups.insertNode(40);
		removeDups.insertNode(50);
		removeDups.insertNode(60);
		
		C2_Nodes head=reverseList(removeDups.head);
		
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
			
	}

	private static C2_Nodes reverseList(C2_Nodes head) {
		// TODO Auto-generated method stub
		
		C2_Nodes prev= null;
		C2_Nodes current = head;
		C2_Nodes next= null;
		while(current!= null) {
			next= current.next;
			current.next=prev;
			prev=current;
			current= next;
			
		}
		
		return prev;
	}
	
}
