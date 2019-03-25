package Practice;

public class FlattenedBT {
	static BinaryTree prev = null;
	public static void main(String s[]) {
		
		BinaryTree root = new BinaryTree(1);
		
		BinaryTree node1 = new BinaryTree(2);
		BinaryTree node2 = new BinaryTree(5);
		
		BinaryTree node3 = new BinaryTree(3);
		BinaryTree node4 = new BinaryTree(4);
		
		BinaryTree node5 = new BinaryTree(6);
		
		FlattenedBT flattened = new FlattenedBT();
		
		root.left = node1;
		root.right = node2;
		
		node1.left = node3;
		node1.right = node4;
		
		node2.right = node5;
		
		flattened.printLL(root);
		
		flattened.print(prev);
	}
	
	public void print(BinaryTree tree) {
		if(tree != null) {
			print(tree.left);
			System.out.println(tree.val);
			print(tree.right);
		}
	}
	public void printLL(BinaryTree tree) {
		if(tree == null)
			return;
		
		//System.out.println(tree.val);
		printLL(tree.right);
		printLL(tree.left);
		
		tree.right = prev;
		tree.left = null;
		prev = tree;
		
		
	}
}
