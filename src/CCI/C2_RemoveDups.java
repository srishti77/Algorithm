package CCI;

public class C2_RemoveDups {

	C2_Nodes head= null;
	public static void main(String s[]) {	
		
		C2_RemoveDups removeDups= new C2_RemoveDups();
		removeDups.insertNode(20);
		removeDups.insertNode(20);
		removeDups.insertNode(30);
		removeDups.insertNode(50);
		removeDups.insertNode(60);
		
		removeDups.insertNode(75);
		
		removeDups.print();
		
		removeDups.removeDuplicates();
		System.out.println("remove...............");
		removeDups.print();
		
	}
	
	public void insertNode(int data) {
		
		if(head== null)
			head= new C2_Nodes(data);
		else {
			C2_Nodes node= head;
			while(node.next!= null)
			{
				node=node.next;
				
			}
			node.next= new C2_Nodes(data);
		}
		
	}
	
	public void print() {
		C2_Nodes node= head;
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		
	}
	
	public void removeDuplicates() {
		C2_Nodes node1= head;
		C2_Nodes node2= head;
		
		while(node1!= null) {
			while(node2.next!=null) {
				if(node1.data == node2.next.data)
					node2.next= node2.next.next;
				node2=node2.next;
			}
			node1=node1.next;
		}
		
	}
}        

class C2_Nodes{
	
	C2_Nodes next;
	int data;
	
	C2_Nodes(int data){
		
		this.data= data;
	}	
}
