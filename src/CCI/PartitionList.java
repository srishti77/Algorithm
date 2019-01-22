package CCI;

public class PartitionList {

	public static void main(String s[]) {
		
		ListNode_PartitionList list1 = new ListNode_PartitionList(1);
		ListNode_PartitionList list2 = new ListNode_PartitionList(4);
		
		ListNode_PartitionList list3 = new ListNode_PartitionList(3);
		ListNode_PartitionList list4 = new ListNode_PartitionList(2);
		
		ListNode_PartitionList list5 = new ListNode_PartitionList(5);
		ListNode_PartitionList list6 = new ListNode_PartitionList(2);
		
		list1.next = list2;
		list2.next = list3;
		list3.next = list4;
		list4.next = list5;
		list5.next = list6;
		
		PartitionList partition = new PartitionList();
		int value =3;
		
		System.out.println(partition.partitionListElement(list1, value));
	}

	private ListNode_PartitionList partitionListElement(ListNode_PartitionList list1, int value) {
		// TODO Auto-generated method stub
		ListNode_PartitionList head = list1, current= list1, start=null, prev= null;
		
		while(current!= null) {
			
			if(current.val < value && start!= null) {
				System.out.println("a");
				ListNode_PartitionList temp = start.next;
				prev.next.next = current.next;
				start.next = current;
				start.next.next = temp;
				current = prev.next;
				continue;
			}
			else if(current.val >= value && start==null) {
				start = prev;
				
			}
			prev = current;
			current = current.next;
			
		}
		
		return head;
	}
	
	public void print(ListNode_PartitionList head) {
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}

class ListNode_PartitionList {
	int val;
	ListNode_PartitionList next;
	ListNode_PartitionList(int x) { val = x; }
}