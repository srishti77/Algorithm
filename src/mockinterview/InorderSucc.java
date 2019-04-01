package mockinterview;

class TreeNode1 {
	int val;
	TreeNode1 left, right, parent;

	TreeNode1(int val) {
		this.val = val;
	}
}

public class InorderSucc {
	public static void main(String s[]) {

		TreeNode1 root = new TreeNode1(2);
		TreeNode1 node1 = new TreeNode1(3);

		TreeNode1 node2 = new TreeNode1(6);
		TreeNode1 node3 = new TreeNode1(2);

		TreeNode1 node4 = new TreeNode1(4);
		TreeNode1 node5 = new TreeNode1(1);

		root.right = node1;

		/*
		 * node1.parent = root; node2.parent = root;
		 * 
		 * node1.left = node3; node1.right = node4; node3.parent = node1; node4.parent =
		 * node1;
		 * 
		 * node3.left = node5; node5.parent = node3;
		 */

		InorderSucc inorderSucc = new InorderSucc();

		System.out.println(inorderSucc.inorderSuccessor(root, node3).val);

	}

	public TreeNode1 inorderSuccessor(TreeNode1 root, TreeNode1 p) {

		if (p.right != null) {
			return leftMostValue(p.right);
		}

		return findSuccessor(root, p);
	}

	public TreeNode1 findSuccessor(TreeNode1 root, TreeNode1 node) {
		TreeNode1 curr = root;
		TreeNode1 candidate = null;

		while (curr != node) {
			if (node.val < curr.val) {
				candidate = curr;
				curr = curr.left;
			} else {
				curr = curr.right;
			}
		}
		return candidate;
	}

	private TreeNode1 leftMostValue(TreeNode1 p) {
		// TODO Auto-generated method stub
	
		while (p.left != null) {
			
			p = p.left;
			}

		return p;
	}
}
