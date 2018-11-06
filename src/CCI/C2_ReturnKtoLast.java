package CCI;

public class C2_ReturnKtoLast {
	
	C2_KthNode head=null;
	
	public static void main(String s[]) {
		
		C2_ReturnKtoLast returnKthLast = new C2_ReturnKtoLast();
		returnKthLast.insert(10);
		returnKthLast.insert(30);
		
		returnKthLast.insert(20);
		returnKthLast.insert(40);
		
		returnKthLast.insert(50);
		returnKthLast.insert(60);
		
		returnKthLast.printLasttokElement(returnKthLast.head,returnKthLast.head);
		
		//System.out.println(returnKthLast.iterativelyPrintLastKthElement(2).data);
	}
	
	public void insert(int data) {
		
		if(head == null)
			head= new C2_KthNode(data);
		else {
			C2_KthNode node= head;
			while(node.next!=null)
			{
				node=node.next;
			}
			node.next= new C2_KthNode(data);
		}
	}
	
	public int printLasttokElement(C2_KthNode node,C2_KthNode head ) {
		
		if(node == null)
			return 0; 
		
		
		int index= printLasttokElement(node.next, head)+1;
	
		//if(head!= null)
		System.out.println("Head="+ head.data);
		System.out.println("This is the node"+ node.data);
		
		return index;
	}
	
	public C2_KthNode iterativelyPrintLastKthElement(int k) {
		C2_KthNode node1 = head;
		C2_KthNode node2 = head;
		
		for(int i=0; i<k; i++) {
			if(node1== null)
				return null;
			node1=node1.next;
		}
		
		while(node1!=null) {
			node1=node1.next;
			node2= node2.next;
		}
		
		return node2;
				
	}
}

class C2_KthNode{
	
	C2_KthNode next;
	int data;
	
	C2_KthNode(int data){
		this.data= data;
	}
	
	
}