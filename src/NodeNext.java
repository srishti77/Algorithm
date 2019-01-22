
public class NodeNext {
	
	public static void main(String[] args) {
		
		NodeItem nodeItem1 = new NodeItem(1);
		
		NodeItem nodeItem2 = new NodeItem(2);
		
		NodeItem nodeItem3 = new NodeItem(3);
		
		NodeItem nodeItem4 = new NodeItem(4);
		
		NodeItem nodeItem5 = new NodeItem(5);
		
		NodeItem nodeItem6 = new NodeItem(6);
		
		NodeItem nodeItem7 = new NodeItem(7);
		
		nodeItem1.left = nodeItem2;
		nodeItem1.next = null;
		nodeItem1.right = nodeItem3;
		
		nodeItem2.left = nodeItem4;
		nodeItem2.right = nodeItem5;
		
		nodeItem3.left = nodeItem6;
		nodeItem3.right = nodeItem7;
		
		NodeNext nodeNext = new NodeNext();
		nodeNext.findNext(nodeItem1);
	}
	
	void findNext(NodeItem root) {
		if(root.left == null || root.right== null)
			return;
	
		
		root.left.next = root.right;
		System.out.println(root.left.data +" "+root.left.next.data);
		
		
		if(root.next == null) {
			root.right.next = null;
			System.out.println(root.right.data +" "+ null);
		}
			
		else {
			root.right.next = root.next.left;
			System.out.println(root.right.data +" "+ root.next.left.data);
		}
		//System.out.println("root: "+root.data +" root."+" root.left "+ root.left.data+" root.right "+ root.right.data);
		findNext(root.left);
		findNext(root.right);
		
	}
}

class NodeItem{
	int data;
	NodeItem left;
	NodeItem right;
	NodeItem next;
	
	NodeItem(int data){
		this.data = data;
	}
}
