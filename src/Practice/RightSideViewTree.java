package Practice;


public class RightSideViewTree {

	int maxLevel = -1;

	public static void main(String s[]) {
		
		RightSideViewTree rightSide = new RightSideViewTree();
		BinaryTree root = new BinaryTree(1);
		BinaryTree node1 = new BinaryTree(2);
		
		BinaryTree node2 = new BinaryTree(3);
		BinaryTree node3 = new BinaryTree(4);
		
		BinaryTree node4 = new BinaryTree(5);
		BinaryTree node5 = new BinaryTree(6);
		BinaryTree node6 = new BinaryTree(7);
		
		root.left = node1;
		root.right = node2;
		
		node1.left = node3;	
		node1.right = node4;
		
		node2.left = node5;
		node2.right = node6;
		
		rightSide.rightSideView(root, 0);
	}

	public void rightSideView(BinaryTree node, int level) {

		if (node == null)
			return;

		if (maxLevel < level) {
			System.out.println(node.val);
			maxLevel = level;
		}

		rightSideView(node.left, level + 1);
		rightSideView(node.right, level + 1);

	}

}
