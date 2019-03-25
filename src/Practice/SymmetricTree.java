package Practice;

public class SymmetricTree {

	public static void main(String s[]) {
		BinaryTree root = new BinaryTree(1);
		BinaryTree node1 = new BinaryTree(2);
		BinaryTree node2 = new BinaryTree(2);

		BinaryTree node3 = new BinaryTree(3);
		BinaryTree node4 = new BinaryTree(4);
		BinaryTree node5 = new BinaryTree(4);

		BinaryTree node6 = new BinaryTree(3);

		root.left = node1;
		root.right = node2;

		node1.left = node3;
		node1.right = node4;

		node2.left = node5;
		node2.right = node6;
		
		SymmetricTree symmetric = new SymmetricTree();
		System.out.println(symmetric.isSymmetric(root));
	}

	public boolean isSymmetric(BinaryTree root) {
		return isSymmetric(root, root);
	}

	private boolean isSymmetric(BinaryTree node1, BinaryTree node2) {
		// TODO Auto-generated method stub

		if (node1 == null && node2 == null)
			return true;
		
		if( node1 == null || node2 == null)
			return false;
		
		return (node1.val == node2.val ) && isSymmetric(node1.left, node2.right) && isSymmetric(node1.right, node2.left); 

	}
}
