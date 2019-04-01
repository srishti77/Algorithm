package mockinterview;

public class BinarySearchTreeDeletion {

	public static void main(String s[]) {

		BinaryTree root = new BinaryTree(5);
		BinaryTree node1 = new BinaryTree(3);
		BinaryTree node2 = new BinaryTree(6);

		BinaryTree node3 = new BinaryTree(2);
		BinaryTree node4 = new BinaryTree(4);

		BinaryTree node5 = new BinaryTree(6);
		BinaryTree node6 = new BinaryTree(8);

		root.left = node1;
		root.right = node2;

		node1.left = node3;
		node1.right = node4;

		/*
		 * node2.left = node5; node2.right = node6;
		 */

		BinarySearchTreeDeletion del = new BinarySearchTreeDeletion();
		// BinaryTree tree = del.deleteNode(root, node2);

		// del.print(tree);

		int n = del.countNoOfNode(root);

		System.out.println(del.checkIsCompleteTree(root, 0, n));
		System.out.println("Full: " + del.checkIsFullTree(root));
		System.out.println("BST: " + del.isBinarySearchTree(root));
		System.out.println("Binary Search: "+ del.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	public void print(BinaryTree node) {
		if (node != null) {
			print(node.left);
			System.out.println(node.val);
			print(node.right);

		}
	}

	public BinaryTree deleteNode(BinaryTree root, BinaryTree node) {

		if (root == null)
			return null;

		if (root.val == node.val) {
			System.out.println("here");
			if (root.right != null) {
				BinaryTree temp = leftMostElement(root.right);
				if (root.left != null) {
					temp.left = root.left;
				}
				root = temp;
			} else if (root.left != null)
				root = root.left;
			else
				root = null;
		} else if (node.val < root.val)
			root.left = deleteNode(root.left, node);
		else if (node.val > root.val)
			root.right = deleteNode(root.right, node);
		return root;

	}

	private BinaryTree leftMostElement(BinaryTree right) {
		// TODO Auto-generated method stub
		BinaryTree left = right;
		while (right.left != null)
			left = right.left;

		System.out.println("Left: " + left.val);
		return left;
	}

	public int countNoOfNode(BinaryTree root) {

		if (root == null)
			return 0;
		return (1 + countNoOfNode(root.left) + countNoOfNode(root.right));

	}

	public boolean checkIsCompleteTree(BinaryTree root, int i, int n) {

		if (root == null)
			return true;

		if (i >= n)
			return false;

		return checkIsCompleteTree(root.left, 2 * i + 1, n) || checkIsCompleteTree(root.right, 2 * i + 2, n);
	}

	public boolean checkIsFullTree(BinaryTree root) {
		if (root == null || (root.left == null && root.right == null))
			return true;

		if (root.left != null && root.right != null) {
			return checkIsFullTree(root.left) && checkIsFullTree(root.right);
		} else
			return false;

	}

	public boolean isBinarySearchTree(BinaryTree root) {

		if (root == null || (root.left == null && root.right == null)) {
			return true;
		}

		if (root.left != null && root.right != null) {
			if ((root.val >= rightMostElementfrom(root.left).val) && (root.val <= leftMostElement(root.right).val))
				return isBinarySearchTree(root.left) && isBinarySearchTree(root.right);

		} else if (root.left != null) {
			if (root.val >= rightMostElementfrom(root.left).val) {
				return isBinarySearchTree(root.left);
			}

		}

		else if (root.right != null) {
			if (root.val <= leftMostElement(root.right).val) {
				return isBinarySearchTree(root.right);
			}
		}

		return false;
	}

	private BinaryTree rightMostElementfrom(BinaryTree left) {
		// TODO Auto-generated method stub
		BinaryTree rightMost = left;

		while (left != null && left.right != null) {
			rightMost = left.right;
			left = left.right;
		}

		System.out.println("right: " + rightMost.val);
		return rightMost;
	}

	
	public boolean isBST(BinaryTree root, int left, int right) {
		
		if(root == null)
			return true;
		
		System.out.println("Values:--" +root.val+ " "+ left+" "+right);
		if(root.val < left || root.val > right)
			return false;
		  if(root.val  == Integer.MIN_VALUE && root.left != null) return false;
	        
	        if(root.val  == Integer.MAX_VALUE && root.right != null) return false;
	        
		return isBST(root.left, left, root.val) && isBST(root.right, root.val, right);
	}
}
