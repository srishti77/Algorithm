package CCI;


public class RemoveNthNode {
	
	static ListNode_Nth head= null;
	int i=0, j=0;
	public static void main(String s[]) {
		RemoveNthNode node = new RemoveNthNode();
		node.insert(12);
		node.insert(34);
		//node.insert(43);
		//node.insert(67);
		//node.insert(90);
		
		//node.printNode();
		ListNode_Nth temp = head;
		node.delete(2, temp);
		
		System.out.println("new list");
		
		node.printNode();
	}
	
	
	public void insert(int val) {
		ListNode_Nth temp = head;
		if(temp == null) {
			head = new ListNode_Nth(val);
		}
		else {
			while(temp.next != null) {
				temp = temp.next;
				
			}
			temp.next = new ListNode_Nth(val);
		}
	}
	
	public void delete(int index, ListNode_Nth temp) {
		
		if(temp == null)
			return;
		j++;
		delete(index, temp.next);
		System.out.println("j::"+j);
		i++;
		if(j== index) {
			head = head.next;
			j= -1;
			return;
		}
		else if(i == index+1) {
			//System.out.println("Element deleted"+ temp.next.val);
			temp.next = temp.next.next;
			return;
		}
		
	}
	public void printNode() {
		ListNode_Nth temp = head;
		while(temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
}

class ListNode_Nth {
	      int val;
	      ListNode_Nth next;
	      ListNode_Nth(int x) { val = x; }
	  }