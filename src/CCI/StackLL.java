
public class StackLL {
	
	StackLLNode top1;
	StackLLNode top2;
	public static void main(String args[]) {
		StackLL stackll= new StackLL();
		stackll.push(10);
		
		stackll.push(20);
		stackll.push(30);
		stackll.push(2);
	
		System.out.println(stackll.pop());
		//stackll.printtop1();
		//stackll.printtop2();
			
	}
	private void push(int i) {
		// TODO Auto-generated method stub
		StackLLNode newNode = new StackLLNode(i);
		
		if(top1 == null) {
			top1 = newNode;
		}
		else {
			newNode.next=top1;
			top1= newNode;
		}
	}
	
	private int pop() {
		
		return shift();
		/*if(top1 != null) {
			top1 = top1.next;
		}*/
	}
	
	private int shift() {
		
		
		while(top1!=null) {
			StackLLNode newNode = new StackLLNode(top1.data);
			if(top2==null)
				top2 = newNode;
			else {
				
				newNode.next=top2;
				top2=newNode;
			}
			
			top1=top1.next;
		}
		if( top2 == null)
			return 0;
		else
			return top2.data;
		}
	
	private void printtop1() {
		// TODO Auto-generated method stub
		StackLLNode newNode = top1;
		
		while(newNode != null) {
			System.out.println(newNode.data);
			newNode= newNode.next;
		}
	}
	
	private void printtop2() {
		// TODO Auto-generated method stub
		StackLLNode newNode = top2;
		
		while(newNode != null) {
			System.out.println(newNode.data);
			newNode= newNode.next;
		}
	}
	
}

class StackLLNode{
	int data;
	
	StackLLNode next;
	
	StackLLNode(int data){
		this.data = data;
	}
}