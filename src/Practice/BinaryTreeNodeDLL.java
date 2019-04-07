package Practice;

class Node_1 {
	int data;
	Node_1 left, right;

	public Node_1(int data) {
		this.data = data;
	}
}

public class BinaryTreeNodeDLL {

	Node_1 prev;

	public static void main(String s[]) {
		BinaryTreeNodeDLL bt = new BinaryTreeNodeDLL();
		Node_1 root = new Node_1(10);
		root.left = new Node_1(12);
		root.right = new Node_1(15);
		root.left.left = new Node_1(25);
		root.left.right = new Node_1(30);
		root.right.left = new Node_1(36);

		System.out.println("Inorder Tree Traversal");
		inorder(root);

		Node_1 head = bt.bttToDLL(root);// toDLL(root);
		 System.out.println("\nDLL Traversal"); 
	     bt.printlist(head); 

	}

	static void inorder(Node_1 root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	void preFixPrev(Node_1 root) {

		if (root == null)
			return;

		preFixPrev(root.left);
		root.left = prev;
		prev = root;
		preFixPrev(root.right);

	}

	Node_1 fixNextptr(Node_1 root) {

		while (root.right != null) {
			root = root.right;
		}

		while (root != null && root.left != null) {

			Node_1 left = root.left;
			left.right = root;
			root = root.left;
		}

		return root;
	}

	Node_1 bttToDLL(Node_1 root) {
		prev = null;
		preFixPrev(root);
		return fixNextptr(root);
	}

	void printlist(Node_1 root) {
		while (root != null) {
			System.out.print(root.data + " ");
			root = root.right;
		}
	}
	
}
