package CCI;

import java.util.ArrayList;

public class FlattenBinaryTree {
	ArrayList<Integer> list = new ArrayList();

	public static void main(String s[]) {

		TreeNode tree1 = new TreeNode(1);
		TreeNode tree2 = new TreeNode(2);
		TreeNode tree3 = new TreeNode(3);
		TreeNode tree4 = new TreeNode(4);
		TreeNode tree5 = new TreeNode(5);
		TreeNode tree6 = new TreeNode(6);

		tree1.left = tree2;
		tree1.right = tree5;
		tree2.left = tree3;
		tree2.right = tree4;
		tree3.right = tree6;
		FlattenBinaryTree bTree = new FlattenBinaryTree();
		//bTree.addToLinkedList(tree1);
		bTree.flatten(tree1);
		// System.out.println(bTree.list);
		//System.out.println(tree1.right.right.val);
		
		//bTree.print(tree1);
		
	}

	public void print(TreeNode root) {
		while (root != null) {

			System.out.println(root.val);
			print(root.right);

		}
	}

	public void addToLinkedList(TreeNode root) {
		if (root != null && root.left == null) {
			return;
		}

		TreeNode temp = root.right;
				
		root.right = root.left;
		addToLinkedList(root.left);
		if(temp != null)
			addToLinkedList(temp);
		
	}
	
	TreeNode prev = null;
	
	public void flatten(TreeNode root) {
		if(root == null) {
			return;
		}
		
		flatten(root.right);
		flatten(root.left);
		System.out.println("root: "+root.val);
		if(prev != null)
			System.out.println("right = "+ prev.val);
		root.right = prev;
		root.left = null;
		prev = root;
		
		
	}
}
