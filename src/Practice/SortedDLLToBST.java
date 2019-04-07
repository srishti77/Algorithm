package Practice;

public class SortedDLLToBST {
	TreeNode root = null;

	public static void main(String s[]) {
		
		SortedDLLToBST dllToBSt = new SortedDLLToBST();
		
		DoublyLL head = new DoublyLL(1);
		DoublyLL node1 = new DoublyLL(2);
		
		DoublyLL node2 = new DoublyLL(3);
		DoublyLL node3 = new DoublyLL(4);
		DoublyLL node4 = new DoublyLL(5);
		
		head.next = node1;
		node1.prev = head;
		
		node1.next = node2;
		node2.prev = node1;
		
		node2.next = node3;
		node3.prev = node2;
		
		node3.next = node4;
		node4.prev = node3;
				
		dllToBSt.root = dllToBSt.sortedDLLToBST(head, node4);
		dllToBSt.printElement(dllToBSt.root);
	}
	
	public void printElement(TreeNode root) {
		if(root != null) {
			printElement(root.left);
			System.out.println(root.val);
			printElement(root.right);
		}
	}

	public TreeNode sortedDLLToBST(DoublyLL left, DoublyLL right) {

		if(left == null && right != null) {
			return new TreeNode(right.val);
		}
		else if(left != null && right == null) {
			return new TreeNode(left.val);
		}
		else if(left == null && right == null){
			return null;
		}
		
		if (left.val == right.val) {
			return new TreeNode(left.val);
		}

		DoublyLL start = left;
		DoublyLL end = right;
		
		if(left.next == right) {
			root = new TreeNode(left.val);
			root.right = sortedDLLToBST(right, null);
			return root;
		}
		while (left.val < right.val) {
			left = left.next;
			right = right.prev;
		}

		TreeNode root = new TreeNode(left.val);
	
		root.left = sortedDLLToBST(start, left.prev);
		root.right = sortedDLLToBST(left.next, end);
		return root;

	}
}
