package mockinterview;

public class CompleteTreeCount {
	int count =0;
	public static void main(String s[]) {

		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);

		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(4);

		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(6);

		root.left = node1;
		root.right = node2;
		
		node1.left = node3;
		node1.right = node4;
		
		node2.left = node5;
	
		CompleteTreeCount completeTree = new CompleteTreeCount();
		System.out.println("Count: "+ completeTree.countNodes(root));
	}

	public int countNodes(TreeNode root) {

		if(root == null)
			return count;
		
		count++;
		countNodes(root.left);
		countNodes(root.right);
		
		return count;
	}
	
	
}
