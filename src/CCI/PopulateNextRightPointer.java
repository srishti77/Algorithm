package CCI;

public class PopulateNextRightPointer {
	
	
	public static void main(String s[]) {
		
		TreeNodeLink node1 = new TreeNodeLink(1);
		TreeNodeLink node2 = new TreeNodeLink(2);
		TreeNodeLink node3 = new TreeNodeLink(3);
		TreeNodeLink node4 = new TreeNodeLink(4);
		
		TreeNodeLink node5 = new TreeNodeLink(5);
		TreeNodeLink node6 = new TreeNodeLink(6);
		TreeNodeLink node7 = new TreeNodeLink(7);
		
		node1.left = node2;
		node1.right = node3;
		
		node2.left = node4;
		node2.right = node5;
		
		node3.left = node6;
		node3.right = node7;
		
		PopulateNextRightPointer nextRight = new PopulateNextRightPointer();
		nextRight.populateRight(node1);
			
	}
	
	
	
	public TreeNodeLink populateRight(TreeNodeLink root) {
		TreeNodeLink head = root;
		TreeNodeLink dummy = new TreeNodeLink(-1);
		TreeNodeLink cur = dummy;
		
		while(root != null) {
			
			if(root.left != null) {
				if(cur == dummy)
					System.out.println("Cur: "+ root.left.data);
				cur.next = root.left;
				cur = cur.next;
			}
			
			if(root.right != null) {
				if(cur == dummy)
					System.out.println("Cur: "+ root.right.data);
				cur.next = root.right;
				cur = cur.next;
			}
			System.out.println("Root: "+ root.data);
			root = root.next;
			if(root == null) {
				cur = dummy;
				root = cur.next;
				dummy.next = null;
			}
				
		}
		
		return head;
	}
	
	
}

class TreeNodeLink{
	
	public int data;
	public TreeNodeLink left;
	public TreeNodeLink right;
	public TreeNodeLink next;
	
	public TreeNodeLink() {
		
	}
	
	public TreeNodeLink(int val) {
		data= val;
	}
}