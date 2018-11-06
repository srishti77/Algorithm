package CCI;


public class C2_PalindromeLinkedList {
	
	C2_Pali_LinkedList head= null;
	StackImpl top= null;
	
	class C2_Pali_LinkedList{
		
		String data;
		C2_Pali_LinkedList next;
		
		C2_Pali_LinkedList(String data){
			this.data= data;
		}
		
	}
	
	class StackImpl{
		
		public StackImpl(String data) {
			// TODO Auto-generated constructor stub
			this.data=data;
		}
		
		String data;
		StackImpl next;
		
	}
	
	public void insertIntoStack(String data) {
		
		StackImpl node = top;
		
		if(top== null) {
			top= new StackImpl(data);	
		}
		else {
			StackImpl temp= new StackImpl(data);
			temp.next=top;
			top=temp;
		}
		
	}
	
	//insert nodes
	public C2_Pali_LinkedList insert(String data) {
		
		C2_Pali_LinkedList node= head;
		
		if(head== null) {
			head= new C2_Pali_LinkedList(data);
			return head;
		}
		else {
			while(node.next!=null) {
				node= node.next;
			}
			node.next= new C2_Pali_LinkedList(data);
			return node.next;
		}
		
	}
	
	
	
	public void stackImpl() {
		//put linkedlist element into stack
		initializeStack();
		
		//compare Stack and LinkedList
		compareStackAndLL();
	}
	
	public void initializeStack() {
		C2_Pali_LinkedList llNode= head;
		while(llNode !=null) {
			insertIntoStack(llNode.data);
			llNode=llNode.next;
		}
	}
	
	public void compareStackAndLL() {
		boolean palindorme=true;
		C2_Pali_LinkedList llNode= head;
		StackImpl stack= top;
		
		while(llNode!=null && top!=null) {
			if(llNode.data.equals(top.data)) {
				llNode=llNode.next;
				top=top.next;
			}
			else {
				palindorme=false;
				break;
			}
		}
		
		System.out.println("Palindrome: "+palindorme);
	}
	
	public static void main(String s[]) {
		C2_PalindromeLinkedList pLL= new C2_PalindromeLinkedList();
		pLL.insert("a");
		//pLL.insert("b");
		pLL.insert("c");
		pLL.insert("c");
		pLL.insert("a");
		
		pLL.stackImpl();
		
	}
}
