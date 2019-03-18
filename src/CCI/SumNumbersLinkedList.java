package CCI;
class ListNode {
   int val;
   ListNode next;
   ListNode(int x) { val = x; }
  }

public class SumNumbersLinkedList {

	public static void main(String s[]) {
		
		SumNumbersLinkedList sumnumber = new SumNumbersLinkedList();
		ListNode l1= new ListNode(2);
		l1.next = new ListNode(4);
		
		l1.next.next = new ListNode(3);
		
		ListNode l2= new ListNode(5);
		
		l2.next = new ListNode(6);
	
		l2.next.next = new ListNode(7);
		sumnumber.printValues(l1);
		
		sumnumber.printValues(sumnumber.addTwoNumbers(l1, l2));
		
	}
	
	public void printValues(ListNode l1) {
		System.out.println("print values------");
		while(l1!=null) {
			System.out.println(l1.val);
			l1= l1.next;
			
		}
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode newLis= new ListNode(0);
		ListNode newListNode=newLis, p=l1, q=l2;
		 int carry=0;
		 int sum =0;
		 while(p!=null || q!=null) {
			if(p==null)
				sum= sum +q.val+carry;
			else if(q==null)
				sum= sum+p.val +carry;
			else
				sum= sum+p.val +q.val+carry;
			carry=0;
			System.out.println("Sum "+ sum);
			if(sum>=10) {
				newListNode.next = new ListNode(sum%10);
				carry= sum/10;
			}
			
			else {
				
				newListNode.next = new ListNode(sum);
				
			}
			
			newListNode= newListNode.next;
			 if (p != null) p = p.next;
		     if (q != null) q = q.next;
			
			sum=0;
		}
		 if (carry > 0) {
		        newListNode.next = new ListNode(carry);
		    }
		
		printValues(newListNode);
		
		return newLis.next;
	}
}
