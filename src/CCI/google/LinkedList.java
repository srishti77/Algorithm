package CCI.google;

public class LinkedList {
	
	public static void main(String s[]) {

		ListNode head1 = new ListNode(9);

		ListNode list1 = new ListNode(4);
		
		ListNode list2 = new ListNode(3);

		ListNode head2 = new ListNode(9);
		ListNode list12 = new ListNode(6);
		ListNode list22 = new ListNode(4);

		/*head1.next = list1;
		list1.next = list2;

		head2.next = list12;
		list12.next = list22;*/

		LinkedList list = new LinkedList();
		ListNode l3 = list.addTwoNumbers(head1, head2);
		list.print(l3);
	}

	public void print(ListNode node) {
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

	 	ListNode l3 = null, head = null;
			int carry = 0;
			while (l1 != null && l2 != null) {

				int value = l1.val + l2.val + carry;
				if (value == 10) {
					carry = 1;
					value =0;
				}

				else if (value > 10) {
					
					carry = value / 10;
					value = value % 10;
					System.out.println("Carry: "+ carry+" "+ value);
				} else {
					carry = 0;
				}
				if(l3 == null){
	                l3 = new ListNode(value);
	            }
					
				else{
					l3.next = new ListNode(value);
					l3 = l3.next;
				}
				if (head == null)
					head = l3;
				
				l1 = l1.next;
				l2 = l2.next;
				
			}
	        
			while (l1 != null) {
				
	            int value = carry + l1.val;
	            if (value == 10) {
					carry = 1;
					value =0;
				}

				else if (value > 10) {
					
					carry = value / 10;
					value = value % 10;
					
				} else {
					carry = 0;
				}
	            if(l3 == null)
					l3 = new ListNode(value);
				else{
					l3.next = new ListNode(value);
					l3 = l3.next;
				}
				
				l1 = l1.next;

			}
			while (l2 != null) {
			
	             int value = carry + l2.val;
	            if (value == 10) {
					carry = 1;
					value =0;
				}

				else if (value > 10) {
					
					carry = value / 10;
					value = value % 10;
				} else {
					carry = 0;
				}
	            if(l3 == null)
					l3 = new ListNode(value);
				else{
					l3.next = new ListNode(value);
					l3 = l3.next;
				}
				
				l2 = l2.next;

			}
	       
	        if(carry != 0){
	            l3.next = new ListNode(carry);
			
	        }
	        
			return head; 
	}
}
