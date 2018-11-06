package CCI;

import org.omg.Messaging.SyncScopeHelper;

import CCI.C2_PalindromeLinkedList.C2_Pali_LinkedList;

public class C2_PalindromeLLRecursive {
	
	C2_DoublyLinkedList head=null; 
	
	class C2_DoublyLinkedList{
		
		String data;
		C2_DoublyLinkedList next;
		C2_DoublyLinkedList prev;
		C2_DoublyLinkedList(String data){
			this.data= data;
		}
		
	}
	
	//insert nodes
	public void insert(String data) {
		
		C2_DoublyLinkedList node= head;
		
		if(head== null) {
			head= new C2_DoublyLinkedList(data);
			
		}
		else {
			while(node.next!=null) {
				node= node.next;
			}
			C2_DoublyLinkedList temp= new C2_DoublyLinkedList(data);
			node.next= temp;
			temp.prev= node;
			
		
		}
		
	}
	
	public void comparePalindrome(int length) {
		
		int pointerPos=0;
		boolean flag=false;
		if(length%2==0)
			pointerPos=length/2;
		else
			pointerPos= (length/2)+1;
		C2_DoublyLinkedList node=head;
		for(int i=0; i< pointerPos-1;i++) {
			node=node.next;
		}
		if(length%2==0) {
			System.out.println("Even Node data:"+node.data);
			compare(node,node.next);
		}
		else {
			System.out.println("Odd Node data:"+node.data);
			compare(node.prev, node.next);
		}

		
	}
	
	public void compare(C2_DoublyLinkedList node1, C2_DoublyLinkedList node2) {
		
		if(node1== null && node2==null) {
			System.out.println("Palindrome");
			
		}
		
		if(!node1.data.equals(node2.data)) {
			System.out.println("Not Palindrome "+node1.data+node2.data);		
		}
		
		else if(node1.data.equals(node2.data)){
			compare(node1.prev,node2.next);
		}
		
	}
	
	public void print() {
		C2_DoublyLinkedList node = head;
		while(node.next!=null) {
			
			node=node.next;
		}
		
		while(node!=null) {
			System.out.println(node.data);
			node=node.prev;
		}
	}
	public static void main(String s[]) {
		C2_PalindromeLLRecursive doubly= new C2_PalindromeLLRecursive();
		doubly.insert("a");
		doubly.insert("b");
		doubly.insert("b");
		doubly.insert("a");
		
		doubly.print();
		
		doubly.comparePalindrome(4);
	}
}
