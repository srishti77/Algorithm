package CCI.google;

class TreeNode1 {
	int val;
	TreeNode1 left;
	TreeNode1 right;

	TreeNode1(int x) {
		val = x;
	}
}

public class InorderSuccessor {
	TreeNode1 node = null;

	public static void main(String s[]) {

		InorderSuccessor inorderSuccessor = new InorderSuccessor();
		TreeNode1 head = new TreeNode1(5);
		TreeNode1 node1 = new TreeNode1(6);

		/*
		 * TreeNode1 node2 = new TreeNode1(2); TreeNode1 node3 = new TreeNode1(1);
		 * 
		 * TreeNode1 node4 = new TreeNode1(4); TreeNode1 node5 = new TreeNode1(6);
		 */

		head.right = node1;
		/*
		 * head.right = node5;
		 * 
		 * node1.left = node2; node1.right = node4;
		 * 
		 * node2.left = node3;
		 */

		TreeNode1 node = inorderSuccessor.inorderSuccessor(head, node1);
		System.out.println(node.val);

	}

	public TreeNode1 inorderSuccessor(TreeNode1 root, TreeNode1 p) {

		if (root == null) {
			return null;
		}

		if (root.val <= p.val)
			return inorderSuccessor(root.right, p);

		else {
			TreeNode1 left = inorderSuccessor(root.left, p);
			return (left != null) ? left : root;
		}

	}
}
