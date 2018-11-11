package CCI;

import java.util.ArrayList;

public class ReverseLinkedList {
	
	static C2_Nodes temp=null;
	
	public static void main(String s[]) {
		C2_RemoveDups removeDups= new C2_RemoveDups();
		removeDups.insertNode(10);
		removeDups.insertNode(20);
		removeDups.insertNode(30);
		removeDups.insertNode(40);
		removeDups.insertNode(50);
		removeDups.insertNode(60);
		
		//removeDups.print();
		temp = removeDups.head;	
		C2_Nodes node= reverseLinkedlist(temp);
		
		//removeDups.print();
		
	}

	private static C2_Nodes reverseLinkedlist(C2_Nodes head) {
		// TODO Auto-generated method stub
		
		if(head!=null) {
			
			reverseLinkedlist(head.next);
			//System.out.println(head.data);
			System.out.print(temp.data+"-"+head.data+" ");
			
			temp=temp.next;
		
		}
		
		return head;
		
	}
}
