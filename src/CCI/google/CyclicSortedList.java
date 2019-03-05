package CCI.google;

class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val,Node _next) {
        val = _val;
        next = _next;
    }
}

public class CyclicSortedList {
	
	public static void main(String s[]) {
		
		CyclicSortedList list = new CyclicSortedList();
		Node head = new Node(1, null);
		
		Node node1 = new Node(3, null);
		head.next = node1;
		
		Node node2 = new Node(3, head);
		node1.next = node2;
			
		node2.next = head;
		list.insertData(head, 4	);
		list.printElement(head);		
	}
	
	public void printElement(Node head) {
		Node node = head;
		System.out.println(node.val);
		node = node.next;
		int count =0;
		while(node != null && count <5) {
			System.out.println(node.val);
			node =node.next;
			count++;
		}
	}
	
	public void insertData(Node head, int insertVal) {
		Node node =head, prev = node;
		Node curr = node.next;
		if(insertVal > node.val) {
			
			while(curr != null && prev.val <= curr.val) {
				
				if(insertVal >= prev.val && insertVal < curr.val) {
					break;
				}
				prev = curr;
				curr = curr.next;
				
			}
			Node temp = new Node(insertVal, curr);
			prev.next = temp;	
		}
		else if(insertVal < node.val) {
			while(curr != null && prev.val < curr.val) {
				prev = curr;
				curr = curr.next;
			}
			while(curr != null && insertVal > curr.val) {
				prev = curr;
				curr = curr.next;
			}
			Node temp = new Node(insertVal, curr);
			prev.next = temp;
		}
		
		else {
			while(curr != null &&  curr.val != node.val) {
				prev = curr;
				curr = curr.next;
			}
			
			Node temp = new Node(insertVal, curr);
			prev.next = temp;
		}
	}
}
