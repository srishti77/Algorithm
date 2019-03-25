package Practice;

public class RecoverBST {
	BinaryTree first, last, middle, prev;

	public static void main(String s[]) {
		
		BinaryTree root = new BinaryTree(7);
		BinaryTree node1 = new BinaryTree(5);
		
		BinaryTree node2 = new BinaryTree(15);
		
		BinaryTree node3 = new BinaryTree(3);
		BinaryTree node4 = new BinaryTree(8);
		
		BinaryTree node5 = new BinaryTree(10);
		BinaryTree node6 = new BinaryTree(20);
		BinaryTree node7 = new BinaryTree(25);
		
		root.left = node1;
		root.right = node2;
		
		node1.left = node3;
		node1.right = node4;
		
		node2.left = node5;
		node2.right = node6;
		node6.right = node7;
		
		RecoverBST recoverBST = new RecoverBST();
		recoverBST.correctBST(root);
	}

	// Get first, last and middle pointer
	public void recoverBST(BinaryTree node) {

		if (node == null)
			return;

		recoverBST(node.left);

		if (prev != null && node.val < prev.val) {
			if (first == null) {
				first = prev;
				middle = node;
			} else
				last = node;
		}

		prev = node;
		System.out.println(prev.val);
		recoverBST(node.right);
	}
	
	public void correctBST(BinaryTree node) {
		
		first = middle = last = prev = null;
		
		recoverBST(node);
		
		if(first != null && last != null) {
			int temp = first.val;
			first.val = last.val;
			last.val = temp;
		}
		
		else if(first != null && middle != null){
			int temp = first.val;
			first.val = middle.val;
			middle.val = temp;
		}
	}

}
