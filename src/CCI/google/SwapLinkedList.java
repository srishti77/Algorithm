package CCI.google;

public class SwapLinkedList {
	public static void main(String s[]) {

		// [2,5,3,4,6,2,2]
		ListNode head = new ListNode(2);
		ListNode list1 = new ListNode(5);
		ListNode list2 = new ListNode(3);
		ListNode list3 = new ListNode(4);
		ListNode list4 = new ListNode(6);
		ListNode list5 = new ListNode(2);
		ListNode list6 = new ListNode(2);

		head.next = list1;
		list1.next = list2;
		list2.next = list3;
		list3.next = list4;
		list4.next = list5;
		list5.next = list6;

		SwapLinkedList swappedlist = new SwapLinkedList();
		head = swappedlist.swapPairs(head);
		swappedlist.printElement(head);

	}

	public void printElement(ListNode list) {
		while (list != null) {
			System.out.println(list.val);
			list = list.next;
		}
	}

	public ListNode swapPairs(ListNode head) {

		ListNode prev = head, curr = head.next, startIndex = null;
		boolean initial = true;
		
		while (curr != null) {	
			prev.next = curr.next;
			curr.next = prev;
			
			if (initial) {
				head = curr;
				initial = false;
				startIndex = prev;
			}
			else {
				startIndex.next = curr;
				startIndex = prev;
			}
			prev = prev.next;
			if (prev != null)
				curr = prev.next;
			else
				curr = prev;
			
			
		}
		return head;
	}
}
