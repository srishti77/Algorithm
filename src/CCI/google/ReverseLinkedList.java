package CCI.google;

public class ReverseLinkedList {
	public static void main(String s[]) {
		ListNode head = new ListNode(1);
		ListNode list1 = new ListNode(2);
		ListNode list2 = new ListNode(3);
		ListNode list3 = new ListNode(4);
		ListNode list4 = new ListNode(5);
		
		head.next = list1;
		list1.next = list2;
		list2.next = list3;
		list3.next = list4;
		
		ReverseLinkedList list = new ReverseLinkedList();
		head = list.reverseList(head);
		list.printElement(head);
	}
	
	public void printElement(ListNode list) {
		while (list != null) {
			System.out.println(list.val);
			list = list.next;
		}
	}

	
	  public ListNode reverseList(ListNode head) {
		  ListNode prev = head;
		  if(head == null)
			  return null;
		  ListNode curr = head.next;
		  boolean flag = true;
		  while(curr != null) {
			  ListNode temp = curr.next;
			  curr.next = prev;
			  if(flag) {
				  prev.next = null;
				  flag=false;
			  }
			  prev = curr;
			
			  curr = temp;
		  }
		  
		  return prev;
	    }
}
