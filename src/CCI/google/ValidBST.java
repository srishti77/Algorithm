package CCI.google;

public class ValidBST {
	public static void main(String s[]) {

		TreeNode root = new TreeNode(2);
		TreeNode node1 = new TreeNode(1);

		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(6);

		root.left = node1;
		root.right = node2;

		/*node2.left = node3;

		node2.right = node4;*/
		
		ValidBST bstValid = new ValidBST();
		System.out.println(bstValid.isValidBST(root));

	}

	public boolean isValidBST(TreeNode root) {

		return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

	}

	public boolean isValid(TreeNode root, int left, int right) {

		if(root == null || left == right)
			return true;
			
		if (root.val < left || root.val > right)
			return false;
		
		return isValid(root.left, left, root.val) && isValid(root.right, root.val, right);
	}
}
