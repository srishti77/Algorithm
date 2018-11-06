package CCI;

public class C2_DeleteMiddleNode {

	class Node_C2{
		int data;
		
		Node_C2 next;
		
		Node_C2(int data){
			this.data= data;
		}
	}
	
	Node_C2 head= null;
	
	public Node_C2 insert(int data) {
		
		Node_C2 node= head;
		
		if(head== null) {
			head= new Node_C2(data);
			return head;
		}
		else {
			while(node.next!=null) {
				node= node.next;
			}
			node.next= new Node_C2(data);
			return node.next;
		}
		
	}
	
	public Node_C2  deleteMiddle(Node_C2 node_data) {
		
		if(node_data== null)
			return null;
		else {
			node_data.data= node_data.next.data;
			node_data.next= node_data.next.next;
			
			return node_data;
		}
			
	}
	
	public void print() {
		Node_C2 node= head;
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		
	}
	
	public static void main(String s[]) {
		C2_DeleteMiddleNode node_c2= new C2_DeleteMiddleNode();
		node_c2.insert(12);
		Node_C2 nodeMid= node_c2.insert(34);
		node_c2.insert(21);
		node_c2.deleteMiddle(nodeMid);
		node_c2.print();
	}
	
}
