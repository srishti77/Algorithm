package CCI;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRighSideView {

	List<Integer> list = new ArrayList<Integer>();

	public static void main(String s[]) {

		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);

		node1.left = node2;
		/*
		 * node1.right = node4; node2.right = node3; node4.right = node5;
		 */

		BinaryTreeRighSideView tree = new BinaryTreeRighSideView();
		tree.rightSideView(node1, 1);
		System.out.println(tree.list);

	}

	int depth = 0, right = 1;

	public void rightSideView(TreeNode root, int curDepth) {
		if (root == null)
			return;

		if (curDepth > depth) {
			right = root.val;
			list.add(right);
			depth = curDepth;

		}

		rightSideView(root.right, curDepth + 1);
		rightSideView(root.left, curDepth + 1);

	}
}
