package CCI.google;

import java.util.ArrayList;

class TreeNode_BST {
	int val;
	TreeNode_BST left;
	TreeNode_BST right;

	TreeNode_BST(int x) {
		val = x;
	}
}

public class BSTIterator {

	TreeNode_BST root;
	ArrayList<Integer> list = new ArrayList();
	int currentIndex =0;
	
	public static void main(String s[]) {
		TreeNode_BST node1 = new TreeNode_BST(7);
		TreeNode_BST node2 = new TreeNode_BST(3);
		TreeNode_BST node3 = new TreeNode_BST(15);
		TreeNode_BST node4 = new TreeNode_BST(9);
		TreeNode_BST node5 = new TreeNode_BST(20);

		node1.left= node2;
		node1.right = node3;
		node3.left = node4;
		node3.right = node5;
		
		BSTIterator bst = new BSTIterator(node1);
		System.out.println(bst.next());
		System.out.println(bst.next());
		System.out.println(bst.next());
		System.out.println(bst.next());
		System.out.println(bst.next());
		System.out.println(bst.next());
	}

	public BSTIterator(TreeNode_BST root) {
		getInorder(root);
		currentIndex=0;
	}

	private void getInorder(TreeNode_BST root2) {
		// TODO Auto-generated method stub
		
		if(root2 != null) {
			getInorder(root2.left);
			list.add(root2.val);
			getInorder(root2.right);
		}
	}

	public int next() {
		currentIndex++;
		if(currentIndex <= list.size())
			return list.get(currentIndex - 1);
		return -1;
	}

	/*public boolean hasNext() {

	}*/
}
