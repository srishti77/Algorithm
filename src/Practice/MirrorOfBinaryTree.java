package Practice;

import java.io.ObjectInputStream.GetField;

public class MirrorOfBinaryTree {

	public static void main(String s[]) {

		MirrorOfBinaryTree mirrorBT = new MirrorOfBinaryTree();

		BinaryTree root = new BinaryTree(1);
		BinaryTree node1 = new BinaryTree(2);
		BinaryTree node2 = new BinaryTree(3);
		
		BinaryTree node3 = new BinaryTree(4);

		BinaryTree node4 = new BinaryTree(5);
		/*BinaryTree node5 = new BinaryTree(6);
		BinaryTree node6 = new BinaryTree(7);

		BinaryTree node7 = new BinaryTree(8);
		BinaryTree node8 = new BinaryTree(9);
		*/
		
		root.left = node1;
		root.right = node2;

		node1.left = node3;
		node1.right = node4;

		/*node2.left = node4;
		node2.right = node5;

		node4.left = node7;
		node4.right = node8;*/

		BinaryTree node = mirrorBT.getMirroredBinaryTree(root);
		mirrorBT.print(node);
		
	}

	public void print(BinaryTree node) {

		if (node != null) {
			print(node.left);
			System.out.println(node.val);
			print(node.right);
		}
	}

	public BinaryTree getMirroredBinaryTree(BinaryTree tree) {

		if (tree == null) {
			return null;
		}
		
		tree.left = getMirroredBinaryTree(tree.left);
		tree.right = getMirroredBinaryTree(tree.right);

		BinaryTree temp = tree.left;
		tree.left = tree.right;
		tree.right = temp;
		
		return tree;
	}
}
