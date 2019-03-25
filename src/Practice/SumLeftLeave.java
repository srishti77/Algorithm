package Practice;

public class SumLeftLeave {

	int sum = 0;

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

		SumLeftLeave sumLeftLeave = new SumLeftLeave();
		System.out.println(sumLeftLeave.leftLeaveSum(root));
	}

	public int leftLeaveSum(BinaryTree node) {

		if (node != null) {
			if (isLeave(node.left)) {
				System.out.println("Sum: " + sum + " newValue: " + node.left.val);
				sum += node.left.val;
			} else {
				leftLeaveSum(node.left);
			}

			leftLeaveSum(node.right);
		}
		return sum;
	}

	private boolean isLeave(BinaryTree left) {
		// TODO Auto-generated method stub

		if (left == null)
			return false;

		if (left.left == null && left.right == null)
			return true;

		return false;
	}

}
